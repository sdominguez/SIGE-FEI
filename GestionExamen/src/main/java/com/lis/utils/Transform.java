/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lis.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author sauld
 */
public class Transform {
    
    public static LocalDateTime stringToLocalDateTime(String mysql_datetime){
        //2022-07-04 19:27:14
        String[] dt = mysql_datetime.split(" ");
        String[] strDate = dt[0].split("-");
        String[] strTime = dt[1].split(":");
        
        LocalDate date = LocalDate.of(Integer.valueOf(strDate[0]), Integer.valueOf(strDate[1]), Integer.valueOf(strDate[2]));
        LocalTime time = LocalTime.of(Integer.valueOf(strTime[0]), Integer.valueOf(strTime[1]));
        
        return LocalDateTime.of(date, time);
    }
    
}
