package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : ");
    }

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    public void customInit() {
        System.out.println("Custom Init Message!");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy Message!");
    }

}
