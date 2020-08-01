package com.zpf.model.status;

public class RunningState extends LiftState {
    @Override
    public void open() {
        // nothing
    }

    @Override
    public void close() {
        // nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行....");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
