package zadaci_12_02_2018;
import java.util.Scanner;
public class SamoglasniciSuglasnici {

	public static void brojSamSug(String s){
			
			int brojSamoglasnika=0;
			int brojSuglasnika=0;
			for(int i=0; i<s.length(); i++){
				char ch=s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
					brojSamoglasnika++;
				}else if(Character.isLetter(ch)){
					brojSuglasnika++;
				}else{
					System.out.println("Pogresan unos.");
					return;
				}
			}
			
			System.out.println("Broj samoglasnika: "+brojSamoglasnika);
			System.out.println("Broj suglasnika: "+brojSuglasnika);
		}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s=unos.nextLine();
		unos.close();
		
		brojSamSug(s);

	}

}
