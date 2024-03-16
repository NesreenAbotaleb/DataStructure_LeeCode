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

public class PalindromLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new LinkedList<>();

        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1))) {
                return false;
            }
        }
        return true;
    }
}
