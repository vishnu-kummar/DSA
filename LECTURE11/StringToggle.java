package LECTURE11;

import java.util.*;
public class StringToggle {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter string to get Toggle:");
    String str= sc.next();

    System.out.println(strToggle(str));

}


public static String strToggle(String str){
 
    StringBuilder sb= new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        
            char ch =str.charAt(i);

            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }

            else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }

            else{
                sb.append(ch);
            }

    }

    return sb.toString();



}

}
