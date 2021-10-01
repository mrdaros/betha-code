package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Estado;
import com.betha.exemplo.exemplo.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping
    public List<EstadoDTO> getEstado() {
        return repository.findAll().stream().map(p -> EstadoDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EstadoDTO getEstadosId(@PathVariable(value = "id") Long estadoId) throws EntityNotFoundException {
        Optional<Estado> estadoFind = repository.findById(estadoId);

        if(estadoFind.isPresent()){
            return EstadoDTO.toDTO(estadoFind.get());
        }
        return new EstadoDTO(); //tratar no front
    }

    @PostMapping
    public Estado create(@RequestBody Estado estado) {
        return repository.save(estado);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable(value = "id") Long estadoId,
                       @RequestBody Estado estado) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID :: " + estadoId));
        estadoFind.setId(estado.getId());
        estadoFind.setNome(estado.getNome());
        estadoFind.setPopulacao(estado.getPopulacao());
        estadoFind.setPais(estado.getPais());

        return repository.save(estadoFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long estadoId) throws EntityNotFoundException {
        Estado estadoFind = repository.findById(estadoId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com id :: " + estadoId));

        repository.delete(estadoFind);

        return ResponseEntity.noContent().build();
    }
}
