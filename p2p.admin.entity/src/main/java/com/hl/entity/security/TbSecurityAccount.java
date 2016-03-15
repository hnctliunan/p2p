package com.hl.entity.security;

import com.base.entity.BaseEntity;
import java.util.Date;

public class TbSecurityAccount extends BaseEntity {
    private String loginName;

    private String loginPass;

    private String loginSalt;

    private Date loginTime;

    private String loginLock;

    private String loginDetail;

    private static final long serialVersionUID = 1L;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public String getLoginSalt() {
        return loginSalt;
    }

    public void setLoginSalt(String loginSalt) {
        this.loginSalt = loginSalt == null ? null : loginSalt.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginLock() {
        return loginLock;
    }

    public void setLoginLock(String loginLock) {
        this.loginLock = loginLock == null ? null : loginLock.trim();
    }

    public String getLoginDetail() {
        return loginDetail;
    }

    public void setLoginDetail(String loginDetail) {
        this.loginDetail = loginDetail == null ? null : loginDetail.trim();
    }
}