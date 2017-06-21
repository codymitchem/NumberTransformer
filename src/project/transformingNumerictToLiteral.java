package trello_project1;

import java.util.*;

public class transformingNumerictToLiteral {

	public static void main(String[] args) {
		// Formatting

		System.out.println("Welcome!!");
		int i = 0;
		String TurnNumberintowords = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number here please: ");

		i = sc.nextInt();

		switch (i) {
		case 1:
			TurnNumberintowords = "1:one";
			break;

		case 2:
			TurnNumberintowords = "2:Two";
			break;

		case 3:
			TurnNumberintowords = "3:Three";
			break;

		case 4:
			TurnNumberintowords = "4:Four";
			break;

		case 5:
			TurnNumberintowords = "5:Five";
			break;

		case 6:
			TurnNumberintowords = "6:Six";
			break;

		case 7:
			TurnNumberintowords = "7:Seven";
			break;

		case 8:
			TurnNumberintowords = "8:Eight";
			break;

		case 9:
			TurnNumberintowords = "9:Nine";
			break;

		case 10:
			TurnNumberintowords = "10:Ten";
			break;

		default:
			TurnNumberintowords = "number not found";
			break;
		}

		System.out.println("Number in words: " + TurnNumberintowords);
		sc.close();
	}

}