import java.util.Scanner;

public class Ejercicio04NumeroParImpar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean esValido = false;
        String cabecera = """
                
                E J E R C I C I O  4
                ********************
                
                Programa que determina si un número es par o impar
                
                """;

        System.out.println(cabecera);
        System.out.print("Introduce el número a determinar: ");
        try {
            numero = sc.nextInt();
            esValido = true;
        } catch (Exception e) {
            System.out.println("Valor no permitido.");
        }

        if (esValido) {

            //Condicional ternario
            System.out.println(numero % 2 == 0?"El número es par":"El número es impar");

            // Sentencias equivalentes al condicional ternario
            /*if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }*/

        }
    }
}

