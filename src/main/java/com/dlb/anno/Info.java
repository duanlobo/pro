package com.dlb.anno;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Info {
    String value() default "remark";
}
