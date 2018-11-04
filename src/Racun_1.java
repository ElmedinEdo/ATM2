
import java.util.Scanner;

public class Racun_1 extends BankomatTest {
	static Scanner input = new Scanner(System.in);

	private static int Id1 = 789654321;
	private static double balans = 2000;

	static double isplata;
	static double uplata;
	static double iznos;

	public Racun_1() {
	}

	public Racun_1(int Id1, double balans) {
		Racun_1.Id1 = Id1;
		Racun_1.balans = balans;
	}

	public int getId1() {
		return Id1;
	}

	public void setId1(int Id1) {
		Racun_1.Id1 = Id1;
	}

	public double getBalans() {
		return balans;
	}

	public void setBalance(double balance) {
		Racun_1.balans = balance;
	}

	public double getIsplata() {
		return isplata;
	}

	public void setIsplata(double isplata) {
		Racun_1.isplata = isplata;
	}

	public double getUplata() {
		return uplata;
	}

	public void setUplata(double uplata) {
		Racun_1.uplata = uplata;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		Racun_1.iznos = iznos;
	}

	public static void Isplati(double iznos) {
		if (balans < iznos || iznos < 00.0d) {
			System.out.println(
					" Nemate dovoljno sredstava na racunu, ili je unesen negativan iznos, molimo pokusajte ponovo! ");
		} else {
			balans = balans - iznos;
		}
	}

	public static void Uplati(double iznos) {
		if (iznos > 0) {
			balans = balans + iznos;
		} else {
			System.out.println("Morate unijeti iznos veci od 0 ");
			iznos = input.nextDouble();
		}
	}

	public void Balans() {
		System.out.println("Stanje vaseg racuna je : " + balans);
	}

	public static void ShowMenu() {

		int izbor = 0;

		System.out.println("...............................................");
		System.out.println("Dobrodosli: ");
		System.out.println("Vas User ID je: " + Racun_1.Id1);
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
				System.out.println("Stanje vaseg racuna je : " + balans + " KM");
				System.out.println("...............................................");
				System.out.println("\n");
				break;

			case 2:
				System.out.println("...............................................");
				System.out.println(" Unesite iznos koji zelite uplatiti " + " KM");
				System.out.println("...............................................");
				int iznos = input.nextInt();
				Uplati(iznos);
				System.out.println("\n");
				break;

			case 3:
				System.out.println("...............................................");
				System.out.println(" Unesite iznos koji zelite za isplatu " + " KM");
				System.out.println("...............................................");
				int iznos1 = input.nextInt();
				Isplati(iznos1);
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
