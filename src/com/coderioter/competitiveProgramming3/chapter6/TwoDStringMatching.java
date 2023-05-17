/**
 * 
 */
package com.coderioter.competitiveProgramming3.chapter6;

import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class TwoDStringMatching {

	/**
	 * @param args
	 */
	//fw,bw,up,dn,urd,uld,lrd,lld
	enum DIR{FORWARD,BACKWARD,UP,DOWN,UPER_RIGHT_DIAG,UPPER_LEFT_DIAG,LOWER_RIGHT_DIAG,LOWER_LEFT_DIAG};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row,col=0;
		char [][] stringGrid = null;
		row = scanner.nextInt();
		col = scanner.nextInt();
		stringGrid = new char[row][col];
		for (int i=0;i<row ;i++) {
			stringGrid[i] = scanner.next().toCharArray();
		}
		String searchPattern = scanner.next();
		scanner.close();
		
		int [] matches = new TwoDStringMatching(). findMatches(stringGrid,searchPattern);
		
	}
	private int[] findMatches(char[][] stringGrid, String searchPattern) {
		int rows = stringGrid.length;
		int columns = stringGrid[0].length;
		for(int i=0;i<stringGrid.length;i++) {
			for(int j=0;j<stringGrid.length;j++) {
				int k=0;
				if(searchPattern.charAt(k)==stringGrid[i][j]) {
					//match the next char
					if (j + searchPattern.length() < columns)
						if (searchPattern.charAt(k + 1) == stringGrid[i][j + 1])
							findMatches(stringGrid, searchPattern, i, j, DIR.FORWARD);
					if(j-searchPattern.length() >=0)
						if(searchPattern.charAt(k+1)==stringGrid[i][j-1])
							findMatches(stringGrid,searchPattern, i,j,DIR.BACKWARD);
					if (i + searchPattern.length() < rows)
						if (searchPattern.charAt(k + 1) == stringGrid[i + 1][j])
							findMatches(stringGrid, searchPattern, i, j, DIR.DOWN);
					if(i-searchPattern.length() >= 0)
						if(searchPattern.charAt(k+1)==stringGrid[i-1][j]) 
							findMatches(stringGrid,searchPattern, i,j,DIR.UP);
					if(i-searchPattern.length() >= 0 && j+searchPattern.length()< columns)
						if(searchPattern.charAt(k+1)==stringGrid[i-1][j+1]) 
							findMatches(stringGrid,searchPattern, i,j,DIR.UPER_RIGHT_DIAG);
					if(i-searchPattern.length() >= 0 && j-searchPattern.length()>= 0)
						if(searchPattern.charAt(k+1)==stringGrid[i-1][j-1]) 
							findMatches(stringGrid,searchPattern, i,j,DIR.UPPER_LEFT_DIAG);
					if (i + searchPattern.length() < rows && j - searchPattern.length() >= columns)
						if (searchPattern.charAt(k + 1) == stringGrid[i + 1][j - 1])
							findMatches(stringGrid, searchPattern, i, j, DIR.LOWER_LEFT_DIAG);
					if (i + searchPattern.length() < rows && j + searchPattern.length() < columns)
						if(searchPattern.charAt(k+1)==stringGrid[i+1][j+1]) 
							findMatches(stringGrid,searchPattern, i,j,DIR.LOWER_RIGHT_DIAG);
				}
			}
		}
		return null;
	}
	private void findMatches(char[][] stringGrid, String searchPattern, int i, int j, DIR direction) {
		System.out.println("["+i+"]["+j+" - "+direction);
		
	}

}
