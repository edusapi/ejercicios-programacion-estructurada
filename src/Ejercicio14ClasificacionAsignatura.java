import java.util.Scanner;

public class Ejercicio14ClasificacionAsignatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        TipoAsignatura asignaturas[] = TipoAsignatura.values();
        TipoAsignatura tipoAsignatura;

        /*
        Guardo todos los valores del enum en un vector de tipo TipoAsignatura. Es decir se guarda:

        asignaturas[0] = TipoAsignatura.PROGRAMACION
        asignaturas[1] = TipoAsignatura.BASES_DE_DATOS
        asignaturas[0] = TipoAsignatura.ENTORNOS_DE_DESARROLLO
        asignaturas[0] = TipoAsignatura.LENGUAJES_DE_MARCAS

        */



        String cabecera = """
                
                E J E R C I C I O  14
                *********************
                
                Clasificación de una asignatura
                """;
        String menu = """
        \nMENU
        ****       
        """;

        System.out.println(cabecera);

        do {
            System.out.print(menu);
            for (int i = 0; i < asignaturas.length; i++) {
                System.out.printf(" %d- %s \n", (i + 1), asignaturas[i]);
            }

            System.out.printf("Introduce un valor [1-%d]= ", asignaturas.length);
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opción no válida");
                scanner.nextLine();
                opcion = -1;
            }

            if (!(opcion > 0 && opcion <= asignaturas.length)) {
                System.out.printf("Debes de introducir un valor entre 1 y %d \n", TipoAsignatura.values().length);
            }

        } while (!(opcion > 0 && opcion <= asignaturas.length));


        //Opción vale de 1 a 4.
        /*switch (opcion){
            case 1:
                tipoAsignatura = TipoAsignatura.PROGRAMACION;
                break;
            case 2:
                tipoAsignatura = TipoAsignatura.BASES_DE_DATOS;
                break;
            case 3:
                tipoAsignatura = TipoAsignatura.ENTORNOS_DE_DESARROLLO;
                break;
            case 4:
                tipoAsignatura = TipoAsignatura.LENGUAJES_DE_MARCAS;
                break;

            }*/

        tipoAsignatura = asignaturas[opcion-1];

        System.out.println("La asignatura seleccionada es " + tipoAsignatura);
        }
    }

