package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

Нужен UUID для Edge !!!

public class EdgeTest {

	@Test
	public void createByPairOfUUIDs() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test
	public void creationByPairOfUUIDsShouldSetCorrespondingId() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).uuid1);
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).uuid2);
	}

	@Test
	public void creationWithFirstUUIDNullShouldBeNormal() {
		UUID uuid = UUID.randomUUID();
		assertEquals(uuid, new Edge(null, uuid).uuid2);
	}

	@Test
	public void creationWithSecondUUIDNullShouldBeNormal() {
		UUID uuid = UUID.randomUUID();
		assertEquals(uuid, new Edge(uuid, null).uuid1);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithBothUUIDsNullIdShouldThrowNPE() {
		new Edge(null, null);
	}
}