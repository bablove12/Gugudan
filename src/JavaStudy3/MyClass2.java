package JavaStudy3;

//메소드 오버로딩:  매개변수의 유형과 개수가 다르게 하여 같은 이름의 베소드를 여러개 가질수 있게 하는 기술

              
public class MyClass2 {
		public int plus (int x, int y) {
			return x + y;
		}
		
		public int plus(int x, int y, int z) {
			return x + y + z;
		}
		
		public String plus(String x, String y) {
			return x + y;
		}
		
		
	}

