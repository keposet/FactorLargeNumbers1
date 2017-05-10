package LargeNumbers;

public class Driver {

    public static void main(String[] args) {
        long value =   600851475143L;


        FactorNumber operate = new FactorNumber();
        operate.findPrimes();
        operate.setInitialValue(value);
        operate.findFactor(value);


    }

}
