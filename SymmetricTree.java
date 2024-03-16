/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leecode;

/**
 *
 * @author nessr
 */
public class SymmetricTree <E>{
    private class TreeNode<E>{
        E val ; 
        TreeNode<E> left;
        TreeNode<E>right;
        
        public TreeNode(){}
        public TreeNode(E val) { this.val = val; }
        public TreeNode(E val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
   
       public boolean isSymmetric(TreeNode root) {
           if (root == null)return true;
            TreeNode r1 = root.left;
            TreeNode r2 = root.right;    
            return d1(r1 ,r2);
    }
    public boolean d1(TreeNode r1 , TreeNode r2){
        if (r1 == null && r2 == null)return true;
        if (r1 == null || r2 == null)return false;
        
        return (r1.val == r2.val) && d1(r1.left , r2.right) &&
                d1(r1.right ,r2.left);
    } 
    
}

