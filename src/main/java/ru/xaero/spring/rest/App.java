package ru.xaero.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.xaero.spring.rest.configuration.Config;
import ru.xaero.spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        Employee empById = communication.getEmployee(7);
        System.out.println(empById);

        communication.deleteEmployee(6);
    }
}
