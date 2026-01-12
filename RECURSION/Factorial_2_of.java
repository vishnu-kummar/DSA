package RECURSION;

public class Factorial_2_of {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

        
    }

    private static int factorial(int n) {
             if(n == 0){
                return 1;
             }

           return n *  factorial(n-1);
    }   
}

/*
------------with loop------------
int fact = 1;
    while (n > 1) {
        fact = fact * n;
        n = n-1;
    }

System.out.println(fact);
----------------------------------

                          RECURSIVE TREE
f(5) = 5 * f(4)
            |
            4 * f(3)
                  |
                  3 * f(2)
                        |
                        2 * f(1)
                             |
                             1 * f(0)

*/