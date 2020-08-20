package store.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.Set;

@Entity(name = "workers")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOfWorker;
    private String fullname;
    private String post;
    @Size(min = 9, max = 11)
    @NotNull
    private String phone;
    private Date dateOfStart;
    private Date dateOfBirthday;
    @NotNull
    private String idencode;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "worker")
    private Set<Order> order;

    public Worker() {
    }

    public int getIdOfWorker() {
        return idOfWorker;
    }

    public void setIdOfWorker(int idOfWorker) {
        this.idOfWorker = idOfWorker;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateofStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateofBirthday() {
        return dateOfBirthday;
    }

    public void setDateofBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getIdencode() {
        return idencode;
    }

    public void setIdencode(String idencode) {
        this.idencode = idencode;
    }

    public Set<Order> getOrder() {
        return order;
    }

    public void setOrder(Set<Order> order) {
        this.order = order;
    }
}
