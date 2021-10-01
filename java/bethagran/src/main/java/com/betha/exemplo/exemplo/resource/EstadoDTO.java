package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Estado;

public class EstadoDTO {
    public Long id;
    public String nome;
    public String populacao;

    public static EstadoDTO toDTO(Estado estado) {
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        dto.setPopulacao(estado.getPopulacao());
        return dto;
    }

    public static Estado fromDTO(EstadoDTO dto) {
        Estado entity = new Estado();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
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

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }
}
