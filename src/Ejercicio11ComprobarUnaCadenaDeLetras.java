import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11ComprobarUnaCadenaDeLetras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  11
                *********************
                
                Programa que comprueba una cadena de caracteres
                
                  - Todos sus caracteres son letras
                          
                """;

        System.out.println(cabecera);
        System.out.print("Introduce tu cadena: ");
        cadena = sc.nextLine();

        // Aqui le decimos que si contiene solo letras es buena
        if (cadena.matches("[a-zA-Z]*")){
                System.out.println("Son todas letras");
            } else {
                System.out.println("En la cadena hay algún carácter que no es una letra (número o símbolo)");
            }
        }








    }

