package com.example.numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFibonacciSequenceToN
{
    public ArrayList<Integer> goToNNumber(int n)
    {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>(Arrays.asList(0,1));

        while (fibonacciSequence.get(fibonacciSequence.size()-1) < n)
        {
            fibonacciSequence.add(calculateSumOfLastTwo(fibonacciSequence));
        }

        return fibonacciSequence;
    }

    public ArrayList<Integer> goToNIndex(int n)
    {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>(Arrays.asList(0,1));

        for(int i = 0; i < n; i++)
        {
            int sum = calculateSumOfLastTwo(fibonacciSequence);
            fibonacciSequence.add(sum);
        }
        return fibonacciSequence;
    }

    private int calculateSumOfLastTwo(ArrayList<Integer> fibonacciSequence)
    {
        int fibonacciSize = fibonacciSequence.size();

        int last = fibonacciSequence.get(fibonacciSize - 1);
        int secondLast = fibonacciSequence.get(fibonacciSize - 2);

        int sum = last + secondLast;

        return sum;
    }
}
