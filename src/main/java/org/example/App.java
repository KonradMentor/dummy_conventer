package org.example;

import org.example.formatter.Formatter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("fileType", args[1]);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        ((Formatter) applicationContext.getBean("formatter")).doFormatting(args[0]);
    }
}
