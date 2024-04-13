package app003;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		float n = (n1 + n2) / 2;
		System.out.println("Média: " + n);
		
		int a = 10;
		int num = (int) Math.pow(a, 2);
		System.out.println(num);
		
		int b = (int) (Math.random() * (10));
		System.out.println(b);
	}

}
