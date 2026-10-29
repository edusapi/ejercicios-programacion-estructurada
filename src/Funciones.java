import java.util.Scanner;

public class Funciones {
    public static int dameUnEntero(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        //System.out.print("Dame un entero: ");
        while (!scanner.hasNextInt()){

            scanner.nextLine();
            System.out.println("Valor no permitido !!! ");
            System.out.print("Dame un entero: ");

        }

        return scanner.nextInt();
    }
    public static double dameUnDecimal(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        //System.out.print("Dame un decimal: ");
        while (!scanner.hasNextDouble()){

            scanner.nextLine();
            System.out.println("Valor no permitido !!! ");
            System.out.print("Dame un decimal: ");

        }

        return scanner.nextDouble();
    }
}
