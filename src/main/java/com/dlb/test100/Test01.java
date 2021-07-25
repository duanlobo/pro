package com.dlb.test100;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + " --> " + properties.getProperty(key));
        }

    }

}
