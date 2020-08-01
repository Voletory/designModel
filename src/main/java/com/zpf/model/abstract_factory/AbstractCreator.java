package com.zpf.model.abstract_factory;

/**
 * 有N个产品族，在抽象工厂中就应该有N个创建方法
 */
public abstract class AbstractCreator {
    // 创建A产品家族
    public abstract AbstractProductA createProductA();
    // 创建B产品家族
    public abstract AbstractProductB createProductB();
}
