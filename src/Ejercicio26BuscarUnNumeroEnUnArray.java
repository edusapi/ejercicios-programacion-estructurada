import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26BuscarUnNumeroEnUnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        int[] numerosAleatorios = new int[50];

        String cabecera = """
                
                E J E R C I C I O  26
                ******************
                1. Generar 15 números y mostrarlos
                
                2. Una vez terminado el proceso, solicitar al usuario un número que desea buscar.
                
                3. Recorrer el array para comprobar si el número aparece
                
                   1. Si aparece mostrar las posiciones en las que aparece el número y cuántas veces ha aparecido
                
                   2. Si no aparece mostrar un mensaje indicando que no se ha encontrado
                
                4. Preguntar si se desea buscar otro número e iniciar otra búsqueda si se responde con `s` o `S`
                
                
                """;


        System.out.println(cabecera);

        do {
            generar15NumerosAleatorios(numerosAleatorios);
            buscarNumero(numerosAleatorios);

            System.out.print("\n¿Deseas buscar otro número? (S/n):");
            opcion = scanner.nextLine();

        } while (!opcion.toLowerCase(Locale.ROOT).equals("n"));


    }

    private static void buscarNumero(int[] numerosAleatorios) {
        int numeroABuscar, numNumerosEncontrados=0;
        int[] posicionesEnLasQueAparece = new int[numerosAleatorios.length];

        System.out.print("\nIntroduce el número que deseas buscar: ");
        numeroABuscar = Funciones.dameUnEntero();


        for (int i = 0; i < numerosAleatorios.length; i++) {
            if(numerosAleatorios[i] == numeroABuscar){
                posicionesEnLasQueAparece[numNumerosEncontrados] = i;
                numNumerosEncontrados++;
            }
        }

        if (numNumerosEncontrados > 0){
            System.out.printf("\nEl número %d aparece en las posiciones: ",numeroABuscar);
            for (int i = 0; i < numNumerosEncontrados; i++) {
                System.out.printf("%d ", posicionesEnLasQueAparece[i]);
            }
            System.out.printf("\nEl número %d aparece %d veces ", numeroABuscar, numNumerosEncontrados);
        } else {
            System.out.print("\nEl número %d no aparece en los números generados");
        }

    }

    private static void generar15NumerosAleatorios(int[] numerosAleatorios) {

        System.out.println("Números generados: ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = Funciones.dameEnteroAleatorio(1,100);
            System.out.print(numerosAleatorios[i] + " ");
        }



    }
}

