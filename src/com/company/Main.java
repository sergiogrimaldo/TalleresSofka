package com.company;
/**
 * Se importa una libreria.
 */
import javax.swing.*;
/**
 *  Representa un ejercicio de POO basado en diagramas taller 1 Canteras Lvl 2.
 * @author Sergio A. Grimaldo R.
*
 * Representa la clase principal que permite correr el codigo.
 */
public class Main {

    public static void main(String[] args) {
        String name, typeFuel, explore, category, typesensors, solarPanel;
        int weight, power, motors, shuttleVehicle, orbitTime, numberPassengers, numRoboticArms, capacity, limit = 0;

        /**
         * Representa un bucle while que no termina hasta que limit sea igual a 1.
         * Representa la interaccion del programa con el usuario.
         */
        while(limit == 0) {
            int selection = JOptionPane.showOptionDialog(null,"Selecciona un tipo de nave","Creations ships",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,
                    new Object[]{"Sonda", "Nave tripulada", "Nave de mantenimiento", "Nave de carga", "Cerrar"},  "opcion 1");

            /**
             * Representa el condicional switch case con las diferentes naves a crear.
             */
            switch (selection + 1) {
                /**
                 * Representa el caso 1 de la nave tipo Sonda.
                 */
                case 1:
                    System.out.println("\n"+"SONDA");
                    name = JOptionPane.showInputDialog("Ingresa por favor el nombre de la nave");
                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso") );
                    power = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la potencia"));
                    typeFuel = JOptionPane.showInputDialog("Ingresa el tipo de conbustible");
                    motors = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de motores"));
                    shuttleVehicle = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad vehiculos lanzadera"));
                    orbitTime = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tiempo en orbita"));
                    explore = JOptionPane.showInputDialog("Ingresa el area de exploracion");

                    Probe.createProbe(name, weight, power, typeFuel, motors, shuttleVehicle, orbitTime, explore);

                    break;
                /**
                 * Representa el caso 2 de la nave tripulada.
                 */
                case 2:
                    System.out.println("\n"+"NAVE TRIPULADA");
                    name = JOptionPane.showInputDialog("Ingresa el nombre");
                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso") );
                    power = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la potencia"));
                    typeFuel = JOptionPane.showInputDialog("Ingresa el tipo de conbustible");
                    motors = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de motores"));
                    shuttleVehicle = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad vehiculos lanzadera"));
                    numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de pasajeros"));
                    category = JOptionPane.showInputDialog("Ingresa la categoria de la nave");

                    MannedShip.createMannedShip(name, weight, power, typeFuel, motors, shuttleVehicle, numberPassengers, category);

                    break;
                /**
                 * Representa el caso de la nave de mantenimiento.
                 */
                case 3:
                    System.out.println("\n"+"NAVE DE MANTENIMIENTO");
                    name = JOptionPane.showInputDialog("Ingresa el nombre");
                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso") );
                    power = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la potencia"));
                    typeFuel = JOptionPane.showInputDialog("Ingresa el tipo de conbustible");
                    motors = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de motores"));
                    shuttleVehicle = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad vehiculos lanzadera"));
                    numRoboticArms = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de brazos roboticos"));
                    typesensors = JOptionPane.showInputDialog("Ingresa el tipo de sensor");

                    MaintenanceShip.createMaintenanceShip(name, weight, power, typeFuel, motors, shuttleVehicle, numRoboticArms, typesensors);

                    break;
                /**
                 * Representa el caso 4 de la nave de carga.
                 */
                case 4:
                    System.out.println("\n"+"NAVE DE CARGA");
                    name = JOptionPane.showInputDialog("Ingresa el nombre");
                    weight = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el peso") );
                    power = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la potencia"));
                    typeFuel = JOptionPane.showInputDialog("Ingresa el tipo de conbustible");
                    motors = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de motores"));
                    shuttleVehicle = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad vehiculos lanzadera"));
                    capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la capacidad de carga"));
                    solarPanel = JOptionPane.showInputDialog("Tiene paneles solares?");

                    CargoShip.createCargoShip(name, weight, power, typeFuel, motors, shuttleVehicle, capacity, solarPanel);

                    break;
                /**
                 * Representa la condicion final después de que el usuario decida terminar el programa.
                 */
                default:
                    JOptionPane.showMessageDialog(null, "Fin del programa",
                            "null", JOptionPane.INFORMATION_MESSAGE);
                    limit = 1;
                    break;
            }
        }
    }
}
