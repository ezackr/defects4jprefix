/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:23:18 GMT 2024
 */
package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Frequency frequency0 = new Frequency();
        Object object0 = new Object();
        // Undeclared exception!
        try {
            frequency0.getCumPct(object0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Object cannot be cast to java.lang.Comparable
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Frequency frequency0 = new Frequency();
        // Undeclared exception!
        try {
            frequency0.getCumFreq((Object) frequency0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.clear();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-2164));
        frequency0.addValue(integer0);
        double double0 = frequency0.getPct((Object) integer0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct((-591L));
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount('=');
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq('-');
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct(1);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getCumPct('K');
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Frequency frequency0 = new Frequency();
        // Undeclared exception!
        try {
            frequency0.getCount((Object) frequency0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount(1328);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getCumPct((-1057L));
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct('u');
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getCumPct(117);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount(3L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Frequency frequency0 = new Frequency();
        Object object0 = new Object();
        // Undeclared exception!
        try {
            frequency0.addValue(object0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // class (java.lang.Object) does not implement Comparable
            //
            verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Object) "org.apache.commons.math.MathRuntimeException$10");
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Comparable<?>) 31);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-1245));
        frequency0.addValue((long) (-1245));
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(2345);
        frequency0.addValue(integer0);
        double double0 = frequency0.getPct((Comparable<?>) integer0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyInt(), anyInt());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((-912));
        String string0 = frequency0.toString();
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-912\t1\t100%\t100%\n", string0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-30));
        long long0 = frequency0.getCumFreq((Comparable<?>) 1L);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(1L);
        long long0 = frequency0.getCumFreq((-1989));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-30));
        frequency0.addValue(712L);
        long long0 = frequency0.getCumFreq((Comparable<?>) 1L);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Frequency frequency0 = new Frequency();
        Frequency frequency1 = new Frequency();
        boolean boolean0 = frequency1.equals(frequency0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Frequency frequency0 = new Frequency();
        boolean boolean0 = frequency0.equals(frequency0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator<?>) null);
        boolean boolean0 = frequency0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Frequency frequency0 = new Frequency();
        Object object0 = new Object();
        boolean boolean0 = frequency0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Frequency frequency0 = new Frequency();
        Frequency frequency1 = new Frequency();
        assertTrue(frequency1.equals((Object) frequency0));
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        Frequency frequency0 = new Frequency();
        Frequency frequency1 = new Frequency();
        frequency1.addValue('\\');
        boolean boolean0 = frequency1.equals(frequency0);
        assertFalse(frequency1.equals((Object) frequency0));
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Frequency frequency0 = new Frequency();
        Frequency frequency1 = new Frequency();
        frequency1.addValue('\\');
        boolean boolean0 = frequency1.equals(frequency0);
        assertFalse(boolean0);
    }
}
