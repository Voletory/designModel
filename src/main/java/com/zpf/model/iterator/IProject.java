package com.zpf.model.iterator;

/**
 * @author steven.zhu 2020/6/22 17:00.
 * @类描述：
 */
public interface IProject {
    void add(String name,int num,int cost);
    String getProjectInfo();
    IProjectIterator iterator();
}
