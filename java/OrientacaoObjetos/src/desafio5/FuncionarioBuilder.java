package desafio5;

public class FuncionarioBuilder {

    public static Funcionario criaFuncionario(String tipo, Integer id, String nome, String cpf, Double salarioBruto) {
        if (tipo.equals("ESTAGIARIO")) {
            return new Estagiario(id, nome, cpf, salarioBruto);
        } else if (tipo.equals("ANALISTA")) {
            return new Analista(id, nome, cpf, salarioBruto);
        } else if (tipo.equals("ARQUITETO")) {
            return new ArquitetoSoft(id, nome, cpf, salarioBruto);
        } else if (tipo.equals("COORDENADOR")){
            return new Coordenador(id, nome, cpf, salarioBruto);
        } else {
            return new Funcionario(id, nome, cpf, salarioBruto);
        }
    }

}
