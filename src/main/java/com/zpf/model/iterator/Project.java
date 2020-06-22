package com.zpf.model.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steven.zhu 2020/6/22 17:01.
 * @类描述：
 */
public class Project implements IProject {

    private static final List<IProject> projectList = new ArrayList<>();

    private String name;
    private int num;
    private int cost;

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info += "项目名称是:" + this.name;
        info += "\t项目人数:" + this.num;
        info += "\t项目费用:" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}
