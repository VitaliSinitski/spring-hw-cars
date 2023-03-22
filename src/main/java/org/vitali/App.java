package org.vitali;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Firm firm = context.getBean("firm", Firm.class);
        firm.driveCar();
        System.out.println(firm.getName());
        System.out.println(firm.getAge());

        context.close();
    }
}
