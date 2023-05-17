package com.coderioter.contests.beingZero.day1;
import java.util.*;
public class SetOperations 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tests = sc.nextInt();
        for(int ti=1;ti<=tests;ti++)
        {
          	// For Every Test, We need to create new Stack
            Set<Integer> set = new HashSet<Integer>(); 

            int opsCount = sc.nextInt();
            for(int op=1;op<=opsCount;op++)
            {
                int opType = sc.nextInt();
				int operand = sc.nextInt();
				switch(opType) {
				case 0:{//ADD
					set.add(operand);
					break;
				}
				case 1:{
					//CHECK
					System.out.println(set.contains(operand));
				}
				case 2:{
					//REMOVE
					set.remove(operand);
				}
					
				}
            }
        }
	}
}