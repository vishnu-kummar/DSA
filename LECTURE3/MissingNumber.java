package LECTURE3;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {9,6,4,2,3,5,7,0,1};
        
        System.out.println(missNum(num));
    }

     public static int missNum(int[] num) {
        int n = num.length;

        int expectedSum = n * (n + 1)/2;

        int actualSum = 0;
        for (int i = 0; i < num.length; i++) {
            actualSum = actualSum + num[i];
        }

        return expectedSum - actualSum;
    }
}
