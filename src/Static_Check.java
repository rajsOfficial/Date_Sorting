
public class Static_Check {

	public static void main(String[] args) {

	    a obj = new a();
		obj.run();
	}
}

class a {
	static int run(){
		System.out.println("worked");
		return 0;
	}
}