package com.juaracoding.ujian;

import java.util.Scanner;

public class ujian7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i=0; i<12; i+=2 ){
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int n=20; n>11; n--){
            System.out.print(n + " ");
        }
    }
}
