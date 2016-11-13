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
import javax.persistence.Table;

/**
 *
 * @author youssef
 */
@Entity
@Table(name="history")
public class History implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_History;
    private String name_History;
    private float price_History;
    private int evaluated;
    private Date date_History;
    
     private Client Client_History;

    public Long getId_History() {
        return id_History;
    }

    public void setId_History(Long id_History) {
        this.id_History = id_History;
    }

    public String getName_History() {
        return name_History;
    }

    public void setName_History(String name_History) {
        this.name_History = name_History;
    }

    public float getPrice_History() {
        return price_History;
    }

    public void setPrice_History(float price_History) {
        this.price_History = price_History;
    }

    public int getEvaluated() {
        return evaluated;
    }

    public void setEvaluated(int evaluated) {
        this.evaluated = evaluated;
    }

    public Date getDate_History() {
        return date_History;
    }

    public void setDate_History(Date date_History) {
        this.date_History = date_History;
    }

    public Client getClient_History() {
        return Client_History;
    }

    public void setClient_History(Client Client_History) {
        this.Client_History = Client_History;
    }

    public History() {
    }

    public History(String name_History, float price_History, int evaluated, Date date_History) {
        this.name_History = name_History;
        this.price_History = price_History;
        this.evaluated = evaluated;
        this.date_History = date_History;
    }

   
}
