package com.itheima.test3;

/**
 * @author: LOKI
 * @date: 2019/7/21 18:22
 */
public class ComputingSpeed {
    public static void main(String[] args) {

        double speed = methodSpeed(20, 100);
        System.out.println(speed);
    }

    /**
     * 计算速度
     * @param time
     * @param distance
     * @return speed
     */
    public static double methodSpeed(double time ,double distance){
        double speed = distance / time;
        return speed;
    }
}
