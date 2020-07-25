package store.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int idOfOrder;
    private int numOfOr;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOfClient")
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idOfWorker")
    private Worker worker;
    private Date dateOfOrder;
    private String orderStatus;
    private int priceOfOrder;
    private String paymentMeth;
    private String methOfObt;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ordersList")
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

    public int getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setPriceOfOrder(int priceOfOrder) {
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
