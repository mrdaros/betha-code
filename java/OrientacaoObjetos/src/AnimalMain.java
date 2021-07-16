public class AnimalMain {


    public static void main(String[] args) {
        /*
        Animal cachorro = new Animal();

        cachorro.nome = "Pipoca";

        cachorro.peso = 21.5;
        cachorro.altura = 0.5;
        cachorro.som = "au au";

        */

        Animal cachorro = new Animal("Pipoca", 0.5, 21.5, "au au");
        cachorro.imprimirSom();
        cachorro.setSom("Miau");
        cachorro.imprimirSom();
        cachorro.pular(90.0);

    }

    /*
    static class Animal {
        String nome;
        Double peso;
        Double altura;
        String som;

        void imprimirSom(){
            System.out.println("O " + nome + " faz " + som);
        }

        void pular(Double alturaPulo) {
            System.out.println("O animal pula " + alturaPulo + " centímetros.");
        }
    }

    */

    static class Animal {
        private String nome;
        private Double peso;
        private Double altura;
        private String som;

        public Animal(String nome, Double peso, Double altura, String som) {
            this.nome = nome;
            this.peso = peso;
            this.altura = altura;
            this.som = som;
        }

        public String getNome() {
            return nome;
        }

        public Double getPeso() {
            return peso;
        }

        public Double getAltura() {
            return altura;
        }

        public String getSom() {
            return som;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPeso(Double peso) {
            this.peso = peso;
        }

        public void setAltura(Double altura) {
            this.altura = altura;
        }

        public void setSom(String som) {
            this.som = som;
        }

        void imprimirSom(){
            System.out.println("O " + nome + " faz " + som);
        }

        void pular(Double alturaPulo) {
            System.out.println("O animal pula " + alturaPulo + " centímetros.");
        }
    }
}
