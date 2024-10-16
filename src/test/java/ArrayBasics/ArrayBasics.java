package ArrayBasics;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		//Declaration of 1D array
		
		int a[]=new int[4]; //array size if fixed here
		
		//Initialization of array
		a[0]=100;
		a[1]=200;
		a[3]=300;
		a[2]=400;
	//	a[5]=500; //Error : Array index outofbound exception
		
		//Declaration & Initialization at one step
		int b[]= {100,200,300,400,500,600}; //array size is dynamic here 
		
     //Size of length
		System.out.println(a.length); //4
		System.out.println(b.length); //6
		
		
		
		//get single value from array
		System.out.println(a[3]);
		
		//get all the elements from array
		System.out.println(Arrays.toString(a));
		
		//get all the values of array using loop
		for(int i=0;i<a.length;i++) //length output is natural number but array  
			                             //-index starts with 0
		{
			System.out.println(a[i]);
		}
		
		//for..each loop(enhanced loop)
		for(int x:a) 
		{
		  System.out.println("for.. each loop o/p : "+x);	
		}
	}

}
