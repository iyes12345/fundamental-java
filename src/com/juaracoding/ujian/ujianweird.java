package com.juaracoding.ujian;

import java.util.Scanner;

public class ujianweird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int x=22;
        if(x == 4){
            System.out.println("Not Weird");
        }
        else if(x == 7){
            System.out.println("Weird");
        }else if(x == 22){
            System.out.println("Not Weird");
        }else{
            System.out.println("nilai x tidak diketahui");
        }
    }
}
