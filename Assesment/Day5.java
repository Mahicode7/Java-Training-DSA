/*
Q11. Encapsulated Product

Create a class Product with private name and price.
The setter must reject negative prices with a message.
Provide getters.
*/

public class Q11_Product {

    private String name;
    private double price;

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double price) {

        if (price < 0) {
            System.out.println("Invalid price: Price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public String getName() {

        return name;
    }

    public double getPrice() {

        return price;
    }

    public static void main(String[] args) {

        Q11_Product p = new Q11_Product();

        p.setName("Laptop");
        p.setPrice(50000);

        System.out.println("Name  : " + p.getName());
        System.out.println("Price : " + p.getPrice());

        p.setPrice(-1000);
    }
}

/*
output :
Name  : Laptop
Price : 50000.0
Invalid price: Price cannot be negative
*/



/*
Q12. Wallet with controlled access

Create a Wallet class with a private balance and methods
addMoney(), pay() (fails if the balance is too low)
and getBalance().

There must be no setter for the balance.
*/

public class Q12_Wallet {

    private double balance;

    void addMoney(double amount) {

        balance = balance + amount;
    }

    void pay(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed: Insufficient balance");
        }
    }

    double getBalance() {

        return balance;
    }

    public static void main(String[] args) {

        Q12_Wallet wallet = new Q12_Wallet();

        wallet.addMoney(1000);

        System.out.println("Balance = " + wallet.getBalance());

        wallet.pay(400);

        System.out.println("Balance = " + wallet.getBalance());

        wallet.pay(800);

        System.out.println("Balance = " + wallet.getBalance());
    }
}

/*
output :
Balance = 1000.0
Payment successful
Balance = 600.0
Payment failed: Insufficient balance
Balance = 600.0
*/



/*
Q13. Read-only roll number

Create a Student class whose roll number is private final
(set once, getter only), while the name has both
a getter and a setter.
*/

public class Q13_Student {

    private final int rollNumber;
    private String name;

    Q13_Student(int rollNumber, String name) {

        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {

        return rollNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public static void main(String[] args) {

        Q13_Student s = new Q13_Student(101, "Mahi");

        System.out.println("Roll Number : " + s.getRollNumber());
        System.out.println("Name        : " + s.getName());

        s.setName("Vishnu");

        System.out.println("Updated Name: " + s.getName());
    }
}

/*
output :
Roll Number : 101
Name        : Mahi
Updated Name: Vishnu
*/

/*
Q14. Contact with validation

Create a Contact class with private name, email and phone.

Setters must check:
email contains "@" and ".",
and phone is exactly 10 digits.

Print a message for invalid data.
*/

public class Q14_Contact {

    private String name;
    private String email;
    private String phone;

    public void setName(String name) {

        this.name = name;
    }

    public void setEmail(String email) {

        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setPhone(String phone) {

        if (phone.matches("\\d{10}")) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    public String getName() {

        return name;
    }

    public String getEmail() {

        return email;
    }

    public String getPhone() {

        return phone;
    }

    public static void main(String[] args) {

        Q14_Contact c = new Q14_Contact();

        c.setName("Mahi");
        c.setEmail("mahi@gmail.com");
        c.setPhone("9876543210");

        System.out.println("Name  : " + c.getName());
        System.out.println("Email : " + c.getEmail());
        System.out.println("Phone : " + c.getPhone());

        c.setEmail("mahi.com");
        c.setPhone("12345");
    }
}

/*
output :
Name  : Mahi
Email : mahi@gmail.com
Phone : 9876543210
Invalid email
Invalid phone number
*/




/*
Q15. Single inheritance

Create a class Vehicle (brand, start())
and a class Car that extends it and adds seats
and openSunroof().

Show that a Car can use both classes' members.
*/

public class Q15_Car extends Q15_Vehicle {

    int seats;

    void openSunroof() {

        System.out.println("Sunroof opened");
    }

    public static void main(String[] args) {

        Q15_Car car = new Q15_Car();

        car.brand = "Toyota";
        car.seats = 5;

        System.out.println("Brand : " + car.brand);
        System.out.println("Seats : " + car.seats);

        car.start();
        car.openSunroof();
    }
}

class Q15_Vehicle {

    String brand;

    void start() {

        System.out.println("Vehicle started");
    }
}

/*
output :
Brand : Toyota
Seats : 5
Vehicle started
Sunroof opened
*/



/*
Q16. Multilevel inheritance

Create a chain Person -> Employee -> Manager.

Person has a name, Employee adds a salary,
and Manager adds a team size.

Print all details from a Manager object.
*/

public class Q16_Manager extends Q16_Employee {

    int teamSize;

    public static void main(String[] args) {

        Q16_Manager m = new Q16_Manager();

        m.name = "Vishnu";
        m.salary = 50000;
        m.teamSize = 8;

        System.out.println("Name      : " + m.name);
        System.out.println("Salary    : " + m.salary);
        System.out.println("Team Size : " + m.teamSize);
    }
}

class Q16_Person {

    String name;
}

class Q16_Employee extends Q16_Person {

    double salary;
}

/*
output :
Name      : Vishnu
Salary    : 50000.0
Team Size : 8
*/


/*
Q17. Constructor chaining with super

Create Animal(name) -> Dog(name, breed),
where each constructor prints a message.

Show the order in which the constructors run.
*/

public class Q17_Dog extends Q17_Animal {

    String breed;

    Q17_Dog(String name, String breed) {

        super(name);

        this.breed = breed;

        System.out.println("Dog constructor called");
    }

    public static void main(String[] args) {

        Q17_Dog dog = new Q17_Dog("Tommy", "Labrador");

        System.out.println("Name  : " + dog.name);
        System.out.println("Breed : " + dog.breed);
    }
}

class Q17_Animal {

    String name;

    Q17_Animal(String name) {

        this.name = name;

        System.out.println("Animal constructor called");
    }
}

/*
output :
Animal constructor called
Dog constructor called
Name  : Tommy
Breed : Labrador
*/



/*
Q18. Overriding with super.method()

Create a class Shape with describe().
Create Square (side) that overrides describe()
but calls the parent version first using super.
*/

public class Q18_Square extends Q18_Shape {

    int side;

    Q18_Square(int side) {

        this.side = side;
    }

    @Override
    void describe() {

        super.describe();

        System.out.println("This is a square");
        System.out.println("Side = " + side);
    }

    public static void main(String[] args) {

        Q18_Square square = new Q18_Square(5);

        square.describe();
    }
}

class Q18_Shape {

    void describe() {

        System.out.println("This is a shape");
    }
}

/*
output :
This is a shape
This is a square
Side = 5
*/



/*
Q19. Hierarchical inheritance: accounts

Create Account (holder, protected balance) with two children:
SavingsAccount with addInterest(rate), and CurrentAccount
with an overdraft limit of Rs.5000 in withdraw().
*/

public class Q19_Accounts {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("Mahi", 10000);

        savings.addInterest(5);

        System.out.println("Savings Account");
        System.out.println("Holder  : " + savings.holder);
        System.out.println("Balance : " + savings.balance);

        CurrentAccount current =
                new CurrentAccount("Vishnu", 3000);

        current.withdraw(7000);

        System.out.println();
        System.out.println("Current Account");
        System.out.println("Holder  : " + current.holder);
        System.out.println("Balance : " + current.balance);

        current.withdraw(2000);
    }
}

class Account {

    String holder;
    protected double balance;

    Account(String holder, double balance) {

        this.holder = holder;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String holder, double balance) {

        super(holder, balance);
    }

    void addInterest(double rate) {

        balance = balance + (balance * rate / 100);
    }
}

class CurrentAccount extends Account {

    double overdraftLimit = 5000;

    CurrentAccount(String holder, double balance) {

        super(holder, balance);
    }

    void withdraw(double amount) {

        if (amount <= balance + overdraftLimit) {

            balance = balance - amount;

            System.out.println("Withdrawal successful");
        } else {

            System.out.println("Withdrawal failed");
        }
    }
}

/*
output :
Savings Account
Holder  : Mahi
Balance : 10500.0
Withdrawal successful

Current Account
Holder  : Vishnu
Balance : -4000.0
Withdrawal failed
*/


/*
Q20. Encapsulation + inheritance

Create an Employee with a private salary and a getter.
Manager extends Employee and adds a bonus.

It must use the getter (not the field) to compute
its total pay.
*/

public class Q20_Manager extends Q20_Employee {

    double bonus;

    Q20_Manager(double salary, double bonus) {

        super(salary);

        this.bonus = bonus;
    }

    double totalPay() {

        return getSalary() + bonus;
    }

    public static void main(String[] args) {

        Q20_Manager manager = new Q20_Manager(50000, 10000);

        System.out.println("Salary   : " + manager.getSalary());
        System.out.println("Bonus    : " + manager.bonus);
        System.out.println("Total Pay: " + manager.totalPay());
    }
}

class Q20_Employee {

    private double salary;

    Q20_Employee(double salary) {

        this.salary = salary;
    }

    double getSalary() {

        return salary;
    }
}

/*
output :
Salary   : 50000.0
Bonus    : 10000.0
Total Pay: 60000.0
*/


