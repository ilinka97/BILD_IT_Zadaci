package zadaci_14_02_2018;
import java.util.Scanner;
public class BrojeviNaopako {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva: ");
		
		int[] niz=new int[10];
		for(int i=0; i<niz.length; i++){
			niz[i]=unos.nextInt();
		}
		
		for(int j=niz.length-1; j>=0; j--){
			System.out.print(niz[j]+" ");
		}
		
		unos.close();
	}

}
