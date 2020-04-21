package com.beingzero.week_2;

import java.util.Scanner;

public class Catlan {
	static Scanner sc = new Scanner(System.in);
  	static int mod = (int) 1e9+7;
  	static long [] dp = new long[1001];
  	static int x = -1;
	public static void main(String[] args)
	{
		int T = sc.nextInt();
		
      	while(T-- != 0)
        {
          	int n = sc.nextInt();
          	System.out.println(catlan(n));
          	
        }   
	}
  	static long catlan(int n)
    {
      	if(n <= 1)
          	return 1;
      	
      	long res = 0;
      	for(int i = 0; i < n ; i++)
      	{
      		res = modSum(res, modProd(catlan(i),catlan(n-i-1)));
      	}
      	return res;
    }
    
  
  	static long modSum(long a, long b)
    {
      	return ( (a%mod) + (b%mod) )% mod;
    }
  	static long modProd(long a, long b)
    {
      	return ( (a%mod) * (b%mod) )% mod;
    }
}
