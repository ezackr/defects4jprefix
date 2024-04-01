/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 10:20:42 GMT 2023
 */
package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.util.MockUtil;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MockUtil_ESTest extends MockUtil_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        mockUtil0.isMock(mockUtil0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        // Undeclared exception!
        try {
            mockUtil0.resetMock((Object) mockUtil0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
        Class<Object> class0 = Object.class;
        // Undeclared exception!
        try {
            mockUtil0.createMock(class0, mockSettingsImpl0);
            fail("Expecting exception: IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            //
            // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
            //
            verifyException("org.mockito.cglib.proxy.Enhancer", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
        // Undeclared exception!
        try {
            mockUtil0.getMockName(mockSettingsImpl0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        mockUtil0.getMockHandler((String) null);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        mockUtil0.isMock((Object) null);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        MockUtil mockUtil0 = new MockUtil();
        MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
        mockSettingsImpl0.serializable();
        Class<Object> class0 = Object.class;
        // Undeclared exception!
        try {
            mockUtil0.createMock(class0, mockSettingsImpl0);
            fail("Expecting exception: IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            //
            // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
            //
            verifyException("org.mockito.cglib.proxy.Enhancer", e);
        }
    }
}
