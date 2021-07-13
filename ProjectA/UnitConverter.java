//Importing the scanner
import java.util.Scanner;

public class UnitConverter{
	
	//Main
	public static void main(String [] args){
		//Scanner object
		Scanner s = new Scanner(System.in);
		
		boolean loopMenu = true;
	    while(true){
		//Main Menu
		System.out.println("Please select an option!");
		System.out.println("-------------------------\n");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		System.out.println("Put your choice down here: ");
		
		//Receiving the user's choice
		int option = s.nextInt();
		
		//Switch case to cycle through the different user choices
		switch(option){
			case 1:
			//Convert Cups to Teaspoons
			System.out.println("Enter the number of Cups to convert: ");
			int cups = s.nextInt();
			int tps = cups * 48;
			System.out.println(tps + " Tps");
			break;
			case 2:
			//Convert Miles to Kilometers
			System.out.println("Enter the number of Miles to convert: ");
			double mi = s.nextDouble();
			double km = mi * 1.6;
			System.out.println(km + " km");
			break;
			case 3:
			//Convert US Gallons to Imperial Gallons
			System.out.println("Enter the number of Imperial Gallons to convert: ");
			double usgal = s.nextDouble();
			double imgal = usgal * 0.8;
			System.out.println(imgal + " Imperial gal");
			break;
			case 4:
			System.out.println("Exiting Now...!");
			System.exit(0);
			//Quit
			break;
			default:
			//Invalid Input!
			System.out.println("Invalid Input, Try Again!");
			break;
		}
		}
	}
}