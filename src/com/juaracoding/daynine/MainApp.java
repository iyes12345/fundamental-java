package com.juaracoding.daynine;

public class MainApp {
    public static void main(String[] args){
        Button button = new Button();

        button.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik");
                System.out.println("berhasil");
            }
        });

        button.doClick();

        Button buttonTwo = new Button();

        buttonTwo.setClickAction(() -> {
            System.out.println("Tombol sudah diklik");
            System.out.println("berhasil");
        });

        buttonTwo.doClick();
    }
}
