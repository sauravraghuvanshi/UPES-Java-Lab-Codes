interface Test
{
    int square();
}

class Arithmetic implements Test
{
    int b;

    Arithmetic(int x)
    {
        b = x;
    }

    public int square()
    {
        return (b*b);
    }

}

class ToTestInt
{
    public int return_ans(int x)
    {
        Arithmetic a=new Arithmetic(x);
        return a.square();
    }
}

class Main
{
    public static void main(String []args)
    {
        ToTestInt x= new ToTestInt();
        System.out.println("\nThe square of 64 is "+x.return_ans(64));
    }
}