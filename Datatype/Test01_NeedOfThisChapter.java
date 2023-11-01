/*
01. Need of this chapter
				- In  this  chapter we will learn data type and types of data types available in java 
				for creating variable and object type memory for storing single value and multiple values
				of same type and different type

				- A variable is a memory,it is a single value memory
				- An object is also a memory ,but it is a multiple values memory

				- In a program we can not store /mention a value directly ,
					it leads to CE: not a statement,because it won't perform any operation

				-For storing a value,
								-First of all we must create this variable or an object by using a data type
								-then we must access it for storing value or object

				Below program explains need of this chapter 
				means creating a variable for storing value
		*/
class  Test01_NeedOfThisChapter
{
	public static void main(String[] args) 
	{
		//10  CE: ; expected
		//10; CE: not a statement
		//i1 = 10;  CE:not a symbol     //accessing variable i1 for storing the value 10 
																//CE : cannot find symbol variable i1 
																//beacause we have not created variable i1 yet
																//first of all we must create that variable 
																//by using data type based on the type of value 
																//we want to store
		int i1;								//it is a variable creation statement 
													//with the name i1 of type int for storing integer type value
		i1 = 10;								//this statement stores value 10 in the variable i1
														//now we won't get CE: because the variable i1 is created
		System.out.println(i1);		//o/p: 10
	}
}
