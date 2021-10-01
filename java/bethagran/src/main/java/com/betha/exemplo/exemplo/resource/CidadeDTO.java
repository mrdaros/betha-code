package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Cidade;

public class CidadeDTO {
    Long id;
    String nome;
    String nomePrefeito;

    public static CidadeDTO toDTO (Cidade cidade) {
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId());
        dto.setNome(cidade.getNome());
        dto.setNomePrefeito(cidade.getNomePrefeito());
        return dto;
    }

    public static Cidade fromDTO (CidadeDTO dto) {
        Cidade entity = new Cidade();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setNomePrefeito(dto.getNomePrefeito());
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePrefeito() {
        return nomePrefeito;
    }

    public void setNomePrefeito(String nomePrefeito) {
        this.nomePrefeito = nomePrefeito;
    }
}
