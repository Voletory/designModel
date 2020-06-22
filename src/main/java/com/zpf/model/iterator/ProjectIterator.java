package com.zpf.model.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author steven.zhu 2020/6/22 17:06.
 * @类描述：
 */
public class ProjectIterator implements IProjectIterator {

    private List<IProject> projectList;

    private int currentNum;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        return this.currentNum < projectList.size() && projectList.get(currentNum) != null;
    }

    @Override
    public IProject next() {
        return projectList.get(currentNum++);
    }

    @Override
    public void remove() {
        projectList.remove(currentNum - 1);
    }
}
