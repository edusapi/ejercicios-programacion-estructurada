import java.util.Scanner;

public class Ejercicio24BuscarNumeroEspecial {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int numeroIntroducido = 0;
        int totalNumerosIntroducidos = 0;

        String cabecera = """
                
                E J E R C I C I O  24
                *********************
- Los números negativos no se tendrán en cuenta y se continuará solicitando números mediante `continue`
- Los números positivos se irán contabilizando
- Si el usuario introduce el número 100, el programa deberá mostrar un mensaje indicando que se ha encontrado el número especial y **terminar inmediatamente el programa**
- Si se introducen 10 números positivos sin encontrar el 100, el programa finalizará también su ejecución
- Al finalizar, mostrará cuántos números positivos se han introducido
                
                """;


        System.out.println(cabecera);


        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = Funciones.dameUnEntero();
            if (numeroIntroducido < 0) {
                System.out.println("El número es negativo. Se ignora.");
                continue;
            }
            totalNumerosIntroducidos++;

            if (numeroIntroducido == 100){
                System.out.println("¡Se ha encontrado el número especial 100!");
                break;
            }

        }

        System.out.printf("Números positivos introducidos: %d", totalNumerosIntroducidos);



    }

}
