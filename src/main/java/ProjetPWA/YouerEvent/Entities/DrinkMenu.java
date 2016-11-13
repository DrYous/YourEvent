/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetPWA.YouerEvent.Entities;

import java.io.Serializable;
import java.util.Collection;
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
@Table(name="drinkMenu")
public class DrinkMenu implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    private Long id_DrinkM;
    private String name_DrinkM;
    
    private Collection<Event>Events;

    public Long getId_DrinkM() {
        return id_DrinkM;
    }

    public void setId_DrinkM(Long id_DrinkM) {
        this.id_DrinkM = id_DrinkM;
    }

    public String getName_DrinkM() {
        return name_DrinkM;
    }

    public void setName_DrinkM(String name_DrinkM) {
        this.name_DrinkM = name_DrinkM;
    }

    public Collection<Event> getEvents() {
        return Events;
    }

    public void setEvents(Collection<Event> Events) {
        this.Events = Events;
    }

    public DrinkMenu() {
    }

    public DrinkMenu(String name_DrinkM) {
        this.name_DrinkM = name_DrinkM;
    }

  
    
}
