import java.util.Arrays;

public class ex3_1 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[10];

        for (int i=0; i < numeros.length; i++){
            numeros[i] = i;
            //Uma forma é imprimir logo após atribuir o valor
            System.out.println("Conteúdo: " + numeros[i]);
        }

        /*
        //Outra forma, percorrer o array

        for (int i=0; i < numeros.length; i++){
            System.out.println("Conteúdo: " + numeros[i]);
        }

        //Outra forma, imprimir o conteúdo no fim
        System.out.println("Conteúdo: " + Arrays.toString(numeros));
         */
    }
}
