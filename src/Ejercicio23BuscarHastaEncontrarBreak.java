import java.util.Scanner;

public class Ejercicio23BuscarHastaEncontrarBreak {
    public static void main(String[] args) {

      /*
    Crea un programa que solicite números enteros al usuario hasta que introduzca un `0`.
    El programa debe mostrar únicamente los números positivos.
    Si se introduce un número negativo deberá mostrar un mensaje indicando que el número se ignora y continuar solicitando otro número.
    Debes de utilizar `continue` para ignorar los números negativos.
         */

        Scanner scanner = new Scanner(System.in);
        int numeroGenerado = 0;
        String opcion = "";

        String cabecera = """
                
                E J E R C I C I O  23
                *********************
                Buscar hasta encontrar con break
                
                """;


        System.out.println(cabecera);


        for (int i = 0; i < 1000; i++) {
            numeroGenerado = Funciones.dameEnteroAleatorio(1,100);
            System.out.printf("Número generado %2d : %d\n",i+1, numeroGenerado);

            if (numeroGenerado == 50){
                System.out.println("Ha aparecido el número 50");
                break;
            }

        }



    }

}
