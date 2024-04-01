/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 04:37:21 GMT 2023
 */
package org.mockito.internal.creation.bytebuddy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker;
import org.mockito.internal.creation.bytebuddy.ClassInstantiator;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ByteBuddyMockMaker_ESTest extends ByteBuddyMockMaker_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ByteBuddyMockMaker byteBuddyMockMaker0 = new ByteBuddyMockMaker();
        MockSettingsImpl<Integer> mockSettingsImpl0 = new MockSettingsImpl<Integer>();
        // Undeclared exception!
        try {
            byteBuddyMockMaker0.resetMock((Object) null, (MockHandler) null, mockSettingsImpl0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ByteBuddyMockMaker byteBuddyMockMaker0 = new ByteBuddyMockMaker();
        MockSettingsImpl<ClassInstantiator.UsingObjenesis> mockSettingsImpl0 = new MockSettingsImpl<ClassInstantiator.UsingObjenesis>();
        // Undeclared exception!
        try {
            byteBuddyMockMaker0.createMock((MockCreationSettings<ClassInstantiator.UsingObjenesis>) mockSettingsImpl0, (MockHandler) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        ByteBuddyMockMaker byteBuddyMockMaker0 = new ByteBuddyMockMaker();
        MockSettingsImpl<Object> mockSettingsImpl0 = new MockSettingsImpl<Object>();
        SerializableMode serializableMode0 = SerializableMode.ACROSS_CLASSLOADERS;
        mockSettingsImpl0.serializable(serializableMode0);
        // Undeclared exception!
        try {
            byteBuddyMockMaker0.createMock((MockCreationSettings<Object>) mockSettingsImpl0, (MockHandler) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        ByteBuddyMockMaker byteBuddyMockMaker0 = new ByteBuddyMockMaker();
        MockSettingsImpl<ClassInstantiator.UsingObjenesis> mockSettingsImpl0 = new MockSettingsImpl<ClassInstantiator.UsingObjenesis>();
        MockHandler mockHandler0 = byteBuddyMockMaker0.getHandler(mockSettingsImpl0);
        assertNull(mockHandler0);
    }
}
