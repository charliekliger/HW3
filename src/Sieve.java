import Queue.Queue;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.Math;


public class Sieve
{
    private final Integer n;
    public Sieve(int n) {this.n = n; }

    public void primesTo()
    {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();
        LinkedQueue<Integer> primes = new LinkedQueue<>();


        for (int i = 2; i <= n; i++)
            numbers.enqueue(i);


        int p = numbers.dequeue();

        while (p <= (int) Math.sqrt(n))
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
}
