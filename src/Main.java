import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter upper bound");
        int n = sc.nextInt();


        while (n < 2)
        {
            System.err.println("Error: Input must be a number greater than 2.");
            n = sc.nextInt();
        }

        Sieve newSieve = new Sieve(n);



        System.out.print("Primes up to " + n + " are: " );
        newSieve.primesTo();

    }

}