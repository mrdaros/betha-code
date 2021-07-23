package matricula;

public class Estagiario extends Matricula {


    @Override
    public Double getSalario() {
        return (super.getSalario() * 1.1);
    }

    public String getTipo() {
        return (getClass().getSimpleName());
    }
}
