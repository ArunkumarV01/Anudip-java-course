//author - Arunkumar V
/* Question -   
In Java, inheritance is an is-a relationship. That is, we use inheritance only if there exists an is-a relationship between two classes. For example,

Car is a Vehicle
Orange is a Fruit
Surgeon is a Doctor
Dog is an Animal
Here, Car can inherit from Vehicle, Orange can inherit from Fruit, and so on.*/


class car
{
	int car_model;
	String car_name;
	
	car()
	{
		System.out.println("car type");
	}
}
class Honda extends car
{
	
	
	Honda(int car_model,String car_name)
	{
		this.car_model = car_model;
		this.car_name = car_name;
		
	}
	
	public  void printDetails()
	{   
        String brand = "Honda";
		System.out.println( brand +" - "+ this.car_name+" ,"+this.car_model);
	}
	
}
class Maruthi extends car
{
	
	Maruthi(int car_model,String car_name)
	{
		this.car_model = car_model;
		this.car_name = car_name;
		
	}
	public void printDetails()
	{
        String brand = "Maruthi";
		System.out.println( brand +" - "+ this.car_name+", "+this.car_model);
	}
	
}
class Toyota extends car
{
	
	Toyota(int car_model,String car_name)
	{
		this.car_model = car_model;
		this.car_name = car_name;
		
	}
	public void printDetails()
	{
         String brand = "Toyota";
        System.out.println(brand +" - "+this.car_name+" , "+this.car_model);
	}
}



class fruits
{
	int percentage;
	String nutrient;
	
 fruits()
 {
   System.out.println("fruit type");	
 }
}
class Orange extends fruits
{
	 
	Orange(int percentage,String nutrient)
	{
		
		this.percentage = percentage;
		this.nutrient = nutrient;
	}
   		public void printDetails() 
   		{
   		    String fruitname = "orange";
   			System.out.println(fruitname +" - "+ this.percentage+"% "+this.nutrient);
   		}
}
class Apple extends fruits
{
	
	Apple(int percentage,String nutrient)
	{
		
		this.percentage = percentage;
		this.nutrient = nutrient;
	}
	public void printDetails() 
	{
        String fruitname ="apple";
		System.out.println(fruitname +" - "+this.percentage+"% " +this.nutrient);
	}
}
class Banana extends fruits
{
	Banana(int percentage,String nutrient)
	{
		
		this.percentage = percentage;
		this.nutrient = nutrient;
	}
	public void printDetails() 
		{
            String fruitname ="banana";
			System.out.println(fruitname +" - "+this.percentage+"% " +this.nutrient);
		}
}
class animals
{
	int speed;
	String lifespan;
	animals()
	{
		System.out.println("animal type");
		
	}
	
}

class Lion extends animals
{
	Lion(int speed,String lifespan)
	{
		this.speed = speed;
		this.lifespan = lifespan; 
	}
    public  void printDetails()
	{   
        String animal = "Lion";
		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
	}
}
class Tiger extends animals
{
	Tiger(int speed,String lifespan)
	{
		this.speed = speed;
		this.lifespan = lifespan; 
	}
     public  void printDetails()
	{   
        String animal = "Tiger";
		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
	}

    
}
class Cheetah extends animals
{
	Cheetah(int speed,String lifespan)
	{
		this.speed = speed;
		this.lifespan = lifespan; 
	}
    public  void printDetails()
	{   
        String animal = "Cheetah";
		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
	}
}



public class printModel {

	public static void main(String[]args) 
	{
		
	 Toyota toyota=new Toyota(2022,"Innova");
	 toyota.printDetails();
	 Maruthi maruthi = new Maruthi (2018,"Ertiga");
	 maruthi.printDetails();
	 Honda honda = new Honda(2022,"Civic");
	 honda.printDetails();
			
			
	 Orange orange =new Orange(88,"vitamin c");
	 orange.printDetails();
	 Apple apple =new Apple(7,"vitamin c");
	 apple.printDetails();
	 Banana banana =new Banana(20,"vitamin B6");
	 banana.printDetails();
	 
		Lion lion =new Lion(80,"15 - 16");
        lion.printDetails();
        Tiger tiger =new Tiger( 65,"8-10");
        tiger.printDetails();
        Cheetah cheetah =new Cheetah(130,"12");
        cheetah.printDetails();

	}

}
