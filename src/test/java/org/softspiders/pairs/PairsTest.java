package org.softspiders.pairs;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

public class PairsTest {
	UUID pid = UUID.randomUUID();
	UUID sid1 = UUID.randomUUID();
	UUID sid2 = UUID.randomUUID();

	@Test
	public void justAfterCreationThePairsShouldBeEmpty() {
		Assert.assertEquals(0, new Pairs().getPairs().size());
	}

	@Test
	public void pairCollectionShouldBeSettable() {
		Pairs pairs = new Pairs();
		Set<Pair> pairSet = new HashSet<Pair>() {{ add(new Pair(pid, sid1, sid2));}};
		pairs.setPairs(pairSet);
		Assert.assertEquals(pairSet, pairs.getPairs());
	}

	@Test
	public void getPairsShouldNotBeExactlyTheSameThatWasInstalled() {
		Pairs pairs = new Pairs();
		Set<Pair> pairSet = new HashSet<Pair>() {{ add(new Pair(pid, sid1, sid2));}};
		pairs.setPairs(pairSet);
		assertNotSame(pairSet, pairs.getPairs());
	}

	@Test
	public void addPair() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		Assert.assertTrue(pairs.getPairs().contains(pair));
	}

	@Test
	public void repeatingAddSamePairShouldBeSilent() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		pairs.addPair(pair);
	}

	@Test
	public void pairsShouldBeSet() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		pairs.addPair(pair);
		Assert.assertEquals(1, pairs.getPairs().size());
	}

	@Test
	public void removePair() {
		Pairs pairs = new Pairs();
		Pair pair = new Pair(pid, sid1, sid2);
		pairs.addPair(pair);
		pairs.removePair(pair);
		Assert.assertFalse(pairs.getPairs().contains(pair));
	}

	@Test
	public void removeNonExistedPairShouldBeSilent() {
		Pairs pairs = new Pairs();
		pairs.removePair(new Pair(pid, sid1, sid2));
	}

}