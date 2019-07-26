package com.itheima.test;

/**
 * @author: LOKI
 * @date: 2019/7/19 18:33
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Teacher teacher = new Teacher();

        person.doSomething(teacher);

        person.doSomething(person);

        TypeTest test = new TypeTest();
        String s = test.i.toString();
        System.out.println(s);
    }
}
