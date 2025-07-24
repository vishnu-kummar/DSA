package LECTURE19;

 // sorting algo. that uses divide-and-conquer approach to sort an array (divide krte krte single element lata hai & phir do single array ko compare krke sort krta hai)
// TimeComplexity: O(nlogn)  SpaceComplexity:O(n) 
public class Merge_Sort {  

	public static void main(String[] args) {
		
		int arr[]= {6,9,1,5,3,11,4};
		
		int arr_sort[]=sort(0,arr.length-1,arr);
		for (int i = 0; i < arr_sort.length; i++) {
			System.out.println(arr_sort[i]);
		}
	}
	
	public static int[] sort(int si,int ei,int arr[] ) {
		
		if(si==ei) {
			int a[]= new int [1];
			a[0]=arr[si];
			return a;
		}
		
		int mid=(si+ei)/2;
		
		int fa[]= sort(si,mid,arr);    // first we get left side sorted array
		int sa[]=sort(mid+1,ei,arr);	// then we get right side sorted array
		
		int a[]= Merge(fa,sa);			// after that we merge both sorted array on comparing which one has smaller value 
		return a;
	}
	public static int[] Merge(int arr1[], int arr2[]) {
		int n=arr1.length;
		int m=arr2.length;
		int res[]=new int[n+m];
		
		int i=0,j=0,idx=0;
		
		while(i<arr1.length &&j<arr2.length) {
			
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
		while(i<arr1.length) {
			res[idx]=arr1[i];
			i++;
			idx++;
		}
	   
		while(j<arr2.length) {
			res[idx]=arr2[j];
			j++;
			idx++;
		}
		
		return res;
			
			
		}

}