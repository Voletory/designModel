package com.zpf.model.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author steven.zhu 2020/6/22 16:15.
 * @类描述：
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String,String> getUserBaseInfo() {
        Map<String,String> baseInfoMap = new HashMap();
        baseInfoMap.put("userName","混世魔王");
        baseInfoMap.put("mobileNumber","这个员工电话是...");
        return baseInfoMap;
    }

    @Override
    public Map<String,String> getUserOfficeInfo() {
        Map<String,String> userOfficeInfo = new HashMap();
        userOfficeInfo.put("jobPosition","员工职位...");
        userOfficeInfo.put("officeTelNumber","办公室号码...");
        return userOfficeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String,String> userHomeInfo = new HashMap();
        userHomeInfo.put("homeTelNumber","员工家庭电话...");
        userHomeInfo.put("homeAddress","员工家庭住址...");
        return userHomeInfo;
    }
}
