import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Date_Sort_UsingTree {

	TreeMap<Date, ArrayList<String>> tm = new TreeMap<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String args[]) throws ParseException{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of Students");
		int n = in.nextInt();
		Date_Sort_UsingTree obj = new Date_Sort_UsingTree();
		obj.work(n);
		obj.show();
		
	}
	
	public void show() {
		
		for(Entry<Date, ArrayList<String>> em : tm.entrySet()){
			System.out.println("Date is "+em.getKey()+"  Name is "+em.getValue());
		}
	}

	public void work(int x) throws ParseException{
		Scanner in = new Scanner(System.in);
		for(int i=0; i<x; i++){
			System.out.println("enter name");
			String name = in.nextLine();
			System.out.println("enter date");
			String dob = in.nextLine();
			Date Dob = formatter.parse(dob);
			ArrayList<String> al = new ArrayList<>();
			if(!tm.containsKey(Dob)){
				al.add(name);
				tm.put(Dob, al);
			}
			else{
				al=tm.get(Dob);
				al.add(name);
				tm.put(Dob,al);
			}
		}
	}
}
