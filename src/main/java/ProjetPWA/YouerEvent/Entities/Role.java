/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetPWA.YouerEvent.Entities;

import java.io.Serializable;
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
@Table(name="roles")
public class Role implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
     private Long id_Role;
     private String name_Role;
     private User user;

    public Long getId_Role() {
        return id_Role;
    }

    public void setId_Role(Long id_Role) {
        this.id_Role = id_Role;
    }

    public String getName_Role() {
        return name_Role;
    }

    public void setName_Role(String name_Role) {
        this.name_Role = name_Role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role() {
    }

    public Role(String name_Role) {
        this.name_Role = name_Role;
    }

   
}
