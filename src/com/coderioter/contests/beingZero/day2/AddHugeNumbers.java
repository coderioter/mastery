package com.coderioter.contests.beingZero.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddHugeNumbers 
{
    void addHugeNumbersAndPrint(char n1[], char n2[])
    {
      char[] sum = new char[Math.max(n1.length,n2.length)+1];
      int carryForward=0;
      int flag=sum.length-1;
      int n1Length = n1.length-1;
      int n2Length = n2.length-1;
      int i=n1Length,j=n2Length;
      while(i>=0&&j>=0) {
    	  int value = Character.getNumericValue(n1[i])+Character.getNumericValue(n2[j])+carryForward;
    	  sum[flag--]=Character.forDigit(value%10,10);
    	  carryForward=value/10;
    	  i--;j--;
      }

      //add remaining digits
      if(n1Length==n2Length) {
    	  //sum[flag]=carryForward>0?Character.forDigit(carryForward,10):' ';
      }else if(n1Length>n2Length) {
    	  while(i>=0) {
        	  int value = Character.getNumericValue(n1[i])+carryForward;
        	  sum[flag--]=Character.forDigit(value%10,10);
        	  carryForward=value/10;
        	  i--;
    	  }
      }else {
    	  while(j>=0) {
	    	  int value = Character.getNumericValue(n2[j])+carryForward;
	    	  sum[flag--]=Character.forDigit(value%10,10);
	    	  carryForward=value/10;
	    	  j--;
    	  }
      }
	  sum[flag]=carryForward>0?Character.forDigit(carryForward,10):' ';
      System.out.println(new String(sum).trim());
    }
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		AddHugeNumbers test = new AddHugeNumbers();
      	int t = sc.nextInt();
      	sc.nextLine(); // Remove \n
      	while(t--!=0){
			String a[] = sc.nextLine().split(" ");
			test.addHugeNumbersAndPrint(a[0].toCharArray(), a[1].toCharArray());
        }
	}
}