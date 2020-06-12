package com.zpf.model.command;

/**
 * @author steven.zhu 2020/6/11 18:52.
 * @类描述：
 */
public abstract class Command {
    protected PageGroup pageGroup = new PageGroup();
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
