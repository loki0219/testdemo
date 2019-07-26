package com.itheima.test3;

import java.util.Random;

/**
 * @author: LOKI
 * @date: 2019/7/21 18:36
 */
public class MoNiYingBi {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            boolean b = random.nextBoolean();
            System.out.println(b);
        }
    }
}
