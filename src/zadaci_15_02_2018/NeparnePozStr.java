package zadaci_15_02_2018;
import java.util.Scanner;
public class NeparnePozStr {

	public static String neparnePoz(String s){
		String str="";
		
		for(int i=0; i<s.length(); i++){
			if(i%2 == 0){
				str=str+s.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s=unos.nextLine();
		unos.close();
		
		System.out.println(neparnePoz(s));


	}

}
