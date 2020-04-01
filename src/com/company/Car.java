package com.company;

public class Car {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public final Double engineVolume;

    public String plates;
    private Double value = 2000.0;


    public Car(String producer, String model, Integer yearOfProduction, Double engineVolumne) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineVolume = engineVolumne;
    }

    public Double getValue(){
        return this.value;
    }

    public String toString(){
        return this.producer + " " + this.model + " " + this.plates;
    }
}
