package com.dlb.aop;

import com.dlb.util.Console;
import org.springframework.stereotype.Service;

@Service
public class MethodService {
    public void add(){
        Console.println("执行" + this.getClass().getSimpleName() + "的添加方法");
    }
}
