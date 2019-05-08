package com.example.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    @Around("@annotation(com.example.demo.aspects.TrackTime)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime =
                System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time Taken by {} is {}",joinPoint,timeTaken);
    }

}
