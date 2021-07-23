package matricula;

public class Funcionario extends Matricula{

    @Override
    public Double getSalario() {
        return (super.getSalario() * 1.2);
    }

    @Override
    public String getTipo() {
        return (getClass().getSimpleName());
    }
}
