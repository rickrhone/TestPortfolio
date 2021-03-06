//Ricardo Rhone May 24, 2019 Control Flow Addition Lab.  

import java.util.Scanner;

public class CONFLOWADD {

	public static void main(String[] args) {
		
		//### Lab Step #1 (if statements)
				System.out.println("********** STEP#1 IF STATEMENTS **********");
				
				// scanner reads input from the command line through various methods
			    Scanner scanner = new Scanner(System.in);
			  
			    // prompt and read a string
			    System.out.print("Enter your name: ");
			    String username = scanner.next();
			  
			    // prompt and read an int
			    System.out.print("Enter your age: ");
			    int age = scanner.nextInt();
			  
			    System.out.println(String.format("Hello %s, your age is %d", username, age));

			    //SERIES OF IF STATEMENTS
			    
			    //if 16 or older, print "You are old enough to drive" & the negative of that
			    if(age >= 16) { 
			    	System.out.println("You are old enough to drive");
			    } else {
			    	System.out.println("You are NOT allowed to drive");
			    }
			    
			    //if 18 or older, print "You are old enough to vote" & the negative of that
			    if(age >= 18) { 
			    	System.out.println("You are old enough to vote");
			    } else {
			    	System.out.println("You are NOT allowed to vote");
			    }
			    
			    //if 21 or older, print "You are old enough to drink" & the negative of that
			    if(age >= 21) { 
			    	System.out.println("You are old enough to drink");
			    } else {
			    	System.out.println("You are NOT allowed drink");
			    }
			    
			    //if 35 or older, print "You are old enough to be President" & the negative of that
			    if(age >= 35) { 
			    	System.out.println("You are old enough to be President");
			    } else {
			    	System.out.println("You are NOT allowed to be president");
			    }
			    
			    //if 55 or older, print "You can join AARP" & the negative of that
			    if(age >= 55 ) { 
			    	System.out.println("You can join AARP");
			    } else {
			    	System.out.println("You are NOT allowed to join AARP");
			    }
			    
			    //if 67 or older, print "You can starting drawing Social Security" & the negative of that
			    if(age >= 67) { 
			    	System.out.println("You can starting drawing Social Security");
			    } else {
			    	System.out.println("You are NOT allowed to start drawing Social Security");
			    }
			
				//### Lab Step #2 (switch statements)  
			    
			    /*
			     * To the statements above add more questions:
		    	- Prompt the user to enter 'E', 'U', or 'S' for employment status - employed, unemployed, or student.
		    	- Do you have a car, truck, suv, or do not own a vehicle? (make up your own one letter responses for this).

			     * Using `switch` statements, print out a sentence for each of the choices above - 
			     * such as "You are employed" and "You own an SUV".
			     */
				System.out.println("\n********** STEP#2 SWITCH STATEMENTS **********");    
				
				// prompt and read a string
			    System.out.print("Enter your employment status ('E' - employed, 'U' - unemployed, 'S' - student): ");
			    String employmentStatus = scanner.next();
			  
				// prompt and read a string
			    System.out.print("Enter your vehicle type ('C' - car, 'T' - truck, 'S' - suv: ");
			    String vehicleType = scanner.next();
			  
			    switch (employmentStatus) {
			    
			    case "E":
			    	System.out.print("Your are employed");
			    	break;
			    case "U":
			    	System.out.print("Your are unemployed");
			    	break;
			    case "S":
			    	System.out.print("Your are a student");
			    	break;
			    }
			    
			    switch (vehicleType) {
			    
			    case "C":
			    	System.out.println(" and you own a car");
			    	break;
			    case "T":
			    	System.out.println(" and you own a truck");
			    	break;
			    case "S":
			    	System.out.println(" and you own a suv");
			    	break;
			    }
		
	  //### Addl Lab Step #3 (for loops) 
	    
	    /*
	     * ### Addl Lab Step #3 (for loops)
	     * declare an integer array with 30 elements
    	- `int[] myArray = new int[30];` 
    
	     * with a `for` loop, initialize the array with the same number as the index. [0] = 0, [1] = 1, etc.
	     * print out the contents of each element of the array using an enhanced `for`

	     * with a `for` loop, reassign the elements of the array with the even numbers up to 60.
	     * print out the contents of each element of the array using an enhanced `for`
	     * print the contents of the array in reverse order.
	     */
	    System.out.println("\n********** STEP#3 FOR LOOPS **********");
	   
	    System.out.println("\nInteger array with 30 elements");
	    //declare an integer array with 30 elements
	    int[] myArray = new int[30];
	    
	    //with a `for` loop, initialize the array with the same number as the index
	    for (int i = 0; i < myArray.length; i++) {
	    	myArray[i] = i; 
	    }
	    
	    //print out the contents of each element of the array using an enhanced `for`
	    for (int item : myArray) {
	    	System.out.println(item);
	    }
	    
	  //with a `for` loop, reassign the elements of the array with the even numbers up to 60.
	    
	    System.out.println("\nInteger array with 30 elements - Even numbers up to 60");
	    int x = 0;
	    for (int j = 0; j < myArray.length; j++) {
	    	myArray[j] = x + 2; 
	    	x = x + 2; 
	    }
	    
	    //print out the contents of each element of the array using an enhanced `for`
	    System.out.println("Prints the contents of the array using an enhanced 'for' loop");
	    for (int item : myArray) {
	    	System.out.println(item);
	    }
	    
	    //print the contents of the array in reverse order.
	    System.out.println("\nPrints the contents of the array in reverse order");
	    for (int j = myArray.length-1; j >= 0; j--) {
	    	System.out.println(myArray[j]);
	    }
	    
	//### Addl Lab Step #4 (while loops)      
	    /*
	     * ### Addl Lab Step #4 (while loops)  
	     * write the last two statements from the previous step - forward enhanced for and reverse order, using `while` loops.
	     * Redo the `main()` method shown in step 1, but surround it with a do-while loop.  The last statement in the loop should be a question - "Do you want to answer the questions again?"  Use the input to either do the loop again or quit.  why is a do-while more appropriate than a while?
	     */
	    
	    System.out.println("\n********** STEP#4 WHILE LOOPS **********"); 
	    
	    //write the last two statements from the previous step - forward enhanced for and reverse order, using `while` loops.
	   
	    //print out the contents of each element of the array using an while loop
	    System.out.println("\nPrints the contents of the array using an while loop");
	    int count = 0;
	    while (count < myArray.length) {
	    	System.out.println(myArray[count]);
	    	count++;
	    }
	    
	    //print the contents of the array in reverse order using an while loop
	    System.out.println("\nPrint the contents of the array in reverse order using a while loop");
	    int count2 = myArray.length-1;
	    while (count2 >= 0) {
	    	System.out.println(myArray[count2]);
	    	count2--;
	    }
	    
	//Redo the `main()` method shown in step 1, but surround it with a do-while loop.  
	//The last statement in the loop should be a question - "Do you want to answer the questions again?"  
	//Use the input to either do the loop again or quit.  why is a do-while more appropriate than a while?
	    
		System.out.println("\nRedo Step 1 but surrounded by a do-while");
		String again;
		do {
			// scanner reads input from the command line through various methods
		    scanner = new Scanner(System.in);
		  
		    // prompt and read a string
		    System.out.print("Enter your name: ");
		    username = scanner.next();
		  
		    // prompt and read an int
		    System.out.print("Enter your age: ");
		    age = scanner.nextInt();
		    
		    System.out.println(String.format("Hello %s, your age is %d", username, age));
		    
		    // prompt and read a string
		    System.out.print("Do you want to answer the questions again (Y or N)?: ");
		    again = scanner.next();
		  
		} while(!again.equals("N")); //Terminates when capital N is entered 
		
//### Addl Lab Step #5 (branching)  
		
	  /*
	   * ### Addl Lab Step #5 (branching)  
		break, continue, return
		* create a void method that takes an integer as an argument.
		* in the method, loop through the array created in step 3.  Perform the following
		    - if the number is even, print it.
		    - if the number is odd, skip it.
		    - if the number is equal to the number passed in the method, quit processing.

		* run some tests to make sure the methods performs as expected.
		* Now change the method signature to return an int.
		* change the method as follows:
		    - if the number is odd, print it.
		    - if the number is even, add it to a running total of even numbers.
		    - if the number is equal to the number passed in the method, return the running total sum from the method.
		
		* run some tests, including printing out the return value from the method.
	   */
		System.out.println("\n********** STEP#5 BRANCHING **********");     
		System.out.println("\nVOID Method that prints the even #'s in the array, skips the odd #'s, and terminate at the input number"); 
		method1(15); // calling the method
		
		System.out.println("\nMethod that prints the odd #'s in the array, adds the even #'s to running total of even #'s, returns the running sum up to the input #"); 
		method2(15); // calling the method
		
	    
	}
	

//METHOD1 CREATION	
	/*
	 * create a void method that takes an integer as an argument.
	 * in the method, loop through the array created in step 3.  Perform the following
	    - if the number is even, print it.
	    - if the number is odd, skip it.
	    - if the number is equal to the number passed in the method, quit processing.
	 */

	public static void method1(int input) {
	    //declare an integer array with 30 elements
	    int[] myArray = new int[30];
	    
	    //with a `for` loop, initialize the array with the same number as the index
	    for (int i = 0; i < myArray.length; i++) {
	    	myArray[i] = i; 
	    }
	    
	    //loop through the array 
	    for (int item: myArray) { 
	    	if (item != 0 && item % 2 == 0 && item != input) { //if the number is even, print it.
	    		System.out.println(item);
	    	} else if (item == input) { // if the number is equal to the number passed in the method, quit processing
	    		break;
	    	} else {
	    		continue; //if the number is odd, skip it.
	    	}
	    }
	}
	
//METHOD2 CREATION		
	/*
	 * Now change the method signature to return an int.
	   change the method as follows:
		    - if the number is odd, print it.
		    - if the number is even, add it to a running total of even numbers.
		    - if the number is equal to the number passed in the method, return the running total sum from the method.
		
		run some tests, including printing out the return value from the method.
	 */
	
	public static int method2(int input) {
	    //declare an integer array with 30 elements
	    int[] myArray = new int[30];
	    
	    //with a `for` loop, initialize the array with the same number as the index
	    for (int i = 0; i < myArray.length; i++) {
	    	myArray[i] = i; 
	    }
	    
	    //loop through the array 
	    int evenTotal = 0;
	    int runningTotal = 0;
	    for (int item: myArray) { 
	    	 
	    	 
	     	if(item != 0) {
	     		runningTotal = runningTotal + item;
	     		System.out.println("\nValue of item: " + item);
		    }
	    	 
	    	if (item != 0 && item % 2 != 0 && item != input) { //if the number is odd, print it.
	    		System.out.println("This is an odd item: " + item);
	    	} else if (item % 2 == 0 && item != 0 && item != input) { // if the number is even, add it to a running total of even numbers.
	    		System.out.println("This is an even item: " + item);
	    		evenTotal = evenTotal + item;
	    		System.out.println("Running Total of Even Numbers: " + evenTotal);
	    	} else if (item == input) { //if the number is equal to the number passed in the method, return the running total sum from the method.
	    		break; //breaks and returns running total
	    	}
	    
	    }
	    System.out.println("Running Total of all numbers in the method: " + runningTotal);
		return runningTotal;
	
	    
	
	}	
}
