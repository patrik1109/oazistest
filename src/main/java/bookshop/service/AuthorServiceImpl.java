package bookshop.service;

import bookshop.entities.Author;
import bookshop.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository repository;

    @Override
    public void addAuthor(Author author) {
        repository.save(author);
    }

    @Override
    public void deleteAuthor(Author author) {
        repository.delete(author);
    }

    @Override
    public void updateAuthor(Author author) {
        repository.save(author);
    }

    @Override
    public Author findById(Integer id) {
        return repository.findByid(id);
    }

    @Override
    public List<Author> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Author> findAll() {
        return repository.findAll();
    }
}
