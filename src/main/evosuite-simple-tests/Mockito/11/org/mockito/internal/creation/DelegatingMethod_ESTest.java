/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 01:22:14 GMT 2023
 */
package org.mockito.internal.creation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.DelegatingMethod;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DelegatingMethod_ESTest extends DelegatingMethod_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DelegatingMethod delegatingMethod0 = null;
        try {
            delegatingMethod0 = new DelegatingMethod((Method) null);
            fail("Expecting exception: AssertionError");
        } catch (AssertionError e) {
            //
            // Method cannot be null
            //
        }
    }
}
