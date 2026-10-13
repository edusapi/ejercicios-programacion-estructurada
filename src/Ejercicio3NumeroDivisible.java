import java.util.Scanner;

public class Ejercicio3NumeroDivisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1=0,numero2=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  3
                ********************
                
                Programa que indica si un número es divisible por otro
                                
                """;

        System.out.println(cabecera);
        try {
            System.out.print("Introduce el primer número:");
            numero1 = sc.nextInt();
            System.out.print("Introduce el segundo número:");
            numero2 = sc.nextInt();
            esValido = true;

        } catch (Exception e) {
            System.out.println("Los números deben de ser enteros. No se puede realizar la operación");
        }

        if (esValido){
            //Si el resto es cero
            if(numero1 % numero2 == 0){
                System.out.printf("El número %d es divisible por %d",numero1,numero2);
            } else {
                System.out.printf("El número %d NO es divisible por %d",numero1,numero2);
            }


        }

    }

}
