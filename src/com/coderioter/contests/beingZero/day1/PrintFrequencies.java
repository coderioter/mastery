package com.coderioter.contests.beingZero.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFrequencies {

	public static void main(String[] args) {
		printFrequencies(new int[]{5, 1, 3, 2, 5, 1});

	}

	public static void printFrequencies(int a[]) 
	{
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i:a){
			if(map.containsKey(i)){
				map.put(i,(map.get(i))+1);
			} else
				map.put(i,1);
		}
		for(Map.Entry<Integer,Integer> e: map.entrySet()){
			System.out.print(e.getKey()+":"+e.getValue()+" ");
		}
	}
}
