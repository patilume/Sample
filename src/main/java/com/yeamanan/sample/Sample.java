package com.yeamanan.sample;

import org.apache.log4j.Logger;

/**
 * Sample class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class Sample {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(Sample.class);

    /**
     * Main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        LOGGER.info(write());
    }

    /**
     * write() method.
     *
     * @return some text
     */
    //public static String write() {
    public String write() {
        return "This is a sample project";
    }
}
