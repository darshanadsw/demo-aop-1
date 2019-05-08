package com.example.demo.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.example.demo.business.*.*(..))")
    public void dataLayerExecution(){}
}
