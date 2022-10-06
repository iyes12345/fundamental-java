package com.juaracoding.dayeight;

public class StringMethod {
    public static void main(String[] args) {

        String actual = " Data berhasil disimpan";
        String expect = "berhasil";

        System.out.println(actual.contains(expect));

        String browser = "firefox";
        String pilihEdge = "chrome";
        String pilihBrave = "Firefox";
        if (pilihEdge.equals(browser)) {
            System.out.println("Browser chrome");
        } else if (pilihBrave.equalsIgnoreCase(browser)) {
            System.out.println("Browser Firefox");

        } else {
            System.out.println("error");
        }

        System.out.println(browser.toUpperCase());
        System.out.println(browser.substring(4,7));

    }
}
