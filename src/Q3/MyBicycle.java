package Q3;

import java.util.List;

public class MyBicycle implements IBicycle{

	@Override
	public void f1(List<Bicycle> a) {
		// TODO Auto-generated method stub
		//bước 1: tìm price min
		float min=a.get(0).getPrice();
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i).getPrice()<min) {
				min=a.get(i).getPrice();
			}
		}
		//bước 2: xóa phần tử đầu tiên có price min
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getPrice()==min) {
				a.remove(a.get(i));
				break;
			}
		}
			
		
	}

	@Override
	public int f2(List<Bicycle> a, String name) {
		// TODO Auto-generated method stub
		int count=0;
		for (Bicycle item : a) {
			if (item.getName().toLowerCase().endsWith(name.toLowerCase())) {
				count++;
			}
		}
		return count;
	}

}
