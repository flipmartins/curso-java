package fundamentos;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.123456888; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d); //conversão explícita (CAST)
		
		double e = 1.99999;
		int f = (int) e; //conversão explícita (CAST)
		System.out.println(f);
	}
}
