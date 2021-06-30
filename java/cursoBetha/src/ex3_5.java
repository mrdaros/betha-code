import java.util.Arrays;
import java.util.Scanner;

public class ex3_5 {
    public static void main(String[] args) {
        String[] frutas;
        frutas = new String[10];
        String aux = "";

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe sua fruta favorita nº " + (i+1));
            frutas[i] = s.nextLine();
        }

        //Inverte array
        for (int i=0; i < (frutas.length/2); i++) {
            aux = frutas[i];
            frutas[i] = frutas[frutas.length-i-1];
            frutas[frutas.length-i-1] = aux;
        }
        System.out.println("Ordem de preferência invertida: " + Arrays.toString(frutas));
    }
}
