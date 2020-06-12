package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 19:00.
 * @类描述：
 */
public class Client {
    public static void main(String[] args) {
        Invoker s = new Invoker();

        // 客户删除一个页面
        System.out.println("------客户要求删除一个页面----------");
        DeletePageCommand deletePageCommand = new DeletePageCommand();

        //接头人接到命令
        s.setCommand(deletePageCommand);
        //接头人执行命令
        s.action();
    }
}
