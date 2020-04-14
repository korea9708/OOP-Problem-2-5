import java.util.ArrayList; //set up for an arraylist oriented program//
import java.util.Scanner; //set up for the scanner oriented program//

public class assignment4 {
//Youngjun Kim's Work//
	public static void main(String[] args) {

		ArrayList<Integer> all = new ArrayList<Integer>(); //set an arraylist for all input numbers.
		ArrayList<Integer> even = new ArrayList<Integer>();//set an arraylist for ONLY even numbers.
        ArrayList<Integer> odd = new ArrayList<Integer>();//set an arraylist for ONLY odd numbers.
        ArrayList<Integer> reverse = new ArrayList<Integer>();//set an array for reverse of all input numbers in order.
        ArrayList<Double> squareRoot = new ArrayList<Double>();//set an array for square roots which include decimals so use double.
        ArrayList<Double> square = new ArrayList<Double>();//set an array for square numbers, use double as .pow method only accepts double-values.
        int[]number=new int[5]; //set the length of the array by 5 as there are only 5 numbers of inputs in total.
        double[]digits=new double [5];// same reason for the above, but for double-values
 
        Scanner input = new Scanner (System.in); //set up the scanner for inputs, so i can declare values later.//

        System.out.print("Enter Your List of Five Numbers:" );//user interface

        for(int i=0;i<number.length;i++) /* For loop that run through 4 out of 5 aspects of homework,
         								what is worse than a long, and complicated code?*/
        {
            number[i]=input.nextInt(); //read the entered input.//
            all.add(number[i]); // save the input in the "all" array.//
            
            digits[i]= Math.sqrt(number[i]); //square root the value
            squareRoot.add(digits[i]); /* save the square rooted 
            							value at the squareRoot arraylist.*/
           
            digits[i]=Math.pow(number[i], 2); //square the input value
            square.add( digits[i]); // save the value at the arraylist "square"//
            
            
            if(number[i]%2==0) //process the input value if it is even. //
            
            {
                even.add(number[i]);  // it is even, store it at the arraylist "even". //
                
            }
            
            else if (number[i]%2==1) //process the input value if it is odd. //
            {
                odd.add(number[i]); //it is odd, store the data at the arraylist "odd".//
               
            }
            
        }
        
        for(int i=all.size()-1;i>=0;i--) /*another loop for setting the input values 
        								in a revsered order */
        {
        
           reverse.add(number[i]); //ONE AT A TIME, store the reversed value at the arraylist "reverse".//


        }


   
        
        System.out.println(even); // print out the even arraylist//
        System.out.println(odd); // print out the odd arraylist//
        System.out.println(reverse); // print out the reverse arraylist//
        System.out.println(squareRoot); //print out the square root arraylist//
        System.out.println(all); // print out the all arraylist//
        System.out.println(square); // print out the square arraylist//
        System.out.println("you have finished the program");//notify the users//
        
        input.close();// close the scanner//
       
}
}

