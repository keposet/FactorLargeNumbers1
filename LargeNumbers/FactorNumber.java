package LargeNumbers;

import java.util.ArrayList;

public class FactorNumber {

    private ArrayList<Integer> primeList = new ArrayList<Integer>();
    private ArrayList<Integer> factorList = new ArrayList<Integer>();
    private final int LIMIT = 10000;
    private long initialValue = 0;


    public void findFactor(long value) {
        boolean foundFactor = false;
        int factor = 0;

        for (int i = 0; i < primeList.size() && foundFactor == false; i++) {
            if (value % primeList.get(i) == 0) {
                foundFactor = true;
                factor = primeList.get(i);
                factorList.add(factor);
                if (factor == value) {
                    printFactors();
                } else {
                    value = value / factor;
                    findFactor(value);
                }
            }
        }
    }

    public void printFactors(){
        System.out.println("The Factors of " + initialValue + " are:");
        for (Integer factor : factorList) {
            System.out.print(factor +" ");
        }

    }

    public void findPrimes() {
        int i = 0, limit = LIMIT, testValue = 2;
        boolean isPrime = true;

        while (testValue < limit) {

            while (isPrime == true && i < primeList.size()) {
                if (testValue % primeList.get(i) == 0) {
                    isPrime = false;
                } else {
                    i++;
                }
            }

            i = 0;

            if (isPrime == true) {

                primeList.add(testValue);
                testValue++;

            } else {
                testValue++;
                isPrime = true;

            }

        }
    }

    public void printList() {

        for (Integer prime : primeList) {
            System.out.println(prime);
        }

    }

    public void setInitialValue(long value){
        initialValue = value;
    }

}
