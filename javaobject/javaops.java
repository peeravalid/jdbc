package javaobject;

public class javaops
{
    private int num1;
    public int num2;

    // if scope is not creating,then we need to create scope 
    int num3;

    protected String msg;

    public void display()
    {
    num3=20;
    num1=50;
    msg="Test Data";
    System.out.println(num1);
    }
 public static void main(String[] args)
 {
    javaops myobj = new javaops();
    myobj.display();
 }
}



