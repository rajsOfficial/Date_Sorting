package main;

class base{
	base(int x){
		System.out.println("into super Constructor");
	}
}

public class SuperConstructor_Check extends base{

	
	public SuperConstructor_Check() {
		System.out.println("into constructor");
	}

	public static void main(String args[]){
		SuperConstructor_Check obj = new SuperConstructor_Check();
	}
}
