package com.itheima.test4;

/**
 * @author: LOKI
 * @date: 2019/7/22 14:43
 */
public class Fu {
    private int a;
    public Fu() {
        System.out.println("fu中的构造");
    }

    public Fu(int a) {
        this.a = a;
    }

    void show(){
        System.out.println("fu类方法");
    }
    static {
        System.out.println("静态代码块 fu");
    }

}
