package ru.dima.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computerBean", Computer.class);

        computer.computerOn();
        System.out.println("");
        computer.computerOff();
    }
}
