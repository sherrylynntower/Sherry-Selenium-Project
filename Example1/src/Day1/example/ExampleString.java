package Day1.example;

public class ExampleString {

	public static void main(String[] args) {
		
		
		String x = "James Dean";
		
		System.out.println("Hello" + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.charAt(3));
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		String age ="37";
		String salary = "78965.83";
		//Wrapper classes
		
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		//java has 8 primitive data types
		// byte, short, int, long, float, double, char, boolean,
		//double used to hold decimal places
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);
		
	}

}
