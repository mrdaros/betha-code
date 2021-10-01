package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Cidade;
import com.betha.exemplo.exemplo.model.ContaUsuario;
import com.betha.exemplo.exemplo.repository.ContaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contas-usuarios")
public class ContaUsuarioController {

    @Autowired
    private ContaUsuarioRepository repository;

    @GetMapping
    public List<ContaUsuarioDTO> getContaUsuario() {
        return repository.findAll().stream().map(c -> ContaUsuarioDTO.toDTO(c)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ContaUsuarioDTO getContasUsuariosId(@PathVariable(value = "id") Long contasUsuariosId) throws EntityNotFoundException {
        Optional<ContaUsuario> contaUsuarioFind = repository.findById(contasUsuariosId);

        if(contaUsuarioFind.isPresent()){
            return ContaUsuarioDTO.toDTO(contaUsuarioFind.get());
        }
        return new ContaUsuarioDTO();
    }

    @PostMapping
    public ContaUsuario create(@RequestBody ContaUsuario contaUsuario) {
        return repository.save(contaUsuario);
    }


    @PutMapping("/{id}")
    public ContaUsuario update(@PathVariable(value = "id") Long contaUsuarioId,
                         @RequestBody ContaUsuario contaUsuario) throws EntityNotFoundException {
        ContaUsuario contaUsuarioFind = repository.findById(contaUsuarioId)
                .orElseThrow(() -> new EntityNotFoundException("Conta usuário não encontrada com o id :: " + contaUsuarioId));

        contaUsuarioFind.setId(contaUsuario.getId());
        contaUsuarioFind.setNomeConta(contaUsuario.getNomeConta());
        contaUsuarioFind.setBiografia(contaUsuario.getBiografia());
        contaUsuarioFind.setDataCriacaoConta(contaUsuario.getDataCriacaoConta());
        contaUsuarioFind.setCidade(contaUsuario.getCidade());
        contaUsuarioFind.setLink(contaUsuario.getLink());
        contaUsuarioFind.setDataNascimento(contaUsuario.getDataNascimento());
        contaUsuarioFind.setNomeCompleto(contaUsuario.getNomeCompleto());

        return repository.save(contaUsuarioFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long contaUsuarioId) throws EntityNotFoundException {
        ContaUsuario contaUsuarioFind = repository.findById(contaUsuarioId)
                .orElseThrow(() -> new EntityNotFoundException("Conta usuário não encontrada com o id :: " + contaUsuarioId));
        repository.delete(contaUsuarioFind);

        return ResponseEntity.noContent().build();
    }

}
