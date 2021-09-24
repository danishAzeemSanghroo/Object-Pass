import java.util.*;
class TestObjPass{
	public static void main(String args[])
	{
	Scanner ob = new  Scanner(System.in);
	Car object =new Car("Farrari","Black",4,2,300,14,6);
	Display.show(object);

	
	}
}
class Car{
	String name;
	String color;
	int noOfTyres;
	int noOfwindows;
	double speed;
	double length;
	double width;
	
	Car(String name,String color,int noOfTyres,int noOfwindows,double speed,double length,double width)
	{
		this.name=name;
		this.color=color;
		this.noOfTyres=noOfTyres;
		this.noOfwindows=noOfwindows;
		this.speed=speed;
		this.length=length;
		this.width=width;
	}
}
class Display{
	static void show(Car ob)
	{
		System.out.println("Name of car= "+ ob.name);
		System.out.println("Color of car= "+ob.color);
		System.out.println("No of tyres of car= "+ob.noOfTyres);
		System.out.println("No of windows of car= "+ob.noOfwindows);
		System.out.println("Speed of car is= "+ob.speed+" kmH");
		System.out.println("Length of car= "+ob.length+"m");
		System.out.println("Width of car= "+ob.width+"m");
		
	}
	void show1()
	{
		System.out.println("I love this car");
	
	}
}