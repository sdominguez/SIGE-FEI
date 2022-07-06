/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lis.beans;

import com.lis.utils.Transform;
import java.time.LocalDateTime;

/**
 *
 * @author sauld
 */
public class Quiz {

    private int id_quiz;
    private String name;
    private String description;
    private LocalDateTime open_date;
    private LocalDateTime close_date;
    private int time_minutes;
    private int type_quiz_id;
    private int status_id;
    private String course_clave;
    private String professor;

    public int getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = Transform.stringToLocalDateTime(open_date);
    }

    public LocalDateTime getClose_date() {
        return close_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = Transform.stringToLocalDateTime(close_date);
    }

    public int getTime_minutes() {
        return time_minutes;
    }

    public void setTime_minutes(int time_minutes) {
        this.time_minutes = time_minutes;
    }

    public int getType_quiz_id() {
        return type_quiz_id;
    }

    public void setType_quiz_id(int type_quiz_id) {
        this.type_quiz_id = type_quiz_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getCourse_clave() {
        return course_clave;
    }

    public void setCourse_clave(String course_clave) {
        this.course_clave = course_clave;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    

}
