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
public class LongestVaildParentheses {
     public int longestValidParentheses(String s) {
        final char open = '(';
        final char close = ')';
        
        int num_pair = 0 ;
        Stack <Character> stack = new Stack<>();

        char [] x = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            x[i] = s.charAt(i);
            stack.push(x[i]);
        }

        for(int j = 0 ; j < s.length() ; j++){
            if(!stack.isEmpty()){
                char z = stack.pop();
                if(z == close && !stack.isEmpty()){
                    
                    char y = stack.pop();
                    if(y == open){
                        num_pair += 2;
                       
                    }else {
                        stack.push(y);
                        
                    }
                }else if(stack.isEmpty()){
                    break;
                }
            }else{
                break;
            }

        }
        return num_pair ; 
    } 
}
