package org.example;

import com.autoWire.Emp;
import com.beanLifecycle.AnnotationExample;
import com.beanLifecycle.Pepsi;
import com.beanLifecycle.Samosa;
import com.constuctorInjection.Addition;
import com.constuctorInjection.Person;
import com.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");


        Student student=(Student) context.getBean("student1");
        System.out.println(student);
        System.out.println(context.getBean("student2"));
        System.out.println(context.getBean("student3"));


        ApplicationContext context1=new ClassPathXmlApplicationContext("empconfig.xml");
        System.out.println(context1.getBean("emp1"));

        ApplicationContext context3= new ClassPathXmlApplicationContext("refConfig.xml");
        System.out.println(context3.getBean("aref"));

        A temp= (A) context3.getBean("aref");
        System.out.println(temp.getB().getY());

        ApplicationContext context4=new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person=(Person) context4.getBean("person");
        System.out.println(person);

        Addition add= (Addition) context4.getBean("add");
        add.doSum();

        AbstractApplicationContext context5=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Samosa samosa=(Samosa) context5.getBean("samosa1");
        System.out.println(samosa);
        context5.registerShutdownHook();

        Pepsi pepsi=(Pepsi) context5.getBean("pepsi1");
        System.out.println(pepsi);

        AnnotationExample annotationExample= (AnnotationExample) context5.getBean("anoexp");
        System.out.println(annotationExample);


        ApplicationContext context6 = new ClassPathXmlApplicationContext("autoComfig.xml");
        Emp emp1 = (Emp) context6.getBean("emp1");
        System.out.println(emp1);

        com.autoWire.annotation.Emp emp2= (com.autoWire.annotation.Emp) context6.getBean("emp2");
        System.out.println(emp2);



    }
}