package assign2;
/*
An employee works in a particular department of an organization. Every employee has an employee number,
name and draws a particular salary. Every department has a name and a head of department. The head of
department is an employee. Every year a new head of department takes over. Also, every year an employee is
given an annual salary enhancement. Identify and design the classes for the above description with suitable
instance variables and methods. The classes should be such that they implement information hiding. You must
give logic in support of your design. Also create two objects of each class.
 */
import java.util.Scanner;

class employee {
 Scanner sc = new Scanner(System.in);

 int employee_no;
 String name;
 int salary = 20000;

 employee() {
  employee_no = 1;
  this.name = "Avi";
 }

 employee(int en, String n) {
  employee_no = en;
  name = n;
 }

 void display() {
  System.out.println("\n Employee Number : " + employee_no + "\n Employee Name : " + name + "\n Salary : " + salary);
 }
}

class department extends employee {

 String D_name;
 int year;

 department() {
  D_name = "INFORMATION TECHNOLOGY";
  this.year = 2000;
  System.out.println(" Department : " + D_name + "\n Year : " + year);
  System.out.println("-----------------------------------");
 }

 department(int en, String n, String D_n) {
  super(en, n);
  D_name = D_n;
 }

 void display(){
  System.out.print(" Enter the year : ");
  year = sc.nextInt();
  int i = year;
  while (i > 2000) {
   salary = salary + 10000;
   --i;
  }
  System.out.println("\n Employee Number : " + employee_no + "\n Employee Name : " + name + "\n Salary : " + salary + "\n Department : " + D_name + "\n Year : " + year);
  System.out.println("-----------------------------------");
 }
}

public class Employee {
 public static void main(String[] args) {
  employee superOB = new employee();
  superOB.display();
  department subOB = new department();

  department subOB1 = new department(2,"Rahul", "IT");
  subOB1.display();

  department subOB2 = new department(2,"Ravi", "IT");
  subOB2.display();
 }
}