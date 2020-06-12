package com.zpf.model.origin;

/**
 * @author steven.zhu 2020/6/9 18:32.
 * @类描述：
 */
public class Prototype2 extends PrototypeClass {

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    protected Object clone() {
        Prototype2 proto = (Prototype2) super.clone();
        return proto;
    }

    public static void main(String[] args) {
        Prototype2 s = new Prototype2();
        s.setS("Fdsaf");
        Object clone = s.clone();
        System.out.println(clone);
    }
}
