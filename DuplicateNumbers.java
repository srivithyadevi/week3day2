package week3day2;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] data= {4,3,6,8,29,1,2,4,7,8};
	Set <Integer> set = new HashSet <Integer>();
for(int i=0;i<data.length;i++){
		set.add(data[i]);
}
System.out.println("The duplicate number is:" +data);	
}
}

