package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String hairColor;
    private String eyeColor;
    private String address;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void  setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getHeight() {return this.height;}

    public Integer getWeight() {return this.weight;}

    public String getHairColor() {return this.hairColor;}

    public String getEyeColor() {return this.eyeColor;}

    public String getAddress() {return this.address;}
}
