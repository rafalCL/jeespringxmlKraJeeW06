package pl.coderslab.jeespringxml.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.jeespringxml.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
// below commented: how it was without Spring
//        HelloWorld hw = new HelloWorld("Witaj Spring");
//        System.out.println(hw.getMessage());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        final HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);

        System.out.println(hw.getMessage());

        context.close();
    }
}
