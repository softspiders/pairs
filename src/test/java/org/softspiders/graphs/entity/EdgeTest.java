package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	// Creation by pair of some Node UUID (NUID)
	@Test
	public void createByPairOfNUIDs() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test
	public void createByPairOfNUIDsShouldSetEdgeUUID() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).euid);
	}

	@Test
	public void creationByPairOfNUIDsShouldSetCorrespondingNUIDs() {
		UUID nuid1 = UUID.randomUUID();
		UUID nuid2 = UUID.randomUUID();
		Edge edge = new Edge(nuid1, nuid2);
		assertEquals(nuid1, edge.nuid1);
		assertEquals(nuid2, edge.nuid2);
	}

	@Test(expected = NullPointerException.class)
	public void creationWithFirstNUIDNullShouldThrowNPE() {
		new Edge(null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationWithSecondNUIDNullShouldThrowNPE() {
		new Edge(UUID.randomUUID(), null);
	}

	@Test(expected = NullPointerException.class)
	public void creationWithBothNUIDNullShouldThrowNPE() {
		new Edge(null, null);
	}
}