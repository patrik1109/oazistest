package bookshop.entities;

import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.util.List;

@Entity
@Indexed
@Table(name="publishers", schema = "oazistest", catalog = "" )
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="address")
    String address;

    @Column(name="phone")
    String phone;

    @Column(name="email")
    String email;

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "idpublisher")
    List<Book> bookList;

    public Publisher(){}

    public Publisher(Integer id ,String name, String address, String phone, String email, List<Book> bookList) {
        this.id  =id;
        this.name = name;
        this.address = address;
        this.phone = phone;

        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
