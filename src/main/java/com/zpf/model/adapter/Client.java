package com.zpf.model.adapter;

/**
 * @author steven.zhu 2020/6/22 16:28.
 * @类描述：
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfo();
        userInfo.getMobileNumber();
    }
}
