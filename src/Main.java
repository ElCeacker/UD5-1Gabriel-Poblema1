import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float operacion = 0;
        Scanner teclado = new Scanner(System.in);
        String salida = "";

        System.out.println("Introduce los números que quieras // Introduce Q para salir:");
        while (!salida.equals("Q")){
            salida = teclado.nextLine();

            if (!Objects.equals(salida, "Q")){
                float flotantes = Float.parseFloat(salida);
                GenericQueue numero = new GenericQueue();
                numero.enqueue(flotantes);
                operacion += flotantes;
                System.out.println("Ha introducido: " + salida);
            }
            else {
                System.out.println("Resultado de la suma es: " + operacion);
            }





        }

    }
}
