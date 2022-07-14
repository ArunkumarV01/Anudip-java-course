import java.util.*;
class program1
{
    public static void main(String[]args)
		{
		 Scanner sc= new Scanner(System.in);
			System.out.println("Enter your attendance percentage ");
            int attendance =sc.nextInt();
            if (attendance>70)
            {
             System.out.println("you are present");
            }
            else if (attendance<70)
            {
                System.out.println("you are absent");
            }
            else
            {
               System.out.println("you are absent");
            }
        }
}