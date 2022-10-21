import java.util.*;
import java.util.Scanner;
import java.lang.Math;


public class Sieve
{
    public static int primesTo(int n)
    {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter upper bound");
        n = sc.nextInt();

        if(n < 2)
        {
            System.err.println("Error: Input must be a number greater than 2.");
            n = sc.nextInt();
        }

        for (int i = 2; i <= n; i++)
        {
            numbers.enqueue(i);
        }

        LinkedQueue<Integer> primes = new LinkedQueue<>();

        while (!numbers.isEmpty())
        {
            int p = numbers.dequeue();

            while (p <= Math.sqrt(n))
            {
                primes.enqueue(p);

                /*
                    for (number : numbers)
                        if (number % p == 0)
                            numbers.dequeue()

                */

            }
        }
        return n;
    }

    public static void main(String[] args)
    {
        primesTo(10);
    }
}
