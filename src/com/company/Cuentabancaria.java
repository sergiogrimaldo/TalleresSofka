package com.company;
import java.util.Date;

/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
 */

public class Cuentabancaria {
    /**
     * Variables
     */
    private int accountNumber;
    protected boolean activated;

    //Constructor con parámetros

    public Cuentabancaria(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }


    //Get y Set

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Cuentabancaria{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}
