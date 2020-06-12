package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 18:56.
 * @类描述：
 */
public class PageGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("客户需求美工增加一个页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户需求美工删除一个页面...");
    }

    @Override
    public void change() {
        System.out.println("客户需求美工修改一个页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户需求美工计划一个页面...");
    }
}
