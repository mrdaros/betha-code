package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.ContaUsuario;
import com.betha.exemplo.exemplo.model.Estado;
import com.betha.exemplo.exemplo.model.Feed;
import com.betha.exemplo.exemplo.model.TipoPublicacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

public class FeedDTO {

    //private ContaUsuario contaUsuario;
    private Long id;
    private String linkPublicacaoS3;
    private LocalDate dataPublicacao;
    private String textoPublicacao;

    public static FeedDTO toDTO(Feed feed) {
        FeedDTO dto = new FeedDTO();
        dto.setId(feed.getId());
        dto.setLinkPublicacaoS3(feed.getLinkPublicacaoS3());
        dto.setDataPublicacao(feed.getDataPublicacao());
        dto.setTextoPublicacao(feed.getTextoPublicacao());
        return dto;
    }

    public static Feed fromDTO(FeedDTO dto) {
        Feed entity = new Feed();
        entity.setId(dto.getId());
        entity.setLinkPublicacaoS3(dto.getLinkPublicacaoS3());
        entity.setDataPublicacao(dto.getDataPublicacao());
        entity.setTextoPublicacao(dto.getTextoPublicacao());
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLinkPublicacaoS3() {
        return linkPublicacaoS3;
    }

    public void setLinkPublicacaoS3(String linkPublicacaoS3) {
        this.linkPublicacaoS3 = linkPublicacaoS3;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }
}
