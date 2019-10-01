package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        //Using XmlBeanFactory
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Movie movie1 = factory.getBean("movie1",Movie.class);

        System.out.println("XmlBeanFactory Movie details: " + movie1);


        //Using  Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie2 = (Movie)((DefaultListableBeanFactory)(beanDefinitionRegistry)).getBean("movie2");
        System.out.println("BeanDefinitionRegistry Movie details: " + movie2);


        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3 = (Movie)context.getBean("movie3");

        System.out.println("ApplicationContext Movie details: " + movie3);

    }
}
