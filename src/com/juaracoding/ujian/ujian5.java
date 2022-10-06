package com.juaracoding.ujian;

import java.util.Scanner;

public class ujian5 {
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // deklarasi variabel
        String nama, alamat;
        int usia, gaji;


        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();

        System.out.print("Profesi: ");
        String Profesi = keyboard.next();

        System.out.print("Salary: ");
        int Salary = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama : " +nama);
        System.out.println("Profesi: " +Profesi);
        System.out.println("Salary: " +Salary);
    }

}