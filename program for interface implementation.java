interface Course
{
void division(int a);
void modules(int b);
}
class Stud implements Course
{
String name;
int div,mod;
void name(String n)
{ name=n; }
public void division(int a)
{ div=a; }
public void modules(int b)
{ mod=b; }
void disp()
{
System.out.println("Name :"+name);
System.out.println("Division :"+div);
System.out.println("Modules :"+mod);
}
}
//--------main---------------
class Test_Class
{
public static void main(String args[])
{ Stud s=new Stud();
s.name("Arun");
s.division(5);
s.modules(15);
s.disp();
}
}
