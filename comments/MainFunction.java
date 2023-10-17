/** Devlop a program which shows usage 3 comments */
/** This class is used to add two numbers
	Author : vanshika Ghodake
	client : Nareshit
	Date  : 17/10/2023
*/

class Addition{
	/** this function will add two fixed values and displays result */

	/*static void add(){
		int a = 10;
		int b = 20;
		int c ;
		c = a + b;
		System.out.println(c);
		}*/

	/** this function will add two passed values and displays result*/

	static void add(int a,int b){
		int c = a + b;
		//c = a + b;
		System.out.println("addition of" +a+ "and" +b+ "is" +c);
		}
	}
class MainFunction{
	public static void main(String[] args){
		System.out.println("main start");
		//add();
		Addition.add(10,20);
		System.out.println("main end"); 
	}
}
		