/*
	Working with an array object
	=====================
	1. What is an array?
				-An array is a refrenced data type,it is an object.
				-An array is a collection of multiple variables of same type in continuation memory locations.
	2.why an array?
				
				-It is used for storing multiple values or objects of similar type as one group with single name.
	
	3.how can we create an Array?
				
				-Array is created by using data type either PDT or RDT.
				
				-For storing mathmatical values we must create array using PDT.
				-For storing objects we must create array by using RDT.
	
	4.Syntax  for creating an Array?
				-creating an array means creating array variable and array object
							
								DT varName = {v1,v1,v3,...};
								PDT varName = {v1,v2,v3,...};
								RDT varName = {O1,O2,O3,...};

					-creating an array for storing 5 integers
								
								int[] ia = {5,6,7,8,9};
    5. Compiler and JVM activities w.r.t an array creation?
					
					1. compiler verifies syntax
								1. DT valid or not
								2. varName valid or not  
								3. Array object creation syntax valid or not
								4. Values are valid or not

					2. JVM allocate memory
								1.To array variable and
								2 To array object with locations with given values
								3. stores array object refrence in array variable

10. Sample Program
			Below program to show 
					1. creating array variable
					2. creating array object
					3. storing array object in array variable
					4. reading and printing array object values in three ways
					5. also show the exception ArrayIndexOutOfBoundsException
*/
class  Test07_WorkingwithArray
{
	public static void main(String[] args) 
	{
		int[] ia = {5,6,7,8,9};
	//	System.out.println(ia);
	/*	System.out.println(ia[0]);				//this sopln() statements based code is static nature ,nature means 
		System.out.println(ia[1]);				//we must modify  logic every time when we change in array object
		System.out.println(ia[2]);				//Solution: we must write dynamic code
		System.out.println(ia[3]);
		System.out.println(ia[4]);
*/
		//by using for loop

		for(int i=0;i<ia.length;i++)
	{
			System.out.println(ia[i]);
	}
		System.out.println();

		System.out.println(java.util.Arrays.toString(ia));  //predefined method
		
	}
}