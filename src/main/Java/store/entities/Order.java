package store.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfOrder;
    private int numOfOr;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idOfClient")
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idOfWorker")
    private Worker worker;
    @NotNull
    private Date dateOfOrder;
    @NotNull
    private String orderStatus;
    @NotNull
    private float priceOfOrder;
    @NotNull
    private String paymentMeth;
    @NotNull
    private String methOfObt;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "order_items", joinColumns = {@JoinColumn(name = "order_id")}, inverseJoinColumns = {@JoinColumn(name = "item_id")})
    private List<Item> itemsList;

    public int getIdOfOrder() {
        return idOfOrder;
    }

    public void setIdOfOrder(int idOfOrder) {
        this.idOfOrder = idOfOrder;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public int getNumOfOr() {
        return numOfOr;
    }

    public void setNumOfOr(int numOfOr) {
        this.numOfOr = numOfOr;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setPriceOfOrder(float priceOfOrder) {
        this.priceOfOrder = priceOfOrder;
    }

    public String getPaymentMeth() {
        return paymentMeth;
    }

    public void setPaymentMeth(String paymentMeth) {
        this.paymentMeth = paymentMeth;
    }

    public String getMethOfObt() {
        return methOfObt;
    }

    public void setMethOfObt(String methOfObt) {
        this.methOfObt = methOfObt;
    }
}
