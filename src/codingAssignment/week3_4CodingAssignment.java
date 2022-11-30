package codingAssignment;

public class week3_4CodingAssignment {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 93};
		
		//a. a.	Programmatically subtract the value of the first element in the array from the value in the last
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		System.out.println(ages[ages.length -1] - ages[0]);
		
		//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays
		//of different lengths).
		int[] ages2 = {3, 9, 23, 64, 2, 8, 93, 36};
		System.out.println(ages2[ages2.length -1] - ages2[0]);
		
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the results to the console.
		double total = 0;
		for(int i=0; i < ages.length; i++) {
			total += ages[i];
		}
		System.out.println(total / ages.length);
		
		//2. Create an array  , ring called names that contains the following values: "Sam", "Tommy", "Tim",
		//"Sally", "Buck", "Bob". 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a.Use a loop to iterate through the array and calculate the average number of letters per name.
		//Print the result to the console.
		double sum = 0;
		for(int i=0; i < names.length; i++){
				sum += names[i].length();
}
		System.out.println(sum / names.length);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by
		//spaces, and print the result to the console.
		String group = "";
		for (int i=0; i< names.length; i++) {
			group += names[i] + " " ;
		}
		System.out.println(group);
		
		
		//3. How do you access the last element of any array?
		// .length of the array -1
		
		//4. How do you access the first element of any array?
		// the first element of an array is always [0] so the syntax could be System.out.println(names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names
		//array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i=0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		
		}
		
			
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//Print the result to the console.
		int totalNames = 0;
		for (int x = 0; x < nameLengths.length; x++) {
			totalNames += nameLengths[x];	
		}
		System.out.println(totalNames);
	
		//methods below
		
		String ali = tripleWord("Hello", 3);
		System.out.println(ali);
		
		String firstName = "Ali";
		String lastName = "Budden";
		String fullName = myFullName(firstName, lastName);
				System.out.println(fullName);
				
		int[] numbers = {2, 4, 6, 8, 100};
		System.out.println(sumOfNumbers(numbers));
		
		double[] oneArray = {10, 20, 30, 40};
		System.out.println(average(oneArray));
		
		double[] twoArray = {15, 25, 35, 45};
		System.out.println(totalAverage(oneArray, twoArray));
		
		boolean isHotOutside = true;
		double moneyInPocket = 7;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		int temp = 12;
		boolean snow = true;
		System.out.println(willIBuildASnowman(snow, temp));

	}



//		//7. Write a method that takes a String word, and an int, n, as arguments and returns the word concatenated to itself
//		//n number of times. (i.e. if I pass in "Hello" and 3, I expect the method to return "HelloHelloHello").
		public static String tripleWord(String a, int b) {
		String result = "";
		for(int i = 0; i < b; i++) {
			result += a;
		}
		return result;
		}


		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be
		//the first and the last name as a String separated by a space).
		public static String myFullName(String a, String b) {
			return a + " " + b;
		}
		
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater
		// than 100.
		public static boolean sumOfNumbers(int[] numbers) {
		int total = 0;
		for(int i=0; i < numbers.length; i++) {
			total += numbers[i];
		}
		if (total > 100) {
			return true;
		} else {
			return false;
		}
}
		
		//10. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is
		// greater than the average of the elements in the second array.
		public static double average(double[]oneArray) {
			double total = 0;
			for(double number : oneArray) {
				total += number;
			}
				return total / oneArray.length;
		}
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater
		//than the average of the elements in the second array.
		public static boolean totalAverage(double[] oneArray, double[] twoArray) {
			double sum = 0;
			for(double number : oneArray) {
				sum += number / oneArray.length;
			}
			double total= 0;
			for(double number : twoArray) {
				total += number / twoArray.length;
			}
			if (sum > total) {
			return true;
			} else {
				return false;
			}
		}
		
		//12. Write a method called willBuyDrink that takes a boolean isHoutOutside, and a double moneyInPocket and returns true if it is hot
		// outside and if moneyInPocket is greater than 10.50.
		
		public static boolean willBuyDrink(boolean temp, double money) {
			if(temp == true && money > 10.50) {
				return true;
			} else {
				return false;
			}
		}
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it
		
		public static boolean willIBuildASnowman(boolean snow, int temp) {
			if(temp >=10 && snow == true) {
				return true;
			} else {
				return false;
			}
		}


}
	


