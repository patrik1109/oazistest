package bookshop.service;

import bookshop.entities.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    void addAuthor(Author author);
    void deleteAuthor(Author author);
    void updateAuthor(Author author);
    Author findById(Integer id);
    List<Author> findByName(String name);
    List<Author> findAll();
}
