package com.company;

public class Runner
{

    public static void main(String[] args)
    {
        int[] arr1 = {90,80,90,80,83};
        int[] arr2 = {50,80,70,53,20};
        int[] arr3 = {50,60,20,40};

        StudentRecord one = new StudentRecord(arr1);
        System.out.println(one.finalAverage());

        StudentRecord two = new StudentRecord(arr2);
        System.out.println(two.finalAverage());

        StudentRecord three = new StudentRecord(arr3);
        System.out.println(three.finalAverage());
    }
}
