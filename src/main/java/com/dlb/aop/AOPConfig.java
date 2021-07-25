package com.dlb.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.dlb.aop")
@EnableAspectJAutoProxy
public class AOPConfig {

}
