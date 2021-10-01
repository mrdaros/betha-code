package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Cidade;
import com.betha.exemplo.exemplo.model.Estado;
import com.betha.exemplo.exemplo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @GetMapping
    public List<CidadeDTO> getCidade() {
        return repository.findAll().stream().map(p -> CidadeDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CidadeDTO getCidadesId(@PathVariable(value = "id") Long cidadeId) throws EntityNotFoundException {
        Optional<Cidade> cidadeFind = repository.findById(cidadeId);

        if(cidadeFind.isPresent()){
            return CidadeDTO.toDTO(cidadeFind.get());
        }
        return new CidadeDTO(); //tratar no front
    }

    @PostMapping
    public Cidade create(@RequestBody Cidade cidade) {
        return repository.save(cidade);
    }

    @PutMapping("/{id}")
    public Cidade update(@PathVariable(value = "id") Long cidadeId,
                         @RequestBody Cidade cidade) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId)
                .orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com o id :: " + cidadeId));

        cidadeFind.setId(cidade.getId());
        cidadeFind.setNome(cidade.getNome());
        cidadeFind.setEstado(cidade.getEstado());
        cidadeFind.setIdh(cidade.getIdh());
        cidadeFind.setPopulacao(cidade.getPopulacao());
        cidadeFind.setNomePrefeito(cidade.getNomePrefeito());

        return repository.save(cidadeFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long cidadeId) throws EntityNotFoundException {
        Cidade cidadeFind = repository.findById(cidadeId)
                .orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada com o id :: " + cidadeId));
        repository.delete(cidadeFind);

        return ResponseEntity.noContent().build();
    }
}
