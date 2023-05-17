package com.coderioter.contests.hackerrank.ipk.stringManipulation;
import java.io.*;
import java.util.*;

public class BSTCheck {
    
    boolean checkBST(Node root) {
         if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left!=null && root.data<root.left.data){
            return false;
        }
        if(root.right!=null && root.data>root.right.data){
            return false;
        }
        return checkBST(root.left) && checkBST(root.right);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
    
    public Node buildTree(String [] arr, int from, int to) {
        int middle = from + (to - from) / 2;
        Node node = new Node();
        node.data = Integer.valueOf(arr[middle]);
        if (middle > from) {
            node.left = buildTree(arr, from, middle - 1);
            node.right = buildTree(arr, middle + 1, to);
        }
        return node;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)))) {
            int maxHeight = Integer.valueOf(in.readLine());
            String [] line = in.readLine().split(" ");
            BSTCheck solution = new BSTCheck();
            Node root = solution.buildTree(line, 0, line.length);
            if (solution.checkBST(root)) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }
    }
}