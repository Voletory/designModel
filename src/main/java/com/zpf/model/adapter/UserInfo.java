package com.zpf.model.adapter;

/**
 * @author steven.zhu 2020/6/22 16:10.
 * @类描述：
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫: ...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭住址是: ...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码是: ...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室号码是: ...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位是: ...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭号码是:...");
        return null;
    }
}
