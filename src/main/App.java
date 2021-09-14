package main;

import java.util.*;
import java.util.stream.IntStream;

public class App
{
    public static void main(String[] args) 
    {
        System.out.println(primeSieve(100));
    }
    static List<Integer> primeSieve(int upTo)
    {
        var primes = new ArrayList<Integer>();
        var nums = new LinkedList<>(
            IntStream.rangeClosed(2, upTo)
            .boxed()
            .filter(i -> i % 2 != 0 || i == 2)
            .toList()
            );
        var max = nums.getLast();

        while (!nums.isEmpty())
        {
            var get = nums.get(0);
            System.out.println(Math.sqrt(get) == Math.sqrt(max));
            primes.add(get);
            nums.removeIf(n -> n % get == 0);
        }

        return primes;
    }
}
