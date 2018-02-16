package zadaci_15_02_2018;
import java.util.Scanner;
public class Avion {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite brzinu i ubrzanje: ");
		double v=unos.nextDouble();
		double a=unos.nextDouble();
		unos.close();
		
		double l=v*v/(2*a);
		System.out.println("Duzina piste je: "+l);

	}

}
