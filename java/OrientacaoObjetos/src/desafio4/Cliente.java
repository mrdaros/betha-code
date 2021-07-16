package desafio4;

public class Cliente extends PessoaFisica{
    private Double limiteCrediario;
    private Double limiteUtilizado;

    public Cliente(Integer id, String nome, String endereco, String telefone, String cpf, String rg, Character sexo,
                   Double limiteCrediario, Double limiteUtilizado) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void aumentarLimite(Double percentualAumento) {
        if (this.validaPercentual(percentualAumento)) {
            this.setLimiteCrediario(this.getLimiteCrediario() * ((percentualAumento / 100) + 1));
        }
    }

    public void diminuirLimite(Double percentualReducao) {
        if (this.validaPercentual(percentualReducao)) {
            Double limite = this.getLimiteCrediario() * (1 - (percentualReducao/100));

            if (limite >= this.getLimiteUtilizado()) {
                this.setLimiteCrediario(limite);
            } else {
                System.out.println("O novo limite não pode ser menor que o limite em uso.");
            }
        }
    }
}
