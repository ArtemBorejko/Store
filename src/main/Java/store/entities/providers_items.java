package store.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "providers_items")
public class providers_items {
    @Id
    private int Id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idOfProvider")
    private Provider provider;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idOfItem")
    private Item item;
    private int numOfPar;
    private int quantity;
    private Date dateOfSupply;
    private String nameOfItem;

    public void setId(int id) {
        this.Id= id;
    }

    public int getId() {
        return Id;
    }
}
