//Ricardo Rhone May 24, 2019 Java Control Flow - LAB 
 
public class CONFLOW {


	
	public static void main(String[] args) {
		//Use the Math.random() function to create a integer between 1 and 100
				int randOne = (int)(Math.random() * 100);

				System.out.println("randOne = " + randOne);
				
				//Using multiple if statements perform the following:
				
					System.out.println("\nEvaluated using multiple if statements");
					if (randOne > 70) { //If the number is greater than 70 print the string "Big Number"
						System.out.println("  Big Number");
					}
					
					if (randOne < 40) { //If the number is less than 40 print the string "Small Number"
						System.out.println("  Small Number");
					}
					
					if (randOne >= 40 && randOne <= 70) { //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						System.out.println("  Medium Number");
					}
					
			// Write the same tests as above but using an if-else statement	
					System.out.println("\nEvaluated using multiple if-else statements");
					if (randOne > 70) { //If the number is greater than 70 print the string "Big Number"
						System.out.println("  Big Number");
					}else if (randOne < 40) { //If the number is less than 40 print the string "Small Number"
						System.out.println("  Small Number");
					}else if (randOne >= 40 || randOne <= 70) { //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						System.out.println("  Medium Number");
					}

			// Add Nesting 
					//Use multiple if statements and complex conditionals ( that AND that ) to add another level of testing.
					System.out.println("\nEvaluated using complex conditionals and multiple nested if statements");
					if (randOne > 70) {  //If the number is greater than 70 print the string "Big Number" 
						if (randOne > 90) {
						System.out.println("  Really Big Number"); //If greater than 90 print "Really big number"
						}
						if (randOne > 70 && randOne <= 90) {
							System.out.println("  Big Number"); //If the number is greater than 70 print the string "Big Number" 
						} 
					}
					
					if (randOne < 40) { //If the number is less than 40 print the string "Small Number"
						if (randOne < 40 && randOne >= 15) { //If the number is less than 40 print the string "Small Number"
							System.out.println("  Small Number"); //If the number is less than 40 print the string "Small Number"
						}
						if (randOne < 15) {
							System.out.println("  Really Small Number"); // If less than 15 print "Really small number"
						}
					}
					
					if (randOne >= 40 && randOne <= 70) { //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						if (randOne != 50) {
							System.out.println("  Medium Number"); //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						}
						if (randOne == 50) { 
							System.out.println("  Really Average Number");//If equal to 50 print "Really average number" 
						}
					}
					
					//Use if-else statements and complex conditionals ( that AND that ) to add another level of testing.
					System.out.println("\nEvaluated using complex conditionals and nested if-else statements");
					if (randOne > 70) {  //If the number is greater than 70 print the string "Big Number" 
						if (randOne > 90) {
						System.out.println("  Really Big Number"); //If greater than 90 print "Really big number"
						} else if (randOne > 70 && randOne <= 90) {
							System.out.println("  Big Number"); //If the number is greater than 70 print the string "Big Number" 
							} 
					} else if (randOne < 40) { //If the number is less than 40 print the string "Small Number"
						if (randOne < 40 && randOne >= 15) { //If the number is less than 40 print the string "Small Number"
							System.out.println("  Small Number"); //If the number is less than 40 print the string "Small Number"
						} else if (randOne < 15) {
							System.out.println("  Really Small Number"); // If less than 15 print "Really small number"
							}
					} else if (randOne >= 40 && randOne <= 70) { //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						if (randOne != 50) {
							System.out.println("  Medium Number"); //If the number is in between 40 and 70, or equal to 40 or 70, print the string "Medium Number". 
						} else if (randOne == 50) { 
							System.out.println("  Really Average Number");//If equal to 50 print "Really average number" 
							}
					}
				
			// for LOOPS
					// Write a for loop that prints numbers 1-30. 
					System.out.println("\nfor loop that prints out numbers 1-30");
					for (int i = 1; i <= 30; i++) {
						System.out.println(i);
					}
					
					//Write a for loop that prints out the even numbers 1-30.
					System.out.println("\nfor loop that prints out the even numbers 1-30");
					for (int i = 2; i <= 30; i = i + 2) {
						System.out.println(i);
					}
					
					//Write a loop that counts down from 20 to 0.
					System.out.println("\nfor loop that counts down from 20 to 0");
					for (int i = 20; i >= 0; i--) {
						System.out.println(i);
					}
					
					//Type in the following statement and examine the output:
					System.out.println("\nExaming the fact that the for loop can contain multiple statements.");
					for (int x = 1, y = 1; x < 20 && y < 50; x++, y += 4) {  
						System.out.println("X is: " + x + ", y is: " + y); }

					//Declare a very long String of at least 10 words
					System.out.println("\n***Declartion of a very long string of at least 10 words***");
					String str = "This is a very long and completely meaningless string that serves no purpose.";
					System.out.println(str);
					
					//Write a statement using an enhanced for that will print out each character on its own line.
					char[] characters = str.toCharArray(); //converts the string to a character array so the enhanced for loop can be used
								
					for (char character : characters) {
						System.out.println(character);
					}
					
			// PRINTING ALL VOWELS AS UPPER CASE
				//Using an IF statement	
					System.out.println("\nPrinting vowels (a,e,i,o,u,y) to UPPERCASE using if staements");
					for (char character : characters) {
						if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
						char upperCASE = Character.toUpperCase(character);
						System.out.println(upperCASE);
							
						} else {
							System.out.println(character);
						}
					}	
					
					//Using an Switch Statements
					System.out.println("\nPrinting vowels (a,e,i,o,u,y) to UPPERCASE using Switch staements");
					for (char character : characters) {
						switch (character) {
							case 'a':
							case 'e':
							case 'i':
							case 'o':
							case 'u':
							case 'y':
								char upperCASE = Character.toUpperCase(character);
								System.out.println(upperCASE);
								break;
							default:
								System.out.println(character);
						}
					}		
			
			// While LOOP
					/*
					 * Use the premise of the random number between 1 and 100 mentioned earlier in the lab, 
					 * but initialize the value to 0. Write a while loop that will print out the value and 
					 * then generate a new value. The loop should end if either the generated value is 
					 * greater than 85 or the loop has been executed 20 times.

					 */
					System.out.println("\nWhile loop that prints the value and generate a new value, terminates above 85 or at 20 iterations");
					int randTwo = 0; //initializes the random number at 0
					int numberOfLoops = 0; //keeps track of the number of loops
					while (randTwo < 85 || numberOfLoops == 20) {
						System.out.println(randTwo); //prints the value
					 	randTwo = (int)(Math.random() * 100); // generates a new value 
					 	numberOfLoops++; //increments the number of loops
					}
					System.out.println("last random number generated: " + randTwo); //prints the last random number
					System.out.println("Number of iterations of the while loop: " + numberOfLoops); //prints how many times the loop ran
			
			// do While LOOP
					/*
					 * Use the premise of the random number between 1 and 100 again, this time to 
					 * initialize two different variables. Using a do-while loop, calculate and
					 *  print the value of the two numbers multiplied together and exit the loop 
					 *  if the result is more that 1000 or the loop has been executed 30 times.

					 */
					System.out.println("\ndo While loop that prints the value of two numbers multiplied together, terminates above 1000 or at 30 iterations");
					int randThree = 0; //initializes the random number at 0
					int randFour = 0; //initializes the random number at 0
					int multiplied = 0; //initializes a variable to store the 2 random numbers multiplied together 
					int numberOfLoops2 = 0; //keeps track of the number of loops
					do {
						System.out.print("R1: " + randThree + "," + " R2: " + randFour); // prints the two random numbers that were generated
						System.out.println(" => R1 * R2 = " + (int)(randThree * randFour)); //prints the result of the two numbers multiplied together
						randThree = (int)(Math.random() * 100); // generates a new value 
						randFour = (int)(Math.random() * 100); // generates a new value 
						multiplied = randThree * randFour; 
						numberOfLoops2++; //increments the number of loops
					} while(multiplied < 1000 || numberOfLoops2 == 30);
					System.out.println("last random numbers generated: " + "R1: " + randThree + " R2: " + randFour); //prints the last multiple of the 2 random numbers
					System.out.println("last multiple of random numbers generated: " + multiplied); //prints the last multiple of the 2 random numbers
					System.out.println("Number of iterations of the while loop: " + numberOfLoops2); //prints how many times the loop ran
			
			//using break, continue, and return		
					//Write a for loop that prints out the even numbers in 1-30 using the modulus operator and the continue statement .
					System.out.println("\nfor loop that prints out the even numbers 1-30 using Modulus(%) and continue statement");
					for (int i = 0; i <= 30; i++) {
						if (i % 2 == 0 && i != 0) { //checks to see if there is no remember because if a # is divisible by 2 there should be none
							System.out.println(i);
						} else {
							continue;
						}	
					}
					
			/*
			 * Write nested for loops that will print out the sum of the inner loop up to the index 
			 * of the outer loop. For example, the first time through the output should be similar to: 
			 * outer: 1, inner sum: 1, the second time through the output should be outer: 2, inner sum: 3, 
			 * etc. Do this for an outer loop of 1 to 30.		
			 */
				
			//Nested for Loop
					System.out.println("\nNested for loops that will print out the sum of the inner loop up to the index of the outer loop");
					for (int i = 1; i <= 30; i++) { //outer loop
						//starts at 1 and ends at 30 
						System.out.print("Outer loop index position: " + i);
						
						int sumInner = 0; 
						for (int x = 1; x <= i; x++) { //inner loop
									
								sumInner = sumInner + x;
						}
						System.out.println(" | Sum of inner loop: " + sumInner);
					}

			/*
			 * Modify the behavior so that if the inner sum is greater than 350, 
			 * the outer loop will print the index where this threshold was reach 
			 * and then quit without executing any more iterations.
			 */
					
					System.out.println("\nNested for loops that will print out the sum of the inner loop up to the index of the outer loop and quit at 350");
					for (int i = 1; i <= 30; i++) { //outer loop
						//starts at 1 and ends at 30 
						//System.out.println("Outer loop index position: " + i);
						
						int sumInner = 0; 
						for (int x = 1; x <= i; x++) { //inner loop
							sumInner = sumInner + x;		
								
							if (sumInner > 350) {	//breaks the inner loop when inner sum is greater that 350
									break;
								}
						}
						if (sumInner > 350) {	//breaks the outer loop when inner sum is greater that 350
							System.out.println("This was reached at index position: " + i);
							break;
						}
						System.out.println("index position: " + i + " | " + "Sum of inner loop: " + sumInner);
						
					}
					
			/*
			 * Earlier there was a scheme to generate a random number between 1 and 100. 
			 * To generalize this create a function called makeBoundedRandom that 
			 * takes a single integer input and returns an integer. This function should do the follow:
			 * check that the input is greater than 10. If it is less than ten the function should 
			 * alert the caller to an error by producing a result of -1. If the input is greater 
			 * than 10 the function should produce a random integer between 1 and that number.
			 */
					//calling the function that does this
					System.out.println("\nOutput of makeBoundedRandom funtion");
					makeBoundedRandom(4);
					
			//Next write a for loop to generate 20 random numbers with a limit of 1000 and print each one.
					System.out.println("\nfor loop that generates 20 random numbers with a limit of 1000 and print each one");
					for (int i = 1; i <= 20; i++) {						
						int rand = (int)(Math.random() * 1000); // generates a random # with a limit of a 1000
						System.out.println("Random Number " + i + ": " + rand); //prints each random number
					}
					
			//Write a loop that generates random numbers, each with a different range of 50 up to 100 and print out each one.
					System.out.println("\nfor loop that generates 20 random numbers each with a different range of 50 up to 100 and print out each one");
					for (int i = 1; i <= 20; i++) {	
						int rand = 50 + (int)(Math.random() * 51); //Generates a random # between 50 and 100								
						System.out.println("Random Number " + i + ": " + rand); //prints each random number
					} 		
	}

	/*
	 * Earlier there was a scheme to generate a random number between 1 and 100. 
	 * To generalize this create a function called makeBoundedRandom that 
	 * takes a single integer input and returns an integer. This function should do the follow:
	 * check that the input is greater than 10. If it is less than ten the function should 
	 * alert the caller to an error by producing a result of -1. If the input is greater 
	 * than 10 the function should produce a random integer between 1 and that number.
	 */
	
	public static int makeBoundedRandom(int input) {
		
		if (input > 10) {
			System.out.println("Error, input is less than 10");
			return -1;
		} else {
			int rand = 1 + (int)(Math.random() * (input + 1)); //Generates a random # between 1 and input	
			System.out.println("Random Interger between 1 and 20: " + rand);
		}
		return 0;
		
	}
	
	
}
