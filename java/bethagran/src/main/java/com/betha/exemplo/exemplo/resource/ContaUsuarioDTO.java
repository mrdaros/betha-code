package com.betha.exemplo.exemplo.resource;


import com.betha.exemplo.exemplo.model.Cidade;
import com.betha.exemplo.exemplo.model.ContaUsuario;

public class ContaUsuarioDTO {

    private Long id;
    private String nomeConta;
    private String nomeCompleto;
    private String biografia;
    private String link;

    public static ContaUsuarioDTO toDTO (ContaUsuario contaUsuario) {
        ContaUsuarioDTO dto = new ContaUsuarioDTO();
        dto.setId(contaUsuario.getId());
        dto.setNomeConta(contaUsuario.getNomeConta());
        dto.setNomeCompleto(contaUsuario.getNomeCompleto());
        dto.setBiografia(contaUsuario.getBiografia());
        dto.setLink(contaUsuario.getLink());
        return dto;
    }

    public static ContaUsuario fromDTO (ContaUsuarioDTO dto) {
        ContaUsuario entity = new ContaUsuario();
        entity.setId(dto.getId());
        entity.setNomeConta(dto.getNomeConta());
        entity.setNomeCompleto(dto.getNomeCompleto());
        entity.setBiografia(dto.getBiografia());
        entity.setLink(dto.getLink());
        return entity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
