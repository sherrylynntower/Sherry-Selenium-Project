package Day1.example;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);

		//LOOP enhanced for (INT A & X)
		
		for(int temp: a) {
		System.out.println(temp);
		}
		
		//Print a "-" between output lines
		System.out.println("-------");
		
			int[] x = new int[5];
			x[3] = 25;
			x[0] = 12;
		
		for(int temp2 : x) {
			System.out.println(temp2);
		}
		
		// Print a "-" between output lines
		System.out.println("____");
		
		String[] st = {"one", "two", "three"};
		
		for(String temp : st) {
			System.out.println(temp);
		}
		
		// Print a "-" between output lines
				System.out.println("____");	
		String[] stx = new String[5];
		
		stx[3] ="25";
		stx[0] = "12";
		for(String temp2 : stx) {
			System.out.println(temp2);
		}
		
		
	}
}	
