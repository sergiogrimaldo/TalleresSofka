package com.company;

public class Work {
    /**
     * Definicion de los atributos
     */
    public String employment;
    private int salary;
    protected String company;

    /**
     * Muestra la compañia del empleado;
     * @return nombre de la compañia
     */
    public String getCompany() {
        return company;
    }

    /**
     * Modifica el nombre de la compañia
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }
}
