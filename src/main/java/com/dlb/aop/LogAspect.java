package com.dlb.aop;


import com.dlb.util.Console;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.dlb.aop.AOPAction)")
    public void annotationPointCut() {
        Console.println("annotationPointCut");
    }

    @Before("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AOPAction aopAction = method.getAnnotation(AOPAction.class);
        Console.println("注解式拦截 ->> " + aopAction.name());
    }

    @After("execution(* com.dlb.aop.MethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Console.println("方法式拦截 ->> " + method.getName());
    }

}
