import java.util.Scanner;
    public class Clave {

        public static void main(String [] a) {

            Scanner leer = new Scanner(System.in);
            int claveValida = 9999;
            int claveUsuario;
            do {
            System.out.println("Introduce una clave de 4 digitos: ");
            claveUsuario=leer.nextInt();
            if (claveUsuario != claveValida)
            System.out.println("Error, intenta de nuevo \n");
            } while (claveUsuario != claveValida);
            System.out.print("Acceso Correcto, Clave Valida");
        }
    }