package week3day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Missingnumber {

	public static void main(String[] args) {
		
		int[] numArray = {1,2,2,3,4,3,6,7,8,9,4,3,10};
		
		Set <Integer> hashSet = new HashSet <Integer>();
		
		for(Integer x:numArray)
		{
			hashSet.add(x);
		}
		System.out.println("The HashSet values are : "+hashSet);
		
		List <Integer> listArray = new ArrayList<Integer>(hashSet);
		
		for(int i=1;i<=10;i++)
		{
			if(i!=listArray.get(i-1))
			{
				System.out.println("Missing Number is: " +i);
				break;
			}	
		}
	}
	}


