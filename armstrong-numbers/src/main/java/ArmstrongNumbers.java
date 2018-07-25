class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int digits = 0;
		int total = 0;

		int temp = numberToCheck;
		while (temp != 0) {
			digits++;
			temp /= 10;
		}

		int num = numberToCheck;
		while (num != 0) {
			int remainder = num % 10;
			int power = (int) Math.pow(remainder, digits);
			total = total + power;
			num = num / 10;
		}

		if (total == numberToCheck) {
			return true;
		}

		else { return false; }
	}

}
