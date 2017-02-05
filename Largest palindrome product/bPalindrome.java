public class bPalindrome {
	public static void main(String [] args){
		int num1 = 999;
		int num2 = 999;
		int x = 0;
		int bP = 0;


		while(num1 > 1){
			x = num1*num2;
			String xs = Integer.toString(x);
			String xr = "";

			for (int i = xs.length()-1; i>= 0; i--){
				xr = xr + xs.charAt(i);
			}

			if (xs.equals(xr) == true && x > bP){
				bP = x;
			}
			else if(num2 <= 1) {
				num1--;
				num2 = 999;

			}
			else {
				num2--;
			}
		}
		System.out.println(bP);
	}
}