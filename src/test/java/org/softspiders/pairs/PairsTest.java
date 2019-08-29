package org.softspiders.pairs;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class PairsTest {
	UUID pid = UUID.randomUUID();
	UUID sid1 = UUID.randomUUID();
	UUID sid2 = UUID.randomUUID();

	@Test
	public void addPair() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		Assert.assertTrue(pairs.pairs.contains(pair));
	}

	@Test
	public void removePair() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		pairs.removePair(pair);
		Assert.assertFalse(pairs.pairs.contains(pair));
	}

}