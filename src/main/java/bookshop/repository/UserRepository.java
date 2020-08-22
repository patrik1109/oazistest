package bookshop.repository;

import bookshop.entities.DAOUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


//@Repository
public interface UserRepository extends JpaRepository<DAOUser, Integer> {

    DAOUser findByUsername(String username);

   // DAOUser findById(Integer id);

    @Modifying
    @Query("update DAOUser u set u.purchases = ?1 where u.username = ?2")
    Integer  setPurchasesForUser( String purchases, String username );

    /*@Modifying
    @Query("update EARAttachment ear set ear.status = ?1 where ear.id = ?2")
    int setStatusForEARAttachment(Integer status, Long id);*/

}