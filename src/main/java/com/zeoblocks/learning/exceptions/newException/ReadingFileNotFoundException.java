package com.zeoblocks.learning.exceptions.newException;

/**
 * Created with IntelliJ IDEA. 06.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class ReadingFileNotFoundException extends Exception {
    public ReadingFileNotFoundException(final String msg,final Throwable cause){
        super(msg,cause);
    }
}
