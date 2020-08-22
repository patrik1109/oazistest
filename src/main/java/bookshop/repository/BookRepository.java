package bookshop.repository;


import bookshop.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByid(Integer id);
    List<Book> findByTitle(String title);


}
