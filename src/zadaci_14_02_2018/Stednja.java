package zadaci_14_02_2018;
import java.util.Scanner;
public class Stednja {

	public static void main(String[] args) {
		
		int mjesecniIznosStednje;
		int brojMjeseci;
		final double kamata=5;
		double stanje=0;
		final double mjesecnaInteresnaStopa=kamata/100/12;
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite mjesecni iznos stednje i broj mjeseci: ");
		mjesecniIznosStednje=unos.nextInt();
		brojMjeseci=unos.nextInt();
		unos.close();
		
		for(int i=0; i<brojMjeseci; i++){
			stanje=(stanje+mjesecniIznosStednje)*(1+mjesecnaInteresnaStopa);
		}
		System.out.println("Vase stanje na racunu je "+stanje);
		

	}

}
