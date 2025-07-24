package LECTURE11;

public class StringOddEven {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String str="afhi";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(i%2==0){
                sb.append((char)(ch+1));  // If ch is 'a', its ASCII value is 97. So, ch + 1 becomes 97 + 1 = 98. This result is an int.
                                          // the cast (char)98 converts the integer 98 back into its corresponding character, which is 'b'.
            }
            else{
                sb.append((char)(ch-1));
            }
        }

        System.out.println(sb);
    }
    
}
