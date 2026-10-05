/*
Q1. Largest of three using a method

Write a method static int max(int a, int b, int c)
that returns the largest of three numbers.

Call it from main with (12, 45, 30) and print the result.
*/

public class Q1_LargestMethod {

    static int max(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        int result = max(12, 45, 30);

        System.out.println("Largest = " + result);
    }
}

/*
output :
Largest = 45
*/



/*
Q2. Pass by value experiment
*/

public class Q2_PassByValue {

    static void changeNum(int x) {

        x = 100;
    }

    static void changeArr(int[] a) {

        a[0] = 100;
    }

    public static void main(String[] args) {

        int num = 5;
        int[] arr = {5};

        System.out.println("num before: " + num);

        changeNum(num);

        System.out.println("num after: " + num);

        System.out.println("arr[0] before: " + arr[0]);

        changeArr(arr);

        System.out.println("arr[0] after: " + arr[0]);
    }
}

/*
output :
num before: 5
num after: 5
arr[0] before: 5
arr[0] after: 100

Explanation:
Java passes values to methods.
For an array, the copied value refers to the same array object,
so its elements can be changed.
*/


/*
Q3. Average with varargs

Write a method static double average(double... nums)
that returns the average of any number of values.

Call it with (4, 8, 6) and with (10, 20).
*/

public class Q3_AverageVarargs {

    static double average(double... nums) {

        double sum = 0;

        for (double n : nums) {
            sum = sum + n;
        }

        return sum / nums.length;
    }

    public static void main(String[] args) {

        System.out.println("Average 1 = " + average(4, 8, 6));
        System.out.println("Average 2 = " + average(10, 20));
    }
}

/*
output :
Average 1 = 6.0
Average 2 = 15.0
*/



/*
Q4. Static vs instance

Create a class Rectangle with fields length and width,
an instance method area(), and a static method
isSquare(int l, int w).

Create an object in main and set the fields.
*/

public class Q4_Rectangle {

    int length;
    int width;

    int area() {

        return length * width;
    }

    static boolean isSquare(int l, int w) {

        return l == w;
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        System.out.println("Area = " + r.area());
        System.out.println("Is square? " + isSquare(r.length, r.width));
    }
}

/*
output :
Area = 50
Is square? false
*/



/*
Q5. Recursive sum of 1 to n

Write a recursive method sum(int n)
that returns 1 + 2 + ... + n.

Test with n = 10.
*/

public class Q5_RecursiveSum {

    static int sum(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int result = sum(10);

        System.out.println("Sum of 1 to 10 = " + result);
    }
}

/*
output :
Sum of 1 to 10 = 55
*/



/*
Q6. Factorial table

Write a recursive method factorial(int n).

Use a loop in main to print the factorials
of 1 to 6 using that method.
*/

public class Q6_FactorialTable {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            System.out.println(i + "! = " + factorial(i));
        }
    }
}

/*
output :
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
*/



/*
Q7. Recursive power

Write a recursive method power(int base, int exp)
that returns base^exp without using Math.pow().

Test with 3^4 and 2^10.

Hint: Base case: any number to the power 0 is 1.
*/

public class Q7_RecursivePower {

    static int power(int base, int exp) {

        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {

        System.out.println("3^4 = " + power(3, 4));
        System.out.println("2^10 = " + power(2, 10));
    }
}

/*
output :
3^4 = 81
2^10 = 1024
*/



/*
Q8. Count digits recursively

Write a recursive method countDigits(int n)
that returns the number of digits in n.

Test with 908172.

Hint: Each call removes the last digit using n / 10.
*/

public class Q8_CountDigits {

    static int countDigits(int n) {

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        int n = 908172;

        System.out.println(n + " has " + countDigits(n) + " digits");
    }
}

/*
output :
908172 has 6 digits
*/


/*
Q9. Palindrome string

Write a recursive method isPalindrome(String s)
that compares the first and last characters,
then checks the middle part using substring().

Test with "madam" and "java".

Hint: Base case: a string of length 0 or 1
is always a palindrome.
*/

public class Q9_PalindromeString {

    static boolean isPalindrome(String s) {

        // Base case
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {

        System.out.println("madam -> " + isPalindrome("madam"));
        System.out.println("java -> " + isPalindrome("java"));
    }
}

/*
output :
madam -> true
java -> false
*/

