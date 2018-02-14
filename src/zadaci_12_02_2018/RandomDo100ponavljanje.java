package zadaci_12_02_2018;

public class RandomDo100ponavljanje {

	public static void main(String[] args){
		
		int[] niz=new int[10];
		
		for(int j=0; j<100; j++){
			int a=(int)(Math.random()*10);
			niz [a]++;
		}
		
		for(int k=0; k<10; k++){
			System.out.println(k+" ima "+niz[k]+" ponavljanja");
		}

	}

}
