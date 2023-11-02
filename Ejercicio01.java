/*1. Escribir un programa que solicite la carga de un numero entre 0 y 999, y
nos muestre un mensaje de cuantos dígitos tiene el mismo.
Finalizar el programa cuando se cargue el valor 0.*/

import java.util.Scanner;

    public class Ejercicio01 {

        public static void main(String[] args) {
            
            Scanner leer = new Scanner(System.in);

            int numero;

            do{

                System.out.print("Ingrese un numero entre el 0 y el 999(Ingrese 0 para cerrar el programa): ");
                numero = leer.nextInt();

                if(numero>=100){
                    System.out.println("El numero tiene 3 digitos");
                } else if (numero>=10){
                    System.out.println("El numero tiene 2 digitos");
                } else {
                    System.out.println("El numero tiene 1 digito");
                }

            } while (numero!=0);

        }
        
    }
