package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	// Creation by pair of NUIDs (NUID - Node UUID)

	@Test
	public void createByPairOfNUIDsShouldSetEdgeUUID() {
		assertTrue(new Edge(UUID.randomUUID(), UUID.randomUUID()).euid instanceof UUID);
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

	// Creation by EUID (EUID -- Edge UUID) and pair of NUIDs

	@Test
	public void createByEUIDAndPairOfNUIDsShouldSetEdgeUUID() {
		assertTrue(new Edge(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()).euid instanceof UUID);
	}

	@Test
	public void creationByEUIDAndPairOfNUIDsShouldSetCorrespondingNUIDs() {
		UUID euid = UUID.randomUUID();
		UUID nuid1 = UUID.randomUUID();
		UUID nuid2 = UUID.randomUUID();
		Edge edge = new Edge(euid, nuid1, nuid2);
		assertEquals(euid, edge.euid);
		assertEquals(nuid1, edge.nuid1);
		assertEquals(nuid2, edge.nuid2);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullEUIDWithBothNUIDNullShouldThrowNPE() {
		new Edge(null, null, null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullEUIDWithFirstNUIDNullShouldThrowNPE() {
		new Edge(null, null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullEUIDWithSecondNUIDNullShouldThrowNPE() {
		new Edge(null, UUID.randomUUID(), null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByNullEUIDShouldThrowNPE() {
		new Edge(null, UUID.randomUUID(), UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByEUIDWithBothNUIDNullShouldThrowNPE() {
		new Edge(UUID.randomUUID(), null, null);
	}

	@Test(expected = NullPointerException.class)
	public void creationByEUIDWithFirstNUIDNullShouldThrowNPE() {
		new Edge(UUID.randomUUID(), null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class)
	public void creationByEUIDWithSecondNUIDNullShouldThrowNPE() {
		new Edge(UUID.randomUUID(), UUID.randomUUID(), null);
	}
}