package com.yurivalle.fleet.exception;

public class FleetException extends RuntimeException {
	private static final long serialVersionUID = -3783608396637961769L;

	public FleetException(String message) {
		super(message);
	}

	public FleetException(String message, Throwable cause) {
		super(message, cause);
	}

	public FleetException(Throwable e) {
		super(e);
	}
}