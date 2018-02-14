package zadaci_13_02_2018;
import java.util.Scanner;
public class NajmanjiUnizu {
	
	public static double min(double[ ] arr){
		double min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		double[] arr=new double[10];
		System.out.println("Unesite 10 brojeva: ");
		
		for(int i=0; i<arr.length; i++){
			arr[i]=unos.nextDouble();
		}
		
		System.out.println("Najmanji u nizu je "+min(arr));
		unos.close();

	}

}
