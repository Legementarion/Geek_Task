package com.Lego;

import com.Lego.Task1.Palindrome;
import com.Lego.Task2.FactorialSum;
import com.Lego.Task3.Pairs;

public class Main {

    public static void main(String[] args) {

        //Task1
        Palindrome palindrome = new Palindrome();
        palindrome.start();

        //Task2
        FactorialSum factorialSum = new FactorialSum();
        factorialSum.start();

        //Task3
        Pairs pairs = new Pairs();
        pairs.start();

    }
}
