package com.company;
import java.util.Date;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */


public class Person {
    /**
     * Variables
     */

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;


    //Constructor por defecto
    public Person() {
    }

    //Constructor con parámetros
 public Person(String name, String lastName1, String lastName2, Date dateBirth, Float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
 }

    //Get y Set persona


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //tostring

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}
