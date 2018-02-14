package zadaci_13_02_2018;
import java.util.Scanner;
public class StriktnoIdenticni {

	public static boolean equals(int[ ] niz1, int[ ] niz2){
		
		if(niz1.length!=niz2.length){
			return false;
		}
		for(int i=0; i<niz1.length; i++){
			if(niz1[i]!=niz2[i]){
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite duzinu prvog niza, pa niz:");
		int a=unos.nextInt();
		int[] niz1=new int[a];
		for(int i=0; i<niz1.length; i++){
			niz1[i]=unos.nextInt();
		}
		
		System.out.println("Unesite duzinu drugog niza, pa niz:");
		int b=unos.nextInt();
		int[] niz2=new int[b];
		for(int i=0; i<niz2.length; i++){
			niz2[i]=unos.nextInt();
		}
		
		System.out.println("Nizovi su strktno identicni? "+equals(niz1, niz2));
		unos.close();

	}

}
