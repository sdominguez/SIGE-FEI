/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lis.beans;

import java.io.Serializable;

/**
 *
 * @author sauld
 */
public class Rol implements Serializable{
    
    private int id;
    private String name_rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

    @Override
    public String toString() {
        return name_rol;
    }
    
    
    
}
