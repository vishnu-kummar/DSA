package LECTURE11;

public class AddString {

	public static void main(String[] args) {
		
		String num1="9";
		String num2="8";
		System.out.println(Add(num1,num2));

	}
	public static String Add(String num1, String num2) {
		//we can not do by this method cuz humare pass digits 10000 hoge
//		int n1= Integer.parseInt(num1);//145
//		int n2=Integer.parseInt(num2);//26
		String ans="";
		int i1=num1.length()-1;
		int i2=num2.length()-1;
		int c=0;
		while(i1>=0 && i2>=0) {
			int d1=num1.charAt(i1)-'0';
			int d2=num2.charAt(i2)-'0';
			ans= (d1+d2+c)%10+ans; //""-> "7"->"87"
			
			c=(d1+d2+c)/10;
			i1--;
			i2--;
		}
		while(i1>=0) {
			int d1=num1.charAt(i1)-'0';
			ans=(d1+c)%10+ans;
			c=(d1+c)/10;
			i1--;
		}
		while(i2>=0) {
			int d2=num2.charAt(i2)-'0';
			ans=(d2+c)%10+ans;
			c=(d2+c)/10;
			i2--;
		}
//		if(c>=1)ans=c+ans;
		return ans;
		
		
		
	}

}