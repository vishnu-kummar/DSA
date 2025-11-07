package LECTURE3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	 
        int n = -123; 

        
        int sum = 0;
        
// ld is negative because −123 % 10 = −3.

        int original = n;

        while (n != 0) {

            int ld = n % 10;

            // // Check for potential positive overflow (Integer.MAX_VALUE / 10 = 214748364)
            if (sum > Integer.MAX_VALUE / 10) {
                sum = 0; // Set result to 0 on overflow
                break;
            }
            
            // // Check for potential negative overflow (Integer.MIN_VALUE / 10 = -214748364)
            if (sum < Integer.MIN_VALUE / 10) {
                sum = 0; // Set result to 0 on underflow
                break;
            }

            
            sum = ( sum * 10 ) + ld; 
            n = n / 10;
        }

        System.out.println(sum);
		

	}

}

/*
 
1 Bit -->	Single Binary Digit (0 or 1) -->The fundamental unit of information.
1 Byte -->	8 Bits -->	The smallest addressable unit of memory.
1 Kilobyte (KB) -->	1024 Bytes (2^10).

Data Type	Size (Bits)		Size (Bytes)	Signed/Unsigned		Range
int	        32 bits			4 bytes			Signed				[−2^31,2^31−1]
long		64 bits			8 bytes			Signed				[−2^63,2^63−1]

 */