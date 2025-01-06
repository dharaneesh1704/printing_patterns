package problems;

import java.util.Scanner;
public class user_login 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);

        String[] user={"user1","user2"};
        String[] password={"qwer","djhg"};

        int count=1;
        while(count==1)
        {
            System.out.println("enter the user name: ");
            String user_inp=sc.next();

            System.out.println("enter the user password: ");
            String pass_inp=sc.next();

            for(int i=0;i<user.length;i++)
            {
                if(user_inp.equals(user[i]) && pass_inp.equals(password[i]))
                {
                    count=0;
                }

            }
            if(count==0)
            {
                System.out.println("$$$$$$Welcome "+user_inp+"$$$$$$$");
            }
            else
            {
                System.out.println("__________Invalid user name or password___________\n==========try again==========");
            }




        }
    }
}
