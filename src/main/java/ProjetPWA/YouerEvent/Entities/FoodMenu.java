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
@Table(name="foodMenu")
public class FoodMenu implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_Food_M;
    private String name_FoodM;
    private String Entree_FoodM;
    private String Principal_FoodM;
    private String Dessert_FoodM;
    private long Calories_FoodM;
   
   private Collection<Event> Events;

    public Long getId_Food_M() {
        return id_Food_M;
    }

    public void setId_Food_M(Long id_Food_M) {
        this.id_Food_M = id_Food_M;
    }

    public String getName_FoodM() {
        return name_FoodM;
    }

    public void setName_FoodM(String name_FoodM) {
        this.name_FoodM = name_FoodM;
    }

    public String getEntree_FoodM() {
        return Entree_FoodM;
    }

    public void setEntree_FoodM(String Entree_FoodM) {
        this.Entree_FoodM = Entree_FoodM;
    }

    public String getPrincipal_FoodM() {
        return Principal_FoodM;
    }

    public void setPrincipal_FoodM(String Principal_FoodM) {
        this.Principal_FoodM = Principal_FoodM;
    }

    public String getDessert_FoodM() {
        return Dessert_FoodM;
    }

    public void setDessert_FoodM(String Dessert_FoodM) {
        this.Dessert_FoodM = Dessert_FoodM;
    }

    public long getCalories_FoodM() {
        return Calories_FoodM;
    }

    public void setCalories_FoodM(long Calories_FoodM) {
        this.Calories_FoodM = Calories_FoodM;
    }

    public Collection<Event> getEvents() {
        return Events;
    }

    public void setEvents(Collection<Event> Events) {
        this.Events = Events;
    }

    public FoodMenu() {
    }

    public FoodMenu(String name_FoodM, String Entree_FoodM, String Principal_FoodM, String Dessert_FoodM, long Calories_FoodM) {
        this.name_FoodM = name_FoodM;
        this.Entree_FoodM = Entree_FoodM;
        this.Principal_FoodM = Principal_FoodM;
        this.Dessert_FoodM = Dessert_FoodM;
        this.Calories_FoodM = Calories_FoodM;
    }

   
}
