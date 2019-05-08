package com.example.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class AfterAopAspect {

    @AfterReturning(value = "execution(* com.example.demo.business.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "execution(* com.example.demo.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("after execution of {}", joinPoint);
    }

    @AfterThrowing(pointcut = "execution(* com.example.demo.business.*.*(..))", throwing = "throwing")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwing) {
        log.info("^^^^^^^^^^^^^ {} Threw it : {}", joinPoint, throwing.getMessage());
    }

}
