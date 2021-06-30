import java.util.Arrays;
import java.util.Collections;

public class ex3_3 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[10];
        int aux = 0;

        //Preenche array
        for (int i=0; i < numeros.length; i++){
            numeros[i] = i;
        }
        System.out.println("Original:  " + Arrays.toString(numeros));


        //Inverte array
        for (int i=0; i < (numeros.length/2); i++) {
            aux = numeros[i];
            numeros[i] = numeros[numeros.length-i-1];
            numeros[numeros.length-i-1] = aux;
        }
        System.out.println("Invertido: " + Arrays.toString(numeros));



    }
}
