/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 19:34:53 GMT 2023
 */
package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Frequency_ESTest extends Frequency_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(1670L);
        Long long0 = new Long(48L);
        double double0 = frequency0.getPct((Object) long0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(585L);
        double double0 = frequency0.getPct((-1577L));
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Comparable<?>) 0L);
        double double0 = frequency0.getPct(0L);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        frequency0.addValue((Object) "BoC)8pkBvutvuVq7c");
        double double0 = frequency0.getPct((-257));
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1553));
        double double0 = frequency0.getPct((-1553));
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('?');
        double double0 = frequency0.getPct('?');
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('?');
        Integer integer0 = new Integer(0);
        double double0 = frequency0.getCumPct((Object) integer0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        frequency0.addValue(comparable0);
        double double0 = frequency0.getCumPct(0L);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(3975, (-1359), 1, (-40), 1).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(0);
        double double0 = frequency0.getCumPct((-1));
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-399L));
        double double0 = frequency0.getCumPct(0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('h');
        double double0 = frequency0.getCumPct('@');
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1553));
        double double0 = frequency0.getCumPct('');
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-2039));
        long long0 = frequency0.getCumFreq((-376L));
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getCumFreq((-1));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('C');
        long long0 = frequency0.getCumFreq('C');
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1567, 1567, 1567, 1567, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Iterator iterator0 = frequency0.valuesIterator();
        frequency0.addValue((-1));
        long long0 = frequency0.getCumFreq((Object) iterator0);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1567, 1567, 1567, 1567, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Iterator iterator0 = frequency0.valuesIterator();
        frequency0.addValue((-1));
        long long0 = frequency0.getCumFreq((Object) iterator0);
        long long1 = frequency0.getCount((-1L));
        assertEquals(1L, long1);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-408));
        long long0 = frequency0.getCount((-408));
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1553));
        long long0 = frequency0.getCount('W');
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        Frequency frequency0 = new Frequency();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(56, (-218), 0, 0, 0).when(comparable0).compareTo(any());
        doReturn((String) null).when(comparable0).toString();
        frequency0.addValue((-399L));
        frequency0.addValue(comparable0);
        // Undeclared exception!
        try {
            frequency0.toString();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        // Undeclared exception!
        try {
            frequency0.getPct((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        frequency0.addValue((Object) "BoC)8pkBvutvuVq7c");
        // Undeclared exception!
        try {
            frequency0.getCumPct((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(1);
        frequency0.addValue(integer0);
        // Undeclared exception!
        try {
            frequency0.getCumFreq((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        Frequency frequency0 = new Frequency();
        // Undeclared exception!
        try {
            frequency0.getCount((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        Frequency frequency0 = new Frequency();
        // Undeclared exception!
        try {
            frequency0.addValue((Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((long) 0);
        // Undeclared exception!
        try {
            frequency0.addValue((Object) "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        Frequency frequency0 = new Frequency();
        Object object0 = new Object();
        // Undeclared exception!
        try {
            frequency0.addValue(object0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Object cannot be cast to java.lang.Comparable
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        Frequency frequency0 = new Frequency();
        // Undeclared exception!
        try {
            frequency0.addValue((Integer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        Integer integer0 = new Integer(0);
        // Undeclared exception!
        try {
            frequency0.addValue(integer0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        // Undeclared exception!
        try {
            frequency0.addValue((Comparable<?>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.TreeMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-399L));
        // Undeclared exception!
        try {
            frequency0.addValue((Comparable<?>) "Value \t Freq. \t Pct. \t Cum Pct. \n-399\t2\t100%\t100%\n");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('v');
        // Undeclared exception!
        try {
            frequency0.addValue((long) (-2362));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparable0).compareTo(any());
        frequency0.addValue(comparable0);
        // Undeclared exception!
        try {
            frequency0.addValue(0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(0L);
        // Undeclared exception!
        try {
            frequency0.addValue('S');
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value not comparable to existing values.
            //
            verifyException("org.apache.commons.math.stat.Frequency", e);
        }
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1553));
        double double0 = frequency0.getCumPct((Object) "");
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getCumPct((Object) "");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(4445, (-40), 1, (-40), 4445).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        frequency0.addValue(comparable0);
        long long0 = frequency0.getCumFreq((Object) "org.apache.commons.math.stat.Frequency");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-3759), (-40), 1, (-40), (-3759)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        frequency0.addValue(comparable0);
        long long0 = frequency0.getCumFreq((Object) "org.apache.commons.math.stat.Frequency");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-2645), (-2645), (-2645)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Object object0 = new Object();
        frequency0.addValue(2531);
        long long0 = frequency0.getCumFreq(object0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0).when(comparator0).compare(anyInt(), anyInt());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(278L);
        Object object0 = new Object();
        long long0 = frequency0.getCumFreq(object0);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test3940() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getCumFreq((Object) "");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4041() throws Throwable {
        Frequency frequency0 = new Frequency();
        Long long0 = new Long(316L);
        double double0 = frequency0.getPct((Object) long0);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test4142() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        frequency0.addValue(comparable0);
        long long0 = frequency0.getCount((Object) "Value \t Freq. \t Pct. \t Cum Pct. \nMock for Comparable, hashCode: 1184670510\t1\t100%\t100%\n");
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test4243() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount((Object) "O_j{lD'oz@");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4344() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-1728));
        long long0 = frequency0.getCount((Object) integer0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4445() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-399L));
        long long0 = frequency0.getSumFreq();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test4546() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getSumFreq();
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4647() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(1);
        frequency0.addValue((Comparable<?>) integer0);
    }

    @Test(timeout = 4000)
    public void test4748() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq(791L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4849() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1610612736, (-1), 1610612736, (-1), 1610612736).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1));
        double double0 = frequency0.getCumPct((long) 1610612736);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test4950() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(0);
        frequency0.addValue((Object) integer0);
        double double0 = frequency0.getPct((Object) integer0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test5051() throws Throwable {
        Frequency frequency0 = new Frequency();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparable0).compareTo(any());
        frequency0.addValue((-399L));
        frequency0.addValue(comparable0);
    }

    @Test(timeout = 4000)
    public void test5152() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1567, 1567, 1567, 1567, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((-1));
        String string0 = frequency0.toString();
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1\t0\t0%\t100%\n", string0);
    }

    @Test(timeout = 4000)
    public void test5253() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getCount((-1L));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5354() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount((int) 'w');
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5455() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-721));
        frequency0.addValue((-66));
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq((Object) integer0);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test5556() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq('E');
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5657() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount('~');
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5758() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(1);
        frequency0.addValue((Object) integer0);
        double double0 = frequency0.getPct('f');
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test5859() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        frequency0.clear();
    }

    @Test(timeout = 4000)
    public void test5960() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((-399L));
        long long0 = frequency0.getCumFreq(0);
        assertEquals(1L, long0);
    }
}
