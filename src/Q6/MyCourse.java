package Q6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCourse implements ICourse {

	@Override
	public void f1(List<Course> a, int st) {

		if (st==1) {//sap xep tang theo fee
			Collections.sort(a, new Comparator<Course>() {

				@Override
				public int compare(Course o1, Course o2) {
					if (o1.getFee()>o2.getFee()) {
						return 1;//doi vi tri
					}else if (o1.getFee()<o2.getFee()) {
						return -1;//k doi
					}else {
						return 0;
					}
				}
				
			});
		}else {
			Collections.sort(a, new Comparator<Course>() {

				//sap xep giam theo ten
				@Override
				public int compare(Course o1, Course o2) {
					return o2.getName().compareToIgnoreCase(o1.getName());
				}
				
			});
		}
		
	}

	@Override
	public int f2(List<Course> a, double fee) {
		// TODO Auto-generated method stub
		int count=0;
		for (Course item : a) {
			if (item.getFee()>=fee) {
				count++;
			}
		}
		return count;
	}

}
