package leecode;

public class LeeCode {

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(7);
        s.push(5);
        s.push(44);
        s.push(13);
        s.push(5);
        s.push(19);
        
        s.removeElement(5);
        
        System.out.println(s.toString());
        
        s.pushDuplicated(7);
        
        System.out.println(s.toString());
        
        int [] x = new int [10];
        System.out.println(x.length);
    }
    
}
