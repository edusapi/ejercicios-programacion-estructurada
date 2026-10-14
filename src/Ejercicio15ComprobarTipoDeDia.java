import java.util.Scanner;

public class Ejercicio15ComprobarTipoDeDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        String cabecera = """
                
                E J E R C I C I O  15
                *********************
                
                El programa muestra un menú con los días de la semana.
                Debes seleccionar uno de ellos y te mostrará si es laborable o fin de semana
                
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
