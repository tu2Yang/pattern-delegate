package com.pattern.delegate.simple;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:28
 * @Version 1.0
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("数据库", new Leader());
    }

}
