public class primeFactor {

	public static void main(String [] args){
		long [] factors = new long[20];
		long newNum = 600851475143L;
		int z=0;
		int x=2;
		while (newNum > 0){
			if (newNum%x != 0){
				x++;
			}
			else {
				factors[z] = x;
				z++;
				newNum = newNum/x;
				x = 2;
			}
		}
		//System.out.println(Math.pow(2,63));
		for (int i=z; i >= 0; i--){
			System.out.print(factors[i] + ",   ");
		}

	}
}