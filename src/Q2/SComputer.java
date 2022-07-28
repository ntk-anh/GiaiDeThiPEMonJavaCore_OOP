package Q2;

public class SComputer extends Computer {
	private String series;

	public SComputer() {

	}

	public SComputer(String name, String color, double price, String series) {
		super(name, color, price);
		this.series = series;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + series;
	}

	public double getSalePrice() {
		double salePrice;
//		String c = series.substring(series.length()-1, series.length());
//		if (c.equalsIgnoreCase("A")) {
		if (series.endsWith("A")||series.endsWith("a")) {
			 salePrice = 0.95 * super.getPrice();

		 
		}else {
			salePrice = 0.99 * super.getPrice();
		}
		return salePrice;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

}
