package com.shijiu.dnftool.test;

/**
 * @Date: 2023-11-03-11:11
 * @Description: 测试 java接口和实现类 在springboot 中的自动装配
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

    @Qualifier("Fish") //通过@Qualifier注解进行了注入需要的实现类
    @Autowired
    private Action fishAction;

    @Qualifier("People")
    @Autowired
    private Action peopleAction;

    @Test
    public void testOne(){
        fishAction.speakName();
        peopleAction.speakName();
    }

    @Test
    public void testTwo(){
        fishAction.speakName();
    }
}



