package desafio5;

public class Estagiario extends Funcionario {

    public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Estagiario(Integer id, String nome, String cpf) {
        super(id, nome, cpf,null);
    }

    public Estagiario(Integer id, String nome) {
        super(id, nome, null);
    }


    @Override
    public Double getSalarioBruto() {
        return (super.getSalarioBruto() * 1.05);
    }
}
