package com.configration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teat {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);
      Student student = context.getBean(Student.class);
      student.display();
    }
}
