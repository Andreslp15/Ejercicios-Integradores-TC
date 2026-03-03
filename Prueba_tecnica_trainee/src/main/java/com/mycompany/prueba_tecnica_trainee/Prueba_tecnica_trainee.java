/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba_tecnica_trainee;

import java.util.Scanner;

/**
 *
 * @author andres-lopez
 */
public class Prueba_tecnica_trainee {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Creemos nuestra estructura para el sistema de reservas:
        // Declaracion de variables
        char anfiteatro[][] = new char[10][10];
        boolean seguir = false;
        Scanner teclado = new Scanner(System.in);
        int asiento = 0;
        int fila = 0;
        String respuesta;
        String ver_mapa;

        // Carga de la matriz inicializada en 'L' = libre
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                anfiteatro[i][j] = 'L';
            }
        }

        // Bienvenido al sistema
        System.out.println(" ------ Bienvenido al sistema de reserva ------");

        // Empezamos con la reserva de asientos
        while (!seguir) {
            // Visualizacion del mapa
            System.out.println("Deseas ver los asientos disponibles?. S = si, cualquier otro No");
            ver_mapa = teclado.next();
            // Aca vamos a realizar a realizar la llamada impresion

            if (ver_mapa.equalsIgnoreCase("s")) {
                dibujar_mapa(anfiteatro);
            }
            
            boolean esta_ok = false;
            while (!esta_ok) {

                System.out.println("Ingrese la Fila y asiento que quieras ingresar: ");
                System.out.print("Filas disponibles entre (0-9): ");
                fila = teclado.nextInt();

                System.out.println("Asientos disponibles entre (0-9): ");
                asiento = teclado.nextInt();
                
                if( fila >= 0 && fila < 10 ){
                    if( asiento >= 0 && asiento < 10){
                        esta_ok = true;
                    }else{
                        System.out.println("El numero de asiento no es valido");
                    }
                }else{
                    System.out.println("El numero de fila no es valido");
                }
            }
            
            if (anfiteatro[fila][asiento] == 'L') {
                anfiteatro[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            } else {
                System.out.println("El asiento esta ocupado, eljia otro por favor");
            }

            System.out.println("Deseas Finalizar la reserva?. S = Si, cualquier tecla NO");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("s")) {
                seguir = true;
            }

        }

    }

    static void dibujar_mapa(char matriz[][]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
