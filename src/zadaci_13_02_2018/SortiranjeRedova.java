package zadaci_13_02_2018;
import java.util.Scanner;
import java.util.Arrays;
public class SortiranjeRedova {

	public static double[ ][ ] sortRows(double[ ][ ] array){

		for(int i=0; i<array.length; i++){
			Arrays.sort(array[i]);
		}
		return array;
	}
	
	public static void main(String[] args){
		
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
		
		for(int k=0; k<a.length; k++){
			for(int l=0; l<a[0].length; l++ ){
				System.out.print(a[k][l] +" ");
			}
			System.out.println();
		}
		System.out.println();
		
		double[][] sorted=sortRows(a);
		for(int i=0; i<sorted.length; i++){
			for(int j=0; j<sorted[0].length; j++ ){
				System.out.print(sorted[i][j] +" ");
			}
			System.out.println();
		}

		unos.close();

	}

}
