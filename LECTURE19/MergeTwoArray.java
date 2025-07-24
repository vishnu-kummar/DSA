package LECTURE19;
// The space complexity is O(N + M)
// it will give sorted array only if array elemnts are sorted
// duplicate elemnts can be present
public class MergeTwoArray {

	public static void main(String[] args) {
		int arr1[]= {2,7,11,19};
		int arr2[]= {1,3,5,6,13,16,21};
		
		int arr[]=Merge(arr1,arr2);
		print(arr);

	}
	public static int[] Merge(int arr1[], int arr2[]) {
	int n=arr1.length;
	int m=arr2.length;
	int res[]=new int[n+m];
	
	int i=0,j=0,idx=0;
	
	while(i<arr1.length &&j<arr2.length) {// In the worst case, this loop iterates through all elements of the smaller array.
										   //  number of iterations here will be at most min(N, M).
		if(arr1[i]>arr2[j]) {
			res[idx]=arr2[j];
			j++;
		}
		else {
			res[idx]=arr1[i];
			i++;
		}
		idx++;
	}
	while(i<arr1.length) { // this loop runs only if there are remaining elements in arr1. It iterates through the remaining arr1 elements
		res[idx]=arr1[i];
		i++;
		idx++;
	}
   
	while(j<arr2.length) {  // : Similarly, this loop runs only if there are remaining elements in arr2. It iterates through the remaining arr2
		res[idx]=arr2[j];
		j++;
		idx++;
	}
	
	return res;
		
		
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
