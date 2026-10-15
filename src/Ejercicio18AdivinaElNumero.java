import java.util.Random;
import java.util.Scanner;

public class Ejercicio18AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int min=1,max=100;
        boolean aciertoNumero = false;
        Scanner scanner = new Scanner(System.in);
        String cabecera = """
                
                E J E R C I C I O  18
                *********************
                
                Adivina el número 
                
                El programa debe de pensar un número entre el 1 y 100 y nosotros debemos de adivinarlo
                """;

        int numeroRandom, numeroUsuario, intentos = 5;
        numeroRandom = random.nextInt(max-min+1)+min;

        System.out.println(cabecera);
        System.out.println("He pensado un número entre 1 y 100. Adivinalo, tienes 5 intentos");
        System.out.println(numeroRandom);

        do{

            try{
                System.out.printf("\nIntroduce el número [%d-%d]: ",min,max);
                numeroUsuario = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("El número debe de ser entero");
                numeroUsuario = -1;
            }


            if (numeroUsuario == numeroRandom){
                aciertoNumero = true;
            } else{
                intentos--;
                System.out.printf("Fallaste. Te quedan %d", intentos);

                if (numeroUsuario > numeroRandom){
                    max = numeroUsuario;
                } else{
                    min = numeroUsuario;
                }
            }


        }while (intentos >0 && !aciertoNumero);



        if (intentos > 0){
            String enhorabuena = """
                    
                    LO CONSEGUISTE. HAS ACERTADO EL NÚMERO
                    
                    
                    """;
            System.out.println(enhorabuena);
        }



    }
}
