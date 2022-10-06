package com.juaracoding.daysix;

import java.util.ArrayList;

public class ContohList {
    public static void main(String []args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("honda");
        cars.add("mistubisi");
        cars.add("toyota");
        cars.add("suzuki");
        System.out.println(cars);
        System.out.println("get:"+cars.get(3));
        cars.set(1,"mazda");
        System.out.println(cars);
        System.out.println("size: "+cars.size());
        cars.remove(3);
        System.out.println("remove: "+cars);
        cars.clear();
        System.out.println("Clear: " +cars);
    }
}
