package com.zpf.model.status;

public class StoppingState extends LiftState {

    @Override
    public void open() {
        context.setLiftState(Context.openingState);
        context.open();
    }

    @Override
    public void close() {
        //
    }

    @Override
    public void run() {
        context.setLiftState(Context.runningState);
        context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
