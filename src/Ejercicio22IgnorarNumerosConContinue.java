import java.util.Locale;
import java.util.Scanner;

public class Ejercicio22IgnorarNumerosConContinue {
    public static void main(String[] args) {

        boolean esValido = false;
        int numeroUsuario = 0, numeroAux, numeroCifras = 0, numeroPares = 0, numeroImpares = 0, cifra = 0;

        /*
    Crea un programa que solicite números enteros al usuario hasta que introduzca un `0`.
    El programa debe mostrar únicamente los números positivos.
    Si se introduce un número negativo deberá mostrar un mensaje indicando que el número se ignora y continuar solicitando otro número.
    Debes de utilizar `continue` para ignorar los números negativos.
         */

        Scanner scanner = new Scanner(System.in);
        int numero=0;
        String opcion = "";

        String cabecera = """
                
                E J E R C I C I O  22
                *********************
                Ignorar número con el continue
                                
                """;


        System.out.println(cabecera);

        do {

            System.out.print("Introduce un número: ");
            numero = Funciones.dameUnEntero();
            if (numero<0) {
                System.out.println("El número es negativo, se ignora.");
                continue;
            }

            if (numero != 0){
                System.out.printf("Número válido: %d\n",numero);
            }


        }while(numero != 0);
        System.out.println("\nFin del programa");
    }

}
