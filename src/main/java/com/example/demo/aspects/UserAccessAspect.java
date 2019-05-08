package com.example.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class UserAccessAspect {

    @Before("execution(* com.example.demo.business.*.*(..))")
    public void before(JoinPoint jointPoint){
        log.info(" Check for users access ");
        log.info(" Allowed execution for {}",jointPoint);
    }

    @Around(value = "com.example.demo.aspects.CommonJoinPointConfig.dataLayerExecution()")
    public void after(JoinPoint joinPoint){
        log.info("############# execution of this {}",joinPoint);
    }
}
