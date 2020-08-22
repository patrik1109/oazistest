package bookshop.entities;

import org.hibernate.search.annotations.Indexed;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Indexed
@Table(name="authors", schema = "oazistest", catalog = "" )
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="lastname")
    String lastname;

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "idauthor")
    List<Book> bookList;

    public Author(){}
    public Author(Integer id, String name, String lastname, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.bookList = bookList;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
