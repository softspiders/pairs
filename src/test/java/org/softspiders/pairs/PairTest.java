package org.softspiders.pairs;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class PairTest {

	// Creation by pair of SIDs (SID - UUID of Something/Somebody)

	@Test
	public void createByPairOfSIDsShouldSetPID() {
		assertTrue(new Pair(UUID.randomUUID(), UUID.randomUUID()).pid instanceof UUID);
	}

	@Test
	public void creationByPairOfSIDsShouldSetCorrespondingSIDs() {
		UUID sid1 = UUID.randomUUID();
		UUID sid2 = UUID.randomUUID();
		Pair pair = new Pair(sid1, sid2);
		assertEquals(sid1, pair.sid1);
		assertEquals(sid2, pair.sid2);
	}

	@Test(expected = NullPointerException.class)
	public void creationWithFirstSIDNullShouldThrowNPE() {
		new Pair(null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationWithSecondSIDNullShouldThrowNPE() {
		new Pair(UUID.randomUUID(), null);
	}

	@Test(expected = NullPointerException.class)
	public void creationWithBothSIDNullShouldThrowNPE() {
		new Pair(null, null);
	}

	// Creation by PID (PID -- Pair UUID) and pair of SIDs

	@Test
	public void createByPIDAndPairOfSIDsShouldSetPID() {
		assertTrue(new Pair(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()).pid instanceof UUID);
	}

	@Test
	public void creationByPIDAndPairOfSIDsShouldSetCorrespondingSIDs() {
		UUID pid = UUID.randomUUID();
		UUID sid1 = UUID.randomUUID();
		UUID sid2 = UUID.randomUUID();
		Pair pair = new Pair(pid, sid1, sid2);
		assertEquals(pid, pair.pid);
		assertEquals(sid1, pair.sid1);
		assertEquals(sid2, pair.sid2);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullPIDWithBothSIDNullShouldThrowNPE() {
		new Pair(null, null, null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullPIDWithFirstSIDNullShouldThrowNPE() {
		new Pair(null, null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullPIDWithSecondSIDNullShouldThrowNPE() {
		new Pair(null, UUID.randomUUID(), null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullPIDShouldThrowNPE() {
		new Pair(null, UUID.randomUUID(), UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByPIDWithBothSIDNullShouldThrowNPE() {
		new Pair(UUID.randomUUID(), null, null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByPIDWithFirstSIDNullShouldThrowNPE() {
		new Pair(UUID.randomUUID(), null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByPIDWithSecondSIDNullShouldThrowNPE() {
		new Pair(UUID.randomUUID(), UUID.randomUUID(), null);
	}
}