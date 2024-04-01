/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:14:41 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CodeConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CodeConsumer_ESTest extends CodeConsumer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = CodeConsumer.isNegativeZero((-1.0));
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        boolean boolean0 = CodeConsumer.isNegativeZero(0.0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('_');
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('I');
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('$');
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        boolean boolean0 = CodeConsumer.isWordChar('*');
    }
}
