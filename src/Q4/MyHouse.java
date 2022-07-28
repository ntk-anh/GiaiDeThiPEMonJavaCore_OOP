package Q4;

public class MyHouse implements House {

	private int price;
	private String address;
	 
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int f) {
		this.price = f;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public double getPricetoUSD() {
		return (double)price/23000;
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		//check address nó chứa số hay chữ
		//ý tưởng: duyệt từ đầu đến cuối nếu có 1 kí tự bất kì k phải số=>false
		boolean check = true;
		for (int i = 0; i < address.length(); i++) {
			if (Character.isDigit(address.charAt(i))==false) {
				check=false;
			}
		}
		if (check==true) {
			return  address.substring(0,3);
		}else {
			return address.substring(address.length()-3);
		}
	}

}
