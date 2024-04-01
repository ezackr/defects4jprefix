/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 06:04:47 GMT 2023
 */
package org.apache.commons.math3.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Dfp_ESTest extends Dfp_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Dfp dfp0 = null;
        try {
            dfp0 = new Dfp((DfpField) null, 0L);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.dfp.Dfp", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Dfp dfp0 = null;
        try {
            dfp0 = new Dfp((DfpField) null, 549.05631869213);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.dfp.Dfp", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Dfp dfp0 = null;
        try {
            dfp0 = new Dfp((DfpField) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.dfp.Dfp", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        DfpField dfpField0 = new DfpField((-1657));
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        // Undeclared exception!
        try {
            Dfp.copysign((Dfp) null, (Dfp) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.dfp.Dfp", e);
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Dfp dfp0 = null;
        try {
            dfp0 = new Dfp((DfpField) null, (byte) (-93));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.dfp.Dfp", e);
        }
    }
}
