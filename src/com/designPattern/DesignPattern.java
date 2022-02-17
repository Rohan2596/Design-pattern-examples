package com.designPattern;


/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Mediator  Design pattern main class
 * @name   : DesignPattern
 * */
public class DesignPattern {

    public static void main(String[] args) {



        User spanishUser= new User("Sofia","SPANISH","Hola amigas");
        System.out.println(spanishUser.translate());

        User englishUser= new User("David","ENGLISH","fine and you");
        System.out.println(englishUser.translate());



    }
}
