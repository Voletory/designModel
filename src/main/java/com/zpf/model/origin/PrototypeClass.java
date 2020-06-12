package com.zpf.model.origin;

/**
 * @author steven.zhu 2020/6/9 18:28.
 * @类描述：
 */
public class PrototypeClass implements Cloneable {
    private String name;
    private String pepe;

    public PrototypeClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPepe() {
        return pepe;
    }

    public void setPepe(String pepe) {
        this.pepe = pepe;
    }

    @Override
    protected Object clone()  {
        PrototypeClass proto = null;
        try {
             proto = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //
        }
        return proto;
    }

    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        prototypeClass.setName("dafda");
        prototypeClass.setPepe("dsafds");
        PrototypeClass clone = (PrototypeClass) prototypeClass.clone();
        System.out.println(clone.getName());
    }
}
