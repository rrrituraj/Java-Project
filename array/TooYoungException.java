package com.tcs.array;

public class TooYoungException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * it will throw the exception if person is less than the specified age
	 * @param s
	 */
	public TooYoungException(String s) {
		super(s);
	}

}