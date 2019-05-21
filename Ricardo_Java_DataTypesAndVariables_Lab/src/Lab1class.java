
// Ricardo Rhone May 20, 2019 | Java Data Types and Variables - LAB

public class Lab1class {
	//Create a string variable that represents a template to print an integer.
	public static void template(int integer) {System.out.println("\nprint int: " + integer);}; 
	
	
//Declare two variables in the class 
static int methodCount = 2;
static String className = "Java Bootcamp";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start with a very basic class with main() method and Hello World! 
		System.out.println("Hello World!");
		
		//Write two statements to print out the value of each variable
		System.out.println("\nmethodCount: " + methodCount);
		System.out.println("\nclassName: " + className);
		
		//declare an integer variable inside of the main() method named mainInt
		 int mainInt = 10; 
		 System.out.println("\nmainInt: " + mainInt);
		
		//Using the add-assignment operator, add the value of mainInt to methodCount 
		//and print the value of methodCount to ensure the value is correct
		methodCount = methodCount + mainInt; 
		System.out.println("\nmethodCount + mainInt: " + methodCount);
		
		//Declare a floating point variable inside of the main method and initialize its value to 845.4f
		float mainFloat = 845.4f;
		int floatToInt = (int) mainFloat;
		System.out.println("\nmainFloat: " + mainFloat + ", Cast to Int: " + floatToInt);
		
		//declare a couple of integer variables with initial values. 
		//Add them together and place the result in a third variable. Then print that value.
		int x = 5;
		int y = 10;
		int intVar3 = x + y; 
		System.out.println("\nintVar3 = x + y: " + intVar3);
		
		//Declare another variable with an initial value. Construct three different statements
		int z = 20;
		System.out.println("\nx = " + x + ", y = " + y + ", z = " + z);
		
		System.out.print("\nx + y * z = "); 
		System.out.println(x + y * z);
		
		System.out.print("\n(x + y) * z = ");
		System.out.println((x + y) * z);
		
		System.out.print("\nx + (y * z) = ");
		System.out.println(x + (y * z));
		
		//Using the add-assignment operator, increment the value of x by 15 and print that value.
		x = x + 15;
		System.out.println("\nx = x + 15: " + x);
		
		//Increment the value of x by the value of y and print that value.
		x = x + y;
		System.out.println("\nx = x + y: " + x);
		
		// type in the following and then print the value. z += (x*2)-6;
		z += (x*2)-6;
		System.out.println("\nz += (x*2)-6: " + z);
		
		//Reuse the previous int values and declare them as follows x = y = 13; z = 15;
		x = y = 13;
		z = 15;
		System.out.println("\nx = " + x + ", y = " + y + ", z = " + z);
		
		
		//Print the value of the following expressions:
		System.out.print("\nx == y: ");
		System.out.println(x == y);
		
		System.out.print("\nx <= y: ");
		System.out.println(x <= y);
		
		System.out.print("\nx != y: ");
		System.out.println(x != y);
		
		System.out.print("\nx > y: ");
		System.out.println(x > y);
		
		System.out.print("\nz < (x + y): ");
		System.out.println(z < (x + y));
		
		System.out.print("\nz > (x + 2): ");
		System.out.println(z > (x + 2));
		
		
		//For binary operators, write the statements that will 
		//verify the first 6 lines of the table on binary operations.
		int b1 = 50; //binary 0011 0010
		int b2 = 19; //binary 0001 0011
		
		int b3 = b1 & b2; //bitwise AND
		System.out.println("\n50 AND 19 is: " + b3); 
	
		b3 = b1 | b2; //bitwise OR
		System.out.println("\n50 OR 19 is: " + b3); 
		
		b3 = b1 ^ b2; //bitwise XOR
		System.out.println("\n50 XOR 19 is: " + b3); 
		
		b3 = ~b1; //bitwise COMPLEMENT
		System.out.println("\n50 COMPLEMENT is: " + b3); //HELP
		
		b3 = b2 << 2; //bitwise shift left
		System.out.println("\n19 bitwise shift left is: " + b3);
		
		b3 = b2 >> 2; //bitwise shift right
		System.out.println("\n19 bitwise shift right is: " + b3);
		
		//For the right shift carry and non-carry operators, type in the following and note the output:
		b3 = b2>>>2;
		System.out.println("\n19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);

		b3 = (~b1)>>2;
		System.out.println("\n50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);

		b3 = (~b1)>>>2;
		System.out.println("\n50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
		
		//STRINGS
		//Declare three string variables, firstName , lastName , middle and initialize them with the appropriate values
		String firstName = "Ricardo"; //one directly with a literal string
		String lastName = new String("Rhone"); //one with the new operator
		String middle = "Antonio";
		middle = "Java"; //one with assigning a value after initialization
		
		// Print out each variable to ensure that the values are correct.
		System.out.println("\nfirstName: " + firstName);
		System.out.println("\nlastName: " + lastName);
		System.out.println("\nmiddle: " + middle);
		
		//Create a string called fullName that will be made from concatenating the previous three values. 
		String fullName = firstName.concat(" ").concat(middle) + " " + lastName;
		System.out.println("\nFull Name is: " + fullName);
		
		//Create three strings with the values of "James", "James" and james
		String Str1 = "James";
		String Str2 = "James";
		String Str3 = "james";
		System.out.println("\nStr1 = " + Str1 + ", Str2 = " + Str2 + ", Str3 = " + Str3);
		System.out.print("\nStr1 == Str2: "); //Are the first two equal if you use the "==" operator?
		System.out.println(Str1 == Str2);
		System.out.print("\nStr1.equals(Str2): "); //Are the first two equal if you use the equals() method?
		System.out.println(Str1.equals(Str2));
		System.out.print("\nStr1.equals(Str3): "); //What about the first and third if you use the equals() method?
		System.out.println(Str1.equals(Str3));
		System.out.print("\nStr1.equals(Str3) Ignore Case: "); //How can you compare them and ignore the case?
		System.out.println(Str1.equalsIgnoreCase(Str3) + "\n");
		
		//Create a string with a full sentence of a least ten words. 
		//Using that string and any resultant variables carry out the following operations:
		String stringSentence = "However, since primitive types most commonly exist in two places, \r\n" 
				+ "class variables and method variables, it maybe necessary to use certain aspects \r\n"
				+ "of classes during this lab.";
		System.out.println(stringSentence);
		
		//Check to see if the sentence contains the word 'and'.
		System.out.print("\nDoes stringSentence contain 'and': "); //What about the first and third if you use the equals() method?
		System.out.println(stringSentence.contains("and"));
		
		//Declare a char variable and put the 16th letter in it.
		char charVar = stringSentence.charAt(16);
		System.out.println("\n16th letter of the sentence: " + charVar);
		
		//Declare an int variable and find the first instance of the letter 'u'.
		int firstInstofU = stringSentence.indexOf('u', 0);
		System.out.println("\nFirst instance of the letter 'u': " + firstInstofU);
		
		//Declare an int variable and find the last instance of the letter 'c'.
		int lastInstofC = stringSentence.lastIndexOf('c');
		System.out.println("\nLast instance of the letter 'c': " + lastInstofC);
		
		//Declare in int and find the total length of the string.
		int totalLength = stringSentence.length();
		System.out.println("\nTotal length of the string: " + totalLength);
				
		//Does the sentence start with the word "The"?
		boolean startWithThe = stringSentence.startsWith("The");
		System.out.println("\nDoes the sentence start with the word 'The'?: " + startWithThe);
		
		//Create a string variable that represents a template to print an integer. 
		//Now use that template and an integer to print the template with the values of 22, 89, and 93.
		template(22);
		template(89);
		template(93);
		
		//Wrappers
		//Declare an integer wrapper object and initialize it with the value of 42. 
		Integer intWrapper = 42;
		System.out.println("\nInteger wrapper object initialized with the value of 42: " + intWrapper);
		
		// Declare another wrapper object and initialize it from the literal "88"
		Integer intWrapper2 = Integer.parseInt("88");
		System.out.println("\nAnother wrapper object and initialize it from the literal \"88\": " + intWrapper2);
		
		//Finally, to wrap things up and combine a wrapper class with a string substitution (and to prove out
		//some of the earlier statements), enter the following three lines and examine the output:
		b3 = b2>>2;
		System.out.println("\n19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
		
		b3 = (~b1)>>2;
		System.out.println("\n50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
		
		b3 = (~b1)>>>2;
		System.out.println("\n50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
		System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
		
		
	}

}
