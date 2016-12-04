import java.lang.*;
import java.util.Scanner;

//Multiple Inheritance
interface It{
	int x=15;
	void putData();
}
class It1{
	int kl;
	void getData(int k){
		kl=k;
	}
	void valueData(){
		System.out.println("Value of kl from class is "+ kl);
	}
}
class A extends It1 implements It{
	public void putData(){
		System.out.println("It interface object X "+x);
	}
}

class Inter{
	public static void main(String []args){
		A obj = new A();
		obj.putData();
		obj.getData(45);
		obj.valueData();
	}
}