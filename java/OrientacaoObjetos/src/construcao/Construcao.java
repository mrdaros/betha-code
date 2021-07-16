package construcao;

public class Construcao {
    private Integer nQuarto;
    private Integer nBanheiro;
    private Double  areaTotal;

    public Construcao(Integer nQuarto, Integer nBanheiro, Double areaTotal) {
        this.nQuarto = nQuarto;
        this.nBanheiro = nBanheiro;
        this.areaTotal = areaTotal;
    }

    public Integer getnQuarto() {
        return nQuarto;
    }

    public void setnQuarto(Integer nQuarto) {
        this.nQuarto = nQuarto;
    }

    public Integer getnBanheiro() {
        return nBanheiro;
    }

    public void setnBanheiro(Integer nBanheiro) {
        this.nBanheiro = nBanheiro;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }
}
