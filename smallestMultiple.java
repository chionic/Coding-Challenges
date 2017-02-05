public class smallestMultiple {
	public static void main(String [] args){
		int num1 = 20;
		int i = 20;
		while(i > 9){
			if (i == 10){
				System.out.println(num1);
			}
			if (num1%i == 0){
				i--;
			}
			else {
				num1++;
				i = 20;
			}

		}
	}
}