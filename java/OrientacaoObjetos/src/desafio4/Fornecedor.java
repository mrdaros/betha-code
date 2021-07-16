package desafio4;

public class Fornecedor extends PessoaJuridica {

    private PessoaFisica responsavel;
    private String observacao;

    public Fornecedor(Integer id, String nome, String endereco, String telefone, String cnpj,
                      String inscricaoEstadual, String cnae, PessoaFisica responsavel, String observacao) {
        super(id, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + super.toString() + "responsavel=" + responsavel + ", observacao='" + observacao + '\'' + '}';
    }
}

