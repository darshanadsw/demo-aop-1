package com.example.demo;

import com.example.demo.business.Business1;
import com.example.demo.business.Business2;
import com.example.demo.business.Business3;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoAop4ApplicationTests {

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    @Autowired
    private Business3 business3;

    @Test
    public void invokeAOPStuff() {

        log.info(business1.calculateSomething());
        log.info(business2.calculateSomething());
        try {
            business3.doThrowing();
        }catch (UnsupportedOperationException e){
            log.info(e.getMessage());
        }
    }

}
