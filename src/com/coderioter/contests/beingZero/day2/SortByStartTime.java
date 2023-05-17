/**
 * 
 */
package com.coderioter.contests.beingZero.day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class SortByStartTime {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0){
			int i = sc.nextInt();
			TimeInterval[] t = new TimeInterval[i];
			for(int flag=0;flag<i;flag++){
				TimeInterval x = new TimeInterval();
				x.startTime = sc.nextInt();
				x.endTime = sc.nextInt();
				t[flag]=x;
			}
			Arrays.sort(t,new Comparator<TimeInterval> (){
				public int compare(TimeInterval t1, TimeInterval t2){
					return t1.startTime-t2.startTime;
				}
			});
			for(TimeInterval tx : t){
				System.out.printf("(%d,%d)",tx.startTime,tx.endTime);
			}
			System.out.println();
		}
		sc.close();
	}

}

class TimeInterval{
	public int startTime;
	public int endTime;
}
