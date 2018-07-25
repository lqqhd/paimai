package me.jessyan.armscomponent.commonres.utils;

public class AppUpdate {


    /**
     * Code : 200
     * Msg : 有新版本
     * UpdateStatus : 1
     * VersionCode : 1
     * ModifyContent : 1测试下载2、本次更新没内容
     * DownloadUrl : http://123.woaixuxiaoxing.com
     * ApkSize : 13.7000
     */

    private int Code;
    private String Msg;
    private String UpdateStatus;
    private String VersionCode;
    private String ModifyContent;
    private String DownloadUrl;
    private String ApkSize;

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public String getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(String UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    public String getVersionCode() {
        return VersionCode;
    }

    public void setVersionCode(String VersionCode) {
        this.VersionCode = VersionCode;
    }

    public String getModifyContent() {
        return ModifyContent;
    }

    public void setModifyContent(String ModifyContent) {
        this.ModifyContent = ModifyContent;
    }

    public String getDownloadUrl() {
        return DownloadUrl;
    }

    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    public String getApkSize() {
        return ApkSize;
    }

    public void setApkSize(String ApkSize) {
        this.ApkSize = ApkSize;
    }
}
