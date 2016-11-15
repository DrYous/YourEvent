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
@Table(name="user")

public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_User;
    private String name_User;
    private String password_User;
    private boolean actived;
    
    @OneToMany()
    private Collection<Role>Roles_User;

    
    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }

    public String getName_User() {
        return name_User;
    }

    public void setName_User(String name_User) {
        this.name_User = name_User;
    }

    public String getPassword_User() {
        return password_User;
    }

    public void setPassword_User(String password_User) {
        this.password_User = password_User;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public Collection<Role> getRoles_User() {
        return Roles_User;
    }

    public void setRoles_User(Collection<Role> Roles_User) {
        this.Roles_User = Roles_User;
    }

    public User() {
    }

    public User(String name_User, String password_User, boolean actived) {
        this.name_User = name_User;
        this.password_User = password_User;
        this.actived = actived;
    }

   
}
