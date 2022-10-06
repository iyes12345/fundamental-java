package com.juaracoding.daynine;

public class LambdaOne {
    public static void main(String[] args){

        Addable addOne = (a, b) -> (a + b); // funtion annon
        System.out.println(addOne.add(10, 5));

        Addable addTwo = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(addTwo.add(20, 10));
    }
}
