package com.company;

// it will add up 100 prime numbers total sum.

public class Main {
    public static void main(String[] args) {


        int counter = 3;
        int sum = 2;
        int primeTimes = 1;
        while (100 > primeTimes) {
            if (isPrime(counter)) {
                sum += counter;
                primeTimes++;
            }
            counter++;
        }
        System.out.println(sum);

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

