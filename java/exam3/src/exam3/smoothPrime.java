package exam3;

import java.util.Scanner;



public class smoothPrime{

    static boolean isPrime(int num) {

        if(num<=1)
            return false;
        for(int i=2;i<num;i++)
            if(num%i==0)
            {
                return false;
            }
        	return true;

    }

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(isPrime(n-1) && isPrime(n+1)) {

            System.out.println("true");

            System.out.println(n-1);

            System.out.println(n+1);

        }

    }

}