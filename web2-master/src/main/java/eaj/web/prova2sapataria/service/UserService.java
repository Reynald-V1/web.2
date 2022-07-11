package eaj.web.prova2sapataria.service;

import eaj.web.prova2sapataria.model.User;
import eaj.web.prova2sapataria.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){

        this.repository = repository;
    }



    public User create(User u){

        return repository.save(u);
    }

    public void delete(Long id){

        repository.deleteById(id);
    }

    public User update(User u){

        return repository.saveAndFlush(u);
    }

    public User findById(long id){

        Optional<User> usersOptional = repository.findById(id);
        return usersOptional.orElse(null);
    }

    public List<User> findAll() {

        return repository.findAll();
    }


}
