package zadaci_12_02_2018;
import java.util.Scanner;
import java.util.ArrayList;
public class PonavljanjeUnizu {

	public static void main(String[] args){
		
		int broj=-1;
		int max=0;
		int brojac=0;
		ArrayList<Integer> niz=new ArrayList<>();
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite brojeve, 0 prekida unos: ");
		
		while(broj!=0){
			broj=unos.nextInt();
			niz.add(broj);
			
			if(broj>max){
				max=broj;
			}
		}
		
		for(int i : niz){
			if(i==max){
				brojac++;
			}
		}
		
		unos.close();
		System.out.println("Najveci broj je: "+max+", a ponavlja se: "+brojac+" puta.");

	}

}
