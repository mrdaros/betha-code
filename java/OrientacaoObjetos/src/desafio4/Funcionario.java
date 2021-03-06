package desafio4;

public class Funcionario extends PessoaFisica {
    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg,
                       Character sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void aplicarDissidio(Double dissidio) {
        if (this.validaPercentual(dissidio)) {
            this.setSalarioBruto(this.getSalarioBruto() * ((dissidio / 100) + 1));
        }
    }
}
