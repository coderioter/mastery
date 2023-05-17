package com.coderioter.contests.beingZero.day1;
import java.util.*;
public class QueueOperations 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = sc.nextInt();
        for(int ti=1;ti<=tests;ti++)
        {
          	// For Every Test, We need to create new Queue
            Queue<Integer> q = new LinkedList<Integer>(); 

            int opsCount = sc.nextInt();
            for(int op=1;op<=opsCount;op++)
            {
                int opType = sc.nextInt();
   		switch(opType){
			case 0:
				q.add(sc.nextInt());
				break;
			case 1:
				System.out.print(q.remove()+" ");
				break;
		}
                // TODO:  Based on op type, complete the code as requested
            }
            System.out.println();
        }
	}
}