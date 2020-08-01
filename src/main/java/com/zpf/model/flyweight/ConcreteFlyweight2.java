package com.zpf.model.flyweight;

public class ConcreteFlyweight2 extends Flyweight {


    // 接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        // 业务逻辑
    }
}
