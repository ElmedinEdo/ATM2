
import java.io.IOException;
import java.util.Scanner;

public class BankomatTest {

	public static void main(String[] args) throws IOException {

		// System.out.println("Unesite password: a za korisnika_1: ");
		// System.out.println("Unesite password: d za korisnika_2: ");

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

		System.out.println("");

		System.out.println("Unesite password a ili d: ");
		String password = input.nextLine();
		System.out.println("");

		Bankomat korisnik1 = new Bankomat(222, "John ", "Stone", "a");
		Bankomat korisnik2 = new Bankomat(999, "Mark ", "Douglas ", "d");

		System.out.println("Unesite tacan password: ");
		password = input.nextLine();

		if (password.equals(korisnik1.getPassword())) {

			System.out.println("\nIme: " + korisnik1.getIme()

					+ "\nPrezime: " + korisnik1.getPrezime()

					+ "\nBrojKorisnika: " + korisnik1.getBrojKorisnika()

					+ "\nDatum: " + korisnik1.getKorisnikDate());
			Racun_1.ShowMenu();
		}

		if (password.equals(korisnik2.getPassword())) {

			System.out.println("\nIme: " + korisnik2.getIme()

					+ "\nPrezime: " + korisnik2.getPrezime()

					+ "\nBroj korisnika: " + korisnik2.getBrojKorisnika()

					+ "\nDatum: " + korisnik2.getKorisnikDate());
			Racun_2.ShowMenu();

		}
		input.close();
	}

}
