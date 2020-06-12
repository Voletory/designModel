package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 18:59.
 * @类描述：
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
