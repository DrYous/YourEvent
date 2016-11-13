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
@Table(name="events")
public class Event implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long id_Evt;
    private String type_Evt;
    private long nb_Inv;
    private boolean food_Req;
    private boolean drink_Req;
    private Date date_Evt;
    
    private ThemeEvent theme_Event;
    private Collection<FoodMenu>food_Menu;
    private Collection<DrinkMenu>drink_menu;

    public Long getId_Evt() {
        return id_Evt;
    }

    public void setId_Evt(Long id_Evt) {
        this.id_Evt = id_Evt;
    }

    public String getType_Evt() {
        return type_Evt;
    }

    public void setType_Evt(String type_Evt) {
        this.type_Evt = type_Evt;
    }

    public long getNb_Inv() {
        return nb_Inv;
    }

    public void setNb_Inv(long nb_Inv) {
        this.nb_Inv = nb_Inv;
    }

    public boolean isFood_Req() {
        return food_Req;
    }

    public void setFood_Req(boolean food_Req) {
        this.food_Req = food_Req;
    }

    public boolean isDrink_Req() {
        return drink_Req;
    }

    public void setDrink_Req(boolean drink_Req) {
        this.drink_Req = drink_Req;
    }

    public Date getDate_Evt() {
        return date_Evt;
    }

    public void setDate_Evt(Date date_Evt) {
        this.date_Evt = date_Evt;
    }

    public ThemeEvent getTheme_Event() {
        return theme_Event;
    }

    public void setTheme_Event(ThemeEvent theme_Event) {
        this.theme_Event = theme_Event;
    }

    public Collection<FoodMenu> getFood_Menu() {
        return food_Menu;
    }

    public void setFood_Menu(Collection<FoodMenu> food_Menu) {
        this.food_Menu = food_Menu;
    }

    public Collection<DrinkMenu> getDrink_menu() {
        return drink_menu;
    }

    public void setDrink_menu(Collection<DrinkMenu> drink_menu) {
        this.drink_menu = drink_menu;
    }

    public Event() {
    }

    public Event(String type_Evt, long nb_Inv, boolean food_Req, boolean drink_Req, Date date_Evt) {
        this.type_Evt = type_Evt;
        this.nb_Inv = nb_Inv;
        this.food_Req = food_Req;
        this.drink_Req = drink_Req;
        this.date_Evt = date_Evt;
    }

   
    
    
}
