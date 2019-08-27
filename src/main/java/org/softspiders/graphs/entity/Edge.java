package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	public UUID uuid;
	public UUID nodeUUID1;
	public UUID nodeUUID2;

	public Edge(UUID nodeId1, UUID nodeId2) {
		if(nodeId1 == null && nodeId2 == null) {
			throw new NullPointerException();
		}
		this.uuid = UUID.randomUUID();
		this.nodeUUID1 = nodeId1;
		this.nodeUUID2 = nodeId2;
	}
}
