/**
 * THE PROBLEM: Write a program in java to calculate the GCD of two numbers using Euclidean's Principle and recursion.
 * Eg: GCD of 32 and 8 is 8.
 */

import java.util.*;
class GCD_Euclidean
{
    static int a, b;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. 1 :-->  ");

        a = sc.nextInt();
                System.out.println();
        System.out.print("Enter the no. 2 :--> ");
        b = sc.nextInt();
                System.out.println();
GCD_Euclidean obj = new GCD_Euclidean();
int g = obj.gcd(a, b);
System.out.println("The GCD of " + a + " and " + b + " is " + g); 
    }

    int gcd(int no1, int no2)
    {
        if(no1 == 0 || no2 == 0)
        return 0;
        if(no1 == no2)
        return no1;
        if(no1 > no2)
        return gcd(no1 - no2, no2);
        else
        return gcd(no1, no2 - no1);

    }
}