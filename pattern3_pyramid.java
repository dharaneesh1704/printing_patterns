import java.util.Scanner;
public class pattern3_pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=5-row;col++)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    

}
