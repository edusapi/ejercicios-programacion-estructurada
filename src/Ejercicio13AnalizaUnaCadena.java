import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio13AnalizaUnaCadena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        int numeroDeCaracteres=0, numeroEspacios=0, numeroVocales=0, numeroConsonantes=0;
        String cabecera = """
                
                E J E R C I C I O  13
                *********************
                
                Programa que analiza una cadena de texto y muestra:
                
                - El número de caracteres que contiene.
                - El número de espacios.
                - El número de vocales.
                - El número de consonantes.
                
                """;

        System.out.println(cabecera);
        System.out.print("Introduce la cadena de texto: ");
        cadena = sc.nextLine();



        for(int i=0; i<cadena.length();i++){
            String caracter = cadena.substring(i,i+1);

            if (caracter.toLowerCase().matches("[aeiou]")){
                numeroVocales++;
            } else if (caracter.equals(" ")){
                numeroEspacios++;
            } else if (caracter.toLowerCase().matches("[bcdfghjklmnñpqrstvwxyz]")){
                numeroConsonantes++;
            }
        }


        System.out.println("Número de caracteres: " + cadena.length());
        System.out.println("Número de espacios: " + numeroEspacios);
        System.out.println("Número de vocales: " + numeroVocales);
        System.out.println("Número de consonantes: " + numeroConsonantes);





    }
}

