package com.fernando.javax;

/**
 * Clase Main para ejecutar la aplicacion.
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 07 de febrero del 2020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ventana ventana = new Ventana("Si me buscas este es mi id " + getPID());
        ventana.setVisible(true);

    }

    public static String getPID() {
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }

}
