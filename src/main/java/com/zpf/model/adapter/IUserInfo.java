package com.zpf.model.adapter;

/**
 * 公司人员对象
 * @author steven.zhu 2020/6/22 16:07.
 * @类描述：
 */
public interface IUserInfo {
    /**
     * 获得用户姓名
     *
     * @return
     */
    String getUserName();

    /**
     * 获得家庭地址
     * @return
     */
    String getHomeAddress();

    /**
     * 获得手机号
     * @return
     */
    String getMobileNumber();

    /**
     * 获得办公号码
     * @return
     */
    String getOfficeTelNumber();

    /**
     * 个人职位
     * @return
     */
    String getJobPosition();

    /**
     * 获取家庭电话
     * @return
     */
    String getHomeTelNumber();
}
