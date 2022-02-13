package com.company;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */
public class Users {

    /**
     * Definicion de los atributos
     */
    protected String user;
    private int password;

    /**
     * Muestra el nombre de usuario
     * @return el nombre del usuario
     */
    public String getUser() {
        return user;
    }

    /**
     * Modifica el nombre de usuario
     * @param user
     */
    public void getUser(String user){
        this.user = user;
    }
}