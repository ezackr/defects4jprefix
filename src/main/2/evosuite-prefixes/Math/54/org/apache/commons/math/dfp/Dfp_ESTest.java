/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 19:39:39 GMT 2024
 */
package org.apache.commons.math.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.dfp.Dfp;
import org.apache.commons.math.dfp.DfpField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Dfp_ESTest extends Dfp_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DfpField dfpField0 = new DfpField((-255));
        Dfp dfp0 = new Dfp(dfpField0, dfpField0.FLAG_DIV_ZERO);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Dfp dfp0 = Dfp.copysign((Dfp) null, (Dfp) null);
        int int0 = 33;
        dfp0.newInstance(int0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Dfp dfp0 = new Dfp((DfpField) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Dfp dfp0 = new Dfp((DfpField) null, (byte) (-26), (byte) 26);
        int int0 = 31;
        dfp0.power10K(int0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Dfp dfp0 = new Dfp((DfpField) null, (byte) 41);
        dfp0.log10();
        dfp0.negate();
    }
}
