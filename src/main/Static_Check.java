package main;


 
public class Static_Check{
	
	public static void main(String a[]){
		
		System.out.println(79);
		System.out.println(90);
		func();
	}
	 static void func(){
		 String k[] = null;
		main(k);
	}

}
 