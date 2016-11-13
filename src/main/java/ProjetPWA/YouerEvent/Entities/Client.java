/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetPWA.YouerEvent.Entities;

import java.io.Serializable;
import java.util.Collection;
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
@Table(name="clients")
public class Client implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long id_Client;
    private String name_Client;
    private String adress_Client;
    private String phone_Client;
    private Date BirthDate_Client;
      
    private Collection<Commande>Commandes_Client;
    private Collection<History>Histories_Client;
    private Collection<NextEvent>NextEvent_Client;

    public Long getId_Client() {
        return id_Client;
    }

    public void setId_Client(Long id_Client) {
        this.id_Client = id_Client;
    }

    public String getName_Client() {
        return name_Client;
    }

    public void setName_Client(String name_Client) {
        this.name_Client = name_Client;
    }

    public String getAdress_Client() {
        return adress_Client;
    }

    public void setAdress_Client(String adress_Client) {
        this.adress_Client = adress_Client;
    }

    public String getPhone_Client() {
        return phone_Client;
    }

    public void setPhone_Client(String phone_Client) {
        this.phone_Client = phone_Client;
    }

    public Date getBirthDate_Client() {
        return BirthDate_Client;
    }

    public void setBirthDate_Client(Date BirthDate_Client) {
        this.BirthDate_Client = BirthDate_Client;
    }

    public Collection<Commande> getCommandes_Client() {
        return Commandes_Client;
    }

    public void setCommandes_Client(Collection<Commande> Commandes_Client) {
        this.Commandes_Client = Commandes_Client;
    }

    public Collection<History> getHistories_Client() {
        return Histories_Client;
    }

    public void setHistories_Client(Collection<History> Histories_Client) {
        this.Histories_Client = Histories_Client;
    }

    public Collection<NextEvent> getNextEvent_Client() {
        return NextEvent_Client;
    }

    public void setNextEvent_Client(Collection<NextEvent> NextEvent_Client) {
        this.NextEvent_Client = NextEvent_Client;
    }

    public Client() {
    }

    public Client(String name_Client, String phone_Client, Date BirthDate_Client) {
        this.name_Client = name_Client;
        this.phone_Client = phone_Client;
        this.BirthDate_Client = BirthDate_Client;
    }

   
    
}
