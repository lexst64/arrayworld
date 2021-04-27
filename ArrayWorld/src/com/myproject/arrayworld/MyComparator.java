package com.myproject.arrayworld;

import java.util.Comparator;

public class MyComparator implements Comparator<CollectionWorld> {

	@Override
	public int compare(CollectionWorld first, CollectionWorld second) {
		return Integer.compare(first.getName().charAt(0), second.getName().charAt(0));
	}

}
