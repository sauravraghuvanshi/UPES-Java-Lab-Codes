class Room
{
  private int l,b;
  Room(int x,int y)
  {
    l=x;
    b=y;
  }
  int area()
  {
    return(l*b);
  }
}
class Class_room extends Room
{
  int h;
  Class_room(int x,int y,int z)
  {
    super(x,y);
    h=z;
  }
  int volume()
  {
    return(area()*h);
  }
}
class Test1
{
  public static void main(String args[])
  {
    Class_room cr=new Class_room(10,20,15);
    int a1=cr.area();
    int v1=cr.volume();
    System.out.println("Area of Room : "+a1);
    System.out.println("Volume of Room : "+v1);
  }
}
