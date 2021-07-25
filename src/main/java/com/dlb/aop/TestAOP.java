package com.dlb.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试AOP
 */
public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        MethodService methodService = context.getBean(MethodService.class);

        annotationService.add();
        annotationService.modify();
        annotationService.del();
        annotationService.collect();

        methodService.add();
        context.close();

    }
}
