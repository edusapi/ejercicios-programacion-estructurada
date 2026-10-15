import java.util.EventListener;
import java.util.Scanner;

public class Ejercicio19FactoriaDeUnNumero {
    public static void main(String[] args) {

        boolean esValido = false;
        int numeroUsuario = 0, resultadoFactorial = 1;

        Scanner scanner = new Scanner(System.in);
        String cabecera = """
                
                E J E R C I C I O  19
                *********************
                
                Cálculo del factorial
                
                """;

        System.out.println(cabecera);

        do {
            System.out.print("Introduce el número a calcular su factorial: ");
            try {
                numeroUsuario = scanner.nextInt();
                esValido = true;
            } catch (Exception e) {
                System.out.println("Debes introducir un entero ....");
                scanner.nextLine();
            }
        } while (!esValido);

        System.out.printf("%d! = ",numeroUsuario);
        if (numeroUsuario<0){
            System.out.println("El factorial de un número negativo es 1");
        } else {

            //Calculamos el factorial
            System.out.printf("%d x ", 1);
            for (int i = 2; i < numeroUsuario; i++) {

                resultadoFactorial *= i;
                if (resultadoFactorial < 0) {
                    System.out.println("\n\nEl resultado es demasiado grande para caber en un int");
                    break;
                }
                System.out.printf("%d x ", i);
            }

            if (resultadoFactorial > 0) {
                resultadoFactorial *= numeroUsuario;
                System.out.printf("%d = ", numeroUsuario);
                if (resultadoFactorial < 0) {
                    System.out.println("\n\n El resultado es demasiado grande");
                } else{
                    System.out.printf("%d", resultadoFactorial);
                }

            }




        }
    }
}
