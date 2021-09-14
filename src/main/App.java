package main;

import java.util.*;
import java.util.stream.IntStream;

public class App
{
    public static void main(String[] args) 
    {
        System.out.println(primeSieve(100));
    }
    static int[] primeSieve(int upTo)
    {
        var primes = new HashSet<Integer>();
        var max = upTo - (upTo % 2 == 0 ? 1 : 0);
        var nums = IntStream.rangeClosed(2, upTo)
            .boxed()
            .filter(i -> i % 2 != 0 || i == 2)
            .toList();
        System.out.println(nums);
        return null;
    }
}
