package org.softspiders.pairs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pairs {
	private Set<Pair> pairs = new HashSet<Pair>();

	public void addPair(Pair pair) {
		pairs.add(pair);
	}

	public void removePair(Pair pair) {
		pairs.remove(pair);
	}

	public Set<Pair> getPairs() {
		return Collections.unmodifiableSet(pairs);
	}

	public void setPairs(Set<Pair> pairs) {
		this.pairs = pairs;
	}
}
