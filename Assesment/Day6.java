/*
Q21. Method overloading

Create a class Calculator with three overloaded add methods:
add(int, int), add(double, double) and add(int, int, int).
*/

public class Q21_Calculator {

    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {

        return a + b;
    }

    int add(int a, int b, int c) {

        return a + b + c;
    }

    public static void main(String[] args) {

        Q21_Calculator c = new Q21_Calculator();

        System.out.println("Integer addition = " + c.add(10, 20));
        System.out.println("Double addition  = " + c.add(10.5, 20.5));
        System.out.println("Three numbers    = " + c.add(10, 20, 30));
    }
}

/*
output :
Integer addition = 30
Double addition  = 31.0
Three numbers    = 60
*/



/*
Q22. Run-time polymorphism

Create Animal with sound(), and override it in Dog,
Cat and Cow.

Store them in an Animal[] and call sound() in a loop.
*/

public class Q22_AnimalTest {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for (Animal a : animals) {

            a.sound();
        }
    }
}

class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog says Woof");
    }
}

class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Cat says Meow");
    }
}

class Cow extends Animal {

    @Override
    void sound() {

        System.out.println("Cow says Moo");
    }
}

/*
output :
Dog says Woof
Cat says Meow
Cow says Moo
*/

/*
Q23. Abstract class Shape

Create an abstract class Shape with an abstract area()
and a concrete print().

Implement it in Circle and Rectangle.
*/

public class Q23_ShapeTest {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.print();
        System.out.println("Circle area = " + circle.area());

        rectangle.print();
        System.out.println("Rectangle area = " + rectangle.area());
    }
}

abstract class Shape {

    abstract double area();

    void print() {

        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    double area() {

        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    double area() {

        return length * width;
    }
}

/*
output :
This is a shape
Circle area = 78.5
This is a shape
Rectangle area = 24.0
*/

/*
Q24. Interface Playable

Create an interface Playable with play()
and implement it in Guitar and Piano.

Call play() through an interface reference.
*/

public class Q24_PlayableTest {

    public static void main(String[] args) {

        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        p1.play();
        p2.play();
    }
}

interface Playable {

    void play();
}

class Guitar implements Playable {

    public void play() {

        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {

    public void play() {

        System.out.println("Piano is playing");
    }
}

/*
output :
Guitar is playing
Piano is playing
*/

/*
Q25. Abstract class with constructor

Create an abstract class Employee (name, constructor,
abstract calculatePay(), concrete printSlip()).

Implement FullTime (monthly salary) and PartTime
(hours x rate).
*/

public class Q25_EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new FullTime("Mahi", 40000);
        Employee e2 = new PartTime("Karthi", 20, 500);

        e1.printSlip();
        e2.printSlip();
    }
}

abstract class Employee {

    String name;

    Employee(String name) {

        this.name = name;
    }

    abstract double calculatePay();

    void printSlip() {

        System.out.println("Name : " + name);
        System.out.println("Pay  : " + calculatePay());
        System.out.println();
    }
}

class FullTime extends Employee {

    double monthlySalary;

    FullTime(String name, double monthlySalary) {

        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculatePay() {

        return monthlySalary;
    }
}

class PartTime extends Employee {

    int hours;
    double rate;

    PartTime(String name, int hours, double rate) {

        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculatePay() {

        return hours * rate;
    }
}

/*
output :
Name : Mahi
Pay  : 40000.0

Name : Karthi
Pay  : 10000.0
*/


/*
Q26. Multiple interfaces

Create interfaces Camera (takePhoto()) and GPS (getLocation()).

Create a SmartPhone that implements both,
and use it through each interface type.
*/

public class Q26_SmartPhoneTest {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        Camera camera = phone;
        GPS gps = phone;

        camera.takePhoto();
        gps.getLocation();
    }
}

interface Camera {

    void takePhoto();
}

interface GPS {

    void getLocation();
}

class SmartPhone implements Camera, GPS {

    public void takePhoto() {

        System.out.println("Photo taken");
    }

    public void getLocation() {

        System.out.println("Location: Bengaluru");
    }
}

/*
output :
Photo taken
Location: Bengaluru
*/


/*
Q27. Default and static interface methods

Create an interface Vehicle with an abstract wheels(),
a default method honk() and a static method info().

Override honk() in one class only.
*/

public class Q27_VehicleTest {

    public static void main(String[] args) {

        Vehicle.info();

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car wheels = " + car.wheels());
        car.honk();

        System.out.println("Bike wheels = " + bike.wheels());
        bike.honk();
    }
}

interface Vehicle {

    int wheels();

    default void honk() {

        System.out.println("Vehicle horn");
    }

    static void info() {

        System.out.println("Vehicles are used for transportation");
    }
}

class Car implements Vehicle {

    public int wheels() {

        return 4;
    }

    @Override
    public void honk() {

        System.out.println("Car horn: Beep Beep");
    }
}

class Bike implements Vehicle {

    public int wheels() {

        return 2;
    }
}

/*
output :
Vehicles are used for transportation
Car wheels = 4
Car horn: Beep Beep
Bike wheels = 2
Vehicle horn
*/


/*
Q28. instanceof and downcasting

Create Animal -> Dog (with an extra fetch()) and Cat.

Loop over an Animal[] and call fetch() only for Dogs,
using instanceof and a cast.
*/

public class Q28_Downcasting {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Dog()
        };

        for (Animal a : animals) {

            a.sound();

            if (a instanceof Dog) {

                Dog d = (Dog) a;
                d.fetch();
            }
        }
    }
}

class Animal {

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog says Woof");
    }

    void fetch() {

        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal {

    void sound() {

        System.out.println("Cat says Meow");
    }
}

/*
output :
Dog says Woof
Dog is fetching
Cat says Meow
Dog says Woof
Dog is fetching
*/


/*
Q29. Payment system with an interface

Create an interface Payment with double fee(double amt)
and String name().

Implement UPI (no fee), Card (2%) and NetBanking
(flat Rs.10).

A checkout() method must work for any Payment.
*/

public class Q29_PaymentTest {

    static void checkout(Payment payment, double amount) {

        double fee = payment.fee(amount);
        double total = amount + fee;

        System.out.println("Payment : " + payment.name());
        System.out.println("Amount  : " + amount);
        System.out.println("Fee     : " + fee);
        System.out.println("Total   : " + total);
        System.out.println();
    }

    public static void main(String[] args) {

        checkout(new UPI(), 1000);
        checkout(new Card(), 1000);
        checkout(new NetBanking(), 1000);
    }
}

interface Payment {

    double fee(double amt);

    String name();
}

class UPI implements Payment {

    public double fee(double amt) {

        return 0;
    }

    public String name() {

        return "UPI";
    }
}

class Card implements Payment {

    public double fee(double amt) {

        return amt * 0.02;
    }

    public String name() {

        return "Card";
    }
}

class NetBanking implements Payment {

    public double fee(double amt) {

        return 10;
    }

    public String name() {

        return "NetBanking";
    }
}

/*
output :
Payment : UPI
Amount  : 1000.0
Fee     : 0.0
Total   : 1000.0

Payment : Card
Amount  : 1000.0
Fee     : 20.0
Total   : 1020.0

Payment : NetBanking
Amount  : 1000.0
Fee     : 10.0
Total   : 1010.0
*/



/*
Q30. Abstraction + interface together

Create an abstract class Notification (recipient, abstract send())
and an interface Schedulable (schedule(String time)).

EmailNotification extends the class and implements the interface.
SmsNotification only extends the class.
*/

public class Q30_NotificationTest {

    public static void main(String[] args) {

        EmailNotification email =
                new EmailNotification("Mahi");

        SmsNotification sms =
                new SmsNotification("Karthi");

        email.send();
        email.schedule("10:00 AM");

        sms.send();
    }
}

abstract class Notification {

    String recipient;

    Notification(String recipient) {

        this.recipient = recipient;
    }

    abstract void send();
}

interface Schedulable {

    void schedule(String time);
}

class EmailNotification extends Notification
        implements Schedulable {

    EmailNotification(String recipient) {

        super(recipient);
    }

    void send() {

        System.out.println("Email sent to " + recipient);
    }

    public void schedule(String time) {

        System.out.println("Email scheduled at " + time);
    }
}

class SmsNotification extends Notification {

    SmsNotification(String recipient) {

        super(recipient);
    }

    void send() {

        System.out.println("SMS sent to " + recipient);
    }
}

/*
output :
Email sent to Mahi
Email scheduled at 10:00 AM
SMS sent to Karthi
*/

