/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:58:17 GMT 2024
 */
package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
        frequency0.addValue((long) 10);
        String string0 = frequency0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        long long0 = frequency0.getCumFreq((-1));
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.clear();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('w');
        Integer integer0 = new Integer(0);
        double double0 = frequency0.getCumPct((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct(1L);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount('(');
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq('5');
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct(0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(151L);
        frequency0.addValue(0L);
        double double0 = frequency0.getCumPct(1);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount((-2421));
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getCumPct(1030L);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Frequency frequency0 = new Frequency();
        double double0 = frequency0.getPct('i');
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = Integer.getInteger("", 10);
        frequency0.addValue(integer0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Frequency frequency0 = new Frequency();
        String string0 = frequency0.toString();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0).when(comparator0).compare(anyString(), anyString());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer((-1059));
        frequency0.addValue((long) (-1059));
        frequency0.addValue((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer(1668);
        long long0 = frequency0.getCount((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1, 1, 2123, (-2650), 1).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(0);
        long long0 = frequency0.getCumFreq((Object) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('T');
        double double0 = frequency0.getCumPct(')');
    }
}
