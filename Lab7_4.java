import javax.swing.*;
import java.lang.*;

/*
	This program determines if the entered number is a prime number.
*/

public class Lab7_4{
	public static void main(String[] args){
		String userNumber;
		int userNum = 0;
		int x = 1;
		boolean prime = false;

		while(userNum != -999){
			userNumber = JOptionPane.showInputDialog("Enter a positive integer (-999 to terminate):");

			if(userNum == -999){
				System.out.println("Terminating the loop. Goodbye");
			} else{
				userNum = Integer.parseInt(userNumber);

				if(userNum < 1){
					System.out.println("Invalid entry. Oops.");
				} else if(userNum == 2){
					System.out.println("PRime!");
				} else {
					while(x <= userNum / 2){
						if(userNum % x == 0){
							JOptionPane.showMessageDialog(null, userNum, "TITLE", 1);
						}
						x++;
					}
				}
			}
		}
	}
}
