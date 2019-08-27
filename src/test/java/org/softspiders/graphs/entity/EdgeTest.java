package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	// Creation by two "Node" UUIDs
	@Test
	public void createByPairOfNodeUUIDs() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test
	public void createByPairOfNodeUUIDsShouldSetEdgeUUID() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).uuid);
	}

	@Test
	public void creationByPairOfNodeUUIDsShouldSetCorrespondingUUIDs() {
		UUID nodeUUID1 = new Edge(UUID.randomUUID();
		UUID nodeUUID2 = new Edge(UUID.randomUUID();
		Edge edge = new Edge(nodeUUID1, nodeUUID2);
		assertEquals(nodeUUID1, edge.nodeUUID1);
		assertEquals(nodeUUID2, edge.nodeUUID2);
	}

	@Test
	public void creationWithFirstUUIDNullShouldBeNormal() {
		Как надо ?
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