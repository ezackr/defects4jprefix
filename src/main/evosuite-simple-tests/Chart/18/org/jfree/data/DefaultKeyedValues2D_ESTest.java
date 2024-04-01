/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:31:00 GMT 2023
 */
package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DefaultKeyedValues2D_ESTest extends DefaultKeyedValues2D_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.removeRow((Comparable) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null 'key' argument.
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.removeColumn(0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.removeRow((-139));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        defaultKeyedValues2D0.clear();
        assertEquals(0, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getRowKey((-1136));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        defaultKeyedValues2D0.hashCode();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Double double0 = new Double((-1.0F));
        defaultKeyedValues2D0.setValue(double0, double0, double0);
        Float float0 = new Float((-1.0F));
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        Object object0 = defaultKeyedValues2D0.clone();
        boolean boolean0 = defaultKeyedValues2D0.equals(object0);
        assertEquals(2, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Double double0 = new Double((-1.0F));
        defaultKeyedValues2D0.setValue(double0, double0, double0);
        Float float0 = new Float((-1.0F));
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        Object object0 = defaultKeyedValues2D0.clone();
        boolean boolean0 = defaultKeyedValues2D0.equals(object0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Float float0 = new Float(0.0F);
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D(true);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        assertEquals(1, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        int int0 = defaultKeyedValues2D0.getColumnIndex(float0);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getColumnIndex((Comparable) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null 'key' argument.
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Double double0 = new Double((-1.0F));
        Float float0 = new Float((-1.0F));
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getValue((Comparable) float0, (Comparable) double0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unrecognised columnKey: -1.0
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getValue((Comparable) null, (Comparable) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null 'rowKey' argument.
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getValue((Comparable) 871, (Comparable) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null 'columnKey' argument.
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Double double0 = new Double((-1.0F));
        defaultKeyedValues2D0.setValue(double0, double0, double0);
        Float float0 = new Float((-1.0F));
        // Undeclared exception!
        try {
            defaultKeyedValues2D0.getValue((Comparable) float0, (Comparable) double0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unrecognised rowKey: -1.0
            //
            verifyException("org.jfree.data.DefaultKeyedValues2D", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Double double0 = new Double((-1.0F));
        defaultKeyedValues2D0.setValue(double0, double0, double0);
        Float float0 = new Float((-1.0F));
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        Number number0 = defaultKeyedValues2D0.getValue((Comparable) float0, (Comparable) double0);
        assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        Number number0 = defaultKeyedValues2D0.getValue((Comparable) float0, (Comparable) float0);
        assertEquals(0.0F, number0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Long long0 = new Long((-2546L));
        defaultKeyedValues2D0.setValue(long0, long0, long0);
        Float float0 = new Float((float) (-2546L));
        defaultKeyedValues2D0.removeValue(long0, float0);
        assertEquals(1, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(2915.86213);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        Float float1 = Float.valueOf((-2643.3962F));
        defaultKeyedValues2D0.removeValue(float1, float1);
        assertEquals(1, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(8.42F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        defaultKeyedValues2D0.removeValue(1, float0);
        assertEquals(1, defaultKeyedValues2D0.getRowCount());
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        boolean boolean0 = defaultKeyedValues2D0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        boolean boolean0 = defaultKeyedValues2D0.equals("YW*-M");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        assertTrue(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        Short short0 = new Short((short) 2440);
        defaultKeyedValues2D1.addValue(short0, short0, short0);
        boolean boolean0 = defaultKeyedValues2D1.equals(defaultKeyedValues2D0);
        assertFalse(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        Short short0 = new Short((short) 2440);
        defaultKeyedValues2D1.addValue(short0, short0, short0);
        boolean boolean0 = defaultKeyedValues2D1.equals(defaultKeyedValues2D0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float((-51.948048F));
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.removeColumn((Comparable) float0);
        boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
        assertEquals(1, defaultKeyedValues2D0.getColumnCount());
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float((-51.948048F));
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.removeColumn((Comparable) float0);
        boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        assertTrue(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }

    @Test(timeout = 4000)
    public void test2429() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.addValue((Number) null, float0, float0);
        boolean boolean0 = defaultKeyedValues2D1.equals(defaultKeyedValues2D0);
        assertFalse(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }

    @Test(timeout = 4000)
    public void test2430() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.addValue((Number) null, float0, float0);
        boolean boolean0 = defaultKeyedValues2D1.equals(defaultKeyedValues2D0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2531() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        assertTrue(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }

    @Test(timeout = 4000)
    public void test2532() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.addValue((Number) null, float0, float0);
        boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        DefaultKeyedValues2D defaultKeyedValues2D0 = new DefaultKeyedValues2D();
        Float float0 = new Float(0.0F);
        defaultKeyedValues2D0.setValue(float0, float0, float0);
        DefaultKeyedValues2D defaultKeyedValues2D1 = (DefaultKeyedValues2D) defaultKeyedValues2D0.clone();
        defaultKeyedValues2D1.addValue((Number) null, float0, float0);
        boolean boolean0 = defaultKeyedValues2D0.equals(defaultKeyedValues2D1);
        assertFalse(defaultKeyedValues2D1.equals((Object) defaultKeyedValues2D0));
    }
}
