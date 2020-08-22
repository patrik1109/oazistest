package bookshop.model;

import java.io.Serializable;
import java.util.List;

public class UserDTO implements Serializable {
    private String username;
    private String password;
    private String role;
//    private List<Integer> purchases;


//    public List<Integer> getPurchases() {
//        return purchases;
//    }

//    public void setPurchases(List<Integer> purchases) {
//        this.purchases = purchases;
//    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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
}