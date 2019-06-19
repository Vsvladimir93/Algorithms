package com.internship;


import com.internship.model.Array;

public class Main {

    public static void main(String[] args) {

        Array arr = Array.createNewArray(10000, true);
        arr.sort();
        System.out.println("Number of operations: " + arr.getNumberOfOperations());
        System.out.println("Sort time in millis: " + arr.getSortTime());
        System.out.println("O(n) : " + arr.getNumberOfOperations() / arr.getArray().length);
    }


}
