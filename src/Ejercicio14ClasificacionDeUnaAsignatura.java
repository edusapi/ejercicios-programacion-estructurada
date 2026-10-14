import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio14ClasificacionDeUnaAsignatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        String cabecera = """
                
                E J E R C I C I O  14
                *********************
                
                El programa muestra un menú con las asignaturas disponibles y el usuario deberá seleccionar la opción
                que desea con un número (del 1 al número de asignaturas). 
                Una vez seleccionada la asignatura, muestra un mensaje indicando el tipo de asignatura elegido
                
                """;
        String menu = """
                
                
                MENU
                ****
                
                1. Programación
                2. Bases de datos
                3. Entornos de desarrollo
                4. Lenguajes de marcas
                          
                Selecciona una asignatura [1-4]:""";

        System.out.println(cabecera);
        System.out.println(menu);

        opcion = scanner.nextLine();

        if (opcion.matches("[1-4]")){
            System.out.println("Has seleccionado " + TipoAsignatura.values()[1]);
        }

        //TipoAsignatura.


    }
}
