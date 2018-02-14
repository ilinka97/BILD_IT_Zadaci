package zadaci_13_02_2018;
import java.util.Scanner;
public class LokacijaNajvecegU2Dnizu {

	public static int[] locateLargest(double[][] a){
		double max=a[0][0];
		int[] maxLoc=new int[2];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				if(a[i][j]>max){
					max=a[i][j];
					maxLoc[0]=i;
					maxLoc[1]=j;
				}
			}
		}
		return maxLoc;
	}
	
	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite broj kolona i redova: ");
		int r=unos.nextInt();
		int c=unos.nextInt();
		double[][] a=new double[r][c];
		
		System.out.println("Unesite elemente matrice: ");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				a[i][j]=unos.nextDouble();
			}
		}
		
		int[] lokacija=locateLargest(a);
		System.out.println("Lokacija najveceg elementa("+lokacija[0]+","+lokacija[1]+")");
		unos.close();

	}

}
