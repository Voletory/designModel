package com.zpf.model.flyweight;

public class ConcreteFlyweight1 extends Flyweight {


    // 接受外部状态
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        // 业务逻辑
    }
}
