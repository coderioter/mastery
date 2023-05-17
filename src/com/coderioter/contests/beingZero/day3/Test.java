package com.coderioter.contests.beingZero.day3;

import java.util.*;
public class Test 
{  
	public static void main(String[] args)
	{
      	Scanner sc = new Scanner(System.in);
      	int T = sc.nextInt();
      	while(T-->0){
          int N = sc.nextInt();
          int[] a = new int[N];
          for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
          }
          int Q = sc.nextInt();
          while(Q-->0){
            int k = sc.nextInt();
           	PriorityQueue<Integer> q = new PriorityQueue<>(k);
 			for(int i:a){
              q.add(i);
            }
            System.out.print(q.peek()+" ");
          }
        }
	}
}