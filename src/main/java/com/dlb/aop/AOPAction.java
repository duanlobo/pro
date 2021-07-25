package com.dlb.aop;

import java.lang.annotation.*;

/**
 * 子定义注解
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AOPAction {
    String name();
}
