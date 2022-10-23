import Queue.Queue;

import java.util.Iterator;
import java.util.Scanner;
import java.lang.Math;


public class Sieve
{
    public static void primesTo()
    {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();
        LinkedQueue<Integer> primes = new LinkedQueue<>();
        LinkedQueue<Integer> maybePrimes = new LinkedQueue<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter upper bound");
        int n = sc.nextInt();

        // throw exception for invalid input
        while (n < 2)
        {
            System.err.println("Error: Input must be a number greater than 2.");
            n = sc.nextInt();
        }

        for (int i = 2; i <= n; i++)
            numbers.enqueue(i);

        // for each number in numbers
        for (int p : numbers)
        {
            while (p <= (int) Math.sqrt(n)) // while it's prime
            {
                primes.enqueue(p); // add to primes queue

                // go through
                for (int num : numbers)
                {
                    // if number % p != 0
                        // add it to some other queue

                    if (num % p == 0)
                        numbers.dequeue();

                    int num = numbers.dequeue();


                }
            }
            primes.enqueue(p);
        }

    }

    public static void main(String[] args)
    {
        primesTo();
    }
}
