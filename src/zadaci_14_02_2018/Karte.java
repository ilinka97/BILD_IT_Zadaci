package zadaci_14_02_2018;

public class Karte {

	public static void main(String[] args) {
		
		int karta=(int)(Math.random()*13);
		int znak=(int)(Math.random()*4);
		
		System.out.println("Karta koju ste izvukli je :");
		
		switch(karta){
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("2");
			break;
		case 2:
			System.out.println("3");
			break;
		case 3:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		case 5:
			System.out.println("6");
			break;
		case 6:
			System.out.println("7");
			break;
		case 7:
			System.out.println("8");
			break;
		case 8:
			System.out.println("9");
			break;
		case 9:
			System.out.println("10");
			break;
		case 10:
			System.out.println("J");
			break;
		case 11:
			System.out.println("Q");
			break;
		case 12:
			System.out.println("K");
			break;
		default:
			System.out.println("Greska");
		}
		
		switch(znak){
		case 0:
			System.out.println("Srce");
			break;
		case 1:
			System.out.println("Kocka");
			break;
		case 2:
			System.out.println("Pik");
			break;
		case 3:
			System.out.println("Djetelina");
			break;
		default:
			System.out.println("Greska");
		}

		
	}

}
