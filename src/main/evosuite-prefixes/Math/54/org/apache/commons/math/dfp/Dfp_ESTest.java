/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 15:54:10 GMT 2023
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Dfp_ESTest extends Dfp_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Dfp dfp0 = null;
        Dfp dfp1 = null;
        dfp1 = new Dfp((Dfp) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        byte byte0 = (byte) (-36);
        Dfp dfp0 = null;
        dfp0 = new Dfp((DfpField) null, (byte) (-36), (byte) (-36));
    }
}
