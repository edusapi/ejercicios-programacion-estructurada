import java.util.Scanner;

public class Ejercicio7OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1=0,numero2=0,numero3=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  7
                ********************
                
                Programa que ordena 3 números
                                
                """;

        System.out.println(cabecera);
        try {
            System.out.println("Puntuaciones iniciales");
            System.out.print("numero 1: ");
            numero1 = sc.nextInt();
            System.out.print("numero 2: ");
            numero2 = sc.nextInt();
            System.out.print("numero 3: ");
            numero3 = sc.nextInt();
            esValido = true;

        } catch (Exception e) {
            System.out.println("Los valores introducidos deben de ser enteros");
        }

        if (esValido){
            System.out.println("\n\nPuntuaciones iniciales:");
            System.out.printf("numero 1: %5d \n",numero1);
            System.out.printf("numero 2: %5d \n",numero2);
            System.out.printf("numero 3: %5d \n",numero3);

            int aux = numero1;
            numero1 = numero2;
            numero2 = numero3;
            numero3 = aux;


            System.out.println("\n\nPuntuaciones después de la reorganización:");
            System.out.printf("numero 1: %5d\n",numero1);
            System.out.printf("numero 2: %5d\n",numero2);
            System.out.printf("numero 3: %5d\n",numero3);

        } else {
            System.out.println("Por tanto no se han podido intercambiar.");
        }

    }
}
