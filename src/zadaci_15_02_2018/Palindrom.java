package zadaci_15_02_2018;
import java.util.Scanner;
public class Palindrom {

	public static int reverse(int number){
		int obrnuto=0;
		while(number!=0){
			obrnuto=obrnuto*10+number%10;
			number=number/10;
		}
		return obrnuto;
	}
	
	public static boolean isPalindrome(int number){
		 if(reverse(number)==number){
			 return true;
		 }
		 return false;
	}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int number=unos.nextInt();
		unos.close();
		
		if(isPalindrome(number)){
			System.out.println("Broj je palindrom.");
		}else{
			System.out.println("Broj nije palindrom.");
		}

	}

}
