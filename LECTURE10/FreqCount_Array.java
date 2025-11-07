//package LECTURE10;

public class FreqCount_Array {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,5,5};


for(int i = 0; i < arr.length; ){

	int j = i;   

	while(j < arr.length && arr[i] == arr[j]){

		j++;                             
	}

	

	System.out.println(arr[i] + "->" + (j - i));
i = j;

			

}


    }
}
