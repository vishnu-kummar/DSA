package LECTURE6;

public class ProductExceptItSelf {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		int ans[]= product(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	public static int [] product (int arr[]) {
		int n=arr.length;
		int left[]= new int[n];
		int right[]= new int [n];
		int ans[]= new int [n];
		
		left[0]=1;
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		
		for(int i=n-2;i>=0 ;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < n; i++) {
			ans[i]=left[i]*right[i];
		}
		return ans;
	}

}