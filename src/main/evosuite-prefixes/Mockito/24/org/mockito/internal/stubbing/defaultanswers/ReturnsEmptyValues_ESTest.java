/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 05:07:23 GMT 2023
 */
package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ReturnsEmptyValues_ESTest extends ReturnsEmptyValues_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
        Class<String> class0 = String.class;
        Object object0 = returnsEmptyValues0.returnValueFor(class0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
        Class<Integer> class0 = Integer.class;
        Object object0 = returnsEmptyValues0.returnValueFor(class0);
    }
}
