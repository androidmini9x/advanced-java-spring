package com.codingnomads.corespring.examples.springbeanlifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class SBean implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("SBean: " + name);
    }
}
