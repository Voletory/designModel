package com.zpf.model.status;

public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.close();
    }

    @Override
    public void run() {
        // nothing
    }

    @Override
    public void stop() {
        // nothing
    }
}
