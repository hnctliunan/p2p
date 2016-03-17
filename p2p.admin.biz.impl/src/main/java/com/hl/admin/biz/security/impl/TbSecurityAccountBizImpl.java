package com.hl.admin.biz.security.impl;

import com.hl.admin.biz.security.ITbSecurityAccountBiz;
import com.hl.admin.base.vo.DataVO;
import com.hl.admin.dao.security.TbSecurityAccountMapper;
import com.hl.admin.entity.security.TbSecurityAccount;
import com.hl.admin.entity.security.TbSecurityAccountExample;
import com.hl.admin.entity.security.TbSecurityResource;
import com.hl.utils.encrypt.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSecurityAccountBizImpl implements ITbSecurityAccountBiz {
    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;
    @Override
    public DataVO<TbSecurityAccount> userLogin(String username, String password) {
        DataVO<TbSecurityAccount> returnVO = new DataVO<>();
        TbSecurityAccountExample example = new TbSecurityAccountExample();
        example.createCriteria().andDataEnableEqualTo("1").andLoginNameEqualTo(username.toLowerCase());
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
        String pwd = PasswordEncoder.encoder(objAccount.getLoginSalt(), password);
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
