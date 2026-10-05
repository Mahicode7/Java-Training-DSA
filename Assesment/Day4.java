/*
Q1. Book class

Create a class Book with fields title, author and price,
and a method display().

Create two Book objects, set their values and display them.
*/

public class Q1_Book {

    String title;
    String author;
    double price;

    void display() {

        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 500;

        Book book2 = new Book();

        book2.title = "Data Structures";
        book2.author = "Mark Allen";
        book2.price = 600;

        book1.display();
        book2.display();
    }
}

/*
output :
Title  : Java Programming
Author : James Gosling
Price  : 500.0

Title  : Data Structures
Author : Mark Allen
Price  : 600.0
*/



/*
Q2. Circle with a constructor

Create a class Circle with a constructor that takes
the radius, and methods area() and circumference().

Print the results to 2 decimal places for radius 7.
*/

public class Q2_Circle {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    double area() {

        return 3.14 * radius * radius;
    }

    double circumference() {

        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle(7);

        System.out.printf("Area = %.2f%n", c.area());
        System.out.printf("Circumference = %.2f%n", c.circumference());
    }
}

/*
output :
Area = 153.86
Circumference = 43.96
*/


/*
Q3. Default and parameterized constructors

Create a class Student with two constructors:
a no-arg one that sets name "Unknown" and marks 0,
and one that takes name and marks.

Create one object with each.
*/

public class Q3_Student {

    String name;
    int marks;

    Student() {

        name = "Unknown";
        marks = 0;
    }

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }

    void display() {

        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Vishnu", 85);

        s1.display();
        s2.display();
    }
}

/*
output :
Name  : Unknown
Marks : 0

Name  : Vishnu
Marks : 85
*/


/*
Q4. Counter object

Create a class Counter with a private count and methods
increment(), decrement() (never below 0), reset()
and getCount().
*/

public class Q4_Counter {

    private int count;

    void increment() {

        count++;
    }

    void decrement() {

        if (count > 0) {
            count--;
        }
    }

    void reset() {

        count = 0;
    }

    int getCount() {

        return count;
    }

    public static void main(String[] args) {

        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();

        System.out.println("After increment = " + c.getCount());

        c.decrement();

        System.out.println("After decrement = " + c.getCount());

        c.reset();

        System.out.println("After reset = " + c.getCount());

        c.decrement();

        System.out.println("After extra decrement = " + c.getCount());
    }
}

/*
output :
After increment = 3
After decrement = 2
After reset = 0
After extra decrement = 0
*/



/*
Q5. Time class with this() chaining

Create a class Time with constructors Time(h),
Time(h, m) and Time(h, m, s) that chain using this(...).

Override toString() to print HH:MM:SS.
*/

public class Q5_Time {

    int hours;
    int minutes;
    int seconds;

    Time(int h) {

        this(h, 0, 0);
    }

    Time(int h, int m) {

        this(h, m, 0);
    }

    Time(int h, int m, int s) {

        hours = h;
        minutes = m;
        seconds = s;
    }

    public String toString() {

        return String.format("%02d:%02d:%02d",
                hours, minutes, seconds);
    }

    public static void main(String[] args) {

        Time t1 = new Time(10);
        Time t2 = new Time(10, 30);
        Time t3 = new Time(10, 30, 45);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}

/*
output :
10:00:00
10:30:00
10:30:45
*/



/*
Q6. Auto-generated IDs

Create a class Ticket that gives every new object
a unique ID (T101, T102, ...) using a static counter,
and stores the passenger name.
*/

public class Q6_Ticket {

    static int counter = 101;

    String id;
    String passengerName;

    Q6_Ticket(String passengerName) {

        this.id = "T" + counter;
        counter++;

        this.passengerName = passengerName;
    }

    void display() {

        System.out.println("Ticket ID : " + id);
        System.out.println("Passenger : " + passengerName);
    }

    public static void main(String[] args) {

        Q6_Ticket t1 = new Q6_Ticket("Mahi");
        Q6_Ticket t2 = new Q6_Ticket("Vishnu");
        Q6_Ticket t3 = new Q6_Ticket("Rahul");

        t1.display();
        t2.display();
        t3.display();
    }
}

/*
output :
Ticket ID : T101
Passenger : Mahi
Ticket ID : T102
Passenger : Vishnu
Ticket ID : T103
Passenger : Rahul
*/




/*
Q7. Array of Employee objects

Create a class Employee (name, salary).

Store 4 employees in an array, then print the
highest-paid employee and the average salary.
*/

public class Q7_Employee {

    String name;
    double salary;

    Q7_Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Q7_Employee[] employees = new Q7_Employee[4];

        employees[0] = new Q7_Employee("Mahi", 30000);
        employees[1] = new Q7_Employee("Vishnu", 45000);
        employees[2] = new Q7_Employee("Rahul", 35000);
        employees[3] = new Q7_Employee("Arun", 40000);

        Q7_Employee highest = employees[0];
        double total = 0;

        for (Q7_Employee e : employees) {

            total = total + e.salary;

            if (e.salary > highest.salary) {
                highest = e;
            }
        }

        double average = total / employees.length;

        System.out.println("Highest-paid employee : " + highest.name);
        System.out.println("Salary                : " + highest.salary);
        System.out.println("Average salary        : " + average);
    }
}

/*
output :
Highest-paid employee : Vishnu
Salary                : 45000.0
Average salary        : 37500.0
*/




/*
Q8. Objects as parameters and return values

Create a class Point (x, y) with a method distanceTo(Point other)
and a method midpoint(Point other) that returns a new Point.
*/

public class Q8_Point {

    double x;
    double y;

    Q8_Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    double distanceTo(Q8_Point other) {

        double dx = other.x - x;
        double dy = other.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    Q8_Point midpoint(Q8_Point other) {

        double midX = (x + other.x) / 2;
        double midY = (y + other.y) / 2;

        return new Q8_Point(midX, midY);
    }

    public static void main(String[] args) {

        Q8_Point p1 = new Q8_Point(0, 0);
        Q8_Point p2 = new Q8_Point(3, 4);

        double distance = p1.distanceTo(p2);
        Q8_Point mid = p1.midpoint(p2);

        System.out.println("Distance = " + distance);
        System.out.println("Midpoint = (" + mid.x + ", " + mid.y + ")");
    }
}

/*
output :
Distance = 5.0
Midpoint = (1.5, 2.0)
*/


/*
Q9. Fraction class

Create a class Fraction (numerator, denominator)
whose constructor reduces it to lowest terms using GCD.

Add a method add(Fraction f) that returns a new Fraction.
*/

public class Q9_Fraction {

    int numerator;
    int denominator;

    Q9_Fraction(int numerator, int denominator) {

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    Q9_Fraction add(Q9_Fraction f) {

        int newNumerator =
                numerator * f.denominator +
                f.numerator * denominator;

        int newDenominator =
                denominator * f.denominator;

        return new Q9_Fraction(newNumerator, newDenominator);
    }

    void display() {

        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {

        Q9_Fraction f1 = new Q9_Fraction(1, 2);
        Q9_Fraction f2 = new Q9_Fraction(1, 3);

        Q9_Fraction result = f1.add(f2);

        System.out.print("Fraction 1 = ");
        f1.display();

        System.out.print("Fraction 2 = ");
        f2.display();

        System.out.print("Sum = ");
        result.display();
    }
}

/*
output :
Fraction 1 = 1/2
Fraction 2 = 1/3
Sum = 5/6
*/


/*
Q10. Shopping cart

Create a class Item (name, price, qty) and a class Cart
that holds up to 10 items in an array.

Add methods addItem(), getTotal() and printBill().
*/

public class Q10_ShoppingCart {

    static class Item {

        String name;
        double price;
        int qty;

        Item(String name, double price, int qty) {

            this.name = name;
            this.price = price;
            this.qty = qty;
        }

        double getAmount() {

            return price * qty;
        }
    }

    static class Cart {

        Item[] items = new Item[10];
        int count = 0;

        void addItem(Item item) {

            if (count < 10) {
                items[count] = item;
                count++;
            }
        }

        double getTotal() {

            double total = 0;

            for (int i = 0; i < count; i++) {

                total = total + items[i].getAmount();
            }

            return total;
        }

        void printBill() {

            System.out.println("----- BILL -----");

            for (int i = 0; i < count; i++) {

                System.out.println(
                    items[i].name + " x " +
                    items[i].qty + " = " +
                    items[i].getAmount()
                );
            }

            System.out.println("----------------");
            System.out.println("Total = " + getTotal());
        }
    }

    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addItem(new Item("Pen", 10, 2));
        cart.addItem(new Item("Notebook", 50, 3));
        cart.addItem(new Item("Bag", 500, 1));

        cart.printBill();
    }
}

/*
output :
----- BILL -----
Pen x 2 = 20.0
Notebook x 3 = 150.0
Bag x 1 = 500.0
----------------
Total = 670.0
*/

