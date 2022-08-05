//Author Arunkumar V
//Question - Basic calculations using constructor and switch



package test;
import java.util.*;

class addition
{
	int Result;
	addition(int value1,int value2)
	{
		
		this.Result = value1 + value2;
		
		
		
	}
	addition(short value1,short value2)
	{
		
		 this.Result =  value1 - value2;
	}
	addition(long value1 ,long value2)
	{
		 
		this.Result = (int)(value1 * value2);
	}
	addition(float value1,float value2)
	{
		this.Result =(int)(value1 % value2);	
	}
	
}


public class calculation
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the option");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int Number = sc.nextInt();
		
	 switch(Number)
		{
		
			case 1:
				System.out.println("Enter the value 1 : ");
				int value1 = sc.nextInt();
				System.out.println("Enter the value 2 : ");
				int value2 = sc.nextInt();
				addition obj = new addition(value1,value2);
				
				System.out.println("Result = " +obj.Result);
	            break;
			case 2:
				System.out.println("Enter the value 1 : ");
				short value3 = sc.nextShort();
				System.out.println("Enter the value 2 : ");
				short value4 = sc.nextShort();
				addition obj1 = new addition(value3,value4);
				
				System.out.println("Result = " +obj1.Result);
				break;
			case 3:
				System.out.println("Enter the value 1 : ");
			    long value5 =  sc.nextLong();
			    System.out.println("Enter the value 2 : ");
			   long value6 =  sc.nextLong();
			    addition obj2 = new addition(value5,value6);
			    
			    System.out.println("Result = " +obj2.Result);
			    break;
			case 4:
				System.out.println("Enter the value 1 : ");
			    float value7 = sc.nextFloat();
			    System.out.println("Enter the value 2 : ");
			    float value8 = sc.nextFloat();
			    addition obj3 = new addition(value7,value8);
			   
			    System.out.println("Result = "+obj3.Result);
			    break;
		}
	}
}	
				
				
		
	



	
	