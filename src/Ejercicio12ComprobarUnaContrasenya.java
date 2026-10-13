import java.util.Scanner;

public class Ejercicio12ComprobarUnaContrasenya {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        boolean esValido = false;
        String cabecera = """
                
                E J E R C I C I O  12
                *********************
                
                Programa que valida una contraseña.
                La contraseña tiene que cumplir:
                  - Tener entre 6 y 12 caracteres
                  - Tener al menos una mayúscula
                  - Tener al menos una minúscula
                  - Tener al menos un número
                
                """;

        System.out.println(cabecera);
        System.out.print("Introduce la contraseña a validar: ");
        cadena = sc.nextLine();


        if (cadena.matches("[a-zA-Z0-9]{6,12}")) {

            if (cadena.matches(".*[A-Z]+.*")) {

                if (cadena.matches(".*[a-z]+.*")) {

                    if (cadena.matches(".*[0-9]+.*")) {
                        esValido = true;
                    }
                }
            }
        }

        if (esValido) {
            System.out.printf("La contraseña %s cumple con los requisitos",cadena);
        } else{
            System.out.println("Contraseña no válida");
        }


    }
}

