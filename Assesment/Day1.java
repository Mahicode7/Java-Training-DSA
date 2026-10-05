/*
Q1. Hello, Java!

Write a Java program named AboutMe that prints your name,
your course and your college on three separate lines.
*/

public class Q1_AboutMe {

    public static void main(String[] args) {

        System.out.println("Name    : Mahi");
        System.out.println("Course  : Java Programming");
        System.out.println("College : ABC Engineering College");

    }
}

/*
output : Name    : Mahi
Course  : Java Programming
College : ABC Engineering College
  */



/*
Q2. All Eight Data Types

Declare one variable of each of the 8 primitive data types
and print each value with a suitable label.
*/

public class Q2_DataTypes {

    public static void main(String[] args) {

        byte b = 10;
        short s = 200;
        int i = 5000;
        long l = 100000L;
        float f = 5.5f;
        double d = 25.75;
        char c = 'M';
        boolean bool = true;

        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : " + c);
        System.out.println("boolean : " + bool);
    }
}

/*
ouput :
byte    : 10
short   : 200
int     : 5000
long    : 100000
float   : 5.5
double  : 25.75
char    : M
boolean : true
  */


/*
Q3. Swap Two Numbers
*/

public class Q3_SwapNumbers {

    public static void main(String[] args) {

        int a = 15;
        int b = 40;
        int temp;

        System.out.println("Before: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After : a = " + a + ", b = " + b);
    }
}



/*
output: Before: a = 15, b = 40
After : a = 40, b = 15
  */


// Q4. Simple Interest Calculator

public class Q4_SimpleInterest {

    public static void main(String[] args) {

        double P = 10000;
        double R = 7.5;
        double T = 3;

        double SI = (P * R * T) / 100;
        double totalAmount = P + SI;

        System.out.println("Simple Interest = " + SI);
        System.out.println("Total Amount    = " + totalAmount);
    }
}

// output : Simple Interest = 2250.0
// Total Amount    = 12250.0



//Even or Odd

public class Q5_EvenOdd {

    public static void main(String[] args) {

        int a = 24;
        int b = 37;

        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }

        if (b % 2 == 0) {
            System.out.println(b + " is Even");
        } else {
            System.out.println(b + " is Odd");
        }
    }
}


/*
output :
24 is Even
37 is Odd
  */


// 6 . Largest of Three Numbers

public class Q6_LargestOfThree {

    public static void main(String[] args) {

        int a = 45;
        int b = 89;
        int c = 23;

        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
    }
}

// Largest number is 89


// Q7 – Grade Calculator

public class Q7_GradeCalculator {

    public static void main(String[] args) {

        int marks1 = 92;
        int marks2 = 78;
        int marks3 = 55;
        int marks4 = 30;

        if (marks1 >= 90) {
            System.out.println(marks1 + " -> Grade A");
        } else if (marks1 >= 75) {
            System.out.println(marks1 + " -> Grade B");
        } else if (marks1 >= 50) {
            System.out.println(marks1 + " -> Grade C");
        } else {
            System.out.println(marks1 + " -> Grade F");
        }

        if (marks2 >= 90) {
            System.out.println(marks2 + " -> Grade A");
        } else if (marks2 >= 75) {
            System.out.println(marks2 + " -> Grade B");
        } else if (marks2 >= 50) {
            System.out.println(marks2 + " -> Grade C");
        } else {
            System.out.println(marks2 + " -> Grade F");
        }

        if (marks3 >= 90) {
            System.out.println(marks3 + " -> Grade A");
        } else if (marks3 >= 75) {
            System.out.println(marks3 + " -> Grade B");
        } else if (marks3 >= 50) {
            System.out.println(marks3 + " -> Grade C");
        } else {
            System.out.println(marks3 + " -> Grade F");
        }

        if (marks4 >= 90) {
            System.out.println(marks4 + " -> Grade A");
        } else if (marks4 >= 75) {
            System.out.println(marks4 + " -> Grade B");
        } else if (marks4 >= 50) {
            System.out.println(marks4 + " -> Grade C");
        } else {
            System.out.println(marks4 + " -> Grade F");
        }
    }
}


/*
output:
92 -> Grade A
78 -> Grade B
55 -> Grade C
30 -> Grade F
  */

// Q8 – Day of the Week


public class Q8_DayOfWeek {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}

// Q9 – Leap Year Check

public class Q9_LeapYear {

    public static void main(String[] args) {

        int year1 = 2024;
        int year2 = 1900;
        int year3 = 2000;

        if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0) {
            System.out.println(year1 + " is a Leap Year");
        } else {
            System.out.println(year1 + " is Not a Leap Year");
        }

        if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0) {
            System.out.println(year2 + " is a Leap Year");
        } else {
            System.out.println(year2 + " is Not a Leap Year");
        }

        if ((year3 % 4 == 0 && year3 % 100 != 0) || year3 % 400 == 0) {
            System.out.println(year3 + " is a Leap Year");
        } else {
            System.out.println(year3 + " is Not a Leap Year");
        }
    }
}

/*
output: 
2024 is a Leap Year
1900 is Not a Leap Year
2000 is a Leap Year
  */


// Q10 – Theory: How Java Works


# Q10 – Theory: How Java Works

## (a) What are JDK, JRE and JVM, and how are they related?

**JDK (Java Development Kit):**  
JDK is used to develop Java programs. It contains tools such as the Java compiler (`javac`) and JRE.

**JRE (Java Runtime Environment):**  
JRE provides the environment required to run Java programs. It contains the JVM and required Java libraries.

**JVM (Java Virtual Machine):**  
JVM executes Java bytecode. It converts bytecode into machine-level instructions that the computer can understand.

**Relationship:**  
JDK is used to develop Java programs, JRE is used to run Java programs, and JVM executes the Java bytecode.

---

## (b) What happens when you run `javac Hello.java` and then run the Java program?

When we execute:

```text
javac Hello.java

  the Java compiler compiles the source code and creates a bytecode file:

Hello.class

Then, when we run:

java Hello

the JVM loads and executes the bytecode.

(c) Give any three differences between Java and C++.
  Java	C++
Java is mainly object-oriented.	C++ supports both procedural and object-oriented programming.
Java uses automatic garbage collection.	C++ provides manual memory management.
Java programs run on the JVM.	C++ programs are generally compiled directly for a specific platform.

  
(d) Why is Java called platform independent?

Java is called platform independent because Java source code is compiled into bytecode.

The bytecode can run on any operating system that has a compatible JVM.

Therefore, the same Java bytecode can run on different platforms without changing the source code.



