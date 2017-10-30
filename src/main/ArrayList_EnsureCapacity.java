package main;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_EnsureCapacity {

	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<17;i++){
			al.add(i);
		}
		al.ensureCapacity(16);
		System.out.println(al.size()); 
	}
}
