package LECTURE4;

import java.util.ArrayList;
import java.util.List;

public class Pascal_II {
    public static void main(String[] args) {
        int rowIndex = 3;
        
        List<Integer> result = getRow(rowIndex);
        System.out.println(result); 
    }

    public static List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>(rowIndex + 1);

        result.add(1);

        long current_val = 1;

        for (int k = 1; k <= rowIndex; k++) {
    
            current_val = current_val * (rowIndex - k + 1) / k;
            
            result.add((int) current_val);
        }

        return result;
    }
}