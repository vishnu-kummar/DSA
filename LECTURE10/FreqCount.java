package LECTURE10;

public class FreqCount {

	public static void main(String[] args) {
		
		String s="aaahkjkjhaakjakjkjcskjadshkfdshfkjnks";
		int arr[]= new int[26];
		
		for(int i=0;i<s.length();i++) {
			int idx=s.charAt(i)-'a';
			arr[idx]++;
		}
	   
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				System.out.println((char)('a'+i)+" -> "+arr[i]);
			}
		}
		
	}

}