package zadaci_12_02_2018;
import java.util.Scanner;
public class NZD {

	public static void nzd(int a,int b){
			
			int k=1;
			int nzd=0;
			
			while(k<=a && k<=b){
				if(a%k==0 && b%k==0){
					nzd=k;
				}
				k++;
			}
			System.out.println("Najveci zajednicki djelilac je: "+nzd);
			
			
		}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int a=unos.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b=unos.nextInt();
		unos.close();
		
		nzd(a, b);

	}

}
