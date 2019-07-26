package com.itheima.test;

/**
 * @author: Loki
 * @date: 2019/7/2 16:01
 */

public class StaticDemo {
    static {
        System.out.println("这是静态代码1");
    }

    public static void main(String[] args) {
        String a=new String();
        //被static修饰的静态方法不依赖对象就可以调用
        test2();
        //普通方法必须被对象调用
        new StaticDemo().test();
    }

    static {
        System.out.println("这是静态代码2");
    }

    public void test() {
        System.out.println("这是自定义方法test");
    }

    public static void test2() {
        System.out.println("这是自定义静态方法test2");
    }
}

