package zadaci_13_02_2018;

public class ProstiBrOdDo {

	public static boolean prost(int a){
			
			for(int i=2; i<a/2; i++){
				if(a%i==0){
					return false;
				}
			}
			return true;
	}
	
	public static void prbr(int a, int b,int c){
		int brojac=0;
		for(int i=a; i<=b; i++){
			if(prost(i)){
				brojac++;
				if(brojac%c==0){
					System.out.println(i);
				}else{
					System.out.print(i+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		prbr(6, 30, 3);

	}

}
