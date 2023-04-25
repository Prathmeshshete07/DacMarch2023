package domain;

import java.util.Comparator;

public class NameComparator implements Comparator <MenuItem> {

	@Override
	public int compare(MenuItem m1, MenuItem m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
