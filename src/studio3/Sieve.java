package studio3;

import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the upper limit number of sieve of Eratosthenes");
		int n = in.nextInt();
	//create the list of numbers
		int[] all_numbers = new int[n-1];
		for (int i = 0; i <= n-2; i++) {
			all_numbers[i] = i + 2;
		}
		int num = 2;
	//a big while loop to loop all iterations of the sieve
		for (int i = 0; i <= n-2; i++) {
			num = all_numbers[i];
			// find first number that is not zero
			if (num == 0)
				continue;	
			//find all multiples of num and turn in to zero
			int diff_index = num-0;
			for (int a = i+diff_index; a <= n-2; a = a + diff_index) 
					all_numbers[a] = 0;
			
		}
		for (int item : all_numbers) {
			if (item != 0)
				System.out.println(item);
		}
		
		
			
		

	}

}
