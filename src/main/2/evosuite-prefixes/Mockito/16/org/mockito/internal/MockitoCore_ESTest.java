/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:33:13 GMT 2024
 */
package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.MockSettings;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.verification.NoMoreInteractions;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.ClonesArguments;
import org.mockito.stubbing.Stubber;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MockitoCore_ESTest extends MockitoCore_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.stubVoid("q_p[_5s8lrKw4&");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.stub((Integer) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Class<String> class0 = String.class;
        MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
        mockitoCore0.mock(class0, (MockSettings) mockSettingsImpl0, true);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        ClonesArguments clonesArguments0 = new ClonesArguments();
        Stubber stubber0 = mockitoCore0.doAnswer(clonesArguments0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.when("Gv+A3<f1");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.getLastInvocation();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.validateMockitoUsage();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.stub();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
        mockitoCore0.verify((Object) noMoreInteractions0, (VerificationMode) noMoreInteractions0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.verify((Object) null, (VerificationMode) null);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Invocation[] invocationArray0 = new Invocation[0];
        mockitoCore0.reset(invocationArray0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Invocation[] invocationArray0 = new Invocation[1];
        mockitoCore0.reset(invocationArray0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[1];
        mockitoCore0.verifyNoMoreInteractions(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[1];
        objectArray0[0] = (Object) mockitoCore0;
        mockitoCore0.verifyNoMoreInteractions(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[0];
        mockitoCore0.verifyNoMoreInteractions(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        mockitoCore0.inOrder((Object[]) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[1];
        mockitoCore0.inOrder(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[0];
        mockitoCore0.inOrder(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        MockitoCore mockitoCore0 = new MockitoCore();
        Object[] objectArray0 = new Object[1];
        objectArray0[0] = (Object) mockitoCore0;
        mockitoCore0.inOrder(objectArray0);
    }
}
