package com.itheima.test3;

/**
 * @author: LOKI
 * @date: 2019/7/21 18:29
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer i = new Integer(147);
        Integer j = new Integer(147);
        System.out.println(i==j);
        System.out.println(i!=j);

        //equal 和==测试
        Dog dog = new Dog();
        Dog dog2 = new Dog();
    }
}
