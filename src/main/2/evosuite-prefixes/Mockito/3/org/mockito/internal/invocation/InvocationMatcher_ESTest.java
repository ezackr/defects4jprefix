/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:19:48 GMT 2024
 */
package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hamcrest.Matcher;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InvocationMatcher_ESTest extends InvocationMatcher_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Object[] objectArray0 = new Object[2];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn(objectArray0).when(invocation0).getArguments();
        doReturn((Method) null).when(invocation0).getMethod();
        InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
        Method method0 = invocationMatcher0.getMethod();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Object[] objectArray0 = new Object[4];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn(objectArray0).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
        List<Matcher> list0 = (List<Matcher>) invocationMatcher0.getMatchers();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Object[] objectArray0 = new Object[3];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Location) null).when(invocation0).getLocation();
        doReturn(objectArray0).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
        Location location0 = invocationMatcher0.getLocation();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Object[] objectArray0 = new Object[2];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Object[]) null).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = null;
        invocationMatcher0 = new InvocationMatcher(invocation0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        ArrayList<Invocation> arrayList0 = new ArrayList<Invocation>();
        List<InvocationMatcher> list0 = InvocationMatcher.createFrom(arrayList0);
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        ArrayList<Invocation> arrayList0 = new ArrayList<Invocation>();
        arrayList0.add((Invocation) null);
        InvocationMatcher.createFrom(arrayList0);
    }
}
