public class evenFib {
	public static void main(String [] args){
		int first = 1;
		int second = 1;
		int a =0;
		int total =0;
		while (first <= 4000000){
			a = first;
			first = first + second;
			second = a;
			if (first%2 == 0){
				total = total + first;
			}
		}
		System.out.println(total);
	}
}