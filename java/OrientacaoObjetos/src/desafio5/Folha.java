package desafio5;


public class Folha {
    private Integer id;
    private Funcionario funcionario;
    private String dataPagamento;
    private Descontos[] descontos;
    private Double salarioLiquido;


    public void calcular (Descontos[] desconto, Double bonus) {
        Double valorTotalDesconto = 0.00;
        Double valorSalarioLiquido = 0.00;
        Double valorSalarioBruto = funcionario.getSalarioBruto();
        Double valorTotalBonus = 0.00;

        if (bonus != null) {
            valorTotalBonus = valorSalarioBruto * (bonus/100);
        }

        if (desconto != null) {
            for (int i = 0; i < desconto.length; i++) {
                valorTotalDesconto += desconto[i].getValor();
            }
        }

        valorSalarioLiquido = (valorSalarioBruto + valorTotalBonus - valorInss(valorSalarioBruto) - valorIrrf(valorSalarioBruto) - valorTotalDesconto);
        this.setSalarioLiquido(valorSalarioLiquido);
    }

    public void calcular(Descontos[] desconto) {
        this.calcular(desconto, null);
    }

    public void calcular() {
        this.calcular(null);
    }


    public Double valorIrrf(Double salarioBruto){
        Double salario = salarioBruto - valorInss(salarioBruto);
        Double aliquota;

        if (salario <= 1903.98) {
            aliquota = 0.00;
        } else if ((salario > 1903.98) && (salario <=2826.65)) {
            aliquota = 0.075;
        } else if ((salario > 2826.65) && (salario <=3751.05)) {
            aliquota = 0.15;
        } else if ((salario > 3751.05) && (salario <=4664.68)) {
            aliquota = 0.225;
        } else {
            aliquota = 0.275;
        }
        return (salario * aliquota);
    }

    public Double valorInss(Double salarioBruto) {
        Double[] tabelaInssMin = {0.0, 1100.0, 2203.48, 3305.22};
        Double[] tabelaInssMax = {1100.0, 2203.48, 3305.22, 6433.57};

        int i = 0;
        Double valor  = 0.00;

        loop: do {
            switch (i) {
                case 0:
                    valor += tabelaInssMax[i] * 0.075;
                    break;
                case 1:
                    //valor += (Math.min(tabelaInssMax[i], salarioBruto) - tabelaInssMin[i]) * 0.09;
                    valor += (menorValor(tabelaInssMax[i], salarioBruto) - tabelaInssMin[i]) * 0.09;
                    break;
                case 2:
                    valor += (menorValor(tabelaInssMax[i], salarioBruto) - tabelaInssMin[i]) * 0.12;
                    break;
                case 3:
                    valor += (menorValor(tabelaInssMax[i], salarioBruto) - tabelaInssMin[i]) * 0.14;
                    break loop;
            }
            i++;

        } while ((salarioBruto > tabelaInssMin[i]) /*&& (i < tabelaleInssMin.length)*/);

        return valor;
    }

    private Double menorValor (Double valorTabela, Double salarioBruto) {
        return (Math.min(valorTabela, salarioBruto));
    }

    public Folha(Integer id, Funcionario funcionario, String dataPagamento, Descontos[] descontos) {
        this.id = id;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
        this.descontos = descontos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Descontos[] getDescontos() {
        return descontos;
    }

    public void setDescontos(Descontos[] descontos) {
        this.descontos = descontos;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
