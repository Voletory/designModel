package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 18:57.
 * @类描述：
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("客户找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个逻辑...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个逻辑...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个逻辑...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求计划一个逻辑...");
    }
}
