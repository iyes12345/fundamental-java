package com.juaracoding.ujian;

import java.util.Scanner;

public class menghitunghari {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();


        switch(input)
        {
            case "weekday":
                System.out.println("Senin Selasa Rabu Kamis Jum'at");
                break;
            case "weekend":
                System.out.println("Sabtu Minggu");
                break;
            default:
                System.out.println("Invalid input");
        }
    }


}