package com.apadala.ArraysStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P216 {
    
    
   static boolean isprime(int n){
       boolean isPrime=true;
       if(n<2) {
           return false;
       }
       int temp=0;
           for(int i=2;i<=n/2;i++)
    {
           temp=n%i;
       if(temp==0)
       {
          isPrime=false;
          break;
       }
    }
    //If isPrime is true then the number is prime else not
    if(isPrime)
       return true;
    else
       return false;
   }
public static boolean psq(int c) {
        int a = (int) Math.sqrt(c);

        return a * a == c;

    }
    
    
    
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static boolean gcd(int a, int b, int c) {

        return gcd(gcd(a, b), c) == 1;

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        
        if(a<1 && a>2)
            System.exit(0);
        if(Math.abs(b)>100)
        System.exit(0);  
        
        if(Math.abs(c)>10000000)
        System.exit(0);  
        
        if(!gcd(a,Math.abs(b),Math.abs(c)))
        System.exit(0);  
        if(!psq(b*b-2*a*b))
        System.exit(0);  
            
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            int z=sc.nextInt();
            for (int j=1;j<=z;j++){
          //  int x=0;
            if(isprime((a*j*j+b*j+c)))
           list.add(a*j*j+b*j+c);
            }
           // System.out.println(list);
            System.out.println(list.size());
            list.clear();   
        }
    }
}