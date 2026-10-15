import java.util.Scanner;

public class Ejercicio17AnalisisSecuenciaNumeros {
    public static void main(String[] args) {
        String cabecera = """
                
                E J E R C I C I O  17
                *********************
                Programa que solicite al usuario números enteros. El programa continuará solicitando números hasta
                que se introduzca un cero.
                Al finalizar mostrará:
                    La suma de todos los números positivos introducidos
                    El número mayor
                    El número menor
                """;

        int numeroMayor=0, numeroMenor=0, sumaNumerosPositivos=0;
        int cantidadNumerosPositivos=0;
        int numeroActual=0;
        boolean esValido = false;
        Scanner sc = new Scanner(System.in);

        System.out.println(cabecera);

        do{
            try {
                System.out.print("Introduce un número: ");
                numeroActual = sc.nextInt();
                esValido = true;
                numeroMayor = numeroMenor = numeroActual;
            } catch (Exception e) {
                System.out.println("Debes de introducir un número.");
                sc.nextLine();
            }
        } while (!esValido);

        while(numeroActual !=0){
            try{

                if (numeroActual>=0){
                    sumaNumerosPositivos+= numeroActual;
                    cantidadNumerosPositivos++;
                    if (numeroActual > numeroMayor){
                        numeroMayor = numeroActual;
                    } else if (numeroActual < numeroMenor){
                        numeroMenor = numeroActual;
                    }
                }

                System.out.print("Introduce un número: ");
                numeroActual = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Debes de introducir un entero \n");
                sc.nextLine();
                numeroActual = -1;
            }

        }

        System.out.printf("\nSuma: %d\n", sumaNumerosPositivos);
        System.out.printf("El número menor es: %d\n", numeroMenor);
        System.out.printf("El número mayor es: %d\n", numeroMayor);
        System.out.printf("El número de positivos es: %d\n", cantidadNumerosPositivos);

    }
}
