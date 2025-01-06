package problems;

import java.util.Scanner;
public class clothes 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the tempreature: ");
   
    try
    {
        float temp=sc.nextFloat();


    if(temp<0)
    {
        System.out.println("you should wear winter clothes");
        System.out.println("Dont't forget your clothes");
    }
    else if(temp>=0 && temp<=10)
    {
        System.out.println("wear warm clothrs");
        System.out.println("light jacket will be helpful");
    }
    else if(temp >=11 && temp<=20)
    {
        System.out.println("wear summer clothes");
        System.out.println("sun glass would be a ggood idea");
    }
    else if(temp>20)
    {
        System.out.println("wear summer clothes");
        System.out.println("carry sunscreen to protect your skin");
    }
    else
    {
        System.out.println("Invalid input");
    }

    }
    catch(Exception e)
    {
        System.out.print("Invalid input");
    }
}
}