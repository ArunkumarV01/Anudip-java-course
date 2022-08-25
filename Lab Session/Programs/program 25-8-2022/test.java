//Author Arunkumar V
/*question - interface program for car details ,fruits types,and animal category
*/

package com.interfce1;
interface car_details
{    
	void Honda(int car_model, String car_name);
	void Toyota(int car_model, String car_name);
	void Maruthi(int car_model, String car_name);
}
 class Model implements car_details
{   
	 int car_model;
		String car_name;
	@Override
	public void Honda(int car_model, String car_name) 
	{   this.car_name =car_name;
	    this.car_model =car_model;
	
		String brand = "Honda"; 
		System.out.println( brand +" - "+ this.car_name+" ,"+this.car_model);
	}
	public void Toyota(int car_model, String car_name) 
	{  
		this.car_name =car_name;
        this.car_model =car_model;
	
		String brand = "Toyota";
		System.out.println( brand +" - "+ this.car_name+" ,"+this.car_model);
	}
	public void Maruthi(int car_model, String car_name) 
	{ 
		this.car_name =car_name;
        this.car_model =car_model;
	
		String brand = "Maruthi";
		System.out.println( brand +" - "+ this.car_name+" ,"+this.car_model);
	}
}
 interface fruits_details
 {
 	void Apple(int percentage,String nutrient);
 	void Orange(int percentage,String nutrient);
 	void Banana(int percentage,String nutrient);
 }
 class Type implements fruits_details
 {
 	int percentage;
 	String nutrient;
 	public void Apple(int percentage,String nutrient) 
 	{
 		this.percentage = percentage;
 		this.nutrient = nutrient;
 		String fruitname ="apple";
 		System.out.println(fruitname +" - "+this.percentage+"% " +this.nutrient);
 	}
 	public void Orange(int percentage,String nutrient) 
 	{
 		this.percentage = percentage;
 		this.nutrient = nutrient;
 		String fruitname ="Orange";
 		System.out.println(fruitname +" - "+this.percentage+"% " +this.nutrient);
 	}
 	public void Banana(int percentage,String nutrient) 
 	{
 		this.percentage = percentage;
 		this.nutrient = nutrient;
 		String fruitname ="Banana";
 		System.out.println(fruitname +" - "+this.percentage+"% " +this.nutrient);
 	}
 	
 	
 }
 interface animals_details
 {
 	void Lion(int speed,String lifespan);
 	void Tiger(int speed,String lifespan);
 	void cheetah(int speed,String lifespan);
 	
 }
 class Category implements animals_details
 {
 	int speed;
 	String lifespan;
 	
 	
 	public void Lion(int speed,String lifespan) 
 	{
 		this.speed = speed;
 		this.lifespan = lifespan; 
 		String animal = "Lion";
 		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
 	}
 	public void Tiger(int speed,String lifespan) 
 	{
 		this.speed = speed;
 		this.lifespan = lifespan; 
 		String animal = "Tiger";
 		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
 	}
 	public void Cheetah(int speed,String lifespan) 
 	{
 		this.speed = speed;
 		this.lifespan = lifespan; 
 		String animal = "Cheetah";
 		System.out.println(animal +" - "+ this.speed+"km/h "+" , "+this.lifespan+"years");
 	}
 }
public class test
{
	
  public static void main(String[]args)
{
	  System.out.println("Car Details");
	  System.out.println(" ");
	Model model = new Model();
	model.Honda(2022,"civic");
	model.Toyota(2018,"Innova");
	model.Maruthi(2020, "swift");
	System.out.println(" ");
	System.out.println("Fruits types");
	System.out.println(" ");
	Type type =new Type();
	type.Apple(7, "vitamin c");
	type.Orange(88,"vitamin c");
	type.Banana(20, "vitamin B6");
	System.out.println(" ");
	System.out.println("Animal category");
	System.out.println(" ");
	Category category=new Category();
	category.Lion(80,"15 - 16");
	category.Tiger(65,"8-10");
	category.Cheetah(130,"12");
}
}

