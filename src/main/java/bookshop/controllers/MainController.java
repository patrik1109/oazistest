package bookshop.controllers;


import bookshop.entities.Author;
import bookshop.entities.Book;
import bookshop.entities.DAOUser;
import bookshop.entities.Publisher;

import bookshop.model.PurchaseDTO;
import bookshop.model.UserDTO;
import bookshop.service.AuthorService;
import bookshop.service.BookService;
import bookshop.service.PublisherService;
import bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @Autowired
    BookService bookRepository;

    @Autowired
    AuthorService authorRepository;

    @Autowired
    PublisherService publisherRepository;

    @Autowired
    UserService userRepository;

    //Hard core part for testing !!!
    HashMap<String,List<Integer>> purchases = new HashMap<>();


    @GetMapping(value = { "/", "/index" } )
    public Book index (Map<String, Object> model) throws IOException {


      purchases.put("user",new ArrayList<>());
      purchases.put("admin",new ArrayList<>());

      return null;
    }


        @RequestMapping(value = { "/listbooks" }, method = RequestMethod.GET)
        public List<Book> getlistBooks  () throws IOException {
            return bookRepository.findAll();
            /*Collection<Book> values = books.values();
            return  new ArrayList<Book>(values);*/
        }

        @RequestMapping(value = { "/getbook/{id}" }, method = RequestMethod.GET)
        public Book findBook  (@PathVariable Integer id) throws IOException {
            return  bookRepository.findById(id);
            //return books.get(id);
        }

        @RequestMapping(value = { "/book/{id}" }, method = RequestMethod.DELETE)
        @PreAuthorize("hasRole('ADMIN')")
         public void deleteBook  (@PathVariable Integer id) throws IOException {
             bookRepository.deleteBookById(id);
            //books.remove(id);
        }


        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = { "/book" }, method = RequestMethod.POST)
            public void addBook  (@RequestBody Book book) throws IOException {
            bookRepository.addBook(book);
           /* book.setId(++lastkeyBook);
            books.put(lastkeyBook,book);*/
        }

        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = { "/book" }, method = RequestMethod.PUT)
        public void editBook  (@RequestBody Book book) throws IOException {
                bookRepository.updateBook(book);
        }

        @PreAuthorize("hasRole('ADMIN')")
        @RequestMapping(value = { "/author" }, method = RequestMethod.POST)
        public void addAuthor  (@RequestBody Author author) throws IOException {
            authorRepository.addAuthor(author);
         }

        @RequestMapping(value = { "/buybook" }, method = RequestMethod.POST)
        @PreAuthorize("hasRole('USER')")
        public void buyBook  (@RequestBody PurchaseDTO purchase) throws IOException {

                List<Integer> userpurchases = purchases.get(purchase.getUsername());
                userpurchases.add(purchase.getIdbook());


        }

    @RequestMapping(value = { "/purchases/{username}" }, method = RequestMethod.GET)
    public List<Integer> userPurchases  (@PathVariable String username) throws IOException {

        return purchases.get(username);
    }

        @GetMapping(produces = "application/json")
        @RequestMapping({"/validateLogin"})
        public UserDTO validateLogin() {
            return new UserDTO();
        }

    }
