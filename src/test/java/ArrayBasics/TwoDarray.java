package ArrayBasics;

public class TwoDarray {

	public static void main(String[] args) {
		//Declaration of 2D
		
		//int a[][]=new int[3][2]; //Declaration
		int b[][]= {{1,2},{3,4}}; //Declaration & Initialization
        System.out.println(b.length);
		int f[][]= {{1,2,3},
				    {3,4,5},
				    {6,7,8}
				           };
		int a[][]= {{1,2},
				    {3,4},
				    {6,7}};
		System.out.println(f.length);  //no.of rows
		System.out.println(a.length); // no.of rows
		
		//how many elements in a row
		System.out.println(a[0].length); //no.of columns in 0th row
		
		
		//Reading the data from 2D array using for Loop
		for(int r=0; r<a.length; r++)
		{
		    for(int c=0; c<a[r].length;c++ )
		    {
		    	System.out.print(a[r][c]+"  ");
		    }
		    System.out.println();
		}
		
	}

}
