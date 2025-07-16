package LECTURE5;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
 Scanner sc= new Scanner(System.in);   
System.out.print("size:");
int n=sc.nextInt();

int[] arr=new int[n];
System.out.print("Enter:");
for (int i = 0; i < n; i++) {
   arr[i]=sc.nextInt();
}


int s=0;
int e=n-1;
int i=0;

	while(i<=e){
		if(arr[i]==0){
			int temp=arr[s];
			arr[s]=arr[i];
			arr[i]=temp;

			s++;
			i++;
		}else{
			int temp=arr[e];
			arr[e]=arr[i];
			arr[i]=temp;
			e--;
		}
	
	}
	for (int j = 0; j <n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	

}
