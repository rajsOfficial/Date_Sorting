import java.util.Scanner;

public class string_split {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String[] A = a.split("\\s");
		for(String x: A){
		System.out.println(x);
		
		String wow = "hello";
		String now = new String ("hello");
		String cow = wow.intern();
	}
		
}
}
