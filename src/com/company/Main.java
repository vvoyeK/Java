package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Fado";

        dog.feed();

        Animal lion = new Animal("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Wojtek";
        me.lastName = "WWW";
        me.pet = dog;

        Car dirtyOne = new Car("Ford", "Mustang", 2014, 5.0);
        dirtyOne.plates = "GDA1234";
        me.setCar(dirtyOne);

        System.out.println(me.getCar().plates);

        System.out.println("I earn " + me.getSalary() + "UZB");

        Human myWife = new Human();
        myWife.firstName = "Agnieszka";
        myWife.lastName = "WWW";
        myWife.setSalary(3200.0);

        Car cleanOne = new Car("Ford", "Mustang", 2014, 5.0);
        myWife.setCar(cleanOne);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());
        System.out.println(me);
        System.out.println(me.pet);

    }
}