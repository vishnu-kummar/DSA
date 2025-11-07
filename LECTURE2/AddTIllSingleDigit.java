package LECTURE2;

public class AddTIllSingleDigit {
    
   public static void main(String[] args) {
    int n = 38;
    System.out.println(addDigits(n));
   }
     public static  int addDigits(int num) {
       
        if (num == 0) {
            return 0;
        }

        
        return 1 + (num - 1) % 9;
    }
}

/* 

Digital Root=1+(num−1)(mod9)
achieving O(1) time and O(1) space.


 */