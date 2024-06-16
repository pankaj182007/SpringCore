package com.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AnnotationExample(String subject) {
        this.subject = subject;
    }

    public AnnotationExample() {
    }

    @Override
    public String toString() {
        return "AnnotationExample:-------------" +'\n'+
                "subject=" + subject;
    }

    @PostConstruct
    public void start()
    {
        System.out.println("starting Method");
    }

    @PreDestroy
    public void end()
    {
        System.out.println( "Ending Method");
    }
}
