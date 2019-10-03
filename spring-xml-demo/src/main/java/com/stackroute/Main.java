package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1 = (Movie)context.getBean("movieA");
        System.out.println("Actor details using movie bean: " + movie1.getActor());

        Movie movie2 = (Movie)context.getBean("movieB");
        System.out.println("Actor details using movie bean: " + movie2.getActor());

        /* Using autowire="byType" with constructor injection results in
            unsatisfied dependency injection
         */

    }
}
