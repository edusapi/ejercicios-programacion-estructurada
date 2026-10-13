import java.util.Scanner;

public class Ejercicio05EntradaAUnPartido {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int edad = 0;
        boolean esValido = false;
        String cabecera = """
                
                E J E R C I C I O  5
                ********************
                
                ////////////////////
                Entrada a un partido
                ////////////////////
                
                Dependiendo de tu edad tienes un precio diferente para la entrada
                
                """;

        System.out.println(cabecera);
        System.out.print("Dime tu edad: ");
        try {
            edad = sc.nextInt();
            esValido = true;
        } catch (Exception e) {
            System.out.println("Valor para la edad no permitida");
        }

        if(esValido){
            if (edad < 0){
                System.out.println("No ha nacido todavía !!! ");
            } else {
                if (edad < 5) {
                    System.out.println("La entrada es gratis");
                } else if (edad >= 5 && edad <=15) {
                    System.out.print("La entrada cuesta 2€ ");
                    if (edad > 7 && edad < 10) {
                        System.out.println("y tiene una bolsa de chuches gratis");
                    }
                } else {
                    //Si es mayor de 15 años, cualquiera que sea su edad, será de 3€
                    System.out.print("La entrada cuesta 3€ ");
                    if (edad > 18 && edad < 30) {
                        System.out.println("y tiene una bebida gratis");
                    }

                }


            }
        }



        }
}


