package org.zhouyu.spring.p1.l1;

/**
 * @author 周宇
 * @create 2021-09-22 23:47
 * 程序清单1.1 Spring不会在HelloWordBean上有任何不合理的要求
 */
public class HelloWorldBean {
    public String sayHello(){
        return "Hello World";
    }
}

/**
 * 可以看到，这是一个简单普通的Java类——POJO。
 * POJO可以通过DI来装配它们
 */
