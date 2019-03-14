package com.pattern.delegate.simple;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:25
 * @Version 1.0
 */
public class EmplyeeA implements IEmployee {

    public void doing(String command) {
        System.out.println("数据库管理员");
    }

}
