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
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack <String> stack = new Stack<>();
        for ( String s : path.split("/")){
            if (s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!s.equals("") && !s.equals(".") && !s.equals("..")){
                stack.push(s);
            }
           
        }
        return "/"+ String.join("/", stack);
    }    
    
}
