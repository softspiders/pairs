package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	/**
	 * Edge UUID
	 */
	public UUID euid;

	/**
	 * Node1 UUID
	 */
	public UUID nuid1;

	/**
	 * Node2 UUID
	 */
	public UUID nuid2;

	public Edge(UUID nuid1, UUID nuid2) {
		this(UUID.randomUUID(), nuid1, nuid2);
	}

	public Edge(UUID euid, UUID nuid1, UUID nuid2) {
		if(euid == null || nuid1 == null || nuid2 == null) {
			throw new NullPointerException();
		}

		this.euid = euid;
		this.nuid1 = nuid1;
		this.nuid2 = nuid2;
	}
}
