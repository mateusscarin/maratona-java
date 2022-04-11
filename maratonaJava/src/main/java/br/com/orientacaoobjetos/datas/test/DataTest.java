package br.com.orientacaoobjetos.datas.test;

import java.util.Date;

public class DataTest {

    public static void main(String[] args) {
        
        Date date = new Date();
        date.setTime(date.getTime()+ 3600000L);
        System.out.println(date);
    }
}
