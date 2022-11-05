import java.util.*;

class Employee {
    String name;
    int year;
    String address;

    Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public void print() {
        System.out.println("Name: " + name + " Year: " + year + " Address: " + address);
    }
}

class Ques2 {
    public static void main(String args[]) {
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");
        e1.print();
        e2.print();
        e3.print();
    }
}