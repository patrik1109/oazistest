package bookshop.entities;

import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Table(name="purshaes", schema = "oazistest", catalog = "" )
public class DAOPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String username;

    Integer idbook;

}
