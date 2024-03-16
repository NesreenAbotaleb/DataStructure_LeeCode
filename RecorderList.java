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
public class RecorderList {
     public void reorderList(ListNode head) {
        List<Integer> list = new LinkedList<>();

        ListNode temp = head.next;
        ListNode tail = head ;
        while(tail.next != null){
            tail = tail.next;
        }
        head.next = tail ;
        tail.next = temp;
        
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;

    }
}
