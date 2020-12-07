package com.company;
import java.util.Collections;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        stack.push(12);
        stack.push(10);
        stack.push(19);
        stack.push(1);
        stack.push(13);
        stack.push(14);
        System.out.println(stack);
        Collections.reverse(stack);
        System.out.println(stack);
        Collections.reverse(stack);
        stack.remove(4);
        System.out.println(stack);
    }
}




