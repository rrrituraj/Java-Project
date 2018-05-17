package com.tcs.ExceptionHandling;

@SuppressWarnings("serial")
public class TooYoungException extends RuntimeException {
    /**
     * it will throw the exception if person is less than the specified age
     *
     * @param s
     */
    public TooYoungException(String s) {
        super(s);
    }

}
