package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    private Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;


    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("too late, sorry");
        } else {
            weight ++;
            System.out.println("thx for food my weight is now " + this.weight);
        }
    }

    void takeForAWalk(){
        weight--;
        if(weight <= 0){
            System.out.println("that a dead animal you freak");
        } else if(weight <= 3){
            System.out.println("thx I'm hungry");
        }else{
            System.out.println("thx for a walk");
        }
    }

    public String toString(){
        return this.species + " " + this.name;
    }
}