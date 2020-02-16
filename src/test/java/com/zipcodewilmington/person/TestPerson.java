package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedHeight = 0;
        Integer expectedWeight = 0;
        String expectedHairColor = null;
        String expectedEyeColor = null;
        String expectedAddress = null;





        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualAddress = person.getAddress();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        //Given
        Person person = new Person();
        Integer expected = 72;
        //When
        person.setHeight(expected);
        //Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        //Given
        Person person = new Person();
        Integer expected = 180;
        //When
        person.setWeight(expected);
        //Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        //Given
        Person person = new Person();
        String expected = "Brown";
        //When
        person.setHairColor(expected);
        //Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEyeColor() {
        //Given
        Person person = new Person();
        String expected = "Blue";
        //When
        person.setEyeColor(expected);
        //Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddress() {
        //Given
        Person person = new Person();
        String expected = "100 Coder Lane";
        //When
        person.setAddress(expected);
        //Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }
}
