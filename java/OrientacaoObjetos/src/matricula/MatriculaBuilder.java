package matricula;

public class MatriculaBuilder {

    public static Matricula criaMatricula(String tipo) {
        if (tipo.equals("ESTAGIARIO")) {
            return new Estagiario();
        } else {
            return new Funcionario();
        }
    }

    public static void main(String[] args) {
        Matricula matr = criaMatricula("ESTAGIARIO");
        matr.setSalario(10.0);
        System.out.println("Salário de " + matr.getTipo() + " " + matr.getSalario());

        Matricula matr2 = criaMatricula("FUNCIONARIO");
        matr2.setSalario(10.0);
        System.out.println("Salário de " + matr2.getTipo() + " " + matr2.getSalario());
    }

}
