package com.itheima.test4;

/**
 * @author: LOKI
 * @date: 2019/7/22 14:34
 */
public class Bath {
    private  int a;
    // private String string="成员变量";
    private String string;


    public Bath() {
        System.out.println(string);
    }

    public Bath(int a) {
        this.a = a;
        System.out.println(this.a);
        System.out.println(string);
    }
}
