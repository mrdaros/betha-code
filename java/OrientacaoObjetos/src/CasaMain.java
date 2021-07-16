
public class CasaMain {

    public static void main(String[] args) {
        Casa casa = new Casa("São Domingos",3,2,2,200.0);

        System.out.println(casa);


    }

    static class Casa {
        private String endereco;
        private Integer nQuarto;
        private Integer nBanheiro;
        private Integer nSala;
        private Double  areaTotal;

        public Casa(String endereco, Integer nQuarto, Integer nBanheiro, Integer nSala, Double areaTotal) {
            this.endereco = endereco;
            this.nQuarto = nQuarto;
            this.nBanheiro = nBanheiro;
            this.nSala = nSala;
            this.areaTotal = areaTotal;
        }

        public String getEndereco() {
            return endereco;
        }

        public Integer getnQuarto() {
            return nQuarto;
        }

        public Integer getnBanheiro() {
            return nBanheiro;
        }

        public Integer getnSala() {
            return nSala;
        }

        public Double getAreaTotal() {
            return areaTotal;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setnQuarto(Integer nQuarto) {
            this.nQuarto = nQuarto;
        }

        public void setnBanheiro(Integer nBanheiro) {
            this.nBanheiro = nBanheiro;
        }

        public void setnSala(Integer nSala) {
            this.nSala = nSala;
        }

        public void setAreaTotal(Double areaTotal) {
            this.areaTotal = areaTotal;
        }

        @Override
        public String toString() {
            return "Casa{" + "endereco='" + endereco + '\'' + ", nQuarto=" + nQuarto + ", nBanheiro=" + nBanheiro +
                    ", nSala=" + nSala + ", areaTotal=" + areaTotal + '}';
        }
    }

}
