import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PodaciKorisnikaBankovnogRacuna {

	public static void main(String[] args) throws IOException {
		

		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("Unesite integer: ");
				int broj = input.nextInt();

				System.out.println("Uneseni broj je: " + broj);

				continueInput = false;
			} catch (Exception ex) {
				System.out.println("Try again. (" + "Pogresan unos: integer je potreban)");
				input.nextLine();

			}
		} while (continueInput);

		int izbor = 0;
		System.out.println("");
		System.out.println("Izaberite jednu od ponudenih opcija: ");

		System.out.println("1. Stanje na bankovnom racunu John:  ");
		System.out.println("2. Stanje na bankovnom racunu Mark: ");
		System.out.println("3. Izlaz ");

		do {
			izbor = input.nextInt();

			System.out.println("...............................................");

			switch (izbor) {

			case 1:
				FileReader file = new FileReader("C:\\Users\\Seka\\Desktop\\OOP\\Projekt1\\Racun\\John.txt ");
				BufferedReader reader = new BufferedReader(file);
				String text = "";
				String line = reader.readLine();
				while (line != null) {
					text += line;
					line = reader.readLine();
				}
				System.out.println(text);
				break;

			case 2:

				FileReader file1 = new FileReader("C:\\Users\\Seka\\Desktop\\OOP\\Projekt1\\Racun\\Mark.txt ");
				BufferedReader reader1 = new BufferedReader(file1);
				String text1 = "";
				String line1 = reader1.readLine();
				while (line1 != null) {
					text1 += line1;
					line1 = reader1.readLine();
				}
				System.out.println(text1);
				break;

			case 3:
				System.out.println("...............................................");
				break;

			default:
				System.out.println("Pogresan unos! Molimo pokusajte ponovo! ");
				break;
			}
		} while (izbor != 3);
		System.out.println("-----------------------------------------------");

		System.out.println("<<<<Izlaz>>>>");
		input.close();
	}

}
