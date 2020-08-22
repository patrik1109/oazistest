package bookshop.repository;


import bookshop.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
    Publisher findByid(String id);
    List<Publisher> findByName(String name);
}
