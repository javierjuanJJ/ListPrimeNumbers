package org.example;

import org.example.ListPrimeNumbers.ListPrimeNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int numberLenghtList= 1000;
        int[] listPrimeNumber = ListPrimeNumbers.listPrimeNumber(numberLenghtList);
        System.out.println(Arrays.toString(listPrimeNumber));
        System.out.println("The prime number " + numberLenghtList + " is " + listPrimeNumber[listPrimeNumber.length - 1]);
    }
}