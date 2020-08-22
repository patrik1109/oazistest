package bookshop.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Indexed
@Table(name = "user", schema = "oazistest", catalog = "" )
public class DAOUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    @JsonIgnore
    private String purchases;

    public List<Integer> getPurchases() {

        List<String> arrayList = Arrays.asList( purchases.split(","));
        List<Integer> favList = new ArrayList<Integer>();
        for(String fav:arrayList){
            favList.add(Integer.parseInt(fav.trim()));
        }
        return favList;
    }

    public void setPurchases(List<Integer> purchases) {
        List<String> favList = new ArrayList<String>();
        for(Integer fav:purchases){
            favList.add(fav.toString());
        }
        this.purchases = favList.toString().replace("[","").replace("]","").replace(" ","");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DAOUser(Integer id, String username, String password, String purchases, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.purchases = purchases;
        this.role = role;
    }

    public DAOUser() {
        this.purchases = "";
    }

    public DAOUser(String username) {
        this.username = username;
    }

}


