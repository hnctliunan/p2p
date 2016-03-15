package com.hl.biz.security.impl;

import com.hl.base.vo.DataVO;
import com.hl.biz.security.ITbSecurityAccountBiz;
import com.hl.dao.security.TbSecurityAccountMapper;
import com.hl.entity.security.TbSecurityAccount;
import com.hl.entity.security.TbSecurityAccountExample;
import com.hl.utils.encrypt.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2016/3/15.
 */
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
