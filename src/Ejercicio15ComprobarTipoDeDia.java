import java.util.Scanner;

public class Ejercicio15ComprobarTipoDeDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        DiaSemana[] diasSemana = DiaSemana.values();
        DiaSemana diaSemana;
        String diaSemanaTexto;

        String cabecera = """
                
                E J E R C I C I O  15
                *********************
                
                El programa muestra un menú con los días de la semana.
                Debes seleccionar uno de ellos y te mostrará si es laborable o fin de semana
                """;
        String menu = """
        \nMENU
        ****       
        """;

        System.out.println(cabecera);

        do {
            System.out.print(menu);
            for (int i = 0; i < DiaSemana.values().length; i++) {
                System.out.printf(" %d- %s \n", (i + 1), DiaSemana.values()[i]);
            }

            System.out.printf("Introduce un valor [1-%d]= ", DiaSemana.values().length);

            opcion = scanner.nextLine();

            if (!opcion.matches("[1-" + DiaSemana.values().length + "]")) {
                System.out.printf("Debes de introducir un valor entre 1 y %d \n", DiaSemana.values().length);
            }

        } while (!opcion.matches("[1-" + DiaSemana.values().length + "]"));

        // Convertimos opcion a entero y cogemos el valor correspondiente del array de valores del enum


        switch (diaSemana){
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES :
                System.out.print(diaSemanaTexto + " es entre semana.");
                break;

            case SABADO, DOMINGO :
                System.out.print(diaSemanaTexto + " es fin de semana.");
                break;
            }

        }




    }

