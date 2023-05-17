/**
 * 
 */
package com.coderioter.contests.programmingChallenges.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class ThreeNPlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inx = new Scanner(System.in);
		ArrayList<Integer> start= new ArrayList<>();
		ArrayList<Integer> end= new ArrayList<>();
		ArrayList<Integer> maxCycleList= new ArrayList<>();
		while(inx.hasNextLine()) {
			start.add(inx.nextInt());
			end.add(inx.nextInt());
			inx.nextLine();
			//if() break;
		}
		for(int k=0;k<start.size();k++) {
			int i=start.get(k);
			int j=end.get(k);
			int from=i<j?i:j;
			int to=i<j?j:i;
			inx.close();
			int maxCycle = 0;
			while(to>=from) {
				int x=to;
				int cycles = 0;
				while(x>=1) {
					cycles++;
					if(x==1)
						break;
					if(x%2==0) {
						x/=2;
					}else  {
						x=3*x+1;
					}
				}
				to--;
				maxCycle=Math.max(maxCycle, cycles);
			}
			maxCycleList.add(maxCycle);
		}
		for(int k=0;k<start.size();k++) {
			System.out.println(start.get(0)+" "+end.get(0)+" "+maxCycleList.get(0));
		}
	}

}
