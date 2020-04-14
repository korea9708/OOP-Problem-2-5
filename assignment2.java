
public class assignment2 {

	public static void main(String[] args) {
		String[] myStrings = {"Youngjun", "Kim", "Blue", "Long Time", "Kimchi"}; //Set an array strings
		int me=myStrings.length; //transfer the set of numbers of strings from strings to int, and declare it as "me"
		for(int i=0; i<me; i++) 
			/*using a for loop, use increment i++.
		Set the initial value of i to 0, make it less than the length of the strings for no errors.
			 */
		{
			System.out.println(myStrings[i]); /* it will print the string where it is placed at 
			the location of i, so it will start from where myStrings[0] which is "Youngjun", and move on to
			the next step.
			*/
	}
		//once the for loop is done where the int value of i is bigger than "me (4)", the process moves to the next line
		System.out.println(); //add a space for orginized print out
	 int i=0; //set initial value of i as 0 for a new while loop
	 while(i<me) //value i must not exeed the number of the strings
	 {System.out.println(myStrings[i]); // print the string at its place
	 i++; //increment the value of i by 1
	}
	 //while loop terminates once the value of i is bigger than 4
	 System.out.println(); //add a line for an organized printout
	 int x=0; /*initialize and declare a new variable for a new loop. 
	 The variable will be used to locate the strings
	 */
	 do { //a new "do" loop
		 System.out.println(myStrings[x]); //print the string where it is placed at the value of x
		 x++; //increment the x value by 1
	 }while(x<me); //use a while statement to stop the loop once the x value exeeds the length of the strings.
	 
	}}
	