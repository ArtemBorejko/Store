package store.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "providers")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfProvider;
    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String typesOfItem;
    @Size(min = 9, max = 11)
    @NotNull
    private String phone;
    @NotNull
    private String fullname;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "providers_items", joinColumns = {@JoinColumn(name = "provider_id")}, inverseJoinColumns = {@JoinColumn(name = "item_id")})
    private List<Item> items;

    public Provider(){
    }

    public int getIdOfProvider() {
        return idOfProvider;
    }

    public void setIdOfProvider(int idOfProvider) {
        this.idOfProvider = idOfProvider;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypesOfItem() {
        return typesOfItem;
    }

    public void setTypesOfItem(String typeOfItem) {
        this.typesOfItem = typeOfItem;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
