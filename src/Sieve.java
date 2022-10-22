import java.util.Scanner;
import java.lang.Math;


public class Sieve
{
    public static void primesTo()
    {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter upper bound");
        int n = sc.nextInt();

        // throw exception for invalid input
        if(n < 2)
        {
            System.err.println("Error: Input must be a number greater than 2.");
            n = sc.nextInt();
        }

        // add all numbers from 2 to n to numbers
        for (int i = 2; i <= n; i++)
        {
            numbers.enqueue(i);
        }


        LinkedQueue<Integer> primes = new LinkedQueue<>();
        LinkedQueue<Integer> maybePrime = new LinkedQueue<>();

        while (!(numbers.isEmpty()))
        {
            int p = numbers.dequeue();

            while (p <= (int) Math.sqrt(n))
            {
                primes.enqueue(p);

                while (!(numbers.isEmpty()))
                {
                    int num = numbers.dequeue();
                    if (!(num % p == 0))
                        maybePrime.enqueue(num);
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
