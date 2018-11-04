import java.util.Scanner;

public class Racun_2 extends BankomatTest {

	static Scanner input = new Scanner(System.in);

	private static int Id2 = 123456789;
	private static double balans2 = 9000;

	static double isplata2;
	static double uplata2;
	static double iznos2;

	public Racun_2() {
	}

	public Racun_2(int Id2, double balans2) {
		Racun_2.Id2 = Id2;
		Racun_2.balans2 = balans2;

	}

	public static int getId2() {
		return Id2;
	}

	public static void setId2(int id2) {
		Id2 = id2;
	}

	public double getBalans2() {
		return balans2;
	}

	public void setBalance2(double balance2) {
		Racun_2.balans2 = balance2;
	}

	public double getIsplata2() {
		return isplata2;
	}

	public void setIsplata2(double isplata2) {
		Racun_2.isplata2 = isplata2;
	}

	public double getUplata2() {
		return uplata2;
	}

	public void setUplata2(double uplata2) {
		Racun_2.uplata2 = uplata2;
	}

	public double getIznos2() {
		return iznos2;
	}

	public void setIznos2(double iznos2) {
		Racun_2.iznos2 = iznos2;
	}

	public static void Isplati2(double iznos2) {
		if (balans2 < iznos2 || iznos2 < 00.0d) {
			System.out.println(
					" Nemate dovoljno sredstava na racunu, ili je unesen negativan iznos, molimo pokusajte ponovo! ");
		} else {
			balans2 = balans2 - iznos2;
		}
	}

	public static void Uplati2(double iznos2) {
		if (iznos2 > 0) {
			balans2 = balans2 + iznos2;
		} else {
			System.out.println("Morate unijeti iznos veci od 0 ");
			iznos2 = input.nextDouble();
		}
	}

	public void Balans2() {
		System.out.println("Stanje vaseg racuna je : " + balans2);
	}

	public static void ShowMenu() {

		int izbor = 0;

		System.out.println("...............................................");
		System.out.println("Dobrodosli: ");
		System.out.println("Vas User ID je: " + Racun_2.Id2);
		System.out.println("...............................................");
		System.out.println("1. Provjeri stanje na racunu: ");
		System.out.println("2. Uplati novac na racun: ");
		System.out.println("3. Isplati novac sa racuna: ");
		System.out.println("4. Izlaz ");

		do {
			System.out.println("...............................................");
			System.out.println("Izaberite jednu od opcija ");
			System.out.println("...............................................");
			izbor = input.nextInt();
			System.out.println("\n");

			switch (izbor) {

			case 1:
				System.out.println("...............................................");
				System.out.println("Stanje vaseg racuna je : " + balans2 + " KM");
				System.out.println("...............................................");
				System.out.println("\n");
				break;

			case 2:
				System.out.println("...............................................");
				System.out.println(" Unesite iznos koji zelite uplatiti " + " KM");
				System.out.println("...............................................");
				int iznos2 = input.nextInt();
				Uplati2(iznos2);
				System.out.println("\n");
				break;

			case 3:
				System.out.println("...............................................");
				System.out.println(" Unesite iznos koji zelite za isplatu " + " KM");
				System.out.println("...............................................");
				iznos2 = input.nextInt();
				Isplati2(iznos2);
				System.out.println("\n");
				break;

			case 4:
				System.out.println("...............................................");
				break;

			default:
				System.out.println("Pogresan unos! Molimo pokusajte ponovo! ");
				break;
			}
		} while (izbor != 4);
		System.out.println(" HVALA VAM STO STE KORISTILI NASE USLUGE BANKOMATA  ) ");

	}
}
