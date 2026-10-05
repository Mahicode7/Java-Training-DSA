/*
Q1. Skip with continue

Using a for loop, print the numbers from 1 to 30,
but skip every multiple of 4 using continue.
*/

public class Q1_SkipContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (i % 4 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}

/*
output :
1
2
3
5
6
7
9
10
11
13
14
15
17
18
19
21
22
23
25
26
27
29
30
*/





/*
Q2. Sum of even numbers

Using a while loop, find the sum of all even numbers
from 1 to 100.
*/

public class Q2_SumEven {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                sum = sum + i;
            }

            i++;
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}

/*
output :
Sum of even numbers = 2550
*/





/*
Q3. Multiplication table
*/

public class Q3_MultiplicationTable {

    public static void main(String[] args) {

        int n = 9;

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

/*
output :
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
*/

/*
Q4. Count the digits

Count how many digits a number has,
using a while loop.
*/

public class Q4_CountDigits {

    public static void main(String[] args) {

        int n = 45823;
        int count = 0;

        while (n != 0) {

            n = n / 10;
            count++;
        }

        System.out.println("45823 has " + count + " digits");
    }
}

/*
output :
45823 has 5 digits
*/



 //  Q5. Palindrome number

public class Q5_Palindrome {

    public static void main(String[] args) {

        int num1 = 121;
        int num2 = 123;

        int original1 = num1;
        int reverse1 = 0;

        while (num1 != 0) {

            int digit = num1 % 10;
            reverse1 = reverse1 * 10 + digit;
            num1 = num1 / 10;
        }

        if (original1 == reverse1) {
            System.out.println(original1 + " is a Palindrome");
        } else {
            System.out.println(original1 + " is Not a Palindrome");
        }

        int original2 = num2;
        int reverse2 = 0;

        while (num2 != 0) {

            int digit = num2 % 10;
            reverse2 = reverse2 * 10 + digit;
            num2 = num2 / 10;
        }

        if (original2 == reverse2) {
            System.out.println(original2 + " is a Palindrome");
        } else {
            System.out.println(original2 + " is Not a Palindrome");
        }
    }
}

/*
output :
121 is a Palindrome
123 is Not a Palindrome
*/



//  Q6. Fibonacci series


public class Q6_Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= 10; i++) {

            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

/*
output :
0
1
1
2
3
5
8
13
21
34
*/


//  Q7. Star triangle

public class Q7_StarTriangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
output :
*
* *
* * *
* * * *
* * * * *
*/



//  Q8. Number pattern


public class Q8_NumberPattern {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j >= i; j--) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
output :
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/


/*
Q9. Prime numbers using a method

Write a method static boolean isPrime(int n)
that returns true if n is prime.

Call it from main inside a loop to print
all prime numbers between 1 and 50.
*/

public class Q9_PrimeNumbers {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

/*
output :
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
*/



/*
Q10. Overloaded area methods

Write three overloaded methods named area:
area(int side) for a square,
area(int l, int w) for a rectangle,
and area(double r) for a circle.

Use 3.14 for the circle.

Test with side = 4, l = 4 and w = 6, and r = 2.0.
*/

public class Q10_AreaOverloading {

    static int area(int side) {

        return side * side;
    }

    static int area(int l, int w) {

        return l * w;
    }

    static double area(double r) {

        return 3.14 * r * r;
    }

    public static void main(String[] args) {

        System.out.println("Square area    = " + area(4));
        System.out.println("Rectangle area = " + area(4, 6));
        System.out.println("Circle area    = " + area(2.0));
    }
}

/*
output :
Square area    = 16
Rectangle area = 24
Circle area    = 12.56
*/


