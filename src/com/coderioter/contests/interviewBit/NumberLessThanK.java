package com.coderioter.contests.interviewBit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 30/09/18
 * Time - 10:52 PM
 */
public class NumberLessThanK {

    public int solve(ArrayList<Integer> A, int B, int C) {
        int c = (int) Math.log10(C) + 1;
        int a = A.size();
        if(c < B || a == 0){
            return 0;
        }
        boolean z = false;
        if(A.get(0) == 0){
            z = true;
        }
        if(c > B){
            if(B > 1 && z){
                return (a-1)* ((int)Math.pow(a, B-1));
            }
            else{
                return (int)Math.pow(a, B);
            }
        }
        int pTen = (int) Math.pow(10, B-1);
        int count = 0;
        for(int i=B;i>0;i--){
            int target = C/pTen;
            int j=0;
            C %= pTen;
            pTen /= 10;
            for(j=0;j<a;j++){
                if(A.get(j)>=target){
                    break;
                }
            }
            count += (B > 1 && i == B && z ? j-1:j) * (int)Math.pow(a, i-1);
            if(j == a || A.get(j) > target)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberLessThanK().solve(new ArrayList<>(Arrays.asList(0, 1, 3, 4)), 3, 423));
    }
}