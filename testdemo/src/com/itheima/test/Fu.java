package com.itheima.test;

/**
 * @author: Loki
 * @date: 2019/7/2 16:11
 */
public abstract class Fu {
    static {
        System.out.println("父类静态代码块");
    }

    public Fu() {
        System.out.println("父类的构造方法");
    }
    public  void show(){
        System.out.println("父类的受方法");
    }
    public  void show1(){
        System.out.println("父类的方法被执行");
    }


}
