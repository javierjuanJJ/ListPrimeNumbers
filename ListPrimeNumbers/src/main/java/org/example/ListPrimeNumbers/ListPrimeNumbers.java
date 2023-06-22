package org.example.ListPrimeNumbers;

public class ListPrimeNumbers {
    public static boolean isPrimeNumber(long number) {
        boolean isPrimeNumber = false;

        for (int counter = 2; counter < number && !isPrimeNumber; counter++) {
            // System.out.println(number % counter);
            isPrimeNumber = number % counter == 0;
        }

        return !isPrimeNumber;
    }

    public static int[] listPrimeNumber(int numberLenghtList){
        int counter = 0;
        int number = 2;
        int[] numberListPrimes = new int[numberLenghtList];

        while (counter < numberLenghtList){


            if (isPrimeNumber(number)){
                numberListPrimes[counter] = number;
                counter++;
            }

            number++;
        }

        return numberListPrimes;
    }


}
