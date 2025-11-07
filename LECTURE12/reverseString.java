package LECTURE12;

public class reverseString {
    
    public static void main(String[] args) {
        
    

    String str = "hello";
  
    
// IT'S JUST PRINT THE ARRAY IN REVERSE ORDER

   // for (int i = str.length() - 1; i >=  0; i--) {
   //    System.out.print(str.charAt(i) + " ");
   // } 



  
//    String revString = "";  // HERE WE ARE STRORING VALUE IN  NEW STRING

//   for (int i = str.length() - 1; i >= 0; i--) {
//          revString += str.charAt(i);    
//   }
//   System.out.println(revString);


/*
--> String objects are immutable in Java.
--> This means that once a String is created, its content cannot be changed.
--> StringBuilder and StringBuffer are mutable classes. 
--> They are specifically designed for performing operations like appending, inserting, and reversing characters
--> without creating a new object each time. 
--> NOTE: even after using stringbuilder the origina; string remains immutable . instead of creating new string, Stringbuilder is more efficient.
*/


        String originalStr = "hello";
        StringBuilder reversedStrBuilder = new StringBuilder();

        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStrBuilder.append(originalStr.charAt(i));
        }
        
        String reversedStr = reversedStrBuilder.toString();
        
        System.out.println("Original string: " + originalStr);
        System.out.println("Reversed string: " + reversedStr);


 // STRINGBUILDER HAS A  REVERSE() METHOD


 String originalstr = "hello";
        
        StringBuilder reversedstrBuilder = new StringBuilder(originalstr);
        reversedstrBuilder.reverse();
        
        String reversedstr = reversedstrBuilder.toString();
        
        System.out.println("Original string: " + originalstr);
        System.out.println("Reversed string: " + reversedstr);

    }
}
