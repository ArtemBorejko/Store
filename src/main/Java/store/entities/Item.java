package store.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOfItem;
    @NotNull
    private String name;
    @NotNull
    private String listOfCon;
    @NotNull
    private String charac;
    @NotNull
    private int price;
    @NotNull
    private int numOfPar;
    @NotNull
    private int number;

    public int getIdOfItem() {
        return idOfItem;
    }

    public void setIdOfItem(int idOfItem) {
        this.idOfItem = idOfItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListOfCon() {
        return listOfCon;
    }

    public void setListOfCon(String listOfCon) {
        this.listOfCon = listOfCon;
    }

    public String getCharac() {
        return charac;
    }

    public void setCharac(String charac) {
        this.charac = charac;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfPar() {
        return numOfPar;
    }

    public void setNumOfPar(int numOfPar) {
        this.numOfPar = numOfPar;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
