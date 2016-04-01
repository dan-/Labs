import java.io.*;
import java.util.Scanner;

public class Lab7_1 {

public static void main(String[] args) throws IOException{
		int i;
		int x = 0;
		int y = 0;
		int total = 0;

		// Open inputFile.txt and store int in userNum.
		File infile = new File("inputFile.txt");
		Scanner inputFile = new Scanner(infile);

		i = inputFile.nextInt();

		// Open outputFile.txt
		FileWriter outFile = new FileWriter("outputFile.txt");
		PrintWriter outputFile = new PrintWriter(outFile);

		outputFile.println("The number entered is " + i + ".");

		// Check if number is negative.
		if(i < 0){
			i *= -1;
		}

		// Reverse the number.
		while(i != 0){
			x = i % 10;
			i = i / 10;
			y = y * 10 + x;
		}

		// Write the numbers and add the total.
		while(y != 0){
			i = y % 10;
			y = y / 10;
			outputFile.print(i + " ");

			total += i;
		}

		// Write the total.
		outputFile.println("the numbers added equal " + total + ".");

		inputFile.close();
		outputFile.close();
	}
}
