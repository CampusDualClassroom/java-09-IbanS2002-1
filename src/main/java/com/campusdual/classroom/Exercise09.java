package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(10);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        int X = 0; // Inicializamos el valor de X en 0

        // Bucle do-while
        do {
            // Muestra el valor con el que entra al bucle
            System.out.println("Entra con valor: " + X + ", sale con valor: " + (X + 1));

            // Incrementamos X en 1
            X++;


            System.out.println("Entra con valor: " + X + ", sale con valor: " + (X + 1));

        } while (X < num); // Continúa el bucle mientras X sea menor que num
    }
}