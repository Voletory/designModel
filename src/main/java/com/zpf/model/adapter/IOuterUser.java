package com.zpf.model.adapter;

import java.util.Map;

/**
 * 劳务公司人员对象
 * @author steven.zhu 2020/6/22 16:14.
 * @类描述：
 */
public interface IOuterUser {
    Map<String,String> getUserBaseInfo();
    Map<String,String> getUserOfficeInfo();
    Map<String,String> getUserHomeInfo();
}
