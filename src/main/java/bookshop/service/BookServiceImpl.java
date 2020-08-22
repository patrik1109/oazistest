package bookshop.service;


import bookshop.entities.Book;
import bookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository repository;

    @Override
    public void addBook(Book book) {
        repository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        repository.delete(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Book findById(Integer id) {
        return repository.findByid(id);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }



    @Override
    public void  updateBook(Book book) {
         repository.save(book);
    }
}
