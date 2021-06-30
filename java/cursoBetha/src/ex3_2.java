import java.util.Arrays;

public class ex3_2 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        int soma = 0;

        for (int i=0; i < numeros.length; i++){
            numeros[i] = i;
            soma += numeros[i];
        }

        System.out.println("Média: " + soma/numeros.length);
    }
}
