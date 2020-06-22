package com.zpf.model.adapter;

import java.util.Map;

/**
 * @author steven.zhu 2020/6/22 16:24.
 * @类描述：
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfo = super.getUserBaseInfo();
    private Map<String,String> officeInfo = super.getUserOfficeInfo();
    private Map<String,String> homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        String userName = baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
