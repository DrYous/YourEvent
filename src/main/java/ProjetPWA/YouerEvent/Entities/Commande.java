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
@Table(name="commandes")
public class Commande implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
     
    private Long id_Command;
    private String name_Command;
    private float price_Command; 
    private Date date_Command;
    
    private Event Event;
    private Client Client;

    public Long getId_Command() {
        return id_Command;
    }

    public void setId_Command(Long id_Command) {
        this.id_Command = id_Command;
    }

    public String getName_Command() {
        return name_Command;
    }

    public void setName_Command(String name_Command) {
        this.name_Command = name_Command;
    }

    public float getPrice_Command() {
        return price_Command;
    }

    public void setPrice_Command(float price_Command) {
        this.price_Command = price_Command;
    }

    public Date getDate_Command() {
        return date_Command;
    }

    public void setDate_Command(Date date_Command) {
        this.date_Command = date_Command;
    }

    public Event getEvent() {
        return Event;
    }

    public void setEvent(Event Event) {
        this.Event = Event;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }

    public Commande() {
    }

    public Commande(String name_Command, float price_Command, Date date_Command) {
        this.name_Command = name_Command;
        this.price_Command = price_Command;
        this.date_Command = date_Command;
    }

  
}
