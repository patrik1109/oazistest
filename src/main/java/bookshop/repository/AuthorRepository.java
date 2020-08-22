package bookshop.repository;


import bookshop.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findByid(Integer id);
    List<Author> findByName(String name);
}
