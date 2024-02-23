package cold;

public class July1 {

	public static void main(String[] args) { // this is parameter method
		
		July1 tom = new July1 ();
		tom.asp(" mukta", " jamil");
		
		July1 kom = new July1();
			kom.asp2(0300, 600, 500);	
			
			July1 abc = new July1();
			abc.asp3(600.50, 500.60, 300.20);
			
			July1.amp1("dhaka", "dallas", "plano");
			
			July1.amp2(500, 400);
			
			
			July1.amp3(500.40, 800.60);
			
	}
	
	
	public void asp (String tool1, String tool2) {  // this is parameter / dynamic method 
		
		
		String tools = tool1+tool2;
		
		System.out.println(tools);
	}
	
	
	public void asp2 (int a, int b,int c) {
		
		int d = a+b+c;
		
		System.out.println(d);
		
	}
	
	public void asp3 (double ac, double bc, double dc) {
		
		double mk = ac+bc+dc;
		
		System.out.println(mk);
		
	}
	
	
	public static void amp1( String a, String  b, String c) {
		
		String ac = a+b+c;
		
		System.out.println(ac);
		
		
	}
	
	
	public static void amp2(int a, int b) {
		
	int c = a+b;
	System.out.println(c);
		
		
		
	}
	
	public static void amp3(double a, double b) {
		
		double ac = a+b;
		
		System.out.println(ac);
		
		
	}
	
	
		
}
