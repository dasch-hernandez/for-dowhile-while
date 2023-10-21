//Programa No. 01 Ciclo for en sumatoria y promedio de edades
//20 de Octubre 2023
//Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Edades{

        public static void main(String[] args) {
            
            int edad, suma=0;
            float prom;

            Scanner age = new Scanner (System.in);
                for(int i=1;i<=10;i++){
                    System.out.print("Ingresa edad: ");
                    edad = age.nextInt();
                    suma=suma+edad;
                }
                prom=suma/10;

            System.out.println("El promedio de las edades es de: "+prom);

        }

    }