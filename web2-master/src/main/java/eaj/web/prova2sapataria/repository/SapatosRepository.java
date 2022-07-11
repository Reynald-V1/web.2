package eaj.web.prova2sapataria.repository;

import eaj.web.prova2sapataria.model.Sapatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SapatosRepository extends JpaRepository<Sapatos, Long> {
    Sapatos findSapatosById(Long Id);
}