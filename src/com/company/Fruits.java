package com.company;
import java.util.ArrayList;
import java.util.Date;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */

public class Fruits {
    /**
     * Variables
     */
     public String name;
    private float averageWeigth;
    private ArrayList<String> colors;
    //public String[] colors;

    /**
     * Crea una instancia de la clase fruits (constructor)
     */
    public Fruits() {
        colors = new ArrayList<String>();
    }

    /**
     * constructor con parámetros
     */

    public Fruits(String name, float averageWeigth, ArrayList<String> colors) {
        this.name = name;
        this.averageWeigth = averageWeigth;
        this.colors = colors;
    }

    /**
     * Get y Set fruta **hacerlo con colors**
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * tostring
     */

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", averageWeigth=" + averageWeigth +
                ", colors=" + colors +
                '}';
    }

    public void setColor(String namecolor){
        this.colors.add(namecolor);
    }
}



