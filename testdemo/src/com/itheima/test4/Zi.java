package com.itheima.test4;

/**
 * @author: LOKI
 * @date: 2019/7/22 14:43
 */
public class Zi extends Fu {
    public Zi() {
        System.out.println("zi中的构造");
    }

    public Zi(int a) {
        super(a);
    }

    @Override
    void show(){
        System.out.println("zi");
    }
    static {
        System.out.println("静态代码块 zi");
    }
}
