package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 19:00.
 * @类描述：
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
