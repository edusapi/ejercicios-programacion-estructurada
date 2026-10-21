import java.util.Scanner;

public class Ejercicio20ContarYSumarCifras {
    public static void main(String[] args) {

        boolean esValido = false;
        int numeroUsuario=0, numeroAux, numeroCifras=0, numeroPares=0, numeroImpares=0, cifra=0;


        /*
            Crea un programa que solicite al usuario un número entero positivo y analice sus cifras utilizando un bucle
            while . El programa debe de indicar:
            Cuántas cifras tiene el número
            Cuántas de ellas son pares
            Cuántas de ellas son impares
            La suma de las cifras pares
         */

        Scanner scanner = new Scanner(System.in);
        String cabecera = """
                
                E J E R C I C I O  20
                *********************
                
                A partir de un número nos dice:
                    - Cuántas cifras tiene el número
                    - Cuántas de ellas son pares
                    - Cuántas de ellas son impares
                    - La suma de las cifras pares
                    
                """;

        System.out.println(cabecera);

        do {
            System.out.print("Introduce el número a calcular: ");
            try {
                numeroUsuario = scanner.nextInt();
                esValido = true;
            } catch (Exception e) {
                System.out.println("Debes introducir un entero ....");
                scanner.nextLine();
            }
        } while (!esValido);

        numeroAux = numeroUsuario;

        while(numeroAux > 0) {
            numeroCifras++;
            cifra = numeroAux % 10;
            switch (cifra % 2) {
                case 0:
                    numeroPares++;
                    break;
                case 1:
                    numeroImpares++;
                    break;
            }
            numeroAux = numeroAux / 10;
        }

        System.out.println("\n R E S U L T A D O S");
        System.out.println("---------------------\n");
        System.out.println("Número de original: " + numeroUsuario);
        System.out.println("Número de cifras: " + numeroCifras);
        System.out.println("Número de pares: " + numeroPares);
        System.out.println("Número de impares: " + numeroImpares);


        }
}
