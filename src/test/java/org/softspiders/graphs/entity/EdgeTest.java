package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	@Test
	public void createByUUIDsOfTwoNodes() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithFirstUUIDNullIdShouldThrowNPE() {
		new Edge(null, UUID.randomUUID());
	}


	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithSecondUUIDNullIdShouldThrowNPE() {
		new Edge(UUID.randomUUID(), null);
	}
}