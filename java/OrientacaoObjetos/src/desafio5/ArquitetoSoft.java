package desafio5;

public class ArquitetoSoft extends Funcionario {

    public ArquitetoSoft(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public ArquitetoSoft(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArquitetoSoft(Integer id, String nome) {
        super(id, nome);
    }


    @Override
    public Double getSalarioBruto() {
        return (super.getSalarioBruto() * 1.15);
    }
}
