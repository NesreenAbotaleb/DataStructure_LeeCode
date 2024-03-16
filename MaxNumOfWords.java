
package leecode;


public class MaxNumOfWords {
    public static int mostWordsFound(String[] sentences) {
        int maxLength = 0 ;
        for (String sentence : sentences) {
            maxLength = Math.max(maxLength, sentence.split(" ").length);
        }
        
        return maxLength;
    }
    public static void main(String[] args){
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"} ;
        int  x = mostWordsFound(sentences);
        System.out.println(x);
    }
}
