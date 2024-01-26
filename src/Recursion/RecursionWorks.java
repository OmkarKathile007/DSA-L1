package Recursion;

// A Java program to demonstrate working of recursion
class RecursionWorks {
    static int printFun(int test)
    {
        if (test < 1)
            return 1;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1); // statement 2
            System.out.printf("%d ", test);
            return test;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int test = 3;
        printFun(test);
    }
}



