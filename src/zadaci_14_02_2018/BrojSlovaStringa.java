package zadaci_14_02_2018;
import java.util.Scanner;
public class BrojSlovaStringa {

	 public static int countLetters(String s){
		 int brojac=0;
		 
		 for(int i=0; i<s.length(); i++){
			 if(Character.isLetter(s.charAt(i))){
				 brojac++;
			 }
		 }
		 
		 return brojac;
	 }
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s=unos.nextLine();
		
		System.out.println("Broj slova u stringu je: "+countLetters(s));
		unos.close();

	}

}
