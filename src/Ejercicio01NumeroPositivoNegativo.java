import java.util.Scanner;

public class Ejercicio01NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  1
                ********************
                
                Programa que determina si un número es positivo, negativo o cero
                                
                """;

        System.out.println(cabecera);
        System.out.print("Introduce el número a determinar: ");
        try {
            numero = sc.nextInt();
            esValido = true;
        } catch (Exception e) {
            System.out.println("Valor no permitido.");
        }

        if (esValido){

            if(numero >= 0){
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }

        }












    }


}
