package FileInOut;

import java.util.Comparator;

public class SortCity implements Comparator <Employee> {

	

	@Override
	public int compare(Employee o1, Employee o2) {
		
			if(o1.empCity==o2.empCity) {
				return 1;
			}else if(o1.empCity!=o2.empCity) {
				return -1;
			}else
				return 0;
	}

}