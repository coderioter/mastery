package com.coderioter.contests.beingZero.day4;
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    ArrayList<Long> factorials ;
    public long mod = 1000000007; 
	public static void main(String[] args) {
	    Main m = new Main();
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
        m.factorials = new ArrayList<>();
        m.factorials.add(0,1L);
        m.factorials.add(1,1L);
	    while(T-->0){
	        int N = sc.nextInt();
	        int R = sc.nextInt();
	        //calculate n!/(r!(n-r)!)
	        System.out.println(m.binCoefficient(N,R));
	    }
	}
	public long binCoefficient(int N, int R){
	    long n = factorial(N);
		long r = factorial(R);
		long nmr = factorial(N-R);
		return n/(r*nmr);
	}
	public long factorial(int n){
	    long fact = 1L;
	    try{
	        fact =factorials.get(n);
	    }catch(IndexOutOfBoundsException e){
	    	if(n<=1) fact = factorials.get(n);
	    	else{
	    		fact = factorial(n-1)*n;
	    		factorials.add(n,fact);
	    	}
	    }
	    return fact;
	}
}
