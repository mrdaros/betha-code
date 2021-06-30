import java.util.Arrays;

public class PesquisarArray {
    public static void main(String[] args) {
        int[] numerosInteiros = new int[1000000];
        int numeroPesquisado = 555000;

        for (int i = 0; i < 1000000; i++) {
            numerosInteiros[i] = i;
        }

        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            if (numerosInteiros[i] == numeroPesquisado) {
                break;
            }
        }

        long fim = System.currentTimeMillis();
        System.out.println("Pesquisa 1: " + (fim-inicio) + " ms.");
        inicio = System.currentTimeMillis();
        Arrays.binarySearch(numerosInteiros, numeroPesquisado);
        fim = System.currentTimeMillis();
        System.out.println("Pesquisa 2: " + (fim-inicio) + " ms.");
    }
}
