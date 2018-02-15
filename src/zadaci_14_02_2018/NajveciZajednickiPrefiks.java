package zadaci_14_02_2018;
import java.util.Scanner;
public class NajveciZajednickiPrefiks {
	
	public static void prefiks(String s1,String s2){
		String prefiks="";
		int kraci=Math.min(s1.length(), s2.length());
		
		for(int i=0; i<kraci; i++){
			if(s1.charAt(i)==s2.charAt(i)){
				prefiks=prefiks+s1.charAt(i);
			}
		}
		
		if(prefiks.isEmpty()){
			System.out.println("Nema zajednicog prefiksa.");
		}else{
			System.out.println("Zajednicki prefiks je: "+prefiks);
		}
	}

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String s1=unos.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2=unos.nextLine();
		unos.close();
		
		prefiks(s1, s2);
	}

}
