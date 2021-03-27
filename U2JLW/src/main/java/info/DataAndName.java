package info;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DataAndName {
    private static String name="Okrut";
    private static LocalDate date = LocalDate.of(2020, 2, 11);
    private Date now=new Date();


    public static void seeDateAndName(){
        Date now=new Date();
        System.out.println("Name: "+name);
        System.out.println("Date of begining "+ date);
        System.out.println("Date of end "+ now);

    }



}
