import java.util.Scanner;

public class Ejercicio09CalculadoraBasica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=1;
        double numero1=0,numero2=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  9
                ********************
                
                Calculadora básica
                                
                """;

        String menu = """
                
                
                MENU
                ****
                
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                0. Salir
           
                Introduce una opción (0-4)
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
        sc.nextLine();
        if (esValido) {

            do{
                System.out.println(menu);
                String valorIntroducidoMenu = sc.nextLine();
                if (valorIntroducidoMenu.matches("[0-9]{1}")){
                    opcion = Integer.parseInt(valorIntroducidoMenu);
                }

                switch (opcion){
                    case 1 -> System.out.println("La suma de los números es: " + (numero1 + numero2));
                    case 2 -> System.out.println("La resta de los números es: " + (numero1 - numero2));
                    case 3 -> System.out.println("La multiplicación de los números es: " + (numero1 * numero2));
                    case 4 ->
                    {
                        if (numero2 == 0){
                            System.out.println("No se puede dividir un número entre cero");
                        } else{
                            System.out.printf("La división de los números es: %.2f \n",(numero1 / numero2));
                        }

                    }
                    case 0 -> System.out.println("Salimos del programa");
                    default -> System.out.println("Opción no encontrada en el menú");

                }



            }while(opcion !=0);




        } else {

        }



    }
}
