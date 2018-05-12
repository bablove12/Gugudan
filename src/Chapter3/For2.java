package Chapter3;

public class For2 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1;i<=100;i++) {
			
			total = total + i;
			if(i ==50) {
				break;
			}
			
		}
		System.out.println(total);

	}

}
