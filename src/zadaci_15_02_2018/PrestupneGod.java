package zadaci_15_02_2018;
import java.util.Scanner;
public class PrestupneGod {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu: ");
		int pGod=unos.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int kGod=unos.nextInt();
		int brojac=0;
		
		for(int i=pGod; i<kGod; i++){
			if(i%4==0 && i%100!=0 || i%400==0){
				brojac++;
				
				if(brojac%10==0){
					System.out.println(i);
				}else{
					System.out.print(i+" ");
				}
			}
		}
		
		unos.close();


	}

}
