/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetPWA.YouerEvent.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author youssef
 */
@Entity
@Table(name="nextEvents")
public class NextEvent implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long id_NextEVt;
    private String name_NextEVt;
    private float price_NextEVt;
    private Date date_NextEVt;
    @ManyToOne
    @JoinColumn(name="idClient")
     private Client client;

    public Long getId_NextEVt() {
        return id_NextEVt;
    }

    public void setId_NextEVt(Long id_NextEVt) {
        this.id_NextEVt = id_NextEVt;
    }

    public String getName_NextEVt() {
        return name_NextEVt;
    }

    public void setName_NextEVt(String name_NextEVt) {
        this.name_NextEVt = name_NextEVt;
    }

    public float getPrice_NextEVt() {
        return price_NextEVt;
    }

    public void setPrice_NextEVt(float price_NextEVt) {
        this.price_NextEVt = price_NextEVt;
    }

    public Date getDate_NextEVt() {
        return date_NextEVt;
    }

    public void setDate_NextEVt(Date date_NextEVt) {
        this.date_NextEVt = date_NextEVt;
    }

    public Client getClient_History() {
        return client;
    }

    public void setClient_History(Client Client_History) {
        this.client = client;
    }

    public NextEvent() {
    }

    public NextEvent(String name_NextEVt, float price_NextEVt, Date date_NextEVt) {
        this.name_NextEVt = name_NextEVt;
        this.price_NextEVt = price_NextEVt;
        this.date_NextEVt = date_NextEVt;
    }

  
}
