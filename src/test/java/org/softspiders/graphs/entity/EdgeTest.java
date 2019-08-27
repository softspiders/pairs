package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	@Test
	public void createByPairOfNodeUUIDs() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test
	public void createByPairOfNodeUUIDsShouldSetEdgeUUID() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).uuid);
	}


	@Test
	public void creationByPairOfUUIDsShouldSetCorrespondingId() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).nodeUUID1);
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).nodeUUID2);
	}

	@Test
	public void creationWithFirstUUIDNullShouldBeNormal() {
		UUID uuid = UUID.randomUUID();
		assertEquals(uuid, new Edge(null, uuid).nodeUUID2);
	}

	@Test
	public void creationWithSecondUUIDNullShouldBeNormal() {
		UUID uuid = UUID.randomUUID();
		assertEquals(uuid, new Edge(uuid, null).nodeUUID1);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithBothUUIDsNullIdShouldThrowNPE() {
		new Edge(null, null);
	}
}