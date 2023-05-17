package com.coderioter.contests.uva.adhoc.easy.lumberjackSequencing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)
		throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int T= Integer.parseInt(str);
		System.out.println("Lumberjacks:");
		while(T-->0) {
			String[] x = br.readLine().split("\\s");
			boolean asc=false,desc=false;
			int prev=Integer.parseInt(x[0]);
			for(int i=1;i<x.length;i++) {
				int c = Integer.parseInt(x[i]);
				if(c>prev) {
					asc=true;
				}else if(c<prev) {
					desc=true;
				}
				if(asc&&desc) {
					break;
				}
				prev=c;
			}
			System.out.println((asc&&desc)||(!asc&&!desc)?"Unordered":"Ordered");
		}
	}
}
