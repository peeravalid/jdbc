package ExceptionHandling;

import java.util.Scanner;

public class JEHDemo1 
{
    int num;
    Scanner sin = new Scanner(System.in);

    public void checkNum()
    {
        try
        {
            System.out.println("Enter the number");
            num = sin.nextInt();

            if(num < 0)
            {
                throw new IllegalNumberException("Negative numbers are not allowed.");
            }
            else
            {
                System.out.println("Number is correct !!");
            }
        }
        catch(IllegalNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }   
}