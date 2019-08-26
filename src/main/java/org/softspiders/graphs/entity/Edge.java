package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	public UUID uuid1;
	public UUID uuid2;

	public Edge(UUID nodeId1, UUID nodeId2) {
		if(nodeId1 == null && nodeId2 == null) {
			throw new NullPointerException();
		}
		this.uuid1 = nodeId1;
		this.uuid2 = nodeId2;
	}
}
