package com.coderioter.learn.algorithms.sort;

public class MergeSort {
//merge sort to sort an array
	public static void main(String [] args) {
		int[] array = {5,2,3,9,7,6,8,1,4};
		MergeSort m = new MergeSort();
		m.merge(array,0,array.length-1);
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+(i<array.length-1?", ":""));
		}
		
	}
	
	public void merge(int[] array, int b,int e ) {
		
		if(b<e) {
			int m = (b+e)/2;
			merge(array, b,m);
			merge(array,m+1,e);
			mergeSort(array, b,e,m);				
		}
	}

	private void mergeSort(int[] array, int b, int e, int m) {
		int i=b;
		int j=m;
		System.out.println();
		for (int l=0;l<array.length;l++) {
			System.out.print(array[l]+(l<array.length-1?", ":""));
		}
		while(i<m && j<e) {
			if(array[i]>array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}else {
				j++;
			}
		}
		System.out.println();
		for (int l=0;l<array.length;l++) {
			System.out.print(array[l]+(l<array.length-1?", ":""));
		}
	}
}
