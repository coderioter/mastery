package com.coderioter.contests.hackerrank.ipk.stringManipulation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxRiddle {

    // Complete the riddle function below.
    static long[] riddle(long[] arr) {
        long[] ans = new long[arr.length];
        for(int i=0;i<arr.length;i++){
            PriorityQueue<Long> max = new PriorityQueue<>(Collections.reverseOrder());
            int w=i+1;
            for(int j=0;j<arr.length-i;j++){
                PriorityQueue<Long> min = new PriorityQueue<>();
                for(int k=j,x=w;x>0&&k<arr.length;x--,k++){
                    min.add(arr[k]);
                }
                System.out.print(min+"\t");
                max.add(min.remove());
            }

            System.out.println(max);
            ans[i]=max.remove();
            System.out.println("------------");
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] res = riddle(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
