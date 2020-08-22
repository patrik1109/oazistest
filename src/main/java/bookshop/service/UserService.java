package bookshop.service;

import bookshop.entities.DAOUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    DAOUser findByUsername(String username);
    //DAOUser findById(Integer id);
    Integer  setPurchasesForUser( String purchases, String username );

}
