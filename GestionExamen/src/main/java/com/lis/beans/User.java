/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lis.beans;

import com.lis.utils.Transform;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author sauld
 */
public class User implements Serializable{
    
    private int id_user;
    private String user_name;
    private String password;
    private LocalDateTime last_access;
    private Rol rol;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLast_access() {
        return last_access;
    }

    public void setLast_access(String last_access) {
        this.last_access = Transform.stringToLocalDateTime(last_access);
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return user_name;
    }
    
    
    
}
