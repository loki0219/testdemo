package com.itheima.test1;

/**
 * @author: Loki
 * @date: 2019/7/2 16:54
 */
public class test1 {
    private String a="私有的成员变量";
    private void test(){
        System.out.println(a);
        System.out.println("私有的方法");
    }

    protected String b="受保护的成员变量";
    protected void test1(){
        System.out.println("受保护的方法");
    }

    String c="默认";
    void test2(){
        System.out.println("默认方法");
    }


    public String d="公共的";
    public void test3(){
        System.out.println("公共的方法");
    }
}
