import java.util.Scanner;

public class Ejercicio14ClasificacionDeUnaAsignatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        String cabecera = "\nE J E R C I C I O  14\n*********************\nEl programa muestra un menú con las asignaturas disponibles y el usuario deberá seleccionar la opción\nque desea con un número (del 1 al número de asignaturas).\nUna vez seleccionada la asignatura, muestra un mensaje indicando el tipo de asignatura elegido\n\n";
        String menu = "\n\nMENU\n****\n\n1. Programación\n2. Bases de datos\n3. Entornos de desarrollo\n4. Lenguajes de marcas\n\nSelecciona una asignatura [1-4]:";
        System.out.println(cabecera);
        System.out.println(menu);
        opcion = scanner.nextLine();
        if (opcion.matches("[1-4]")) {
            System.out.println(TipoAsignatura.values()[1]);
        }

    }
}

