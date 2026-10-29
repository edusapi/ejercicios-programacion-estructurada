import java.util.Scanner;

public class Ejercicio25BuscarAnalizarNumeros {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numeroIntroducido = 0;
        int sumaTotalNumerosIntroducidos = 0;
        int totalNumerosIntroducidos = 0;
        int[] numeros = new int[10];

        String cabecera = """
                
                E J E R C I C I O  25
                ******************
                El programa debe:
                
                 1. Solicitar números enteros al usuario
                 2. Los números positivos se almacenarán en el array
                 3. Si se introduce un número negativo, se mostrará un mensaje indicando que no se puede almacenar y se continuará solicitando uno nuevo
                 4. Si se almacenan 10 números, el array estará lleno y no se solicitarán más números\s
                 5. Si se introduce **0** o el número **100** el programa deberá finalizar inmediatamente ya que ese valor son valores especiales.\s
                
                """;


        System.out.println(cabecera);


        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = Funciones.dameUnEntero();
            if (numeroIntroducido < 0) {
                System.out.println("El número es negativo. Se ignora.");
                continue;
            }



            if (numeroIntroducido == 100 || numeroIntroducido == 0) {
                System.out.println(numeroIntroducido == 100 ? "¡Se ha encontrado el número especial 100!" : "¡Se ha encontrado el número especial 0!");
                break;
            } else {
                numeros[totalNumerosIntroducidos] = numeroIntroducido;
                totalNumerosIntroducidos++;
            }

        }

        System.out.printf("Números positivos introducidos: %d", totalNumerosIntroducidos);
        if (totalNumerosIntroducidos > 0) {
            System.out.print("\nNúmeros almacenados: ");
            int numeroMayor=0,numeroMenor=0, numPares=0, numImpares=0;
            for (int i = 0; i < totalNumerosIntroducidos; i++) {
                System.out.print(numeros[i] + " ");
                sumaTotalNumerosIntroducidos += numeros[i];

                if (i == 0){
                    numeroMayor = numeroMenor = numeros[i];
                } else {
                    if (numeros[i] < numeroMenor) numeroMenor=numeros[i];
                    if (numeros[i] > numeroMayor) numeroMayor=numeros[i];
                    if (numeros[i]%2 == 0) numPares++;
                        else numImpares++;
                }
            }

            System.out.printf("\n\nCantidad de números introducidos: %d", totalNumerosIntroducidos);
            System.out.printf("\nSuma de los números introducidos: %d", sumaTotalNumerosIntroducidos);
            System.out.printf("\nNúmero mayor: %d", numeroMayor);
            System.out.printf("\nNúmero menor: %d", numeroMenor);
            System.out.printf("\nTotal números pares: %d", numPares);
            System.out.printf("\nTotal números impares: %d", numImpares);

        }

    }
}


