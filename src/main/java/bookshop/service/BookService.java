package bookshop.service;


import bookshop.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void addBook(Book book);
    void deleteBook(Book book);
    void deleteBookById(Integer id);
    void updateBook(Book book);
    Book findById(Integer id);
    List<Book> findByTitle(String title);
    List<Book> findAll();

}
