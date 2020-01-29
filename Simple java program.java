import java.util.*;
class Employee
{
  String name;
  int empid;
  double salary;

  Employee()
  {
    name="";
    empid=0;
    salary=0;
  }

  Employee(String n,int id,double amt)
  {
    name=n;
    empid=id;
    salary=amt;
  }

  void display()
  {
    System.out.println("Name Of Employee="+name);
    System.out.println("ID Of Employee="+empid);
    System.out.println("salary Of Employee="+salary);
  }

  void increment(double per)
  {
    salary+=((salary*per)/100);
  }

  class Manager extends Employee
  {
    String department;
  }
}

class Test5
{
   public static void main(String[] args) {
    Scanner K=new Scanner (System.in);
    Employee E1=new Employee("abc",1001,50000);
    E1.display();
    E1.increment(20);
    E1.display();
  }
}
