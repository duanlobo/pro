package com.dlb.aop;

import com.dlb.util.Console;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    @AOPAction(name = "注解式拦截的方法")
    public void add() {
        Console.println("执行" + this.getClass().getSimpleName() + "的添加方法");
    }

    @AOPAction(name = "注解式拦截的方法")
    public void modify() {
        Console.println("执行" + this.getClass().getSimpleName() + "的修改方法");
    }

    @AOPAction(name = "注解式拦截的方法")
    public void del() {
        Console.println("执行" + this.getClass().getSimpleName() + "的删除方法");
    }

    @AOPAction(name = "注解式拦截的方法")
    public void collect() {
        Console.println("执行" + this.getClass().getSimpleName() + "的数据汇总方法");
    }
}
