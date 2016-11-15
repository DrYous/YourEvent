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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author youssef
 */
@Entity
@Table(name="themes")
public class ThemeEvent implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_Theme;
    private String name_Theme;
    private String Description_Theme;
    private byte[] photo_Theme;
     @OneToMany()
    private Collection<Event> Events;

    public Long getId_Theme() {
        return id_Theme;
    }

    public void setId_Theme(Long id_Theme) {
        this.id_Theme = id_Theme;
    }

    public String getName_Theme() {
        return name_Theme;
    }

    public void setName_Theme(String name_Theme) {
        this.name_Theme = name_Theme;
    }

    public String getDescription_Theme() {
        return Description_Theme;
    }

    public void setDescription_Theme(String Description_Theme) {
        this.Description_Theme = Description_Theme;
    }

    public byte[] getPhoto_Theme() {
        return photo_Theme;
    }

    public void setPhoto_Theme(byte[] photo_Theme) {
        this.photo_Theme = photo_Theme;
    }

    public Collection<Event> getEvents() {
        return Events;
    }

    public void setEvents(Collection<Event> Events) {
        this.Events = Events;
    }

    public ThemeEvent() {
    }

    public ThemeEvent(String name_Theme, String Description_Theme, byte[] photo_Theme) {
        this.name_Theme = name_Theme;
        this.Description_Theme = Description_Theme;
        this.photo_Theme = photo_Theme;
    }

  
}
