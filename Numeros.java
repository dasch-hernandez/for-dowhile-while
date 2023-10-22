import java.util.Scanner;
    public class Numeros
    {
        public static void main(String [] a)
        {
            int x;
            Scanner leer = new Scanner(System.in);
            System.out.println ("Programa que determina si un numero es multiplo de 5\n\n");
            System.out.println ("Presiona un cero o negativo cuando quieras que termine el ciclo\n\n");
            do
            {
            System.out.println ("Escribe un numero entero ");
            x=leer.nextInt();
            if (x>0)
            {
            if (x%5==0)
            {
            System.out.println ("El numero "+x+" es multiplo de 5 \n");
            }
            else
            {
            System.out.println ("El numero "+x+" NO es multiplo de 5 \n");
            }
            }
            else
            {
            System.out.println ("Gracias por usar el programa");
            }
            }
            while (x>0);
        }
    }