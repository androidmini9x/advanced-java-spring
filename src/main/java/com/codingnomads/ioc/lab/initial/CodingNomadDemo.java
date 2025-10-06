package com.codingnomads.ioc.lab.initial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class CodingNomadDemo {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                CodingNomadConfiguration.class
//        );
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "xml-config/codingnomad_configuration.xml"
        );
        CodingNomad codingNomad = context.getBean(CodingNomad.class);
        System.out.println(codingNomad.createAwesomeSoftware());
    }
}
