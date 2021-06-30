public class CaixaEletronico {
    public static void main(String[] args) {
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        int qtdeTotal = 0;
        int valorReais = 250;

        for(int i = 0; i < cedulas.length; i++) {
            int qtdeCedulas = valorReais/cedulas[i];
            System.out.println("Quantidade de cédulas de " + cedulas[i] + ": " + qtdeCedulas);

            valorReais %= cedulas[i];
            qtdeTotal += qtdeCedulas;
        }
        System.out.println("Quantidade total: " + qtdeTotal);
    }
}
