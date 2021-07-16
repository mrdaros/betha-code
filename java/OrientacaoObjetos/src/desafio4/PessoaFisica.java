package desafio4;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;
    private Character sexo;

    public PessoaFisica(Integer id, String nome, String endereco, String telefone, String cpf, String rg,
                        Character sexo) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public boolean validaPercentual(Double percentual) {
        if (percentual > 0.00) {
            return true;
        } else {
            System.out.println("Percentual inválido.");
            return false;
        }
    }

    @Override
    public String documentoPrincipal(){
        return this.getCpf();
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + super.toString() + "cpf='" + cpf + '\'' + ", rg='" + rg + '\'' + ", sexo=" + sexo +'}';
    }
}
