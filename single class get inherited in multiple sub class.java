class Player
{
  String name;
  int age;
  Player(String n,int a)
  {
    name=n;
    age=a;
  }

  void show()
  {
    System.out.println("\n");
    System.out.println("Player name : "+name);
    System.out.println("Age : "+age);
  }
}

class Cricket_player extends Player
{
  String type;
  Cricket_player(String n,String t,int a)
  {
    super(n,a);
    type=t;
  }

  public void show()
  {
    super.show();
    System.out.println("Player type : "+type);
  }
}

class Football_player extends Player
{
  String type;
  Football_player(String n,String t,int a)
  {
    super(n,a);
    type=t;
  }
  public void show()
  {
    super.show();
    System.out.println("Player type : "+type);
  }
}

class Hockey_player extends Player
{
  String type;
  Hockey_player(String n,String t,int a)
  {
    super(n,a);
    type=t;
  }
  public void show()
  {
    super.show();
    System.out.println("Player type : "+type);
  }
}

class Test2
{
  public static void main(String args[])
{
  Cricket_player c=new Cricket_player("Ameer","cricket",25);
  Football_player f=new Football_player("arun","foot ball",25);
  Hockey_player h=new Hockey_player("Ram","hockey",25);
  c.show();
  f.show();
  h.show();
  }
}
