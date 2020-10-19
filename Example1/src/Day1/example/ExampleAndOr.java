package Day1.example;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = -10;
		// && short AND (both conditions must be true)
		// & checks both conditions only ones needs to be true
		// || or
		
		if(x > 0 && y > 0) {
			System.out.println(" Both num are +ve");
		}else if (x > 0 || y > 0){
			System.out.println(" atleast one numb is +ve");
		}else {
			System.out.println(" Both nums are -ve");
		}
	}

}
