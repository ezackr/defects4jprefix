/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 19:36:14 GMT 2023
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
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(2834, 2834, 2434, 2434, 2434).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(2834);
        Object object0 = new Object();
        frequency0.addValue(1L);
        double double0 = frequency0.getCumPct(object0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-2595));
        frequency0.addValue((Object) integer0);
        frequency0.addValue(integer0);
        double double0 = frequency0.getPct((-2595));
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        Object object0 = new Object();
        long long0 = frequency0.getCount(object0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyInt(), anyInt());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(1);
        frequency0.addValue((Object) integer0);
        Object object0 = new Object();
        double double0 = frequency0.getPct(object0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-1), (-1)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((-1));
        double double0 = frequency0.getPct(0L);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyInt(), anyInt());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(1);
        frequency0.addValue((Object) integer0);
        double double0 = frequency0.getPct(1L);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(2834, 2834).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(2834);
        double double0 = frequency0.getPct(1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        double double0 = frequency0.getPct('T');
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue('V');
        double double0 = frequency0.getPct(':');
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-1543), (-1543), (-1543)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((long) (-1543));
        double double0 = frequency0.getCumPct((long) (-1543));
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(1230);
        double double0 = frequency0.getCumPct((long) 1230);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('p');
        double double0 = frequency0.getCumPct(98);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(2834, 2834, 2434, 2434).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(2834);
        double double0 = frequency0.getCumPct((-1022));
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412), 1038, 1760, (-1068)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq('*');
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412), 1038, 1760, (-1068)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq('*');
        double double0 = frequency0.getCumPct('T');
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(2834, 2834, 2434, 2434).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(2834);
        double double0 = frequency0.getCumPct('W');
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-4305));
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq((long) (-4305));
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(0);
        long long0 = frequency0.getCount(0L);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((-2376L));
        long long0 = frequency0.getCount((-1280));
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue((-2376L));
        long long0 = frequency0.getCount('V');
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        frequency0.addValue(0);
        frequency0.getPct((Object) null);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((long) 58);
        frequency0.getCumPct((Object) null);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        frequency0.addValue('\"');
        frequency0.getCumFreq((Object) null);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.getCount((Object) null);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Object) null);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer('\u0019');
        frequency0.addValue('h');
        frequency0.addValue((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue((Integer) null);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('p');
        frequency0.addValue((-982L));
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('q');
        frequency0.addValue(0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(1537);
        frequency0.addValue('r');
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        double double0 = frequency0.getCumPct((Object) "");
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-1), (-3611), 1610612736, (-1008), 1).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(0);
        long long0 = frequency0.getCumFreq((Object) null);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412), 1038, 1760, (-1068)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq('*');
        long long1 = frequency0.getCumFreq((Object) null);
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0, 0, 0).when(comparator0).compare(anyLong(), anyLong());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue('V');
        Long long0 = new Long(0L);
        long long1 = frequency0.getCumFreq((Object) long0);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        long long0 = frequency0.getCumFreq((Object) null);
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Frequency frequency0 = new Frequency();
        Long long0 = new Long(921);
        double double0 = frequency0.getPct((Object) long0);
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0, 0).when(comparator0).compare(anyInt(), anyInt());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue('/');
        Long long0 = new Long(2488L);
        long long1 = frequency0.getCount((Object) long0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getCount((Object) null);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-1144));
        long long0 = frequency0.getCount((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue(247);
        long long0 = frequency0.getSumFreq();
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getSumFreq();
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq((-1008L));
    }

    @Test(timeout = 4000)
    public void test4143() throws Throwable {
        Frequency frequency0 = new Frequency();
        Iterator iterator0 = frequency0.valuesIterator();
    }

    @Test(timeout = 4000)
    public void test4244() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-4305));
        frequency0.addValue(integer0);
        frequency0.addValue(162);
        Long long0 = new Long(1);
        long long1 = frequency0.getCumFreq((Object) long0);
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412), 1038, 1760, (-1068)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        long long0 = frequency0.getCumFreq('*');
        double double0 = frequency0.getCumPct((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(1190, (-1412)).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        Integer integer0 = new Integer(853);
        frequency0.addValue(integer0);
        double double0 = frequency0.getPct((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount(0L);
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-4305));
        frequency0.addValue(integer0);
        frequency0.addValue((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test4750() throws Throwable {
        Frequency frequency0 = new Frequency((Comparator) null);
        long long0 = frequency0.getCount(0);
    }

    @Test(timeout = 4000)
    public void test4851() throws Throwable {
        Frequency frequency0 = new Frequency();
        frequency0.addValue('P');
        Integer integer0 = new Integer(1);
        frequency0.addValue(integer0);
    }

    @Test(timeout = 4000)
    public void test4952() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCumFreq('E');
    }

    @Test(timeout = 4000)
    public void test5053() throws Throwable {
        Frequency frequency0 = new Frequency();
        long long0 = frequency0.getCount(')');
    }

    @Test(timeout = 4000)
    public void test5154() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-1), (-3611), 1610612736, (-1008), 1).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(0);
        Integer integer0 = new Integer(1243);
        long long0 = frequency0.getCumFreq((Object) integer0);
    }

    @Test(timeout = 4000)
    public void test5155() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn((-1), (-3611), 1610612736, (-1008), 1).when(comparator0).compare(any(), any());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.addValue(0);
        Integer integer0 = new Integer(1243);
        long long0 = frequency0.getCumFreq((Object) integer0);
        long long1 = frequency0.getCumFreq(1243);
    }

    @Test(timeout = 4000)
    public void test5256() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        frequency0.clear();
    }

    @Test(timeout = 4000)
    public void test5357() throws Throwable {
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        Frequency frequency0 = new Frequency(comparator0);
        long long0 = frequency0.getCumFreq((-1));
    }

    @Test(timeout = 4000)
    public void test5458() throws Throwable {
        Frequency frequency0 = new Frequency();
        Integer integer0 = new Integer((-2595));
        frequency0.addValue((Object) integer0);
        String string0 = frequency0.toString();
    }
}
