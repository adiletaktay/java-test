package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Rex");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Doberman");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

//        System.out.println("Переменные ссылаются на один и тот же обьект? " +
//                (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
