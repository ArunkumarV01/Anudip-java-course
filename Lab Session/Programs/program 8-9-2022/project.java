package com.thread;
//author Arun kumar V
/* Question =         Write a java program using synchronization and extend the thread*/
                       

class car extends Thread{
	
synchronized void test1() {
for(int i=0;i<5;i++) {
System.out.println(i);
}
}
synchronized void test2() {
for(int i=5;i<10;i++) {
System.out.println(i);
}
}	
}

class Hyndai extends Thread{
car obj;
	
Hyndai(car obj)
{
this.obj=obj;
}	
@Override
public void run() {
// TODO Auto-generated method stub
obj.test1();
}
}

class Maruthi extends Thread{
car obj1;
Maruthi(car obj1)
{
this.obj1=obj1;
}
@Override
public void run() {
// TODO Auto-generated method stub
obj1.test2();
}
}

public class project {



public static void main(String[] args) {
// TODO Auto-generated method stub
car obj = new car();			
Hyndai obj1 = new Hyndai(obj);
Maruthi obj2 = new Maruthi(obj);			
obj1.start();
obj2.start();	
}

}
