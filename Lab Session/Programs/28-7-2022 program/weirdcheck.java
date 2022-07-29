/*
author - Arunkumar V
Question - check whether the number is weird or not weird
*/
import java.util.*;
class Weird
{
	int value;
	String s1;
	//using contructor overloading
	public Weird() 
	{
		System.out.println("Object Created using Constructor 1");
	}
	public Weird(String s1) 
	{
		System.out.println(s1);
	}
    //declaring weird method
	public void WeirdC() 
	{
		System.out.print("Enter a Number : ");
		Scanner a = new Scanner(System.in);
		value = a.nextInt();
        //checking odd or even number
		if((value%2)==0) 
		{
			//checking the range of number
			if(value<=6) 
			{
				System.out.println(value+" is Weird");
			}
			else 
			{
				System.out.println(value+" is not Weird");
			}
		}
		else 
		{
			System.out.println(value+" is Weird");
		}
    }
}

class weirdcheck
{

    //declaring main method 
	public static void main(String[]args) 
	{
		Weird obj1 = new Weird();
		obj1.WeirdC();
		Weird obj2 = new Weird("Anudip students ");
		obj2.WeirdC();
		
		
	}

}