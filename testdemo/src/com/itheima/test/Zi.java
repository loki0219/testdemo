package com.itheima.test;

/**
 * @author: Loki
 * @date: 2019/7/2 16:12
 */
public class Zi extends Fu {
    static {
        System.out.println("子类中的静态代码块");
    }
    public Zi() {
        System.out.println("子类中的构造方法");
    }

    @Override
    public void show() {
        System.out.println("继承的父类的show方法");
    }

}
