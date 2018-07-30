/*Code Challenge 2: Maps*
Create Map with String keys and Integer values.
Write a method that will increment the value at a given key or,
if there is no value at that key yet, set it to 1. 
Call this method for these keys: “A”, “B”, “A”, “C”, “B”, “B”.
Then print the map (just use sysout(leMap).
Bonus: Allow user to input keys in a loop until they do not want to continue.
*/
package codechallenge2Day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeChallenge2 {
	public static void main(String[] args) {
		Map<String, Integer> keyValues = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		String newKey = "", choice="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Please enter an uppercase alphabet: ");
			newKey=sc.next().toUpperCase();
			if(keyValues.containsKey(newKey)) {
				keyValues.put(newKey, keyValues.get(newKey)+1);
			} else {
				keyValues.put(newKey, 1);
			}
			System.out.print("Enter key again? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nContents of the Hash Map:");
		System.out.println(keyValues);
		System.out.println("Thank you!");
		sc.close();
	}

}
