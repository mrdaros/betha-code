package matricula;

public class Matricula {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getTipo() {
        return (getClass().getName());
    }


}
