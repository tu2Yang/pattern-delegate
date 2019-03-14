package com.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:20
 * @Version 1.0
 */
public class Leader {

    private Map<String, IEmployee> register = new HashMap<String, IEmployee>();

    public Leader() {
        register.put("数据库", new EmplyeeA());
        register.put("登陆", new EmplyeeB());
    }

    public void doing(String command) {
        register.get(command).doing(command);
    }

}
