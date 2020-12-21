package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            prime = (!(number % index == 0));
                break;
            }
        return prime;
    }
}