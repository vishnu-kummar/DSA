package RECURSION;

public class Sum_10_array {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(sum(arr,0));
    }

    private static int sum(int[] arr, int idx) {
        if(idx == arr.length){
            return 0;
        }

        int smallAns = sum(arr,idx+1);  // ye wala part hume idx + 1 se lekar akhir tak kasum lakr de degi
        return smallAns+arr[idx];
    }
    
}
