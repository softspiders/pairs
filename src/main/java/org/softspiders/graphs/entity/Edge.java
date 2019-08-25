package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	public Edge(UUID nodeId1, UUID nodeId2) {
		if(nodeId1 == null || nodeId2 == null) {
			throw new NullPointerException();
		}
	}
}
