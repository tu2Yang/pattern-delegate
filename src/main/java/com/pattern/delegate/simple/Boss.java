package com.pattern.delegate.simple;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:20
 * @Version 1.0
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }

}
