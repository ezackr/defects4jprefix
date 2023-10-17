/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 00:17:56 GMT 2023
 */
package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Equality;

public class EqualityTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Object object0 = new Object();
        Object object1 = new Object();
        // Undeclared exception!
        try {
            Equality.areArraysEqual(object0, object1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Argument is not an array
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        boolean boolean0 = Equality.isArray("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        // Undeclared exception!
        try {
            Equality.isArray((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        // Undeclared exception!
        try {
            Equality.areArraysEqual((Object) null, (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Object object0 = new Object();
        // Undeclared exception!
        try {
            Equality.areArrayLengthsEqual((Object) null, object0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Object object0 = new Object();
        // Undeclared exception!
        try {
            Equality.areArrayLengthsEqual(object0, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Argument is not an array
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        // Undeclared exception!
        try {
            Equality.areArrayElementsEqual((Object) null, (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Equality equality0 = new Equality();
        Object object0 = new Object();
        // Undeclared exception!
        try {
            Equality.areArrayElementsEqual(equality0, object0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Argument is not an array
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        boolean boolean0 = Equality.areEqual((Object) null, (Object) null);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Object object0 = new Object();
        boolean boolean0 = Equality.areEqual(object0, (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Object object0 = new Object();
        boolean boolean0 = Equality.areEqual((Object) null, object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Object object0 = new Object();
        Equality equality0 = new Equality();
        boolean boolean0 = Equality.areEqual(object0, equality0);
        assertFalse(boolean0);
    }
}
