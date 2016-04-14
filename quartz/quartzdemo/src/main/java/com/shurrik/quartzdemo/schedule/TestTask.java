package com.shurrik.quartzdemo.schedule;

import org.springframework.stereotype.Service;

/**
 * Created by lip on 2016-04-14.
 */
@Service
public class TestTask {
    public void execute() throws Exception {
        System.out.println("testTask开始！");
        System.out.println("testTask结束！");
    }
}
