package com.weihuagu.receiptnotice.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtil {
    SharedPreferences sharedPref = null;
    Context context = null;

    public PreferenceUtil(Context context) {
        this.context = context;
        init();
    }

    public void init() {
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this.context);

    }

    public String getDeviceid() {
//        return this.sharedPref.getString("deviceid", "");
        return "";
    }

    public boolean isEncrypt() {
//        return this.sharedPref.getBoolean("isencrypt", false);
        return true;
    }

    public boolean isEcho() {
//        return this.sharedPref.getBoolean("isecho", false);
        return false;
    }

    public boolean isWakelock() {
        return this.sharedPref.getBoolean("iswakelock", false);
    }

    public boolean isAppendDeviceiduuid() {
//        return this.sharedPref.getBoolean("isappenddeviceiduuid", false);
        return false;
    }

    public boolean isSkipEncryptDeviceid() {
//        return this.sharedPref.getBoolean("isskipencryptdeviceid", false);
        return false;
    }

    public boolean isTrustAllCertificates() {
//        return this.sharedPref.getBoolean("istrustallcertificates", false);
        return false;
    }
    public boolean isAccessibilityService() {
//        return this.sharedPref.getBoolean("isaccessibilityservice", false);
        return false;
    }
    public boolean isAgreeUserAgreement(){
        return this.sharedPref.getBoolean("isagreeuseragreement", false);
    }
    public void setAgreeUserAgreement(boolean flag){
        SharedPreferences.Editor edit = this.sharedPref.edit();
        //通过editor对象写入数据
        edit.putBoolean("isagreeuseragreement",flag);
        //提交数据存入到xml文件中
        edit.apply();
    }


    public String getEchoServer() {
//        return this.sharedPref.getString("echoserver", null);
        return "";
    }

    public String getEchoInterval() {
//        return this.sharedPref.getString("echointerval", "");
        return "";
    }

    public String getEncryptMethod() {
//        return this.sharedPref.getString("encryptmethod", null);
        return "md5";
    }

    public String getPasswd() {
//        return this.sharedPref.getString("passwd", null);
        return "JKDSAgHG6uhsGDSA75Bg";
    }

    public boolean isRemoveNotification() {
        return this.sharedPref.getBoolean("isremovenotification", false);
    }

    public boolean isPostRepeat() {
//        return this.sharedPref.getBoolean("ispostrepeat", false);
        return false;
    }

    public String getPostRepeatNum() {
//        return this.sharedPref.getString("postrepeatnum", "3");
        return "3";
    }

    public String getCustomOption() {
//        return this.sharedPref.getString("custom_option", "");
        return "";
    }
    public String getEchoCustomOption() {
//        return this.sharedPref.getString("echo_custom_option", "");
        return "";
    }

}
