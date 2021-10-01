package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.ContaUsuario;
import com.betha.exemplo.exemplo.model.Estado;
import com.betha.exemplo.exemplo.model.Feed;
import com.betha.exemplo.exemplo.repository.EstadoRepository;
import com.betha.exemplo.exemplo.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/feed")
public class FeedController {

    @Autowired
    private FeedRepository repository;

    @GetMapping
    public List<FeedDTO> getFeed() {
        return repository.findAll().stream().map(p -> FeedDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FeedDTO getFeedId(@PathVariable(value = "id") Long feedId) throws EntityNotFoundException {
        Optional<Feed> feedFind = repository.findById(feedId);

        if(feedFind.isPresent()){
            return FeedDTO.toDTO(feedFind.get());
        }
        return new FeedDTO();
    }

    @PostMapping
    public FeedDTO create(@RequestBody Feed feed) {
        return FeedDTO.toDTO(repository.save(feed));
    }

    @PutMapping("/{id}")
    public Feed update(@PathVariable(value = "id") Long feedId,
                               @RequestBody Feed feed) throws EntityNotFoundException {
        Feed feedFind = repository.findById(feedId)
                .orElseThrow(() -> new EntityNotFoundException("Feed não encontrado com o id :: " + feedId));

        feedFind.setId(feed.getId());
        feedFind.setContaUsuario(feed.getContaUsuario());
        feedFind.setLinkPublicacaoS3(feed.getLinkPublicacaoS3());
        feedFind.setDataPublicacao(feed.getDataPublicacao());
        feedFind.setTextoPublicacao(feed.getTextoPublicacao());

        return repository.save(feedFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long feedId) throws EntityNotFoundException {
        Feed feedFind = repository.findById(feedId)
                .orElseThrow(() -> new EntityNotFoundException("Feed não encontrado com id :: " + feedId));

        repository.delete(feedFind);

        return ResponseEntity.noContent().build();
    }

}
