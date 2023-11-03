/*
	Working with a class
	===============
	1. What is class?
	-A class is RDT ,it is user defined data type.

	2.Why is class?
	- It is used for storing multiple value of same type and different type with single name
		as one group.

	3.How is class create?
	-A class is created by using the keyword "class" following by class name.

	4.How to store values in the class?
	-For storing values inside a class we must declare variables ; number of variablesand type of 
		variables depending of the number of values and type of values we need to store.

	5.What is rule for reading values from class?
	-Those values must have memory.
	-The variabled declared inside a class can have multiple copies of memory.

	6. How can we provide memory to the values declared inside a class?
	- By using either static or new keywords.

	7.What are the differences between static and new?
									static																									new

1.			static provides one copy memory.                                   new provides multiple copies of memory
																											as many times as we used new keyword,

2.		we will use static keyword directly in							we do not use new keyword directly in the group
        the variable declaration statement.							variable declaration statement.we will use new keyword
																								  in the logic part wherever we need to access this class variable.

3. we must use static keyword to each variable			we must use new keyword one time common to all variables
     separately.																		with class name as part of logic wherever we need to access those
																								variables.

4. static keyword does not provide group					new keyword provides memory to all non static variables 				
	memory with single name.												available in the class as one group with single name.


8.  Devlop a program create UDDT for storing different type of values provide memory to all variables as one group
       by using new keyword read and display all values available in the class object .
*/
class  Example  //UDDT class
{
	int i1 = 5;
	double d1 = 10.5;
	char c1 = 'a';
	long[] ia = {8,9};
	String s1 = "Hari";
}


class Test09_Class
{
		public static void main(String[] args)
		{
			//System.out.println(i1); // CE: cannot symbol variable i1
			//System.out.println(Example.i1);
			//System.out.println(Example.d1);
	
			 Example e1 = new Example();
				
			System.out.println(e1); //Example@1010
			System.out.println();
			System.out.println(e1.i1); //5
			System.out.println(e1.d1); //10.5
			System.out.println(e1.c1); // a
			System.out.println(e1.ia); //[j@2020
			System.out.println(e1.ia[0]);//8
			System.out.println(e1.ia[1]);//9
			System.out.println(e1.s1);//Hari

		}
}