/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:59:04 GMT 2023
 */
package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.hamcrest.core.StringContains;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;
import org.mockito.stubbing.Answer;

public class InvocationMatcherTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Object[] objectArray0 = new Object[10];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Object[]) null).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = null;
        invocationMatcher0 = new InvocationMatcher(invocation0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Object[] objectArray0 = new Object[2];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Object[]) null).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = null;
        invocationMatcher0 = new InvocationMatcher(invocation0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Object[] objectArray0 = new Object[3];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Object[]) null).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = null;
        invocationMatcher0 = new InvocationMatcher(invocation0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Object[] objectArray0 = new Object[10];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn(objectArray0).when(invocation0).getArguments();
        doReturn((Object) null).when(invocation0).getMock();
        InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
        invocationMatcher0.toString();
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Object[] objectArray0 = new Object[1];
        StringContains stringContains0 = new StringContains("");
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(invocation0).toString();
        doReturn(objectArray0).when(invocation0).getArguments();
        doReturn(stringContains0, "").when(invocation0).getMock();
        InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
        Invocation invocation1 = invocationMatcher0.getInvocation();
        boolean boolean0 = invocationMatcher0.matches(invocation1);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Stack<Invocation> stack0 = new Stack<Invocation>();
        Object[] objectArray0 = new Object[1];
        Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
        doReturn((Object[]) null).when(invocation0).getArguments();
        InvocationMatcher invocationMatcher0 = null;
        invocationMatcher0 = new InvocationMatcher(invocation0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Vector<Invocation> vector0 = new Vector<Invocation>();
        List<InvocationMatcher> list0 = InvocationMatcher.createFrom(vector0);
        list0.size();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        ArrayList<Invocation> arrayList0 = new ArrayList<Invocation>();
        arrayList0.add((Invocation) null);
        InvocationMatcher.createFrom(arrayList0);
    }
}
