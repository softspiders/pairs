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
		if(nuid1 == null || nuid2 == null) {
			throw new NullPointerException();
		}
		this.euid = UUID.randomUUID();
		this.nuid1 = nuid1;
		this.nuid2 = nuid2;
	}
}
