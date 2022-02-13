package com.company;
import java.util.Date;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */


public class Person {
    /**
     * Se define los atributos
     */

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    /**
     * Devuelve el nombre de la persona
     * @return nombre persona
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica el nombre de la persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
