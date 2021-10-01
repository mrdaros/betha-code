package com.betha.exemplo.exemplo.model;

import com.betha.exemplo.exemplo.enterprise.AbstractRegion;

import javax.persistence.*;

@Entity
public class Cidade extends AbstractRegion {
    @ManyToOne
    @JoinColumn(name = "I_ESTADOS", referencedColumnName = "ID")
    private Estado estado;
    @Column(name = "INDICE_DESENVOLVIMENTO_HUMANO")
    private Double idh;
    @Column(name = "NOME_PREFEITO")
    private String nomePrefeito;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getIdh() {
        return idh;
    }

    public void setIdh(Double idh) {
        this.idh = idh;
    }

    public String getNomePrefeito() {
        return nomePrefeito;
    }

    public void setNomePrefeito(String nomePrefeito) {
        this.nomePrefeito = nomePrefeito;
    }
}
