package com.company;

import java.util.ArrayList;
/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */
public class Skill {
    /**
     * Definicion de los atributos
     */
    public ArrayList<String> programmingLenguages;

    /**
     * Muestra una lista con las habilidades
     * @return una lista
     */
    public ArrayList<String> getProgrammingLenguages() {
        return programmingLenguages;
    }

    /**
     * Modifica las habilidades
     * @param programmingLenguages
     */
    public void setProgrammingLenguages(ArrayList<String> programmingLenguages) {
        this.programmingLenguages = programmingLenguages;
    }
}