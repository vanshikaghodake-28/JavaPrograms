/*
02. What is a data type?
		 - A keyword or a class name that is used for creating a variable or an 
		 object is called as data type.

03. Why data type?
		-Data type is used to give information to the compiler and JVM for creating 
		variable and object memory

		-A datatype given 5 detail to compiler and JVM
				1. Type of the memory  (Integer ,Floating-point,Character,Boolean,String)
				2. Size of the memory   (1/2/4/8 bytes memory)
				3. Type of the value can be stored (integer ,fp,char,boolean,string)and
						range of the value(1digit,2digit,3digit...)
				4.  different opertor allowed to apply on this variable
				5. the type of the result comes to out from an expression,
				     when we use this variable as an operend

		-which ever keyword given above information that keyword is called data type
					for example :
						-int,double,char,boolean etc ...are data type keyword 
						-class, static,new etc...are not data type keywords

04. Types of data types?
				-Java supports two types of data types 
							1 PDT
							2 RDT
				-PDT for creating variable for storing one mathematical value 
				-RDT is for creating object for storing multiple values
				-PDT 
							-Integer    ->byte,short,int,long ->for storing integers
							-Floating-point   ->float,double  ->for storing fp values
							-Character       -> char				->for storing character
							-Boolean			->boolean			->for storing boolean value
				-RDT
						-Array ->for storing multiple value of same type
						-class ->for storing multiple value of different type

			//by default all integer values are of  -> int type
			//by default all floating-point values are of ->double type
			//by default all character placed in '  ' are of character type
			// by default true and false are of boolean type

	//below program explains creating diff type of variable for storing diff type of values
*/
class  Test02_WhatAndWhyDt
{
	public static void main(String[] args) 
	{
		//10;
		//10.5;
		//'a';
		//true;

		int i1 =10;				//i1 var with 4 bytes
		double d1 = 10.5; //d1 var with 8 bytes
		char c1 = 'a';			//c1 var with 2 bytes
		boolean bo1 = true; // bo1 var with 1bit and 1 byte memory

		System.out.println("i1: "+i1);
		System.out.println("d1: "+d1);
		System.out.println("c1: "+c1);
		System.out.println("bo1: "+bo1);
	}
}
