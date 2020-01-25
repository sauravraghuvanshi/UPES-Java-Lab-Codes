interface Area
{
static final float pi=3.142f;
float compute(float x,float y);
}
class Rectangle implements Area
{
public float compute(float x,float y)
{return(x*y);}
}
class Circle implements Area
{
public float compute(float x,float y)
{return(pi*x*x);}
}
class Test
{
public static void main(String args[])
{
Rectangle rect=new Rectangle();
Circle cr=new Circle();
Area ar;
ar=rect;
System.out.println("Area of the rectangle= "+ar.compute(10,20));
ar=cr;
System.out.println("Area of the circle= "+ar.compute(10,0));
}
}
