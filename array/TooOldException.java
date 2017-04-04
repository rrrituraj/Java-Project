package com.tcs.array;

public class TooOldException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7608212542759889260L;

	/**
	 * it will throw the exception if person is more than the specified age
	 * @param s
	 */
	public TooOldException(String s) {
		super(s);
	}

}
