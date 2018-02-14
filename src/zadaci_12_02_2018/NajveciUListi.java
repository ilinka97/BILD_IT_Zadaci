package zadaci_12_02_2018;
import java.util.ArrayList;
public class NajveciUListi {

	public static Integer max(ArrayList<Integer> list){
			
			if(list.isEmpty() || list.equals(null)){
				return null;
			}else{
				Integer max=list.get(0);
				for(int i : list){
					if(i>max){
						max=i;
					}
				}
			return max;
			}
		}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(36);
		list.add(8);
		list.add(89);
		
		System.out.println("Najveci je: " + max(list));

	}

}
