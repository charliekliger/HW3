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


        while (n < 2)
        {
            System.err.println("Error: Input must be a number greater than 2.");
            n = sc.nextInt();
        }

        for (int i = 2; i <= n; i++)
            numbers.enqueue(i);


        int p = numbers.dequeue();
        int bound = (int) Math.sqrt(n);
        while(p <= bound)
        {
            primes.enqueue(p);
            int sizeNumbers = numbers.size();

            for (int j = 0; j < sizeNumbers; j++)
            {
                int num = numbers.dequeue();
                if (num % p != 0)
                {
                    numbers.enqueue(num);
                }

            }
           p = numbers.dequeue();

        }
        primes.enqueue(p);

        while (!(numbers.isEmpty()))
        {
            p = numbers.dequeue();
            primes.enqueue(p);

        }

        System.out.println(primes);
    }


    public static void main(String[] args)
    {
        primesTo();
    }
}
