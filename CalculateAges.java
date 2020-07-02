import java.util.Scanner;

public class CalculateAges{

public static void main(String[] args){

int current_year = 0;
int[] age = new int[4];
Scanner sc = new Scanner(System.in);

	System.out.println("What is the current year? :");
	current_year = sc.nextInt();

	for (int i=0; i<4; i++){

		System.out.println("What is the age of the "+(i+1)+" participant? :");
		age[i]=sc.nextInt();}
		
	for (int i=0; i<4; i++){
		
		int x = age[i] + (2040 - current_year); // Calculates users age in 2040
		int y = age[i] - (current_year - 1960); // Calculates users age in 1960

                        if (y < 0){ // Check if user was born in 1960
				System.out.println("Participant "+(i+1)+" wasn't born in 1960 and will be "+x+" years old in 2040");}
			else{
				System.out.println("Participant "+(i+1)+" was "+y+" years old in 1960 and will be "+x+" in 2040");}

		}


}
}