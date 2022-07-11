package eaj.web.prova2sapataria.repository;

import eaj.web.prova2sapataria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long Id);
}