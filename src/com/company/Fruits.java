package com.company;
import java.util.ArrayList;
import java.util.Date;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */

public class Fruits {
    /**
     * Definimos los atributos
     */
    public String name;
    private float averageWeigth;
    private ArrayList<String> colors;
    //public String[] colors;

    /**
     * Muestra una lista con los colores
     * @return una lista
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Modifica la lista de colores
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}


