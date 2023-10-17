/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 01:33:09 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CodeConsumer;
import org.junit.runner.RunWith;

public class CodeConsumerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('c');
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('\u001B');
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('$');
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('_');
    }
}
