package bookshop.model;

import bookshop.entities.DAOUser;

public class PurchaseDTO {
    String username;
    Integer idbook;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }
}
