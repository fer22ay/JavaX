package com.fernando.javax;

import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 09 de febrero del 2020
 */
public class Cambio {

    /**
     * Programa que devuelve el vuelto desglozado en billetes o monedas
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Cantidad = quantity;
        double quantity = 0;

        do {
            try {
                System.out.print("Ingresa la cantidad a devolver : ");
                quantity = sc.nextDouble();

            } catch (Exception e) {
                System.out.println("Intruduciste un dato erroneo");
                System.out.println("");
                sc.nextLine();
            }
        } while (quantity <= 0);
        //Llamamos al metodo calcular()
        calcular(quantity);

    }

    private static void calcular(double quantity) {

        //Indicamos las monedas posibles
        //coins = monedas
        double coins[] = {200, 100, 50, 20, 10, 5, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

        //Este array contendra las monedas a devolver
        //Debe ser la misma cantidad de monedas = coins
        double vuelto[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        //Recorremos todas las monedas
        for (int i = 0; i < coins.length; i++) {

            //Si la cantidad actual, es superior a la moneda
            if (quantity >= coins[i]) {
                //Obtenemos cantidad de monedas
                vuelto[i] = Math.floor(quantity / coins[i]);
                quantity = quantity - (vuelto[i] * coins[i]);
            }

        }

        for (int i = 0; i < coins.length; i++) {

            if (vuelto[i] > 0) {
                if (coins[i] > 2) {
                    System.out.println("Hay " + vuelto[i] + " billetes de Q: " + coins[i]);
                } else {
                    System.out.println("Hay " + vuelto[i] + " monedas de Q: " + coins[i]);
                }
            }

        }

    }

}
