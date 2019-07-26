package com.itheima.test;

import java.sql.SQLOutput;

/**
 * @author: Loki
 * @date: 2019/7/2 16:22
 */
public class Out {

    public static void main(String[] args) {
        System.out.println("---------------------");
        Inner1 inner1 = new Inner1();
        inner1.test();
        inner1.test1();
    }

    public static class Inner{
        public void in(){
            System.out.println("静态内部类的方法");
        }
        public static void inStatic(){
            System.out.println("静态内部类的静态方法");
        }
    }

    public static class Inner1{
        private void test(){
            System.out.println("私有方法");
        }
        public   void test1(){
            System.out.println("公共方法");
        }
    }
}
