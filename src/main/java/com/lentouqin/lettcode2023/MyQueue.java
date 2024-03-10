package com.lentouqin.lettcode2023;

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        myQueue.empty(); // return false
    }
    private Deque<Integer> stack;

    public MyQueue() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Integer temp = stack.getLast();
        stack.removeLast();
        return temp;
    }
    
    public int peek() {
        return stack.getLast();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}