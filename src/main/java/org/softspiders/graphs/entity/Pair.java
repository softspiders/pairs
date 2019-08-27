package org.softspiders.graphs.entity;

import java.util.UUID;

public class Pair {
	/**
	 * Pair UUID
	 */
	public UUID pid;

	/**
	 * UUID1 of something
	 */
	public UUID sid1;

	/**
	 * UUID2 of something
	 */
	public UUID sid2;

	public Pair(UUID sid1, UUID sid2) {
		this(UUID.randomUUID(), sid1, sid2);
	}

	public Pair(UUID pid, UUID sid1, UUID sid2) {
		if(pid == null || sid1 == null || sid2 == null) {
			throw new NullPointerException();
		}

		this.pid = pid;
		this.sid1 = sid1;
		this.sid2 = sid2;
	}
}
