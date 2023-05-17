/**
 * 
 */
package com.coderioter.contests.beingZero.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shakeels
 *
 */
public class DistinctValuesInWindowSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(4);
		al.add(1);
		al.add(6);
		al.add(1);
		List<Integer> x = distinctValuesInWindow(al,2);
		System.out.println();
		for(Integer y:x) {
			System.out.println(y);
		}
		
	}
  	public static List<Integer> distinctValuesInWindow(ArrayList<Integer> al, int w)
    {
  		List<Integer> l = new ArrayList<>();
  		for(int flag=0;flag+w<=al.size();flag++) {
      		int newIndex = w+flag;
      		Set<Integer> s = new HashSet<>();
      		while(newIndex-flag>0) {
      			System.out.print(al.get(newIndex-1)+" ");
      			s.add(al.get(newIndex-1));
      			newIndex--;
      		}
      		l.add(s.size());	
      	}
  		return l;
    }
}
