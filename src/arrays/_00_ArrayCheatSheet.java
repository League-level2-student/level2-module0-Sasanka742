package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int smallest;
	static int largest;
	public static void main(String[] args) {
	//1. make an array of 5 Strings
		
		String[] list = {"first","sec","third","fourth", "fifth"};
		
	//2. print the third element in the array
		System.out.println(list[2]);
		
	//3. set the third element to a different value
		list[2]="word";
	//4. print the third element again
		System.out.println(list[2]);
	//5. use a for loop to print all the values in the array
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
	//6. make an array of 50 integers
		int[] integers = new int[50];
 	//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<integers.length;i++) {
			integers[i] = new Random().nextInt(50);
		}
	//8. without printing the entire array, print only the smallest number in the array
		for(int i=0;i<integers.length;i++) {
			int temp = integers[i];
			if(i<=48) {
				if(integers[i]<integers[i+1]) {
					if(temp<integers[i+1]) {
					 temp = integers[i];
					}
				}else {
					temp = integers[i+1];
				}
				smallest = temp;
			}
		
		}
		System.out.println(smallest);
	//9 print the entire array to see if step 8 was correct
		for(int i=0;i<integers.length;i++) {
			System.out.print(integers[i]+",");
		}
	//10. print the largest number in the array.
		for(int i=0;i<integers.length;i++) {
			if(i<49) {
				if(integers[i]>integers[i+1]) {
					 largest = integers[i];
				}
			}
		}
		System.out.println("");
		System.out.println(largest);
	}
}
