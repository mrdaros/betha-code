public class PessoaMain {

    static class Pessoa {
        String nome;
        String cpf;
        String rg;
        Double altura = 0.0;
        Double peso = 0.0;
        String dataNascimento;
        Pessoa pai;
        Pessoa mae;

        void getIMC () {
            if (peso <= 0.0 || altura <= 0.0) {
                System.out.println("Dados inválidos para cálculo.");
            } else {
                System.out.println("IMC: " + String.format("%.2f", peso / (Math.pow(altura, 2))));
            }
        }
    }

    public static void main(String[] args) {
        Pessoa pFilho = new Pessoa();
        Pessoa pMae = new Pessoa();
        Pessoa pPai = new Pessoa();

        pMae.nome = "Marlene";
        pMae.cpf = "12345678901";
        pMae.rg = "936583";
        pMae.altura = 1.6;
        pMae.peso = 70.5;
        pMae.dataNascimento = "16/10/1965";
        pMae.mae = null;
        pMae.pai = null;

        pPai.nome = "Lidio";
        pPai.cpf = "09887654321";
        pPai.rg = "4856385";
        pPai.altura = 1.75;
        pPai.peso = 77.5;
        pPai.dataNascimento = "08/07/1959";
        pPai.mae = null;
        pPai.pai = null;

        pFilho.nome = "Marina";
        pFilho.cpf = "20924878744";
        pFilho.rg = "8463789";
        pFilho.altura = 1.65;
        pFilho.peso = 59.0;
        pFilho.dataNascimento = "11/04/1993";
        pFilho.mae = pMae;
        pFilho.pai = pPai;

        pFilho.getIMC();

    }
}
