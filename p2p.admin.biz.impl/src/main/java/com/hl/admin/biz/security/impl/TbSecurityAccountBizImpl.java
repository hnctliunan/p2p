package com.hl.admin.biz.security.impl;

import com.hl.admin.biz.security.ITbSecurityAccountBiz;
import com.hl.admin.base.vo.DataVO;
import com.hl.admin.dao.security.TbSecurityAccountMapper;
import com.hl.admin.entity.security.TbSecurityAccount;
import com.hl.admin.entity.security.TbSecurityAccountExample;
import com.hl.admin.entity.security.TbSecurityResource;
import com.hl.utils.constant.FinalConstant;
import com.hl.utils.encrypt.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSecurityAccountBizImpl implements ITbSecurityAccountBiz {
    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;

    /**
     * 验证码用户名和密码
     * @param strUsername 用户名
     * @param strPassword 密码
     * @return DataVO
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    @Override
    public DataVO<TbSecurityAccount> userLogin(String strUsername, String strPassword) {
        DataVO<TbSecurityAccount> returnVO = new DataVO<>();
        TbSecurityAccountExample example = new TbSecurityAccountExample();
        example.createCriteria().andDataEnableEqualTo(FinalConstant.DataStatus.Enable.getValue()).andLoginNameEqualTo(strUsername.toLowerCase());
        List<TbSecurityAccount> alAccount = this.objSecurityAccountMapper.selectByExample(example);
        if(null == alAccount || alAccount.isEmpty()){
            returnVO.setSuccess(false);
            returnVO.setMessage("指定帐号不存在!");
            return returnVO;
        }
        if(alAccount.size() > 1){
            returnVO.setSuccess(false);
            returnVO.setMessage("指定帐号存在重复,为保证系统安全,您无法登录系统!");
            return returnVO;
        }
        TbSecurityAccount objAccount = alAccount.get(0);
        if(objAccount.getLoginLock().equals("-1")){
            returnVO.setSuccess(false);
            returnVO.setMessage("您的帐号已被锁定,您无法登录系统!");
            return returnVO;
        }
        String pwd = PasswordEncoder.encoder(objAccount.getLoginSalt(), strPassword);
        if(!pwd.equals(objAccount.getLoginPass())){
            returnVO.setSuccess(false);
            returnVO.setMessage("登录密码错误,您无法登录系统!");
            return returnVO;
        }
        returnVO.setResult(objAccount);
        returnVO.setMessage("登录成功!");
        returnVO.setSuccess(true);
        return returnVO;
    }
}
