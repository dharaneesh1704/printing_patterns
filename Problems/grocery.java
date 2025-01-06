package  problems;

import java.util.Scanner;

public class grocery 
{
    public static void main(String[] args) 
    {
        
    Scanner sc = new Scanner(System.in);
    float total=0;

    System.out.println("grocery billing : ");
    System.out.println("enter 0 to exit");
        int price=1,qty=0;
    
    
    total+=(price*qty);

    while(price!=0)
    {
        
        System.out.print("enter the price of item : ");
        price=sc.nextInt();
        

        System.out.print("enter the quantity: ");
        qty=sc.nextInt();

        total+=(price*qty);

    }

    System.out.println("the total amoutn to be get paid is : "+total);
    }

}
