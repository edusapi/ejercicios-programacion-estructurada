import java.util.Scanner;

public class Ejercicio07OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1=0,numero2=0,numero3=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  7
                ********************
                
                Programa que ordena 3 números de menor a mayor
                                
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
            System.out.println("\n Números ordenados de menor a mayor");

            //El número 1 es el mayor
            if (numero1 > numero2 && numero1 > numero3){
                if (numero2 > numero3){
                    System.out.printf("El orden es el siguiente %d %d %d",numero3,numero2,numero1);
                } else {
                    System.out.printf("El orden es el siguiente %d %d %d",numero2,numero3,numero1);
                }

            //El número 2 es el mayor
            } else if (numero2 > numero1 && numero2 > numero3) {
                if (numero1 > numero3){
                    System.out.printf("El orden es el siguiente %d %d %d",numero3,numero1,numero2);
                } else {
                    System.out.printf("El orden es el siguiente %d %d %d",numero1,numero3,numero2);
                }
            } else{
                //El número 3 es el mayor, si o si
                if (numero1 > numero2){
                    System.out.printf("El orden es el siguiente %d %d %d",numero2,numero1,numero3);
                } else {
                    System.out.printf("El orden es el siguiente %d %d %d",numero1,numero2,numero3);
                }
            }


        } else {
            System.out.println("Por tanto no se han podido ordenar.");
        }

    }
}
