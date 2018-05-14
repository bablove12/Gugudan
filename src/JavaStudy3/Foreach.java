package JavaStudy3;

public class Foreach {

	public static void main(String[] args) {
		
		int [] iarr = {10,20,30,40,50};
		
		for(int i=0; i <iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		//for each문 추가 된 부분 
		for(int value:iarr) {
			System.out.println(value);
		}

	}

}
