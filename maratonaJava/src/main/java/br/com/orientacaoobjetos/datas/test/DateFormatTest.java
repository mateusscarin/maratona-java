package br.com.orientacaoobjetos.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getTimeInstance(DateFormat.SHORT);
        df[4] = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getTimeInstance(DateFormat.LONG);
        df[6] = DateFormat.getTimeInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
