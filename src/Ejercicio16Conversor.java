import java.util.Scanner;

public class Ejercicio16Conversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        TipoConversion tipoConversion;
        double temperaturaMedida = 0;
        boolean esValido = false;
        final double FACTOR_CONVERSION_METROS_PIES = 3.28084;
        final double FACTOR_CONVERSION_PIES_METROS = 0.3048;
        final double FACTOR_CONVERSION_CELSIUS_FAHRENHEIT = 1.8;
        final int AJUSTE_CELSIUS_FAHRENHEIT = 32;


        String cabecera = """
                
                E J E R C I C I O  16
                *********************
                Programa que mostrará diferentes tipos de conversión
                """;
        String menu = """
                \n     CONVERSOR
                     ****       
                """;

        System.out.println(cabecera);

        do {
            System.out.print(menu);
            for (int i = 0; i < TipoConversion.values().length; i++) {
                System.out.printf(" %d- %s \n", (i + 1), TipoConversion.values()[i].name().replace("_", " "));
            }

            System.out.printf("\nIntroduce un valor [1-%d]= ", TipoConversion.values().length);

            opcion = scanner.nextLine();

            if (!opcion.matches("[1-" + TipoConversion.values().length + "]")) {
                System.out.printf("Debes de introducir un valor entre 1 y %d \n", TipoConversion.values().length);
            }

        } while (!opcion.matches("[1-" + TipoConversion.values().length + "]"));

        tipoConversion = TipoConversion.values()[Integer.parseInt(opcion) - 1];

        System.out.print("Introduce la temperatura/medida: ");

        do {
            try {
                temperaturaMedida = scanner.nextDouble();
                esValido = true;
            } catch (Exception e) {
                System.out.println("Debes de introducir un valor numérico. ");
                System.out.print("Introduce la temperatura/medida: ");
                scanner.nextLine();
            }

        } while (!esValido);

        switch (tipoConversion) {
            case METROS_PIES:
                System.out.printf("\n%.2f metros = %.2f pies", temperaturaMedida, temperaturaMedida * FACTOR_CONVERSION_METROS_PIES);
                break;
            case PIES_METROS:
                System.out.printf("\n%.2f pies = %.2f metros", temperaturaMedida, temperaturaMedida * FACTOR_CONVERSION_PIES_METROS);
                break;
            case CELSIUS_FAHRENHEIT:
                System.out.printf("\n%.2f ºC = %.2f ºF", temperaturaMedida, temperaturaMedida * FACTOR_CONVERSION_CELSIUS_FAHRENHEIT + AJUSTE_CELSIUS_FAHRENHEIT);
                break;
            case FAHRENHEIT_CELSIUS:
                System.out.printf("\n%.2f ºC = %.2f ºF", temperaturaMedida, (temperaturaMedida - AJUSTE_CELSIUS_FAHRENHEIT)/FACTOR_CONVERSION_CELSIUS_FAHRENHEIT);
                break;

        }
    }
}
