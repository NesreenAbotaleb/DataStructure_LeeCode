package leecode;
import java.util.*;
public class Stack1 {
    List<Integer> list =new ArrayList<>();
    
    public int size(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void push(int element){
        list.add(element);
    }
    
    public int pop(){
        if(list.size() == 0){
        return -1;
        }
        return list.remove(list.size() - 1);
    }
    
    public void removeElement(int element){
       
      for(int i = 0 ; i < size();){
          if (list.get(i) == element) {
              list.remove(i);
          }else i++;
      }  
     
    
    }
    
    public void pushDuplicated(int element){
        for (int i = 0; i < size(); i +=2) {
            if (list.get(i) == element) {
                
               list.add(i+1, element);
            }
        }
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    }
