package zadaci_15_02_2018;
import java.util.Scanner;
public class Investicija {

	public static void main(String[] args) {
		
		double iznosInvesticije=0;
		double godInteresnaStopa=0;
		int brGod=0;
		double buducaVrijednost=0;
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite iznos investicije: ");
		iznosInvesticije=unos.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		godInteresnaStopa=unos.nextDouble();
		System.out.println("Unesite broj godina: ");
		brGod=unos.nextInt();
		
		double mjesecnaInteresnaStopa=godInteresnaStopa/12/100;
		buducaVrijednost=iznosInvesticije*Math.pow((1+mjesecnaInteresnaStopa), (brGod*12));
		
		System.out.println("Buduca vrijednost je: "+ buducaVrijednost);
		unos.close();

	}

}
