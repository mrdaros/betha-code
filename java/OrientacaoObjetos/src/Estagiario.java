public class Estagiario extends Funcionario {

    public Estagiario(String nome, Double altura, Double peso) {
        super(nome, altura, peso);
    }
    public void imprimeImc(){
        getImc();
    }

    //a classe Estagiario irá utilizar este método e não o método da classe "pai" Funcionario
    @Override
    public void getImc() {
        double imc = getPeso()/(getAltura() * getAltura());
    }

}
