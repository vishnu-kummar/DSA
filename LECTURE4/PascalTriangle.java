package LECTURE4;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        
      
        int numRows1 = 5;
       
        List<List<Integer>> result1 = generate(numRows1);
       
        for (List<Integer> row : result1) {
            System.out.println(row);
        }

    }

    public static List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        
        List<Integer> firstRow = new ArrayList<>(); // creating single row 
        /*
        Analogy: If the entire triangle is a Book (List<List<Integer>>), this line is creating a Page (List<Integer>).
        A page holds Words (Integers), not other pages.  
        List<Integer> firstRow = new Arraylist. This means the variable is only allowed to "see" and call the methods defined in the List interface
        */
        firstRow.add(1);
        triangle.add(firstRow);

        /*
         Code Line	                                State of firstRow    State of triangle
        List<Integer> firstRow = new ArrayList<>();	    []	                    []
        firstRow.add(1);	                            [1]	                    []
        triangle.add(firstRow);	                        [1]	                   [[1]] 
         */

        for (int i = 1; i < numRows; i++) {
            
            List<Integer> previousRow = triangle.get(i - 1);
            
            List<Integer> currentRow = new ArrayList<>();
            
            currentRow.add(1);

            for (int j = 1; j < previousRow.size(); j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }

            currentRow.add(1);
            
            triangle.add(currentRow);
        }

        return triangle;
    }
}
/*
Single List (Incorrect)	[1, 1, 1, 1, 2, 1]	You can't tell where Row 1 ends and Row 2 begins.
List of Lists (Correct)	[[1], [1, 1], [1, 2, 1]]	The structure is preserved. Each inner list is a distinct row.
i.e:
Row 0 has length 1 ([1])

Row 1 has length 2 ([1, 1])

Row 2 has length 3 ([1, 2, 1])


The main advantage of ArrayList is its dynamic nature.

Arrays are Fixed: When you create a Java array like int[] row = new int[5], its size is permanently set to 5.
                 If you later need 6 elements, you must create a whole new array and copy the data over.

Lists are Dynamic: When you use ArrayList, you can keep adding elements using the .add() method, and the list
                   automatically grows its internal capacity as needed.

List and ArrayList both are different.

methods like .add(), .get(), .remove(), .size() come from the List, but they are implemented by the ArrayList class.
*/

/*
kiya jae aur  
*/ 
