package com.example.gqstests2.service;
import com.example.gqstests2.model.Sapatos;
import com.example.gqstests2.repository.SapatosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SapatosService {
    private SapatosRepository repository;

    public SapatosService(SapatosRepository repository){

        this.repository = repository;
    }

    public Sapatos create(Sapatos sapato){

        return repository.save(sapato);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Sapatos update(Sapatos sapato){

        return repository.saveAndFlush(sapato);
    }

    public Sapatos findById(long id){

        Optional<Sapatos> sapatosOptional = repository.findById(id);
        return sapatosOptional.orElse(null);
    }

    public List<Sapatos> findAll() {

        return repository.findAll();
    }
}
