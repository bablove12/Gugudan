package JavaStudy2;

public class Array2 {

	public static void main(String[] args) {
		int [] array = new int[100];
		array[0] = 1;
		array[1] = 2;
		System.out.println(array.length);
		
		for(int i=0; i< array.length; i++) {
			array[i] = i + 1;
		} //������ ����
		
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum = sum + array[i];
		}
		
		System.out.println(sum);
		
		

	}

}
