package baseConverter;

public class Decimal {
	public static String toBinary(int num) {
		String binary = "";
		while (num > 0) {
			binary = num % 2 + binary;
			num = num / 2;
		}

		return binary;
	}

	static int toOctal(int deciNum) {
		int octalNum = 0, countval = 1;

		while (deciNum != 0) {

			// decimals remainder is calculated
			int remainder = deciNum % 8;

			// storing the octalvalue
			octalNum += remainder * countval;

			// storing exponential value
			countval = countval * 10;
			deciNum /= 8;
		}
		return octalNum;
	}

	public static String toHexa(int n) {

		// character array to represent double
		// digit remainders
		char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// variable to store the remainder on
		// division by 16
		int remainder;

		// declaring the string that stores the
		// final hex string
		String hexNumber = "";

		// loop to convert decimal to hex
		while (n != 0) {

			// calculating the remainder of decimal
			// by dividing by 16
			remainder = n % 16;

			// checking if the remainder is >= 10
			if (remainder >= 10)

				// replacing with the corresponding
				// alphabet from the array
				hexNumber = arr[remainder - 10] + hexNumber;

			else

				hexNumber = remainder + hexNumber;

			// update condition of dividing the
			// number by 16
			n /= 16;
		}

		// returning the hex string
		return hexNumber;
	}
}
