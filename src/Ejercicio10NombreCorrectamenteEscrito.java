import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10NombreCorrectamenteEscrito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  10
                *********************
                
                Programa que escribe correctamente un nombre
                
                  - La primera letra en mayúscula
                  - Las letras intermedias aparezcan en minúsculas
                  - La última letra en mayúscula     
                   
                          
                """;

        System.out.println(cabecera);
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        if (nombre.matches("\\d*")){
            System.out.println("No pueden ser todos números.");
        } else {
            System.out.print("Salida: ");
            System.out.print(nombre.substring(0,1).toLowerCase());
            System.out.print(nombre.substring(1,nombre.length()-1).toUpperCase(Locale.ROOT));
            System.out.println(nombre.substring(nombre.length()-1,nombre.length()).toLowerCase(Locale.ROOT));

        }








    }
}
