import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

//Single Inheritance
class A{
	int x,y;
	void getData(int a,int b){
		x=a;y=b;
	}
	int add(){
		System.out.println("This is base class A");
		return (x+y);
	}
}

class B extends A{
	int mul(){
		System.out.println("This is child class B");
		return (x*y);
	}
}

//Multilevel Inheritance
class Student{
	int roll;
	void getRoll(int r){
		roll = r;
	}
	void putRoll(){
		System.out.println("RollNumber is :"+roll);
	}
}

class Test extends Student{
	int mark1,mark2;
	void getMark(int m1,int m2){
		mark1 = m1;mark2=m2;
	}
}

class Result extends Test{
	void putMarks(){
		System.out.println("Test Mark "+mark1 + " :: "+ "Test2 Mark " + mark2);
	}
	void putTotal(){
		System.out.println("Total Test Score: "+(mark1+mark2));
	}
}


//Heirerical Inheritance
class One{
	int x,y;
	void getValue(int a,int b){
		System.out.println("the parent class One for both classes Two and Three");
		x=a;y=b;
	}
}

class Two extends One{
	void Add(){
		System.out.println("Class Two Inherited from Class One");
		System.out.println("Sum of the numbers is :" + (x+y));
	}
}

class Three extends One{
	void Multi(){
		System.out.println("Class Three Inherited from class One");
		System.out.println("Multiplication of numbers is :" + (x*y));
	}
}

class Opp{
	public static void main(String[] ashu) {

		//For single Inheritance
		B obj = new B();
		obj.getData(12,20);
		System.out.println(obj.add());
		System.out.println(obj.mul());

		//for multilevel Inheritance
		Result obj = new Result();
		obj.getRoll(101);
		obj.getMark(85,95);
		obj.putRoll();
		obj.putMarks();
		obj.putTotal();

		//For Hirerical Inheritance
		Two tobj = new Two();
		Three thobj = new Three();
		tobj.getValue(10,20);
		tobj.Add();
		thobj.getValue(4,8);
		thobj.Multi();
	}
}