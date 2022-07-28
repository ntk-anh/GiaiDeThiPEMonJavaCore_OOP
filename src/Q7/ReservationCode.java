package Q7;

public class ReservationCode {

	private String customerName;
	private String code;

	public ReservationCode(String customerName, String code) {
		this.customerName = customerName;
		this.code = code;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCode() {
		String chuoi = "";
		for (int i = 0; i < code.length(); i += 3) {
			chuoi = chuoi + code.substring(i, i + 3) + "-";
		}
		return chuoi.substring(0, chuoi.length() - 1);

	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return customerName + "\t" + code;
	}
}
