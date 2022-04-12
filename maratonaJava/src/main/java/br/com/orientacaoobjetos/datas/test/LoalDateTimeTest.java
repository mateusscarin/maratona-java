package br.com.orientacaoobjetos.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LoalDateTimeTest {

    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-10-24");
        LocalTime time = LocalTime.parse("10:19:00");
        
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
    
}
