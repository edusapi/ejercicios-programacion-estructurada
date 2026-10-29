import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21SuperficieDeUnTriangulo {
    public static void main(String[] args) {

         /*
    Calcula la superficie de un triángulo. El programa deberá:
    1. Pedir al usuario la **base** y la **altura**
    2. Comprobar que ambos valores sean positivos, si no lo son deberá ir al punto 5.
    3. Calcular la superficie mediante la siguiente fórmula:
       **superficie = (base x altura) / 2**
    4. Mostrar el resultado por pantalla
    5. Preguntar al usuario si desea hacer otro cálculo
    6. Si responde `s` o `S` volverá a solicitar los datos y realizar un nuevo cálculo
    7. Si responde cualquier otro valor, deberá finalizar el programa
         */

        Scanner scanner = new Scanner(System.in);
        double base=0,altura=0;
        String opcion = "";

        String cabecera = """
                
                E J E R C I C I O  21
                *********************
                Cálculo de la superficie de un triángulo
                                
                """;


        do {
            System.out.println(cabecera);

            System.out.println("Introduce 2 valores positivos");
            System.out.print("Introduce el primer valor: ");
            base = Funciones.dameUnEntero();
            System.out.print("Introduce el segundo valor: ");
            altura = Funciones.dameUnEntero();

            if (base > 0 && altura > 0) {
                System.out.printf("\nLa superficie del triángulo es %.2f\n",calculoSuperficieTriangulo(base,altura));
            } else {
                System.out.println("Los valores deben de ser positivos");
            }

            System.out.print("¿Deseas hacer otro cálculo? s/N");
            opcion = scanner.nextLine();

        }while(opcion.toLowerCase(Locale.ROOT).equals("s"));
    }

    private static double calculoSuperficieTriangulo(double base, double altura) {

        return (base*altura)/2;

    }
}
