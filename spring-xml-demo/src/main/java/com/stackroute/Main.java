package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1 = (Movie)context.getBean("movieA");
        System.out.println(movie1);

        // BeanNameAware & BeanFactoryAware
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie3 = (Movie)beanFactory.getBean("movieC");
        System.out.println(movie3);
    }
}
