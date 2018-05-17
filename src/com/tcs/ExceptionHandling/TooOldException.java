package com.tcs.ExceptionHandling;

@SuppressWarnings("serial")
public class TooOldException extends RuntimeException {
    /**
     * it will throw the exception if person is more than the specified age
     *
     * @param s
     */
    public TooOldException(String s) {
        super(s);
    }

}
