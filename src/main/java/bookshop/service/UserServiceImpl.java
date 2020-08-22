package bookshop.service;

import bookshop.entities.DAOUser;
import bookshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository repository;



    @Override
    public DAOUser findByUsername(String username) {

        return repository.findByUsername(username);

    }

    @Override
     public Integer  setPurchasesForUser( String purchases, String username ){
     return repository.setPurchasesForUser(purchases,username);
    }
}
