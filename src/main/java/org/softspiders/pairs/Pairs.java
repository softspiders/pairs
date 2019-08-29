package org.softspiders.pairs;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
	public Set<Pair> pairs = new HashSet<Pair>();

	public void addPair(Pair pair) {
		pairs.add(pair);
	}

	public void removePair(Pair pair) {
		pairs.remove(pair);
	}
}
