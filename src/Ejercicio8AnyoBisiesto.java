import java.util.Scanner;

public class Ejercicio8AnyoBisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anyo=0;
        boolean esValido=false;
        String cabecera = """
                
                E J E R C I C I O  8
                ********************
                
                Programa que determina si un año es bisiesto
                                
                """;

        System.out.println(cabecera);
        System.out.print("Introduce el año: ");
        try {
            anyo = sc.nextInt();
            esValido = true;
        } catch (Exception e) {
            System.out.println("Valor no permitido.");
        }

        if (esValido){
            boolean bisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
            System.out.println(bisiesto?"El año es bisiesto":"El año no es bisiesto");
        }

        //
    }


}
