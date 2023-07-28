package JavaDataStructure;

import java.util.Scanner;

public class JDS
{
    Scanner sin = new Scanner(System.in);

    String[] nameOfPlayer = new String[5];
    int[] ageOfPlayer = new int[5];

    public void acceptAge()
    {
        for (int i = 0; i < ageOfPlayer.length; i++)
        {
            System.out.print("Please input the name of player " + (i + 1) + ": ");
            nameOfPlayer[i] = sin.next();
            System.out.print("Please input the age of player " + (i + 1) + ": ");
            ageOfPlayer[i] = sin.nextInt();
        }
    }

    public void displayAge()
    {
        for (int i = 0; i < ageOfPlayer.length; i++)
        {
            System.out.println("The name of player " + (i + 1) + " is " + nameOfPlayer[i]);
            System.out.println("The age of player " + (i + 1) + " is " + ageOfPlayer[i]);
        }
    }

    public void specificPlayerDetails(int i)
    {
        System.out.println("The details of specific player  is as follows: ");
        System.out.println("The name of player " + (i + 1) + " is " + nameOfPlayer[i]);
        System.out.println("The age of player " + (i + 1) + " is " + ageOfPlayer[i]);
    }

    public static void main(String[] args)
    {
        JDS jObj = new JDS();
        jObj.acceptAge();
        jObj.displayAge();
        jObj.specificPlayerDetails(2);
    }
}
