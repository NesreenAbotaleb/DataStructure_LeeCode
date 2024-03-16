/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leecode;

/**
 *
 * @author nessr
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       
        for ( int i = 0 ; i < nums.length-1; i++){
           
            for(int j = i+1 ; j < nums.length; j++){
                
                if ( nums[i] + nums[j] == target){
                    
                    return new int []{i , j};
                }
            }
        }
        return new int [] {};
    }
}
