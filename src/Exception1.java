
public class Exception1 {
	static int x;
	public static void main(String args[]){
		
		try{
			 x= 50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e){
			System.out.println("exception");
		}
		System.out.println(x);
	}
}
