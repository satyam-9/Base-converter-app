package baseConverter;

public class Binary {

	public static int toDecimal(int n) {
		int num = n;
		int dec_value = 0;

		// Initializing base 
		
		// value to 1, i.e 2^0
		int base = 1;

		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;

			dec_value += last_digit * base;

			base = base * 2;
		}

		return dec_value;

	}

	public static int toOctal(int n) {
		int decimal = toDecimal(n);
		int octal = Decimal.toOctal(decimal);
		return octal;
	}

	public static String toHexa(int n) {
		int decimal = toDecimal(n);
		String hexa = Decimal.toHexa(decimal);
		return hexa;
	}
}
