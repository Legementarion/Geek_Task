package com.Lego.Task2;

import java.math.BigInteger;

/**
 * @author Lego on 26.07.2016.
 */
public class FactorialSum {

    public void start(){
        long time = System.nanoTime();
        StringBuilder tmp = new StringBuilder(String.valueOf(factorial(100))); //find the required number and converts number to array of numerals

        int result = 0;
        for (int i = 0; i < tmp.length(); i++) {
            result+= Integer.parseInt(tmp.substring(i,i+1));    // sum up all the numbers of array
        }

        System.out.print("Factorial sum - "+result);
        System.out.println("\n Time of execution -" + (System.nanoTime() - time) * (Math.pow(10, -9)) + " \n");
    }

    public static BigInteger factorial(int n)
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }
}
