package com.coderioter.contests.beingZero.day1;
import java.util.*;
import java.math.*;

public class ArrayListSortPrint {

    static Scanner sc;
    public static void main(String[] args) {
  		sc = new Scanner(System.in);
    	int t = sc.nextInt();
      	for(int ti=1; ti <= t; ti++)
        {
            int n = sc.nextInt(); 
            int q = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>(n); // Note:  This is dynamic in size
            int ai, x;
            for(ai=0;ai<n;ai++){
                x = sc.nextInt();
                a.add(x); // Note: add Function of ArrayList
            }	
            // TODO:  Write A Line of Code that Sorts ArrayList elements
            a.sort(new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o1-o2;
				}
			});
            // TODO:  For Each query index on input
            // Print the Element at given index
            while(q-->0) {
            	int query = sc.nextInt();
				System.out.print((a.size()>query && query>-1?a.get(query):-1)+" ");
            }
            System.out.println();
        }
      	sc.close();
    }
}