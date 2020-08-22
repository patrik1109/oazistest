package bookshop.entities;


import org.hibernate.search.annotations.Indexed;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Indexed
@Table(name="books", schema = "oazistest", catalog = "" )
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="title")
    String title;

    @Column(name="year")
    Integer year;

    @Column(name="price")
    Integer price;

    Integer idauthor;
    Integer idpublisher;



    public Book(){}

    public Book(Integer id, String title, Integer year, Integer idauthor, Integer idpublisher, Integer price) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.idauthor = idauthor;
        this.idpublisher = idpublisher;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(Integer idauthor) {
        this.idauthor = idauthor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIdpublisher() {
        return idpublisher;
    }

    public void setIdpublisher(Integer idpublisher) {
        this.idpublisher = idpublisher;
    }
}
