public class NewReleasePrice extends Price {
	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		//determine amounts for each line
		double result = 0;
		result += daysRented * 3;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}
