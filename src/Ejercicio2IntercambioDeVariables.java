import java.util.Scanner;

public class Ejercicio2IntercambioDeVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugador1=0,jugador2=0,jugador3=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  2
                ********************
                
                Programa que intercambia tres variables
                                
                """;

        System.out.println(cabecera);
        try {
            System.out.println("Puntuaciones iniciales");
            System.out.print("Jugador 1: ");
            jugador1 = sc.nextInt();
            System.out.print("Jugador 2: ");
            jugador2 = sc.nextInt();
            System.out.print("Jugador 3: ");
            jugador3 = sc.nextInt();
            esValido = true;

        } catch (Exception e) {
            System.out.println("Los valores introducidos deben de ser enteros");
        }

        if (esValido){
            System.out.println("\n\nPuntuaciones iniciales:");
            System.out.printf("Jugador 1: %5d \n",jugador1);
            System.out.printf("Jugador 2: %5d \n",jugador2);
            System.out.printf("Jugador 3: %5d \n",jugador3);

            int aux = jugador1;
            jugador1 = jugador2;
            jugador2 = jugador3;
            jugador3 = aux;


            System.out.println("\n\nPuntuaciones después de la reorganización:");
            System.out.printf("Jugador 1: %5d\n",jugador1);
            System.out.printf("Jugador 2: %5d\n",jugador2);
            System.out.printf("Jugador 3: %5d\n",jugador3);

        } else {
            System.out.println("Por tanto no se han podido intercambiar.");
        }

    }
}
