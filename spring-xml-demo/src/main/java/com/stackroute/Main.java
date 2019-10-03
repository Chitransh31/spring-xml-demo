package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean) context.getBean
                ("beanLifecycleDemoBean");
        System.out.println(beanLifecycleDemoBean);
        beanLifecycleDemoBean.customInit();
        beanLifecycleDemoBean.customDestroy();

        context.close();

    }
}
