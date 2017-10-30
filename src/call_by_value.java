public class call_by_value {
	static int x=10;
	int r = 100;
	public static void run(call_by_value object){
		System.out.println(object+ "in method");
		System.out.println(object + " in method after change");
		object.x=20;
	}
	
	public static void main(String args[]){
		
		call_by_value obj = new call_by_value();
		System.out.println(obj+" in main");
		run(obj);
		
		System.out.println(obj+"in main after func call");
		System.out.println(obj.x);
		
		raj object = new raj();
		System.out.println(object.p);
	}
}


