/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leecode;

/**
 *
 * @author nessr
 */
import java.util.*;
public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
       
        stack1.push(x);
        
    }

    
    public int pop() {
        while (stack1.size() > 1){
            stack2.push(stack1.pop());
        }
        int x =stack1.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return x;
    }
    
    public int peek() {
         while (stack1.size() > 1){
            stack2.push(stack1.pop());
        }
        int x =stack1.peek();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
    
}
