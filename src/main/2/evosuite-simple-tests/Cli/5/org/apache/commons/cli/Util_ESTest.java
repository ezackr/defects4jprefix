/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 21:57:33 GMT 2024
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Util_ESTest extends Util_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Util util0 = new Util();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        String string0 = Util.stripLeadingHyphens("-");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        String string0 = Util.stripLeadingHyphens("--");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        String string0 = Util.stripLeadingHyphens("b*h{p} jzFE");
        assertEquals("b*h{p} jzFE", string0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        String string0 = Util.stripLeadingAndTrailingQuotes("\"ED.Cahr");
        assertEquals("ED.Cahr", string0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        String string0 = Util.stripLeadingAndTrailingQuotes("~ejLg;=`mCF'-$5=e\"");
        assertEquals("~ejLg;=`mCF'-$5=e", string0);
    }
}
