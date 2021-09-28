package baseConverter;

public class Octal {
	public static int toDecimal(int n) {
		int num = n;
		int dec_value = 0;

		// Initializing base value to 1, i.e 8^0
		int base = 1;

		int temp = num;
		while (temp > 0) {
			// Extracting last digit
			int last_digit = temp % 10;
			temp = temp / 10;

			// Multiplying last digit with appropriate
			// base value and adding it to dec_value
			dec_value += last_digit * base;

			base = base * 8;
		}
		return dec_value;
	}

	public static String toBinary(int num) {
		int decimal = toDecimal(num);
		String binary = Decimal.toBinary(decimal);
		return binary;
	}

	static String toHexa(int n) {
		int decimal = toDecimal(n);
		String hexa = Decimal.toHexa(decimal);
		return hexa;

	}

}
