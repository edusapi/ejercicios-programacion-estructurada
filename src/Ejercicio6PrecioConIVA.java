import java.util.Scanner;

public class Ejercicio6PrecioConIVA {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            final int IVA = 21;
            double precio=0;

            boolean esValido=false;
            String cabecera = """
                
                E J E R C I C I O  6
                ********************
                
                Programa que calcula el precio de un producto con su IVA
                                
                """;

            System.out.println(cabecera);
            try {
                System.out.print("Introduce el precio del producto:");
                precio = sc.nextDouble();
                esValido = true;

            } catch (Exception e) {
                System.out.println("Error al introducir el valor del producto.");
            }

            if (esValido){
                //Es necesario poner 100f porque sino
                double impuesto = (precio*(IVA/100f));
                System.out.printf("El precio final, con un IVA del %d%% es %.2f€",IVA,precio+impuesto);

            }

        }
        
        
}

