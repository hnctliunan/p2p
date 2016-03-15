package com.hl.entity.security;

import java.util.Date;

public class TbSecurityAccount {
    private String dataId;

    private String dataEnable;

    private Date dataInsertTime;

    private Date dataUpdateTime;

    private Date dataDeleteTime;

    private String extensionA;

    private String extensionB;

    private String extensionC;

    private String extensionD;

    private String extensionE;

    private String extensionF;

    private String loginName;

    private String loginPass;

    private String loginSalt;

    private Date loginTime;

    private String loginLock;

    private String loginDetail;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataEnable() {
        return dataEnable;
    }

    public void setDataEnable(String dataEnable) {
        this.dataEnable = dataEnable == null ? null : dataEnable.trim();
    }

    public Date getDataInsertTime() {
        return dataInsertTime;
    }

    public void setDataInsertTime(Date dataInsertTime) {
        this.dataInsertTime = dataInsertTime;
    }

    public Date getDataUpdateTime() {
        return dataUpdateTime;
    }

    public void setDataUpdateTime(Date dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }

    public Date getDataDeleteTime() {
        return dataDeleteTime;
    }

    public void setDataDeleteTime(Date dataDeleteTime) {
        this.dataDeleteTime = dataDeleteTime;
    }

    public String getExtensionA() {
        return extensionA;
    }

    public void setExtensionA(String extensionA) {
        this.extensionA = extensionA == null ? null : extensionA.trim();
    }

    public String getExtensionB() {
        return extensionB;
    }

    public void setExtensionB(String extensionB) {
        this.extensionB = extensionB == null ? null : extensionB.trim();
    }

    public String getExtensionC() {
        return extensionC;
    }

    public void setExtensionC(String extensionC) {
        this.extensionC = extensionC == null ? null : extensionC.trim();
    }

    public String getExtensionD() {
        return extensionD;
    }

    public void setExtensionD(String extensionD) {
        this.extensionD = extensionD == null ? null : extensionD.trim();
    }

    public String getExtensionE() {
        return extensionE;
    }

    public void setExtensionE(String extensionE) {
        this.extensionE = extensionE == null ? null : extensionE.trim();
    }

    public String getExtensionF() {
        return extensionF;
    }

    public void setExtensionF(String extensionF) {
        this.extensionF = extensionF == null ? null : extensionF.trim();
    }

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