import java.util.Scanner;

public class Ejercicio15ComprobarTipoDeDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        DiaSemana[] diasSemana = DiaSemana.values();
        DiaSemana diaSemana;

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
            for (int i = 0; i < diasSemana.length; i++) {
                System.out.printf(" %d- %s \n", (i + 1), diasSemana[i]);
            }

            System.out.printf("Introduce un valor [1-%d]= ", diasSemana.length);

            opcion = scanner.nextLine();

            if (!opcion.matches("[1-" + diasSemana.length + "]")) {
                System.out.printf("Debes de introducir un valor entre 1 y %d \n", diasSemana.length);
            }

        } while (!opcion.matches("[1-" + diasSemana.length + "]"));

        // Convertimos opcion a entero y cogemos el valor correspondiente del array de valores del enum

        switch (Integer.parseInt(opcion)){
            case 1 :
                diaSemana = DiaSemana.LUNES;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 2 :
                diaSemana = DiaSemana.MARTES;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 3 :
                diaSemana = DiaSemana.MIERCOLES;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 4 :
                diaSemana = DiaSemana.JUEVES;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 5 :
                diaSemana = DiaSemana.VIERNES;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 6 :
                diaSemana = DiaSemana.SABADO;
                System.out.print(diaSemana + " es entre semana.");
                break;
            case 7 :
                diaSemana = DiaSemana.DOMINGO;
                System.out.print(diaSemana + " es entre semana.");
                break;
            }

        }




    }

