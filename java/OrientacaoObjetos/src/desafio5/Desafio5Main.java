package desafio5;

public class Desafio5Main {
    public static void main(String[] args) {
        Funcionario func = FuncionarioBuilder.criaFuncionario("ESTAGIARIO", 1, "Joãozinho", "12345678901", 1800.0);

        Descontos[] desc = new Descontos[2];
        desc[0] = new Descontos(1,"Unimed mensal", 60.0);
        desc[1] = new Descontos(2, "Unimed part", 300.0);

        Folha folhaPgtoJunho = new Folha(1, func, "01/07/2021", desc);
        System.out.println("Salário Bruto do " + func.getNome() + ": " + func.getSalarioBruto());
        folhaPgtoJunho.calcular(desc);

        System.out.println("Salário Líquido do " + func.getNome() + ": " + folhaPgtoJunho.getSalarioLiquido());
    }
}
