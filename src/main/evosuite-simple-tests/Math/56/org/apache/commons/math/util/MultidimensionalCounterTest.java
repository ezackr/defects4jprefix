/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:00:10 GMT 2023
 */
package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.function.Consumer;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.junit.runner.RunWith;

public class MultidimensionalCounterTest {

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 2097;
        intArray0[1] = 1383;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter0.getSize();
        multidimensionalCounter0.getSizes();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator1 = multidimensionalCounter0.iterator();
        multidimensionalCounter0.spliterator();
        int[] intArray1 = multidimensionalCounter_Iterator1.getCounts();
        int int0 = new Integer(1383);
        multidimensionalCounter_Iterator0.hasNext();
        try {
            multidimensionalCounter0.getCount(intArray1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -1 out of [0, 1,382] range
        }
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = (-672);
        intArray0[1] = (-672);
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.spliterator();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
        multidimensionalCounter_Iterator0.hasNext();
        try {
            multidimensionalCounter0.getCount(intArray1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 out of [0, -673] range
        }
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 2097;
        intArray0[1] = 1383;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter0.getSize();
        multidimensionalCounter0.getSizes();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator1 = multidimensionalCounter0.iterator();
        multidimensionalCounter0.spliterator();
        multidimensionalCounter_Iterator1.getCounts();
        int int0 = new Integer(2097);
        multidimensionalCounter0.iterator();
        multidimensionalCounter0.getSize();
        multidimensionalCounter_Iterator0.getCounts();
        multidimensionalCounter_Iterator0.getCount();
        multidimensionalCounter_Iterator0.hasNext();
        multidimensionalCounter_Iterator1.getCount();
        multidimensionalCounter0.getDimension();
        multidimensionalCounter_Iterator0.getCounts();
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator1.getCount((-1679));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1679
        }
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[1] = (-529);
        intArray0[1] = 12;
        intArray0[2] = 787;
        intArray0[3] = 0;
        intArray0[4] = (-291);
        int int0 = 0;
        intArray0[5] = (-291);
        int[] intArray1 = null;
        int[] intArray2 = new int[4];
        intArray2[0] = (-291);
        intArray2[1] = (-291);
        intArray2[2] = 787;
        intArray2[3] = 787;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray2);
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCount((int[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int[] intArray0 = new int[1];
        int int0 = 1860;
        intArray0[0] = 1860;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.spliterator();
        multidimensionalCounter0.spliterator();
        Consumer<Integer> consumer1 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.toString();
        multidimensionalCounter0.forEach(consumer1);
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts(2690);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 2,690 out of [0, 1,860] range
        }
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 2097;
        intArray0[1] = 1383;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.iterator();
        multidimensionalCounter0.getSize();
        multidimensionalCounter0.getSizes();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter0.spliterator();
        multidimensionalCounter_Iterator0.getCounts();
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator0.getCount(2097);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2097
        }
    }

    @Test(timeout = 4000)
    public void test116() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 1;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.toString();
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts(1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 out of [0, 1] range
        }
    }

    @Test(timeout = 4000)
    public void test127() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 1;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts(1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 out of [0, 1] range
        }
    }

    @Test(timeout = 4000)
    public void test138() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 3047;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        int[] intArray1 = new int[3];
        intArray1[0] = 3047;
        intArray1[1] = 3047;
        intArray1[2] = 3047;
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCount(intArray1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 3 != 1
        }
    }

    @Test(timeout = 4000)
    public void test149() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = (-483);
        intArray0[1] = (-2744);
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        // Undeclared exception!
        try {
            multidimensionalCounter0.toString();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 != 2
        }
    }

    @Test(timeout = 4000)
    public void test1510() throws Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 35;
        intArray0[1] = 1;
        intArray0[2] = 1;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.getDimension();
        // Undeclared exception!
        try {
            multidimensionalCounter0.toString();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 != 3
        }
    }

    @Test(timeout = 4000)
    public void test1611() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = (-2014);
        intArray0[1] = (-817);
        intArray0[2] = 276;
        intArray0[3] = (-1);
        intArray0[4] = 840;
        intArray0[5] = 1873;
        intArray0[6] = (-3518);
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.iterator();
        multidimensionalCounter0.spliterator();
        try {
            multidimensionalCounter0.getCount(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -2,014 out of [0, -2,015] range
        }
    }

    @Test(timeout = 4000)
    public void test1712() throws Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = (-4460);
        intArray0[1] = (-1677);
        intArray0[2] = 1900;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        try {
            multidimensionalCounter0.getCount(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -4,460 out of [0, -4,461] range
        }
    }

    @Test(timeout = 4000)
    public void test1813() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 188;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        try {
            multidimensionalCounter0.getCount(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 188 out of [0, 187] range
        }
    }

    @Test(timeout = 4000)
    public void test2014() throws Throwable {
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter((int[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2115() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = (-176);
        intArray0[1] = (-1207);
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.getSizes();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter_Iterator0.getCounts();
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator0.remove();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2416() throws Throwable {
        int[] intArray0 = new int[0];
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1
        }
    }

    @Test(timeout = 4000)
    public void test2517() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = 0;
        intArray0[1] = 750;
        intArray0[2] = (-1);
        intArray0[3] = 1;
        intArray0[4] = 507;
        intArray0[5] = 0;
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
        }
    }

    @Test(timeout = 4000)
    public void test2618() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 567;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.toString();
        String string0 = multidimensionalCounter0.toString();
        assertEquals("[0]", string0);
    }

    @Test(timeout = 4000)
    public void test2619() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 567;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.toString();
        String string0 = multidimensionalCounter0.toString();
        assertEquals(567, multidimensionalCounter0.getSize());
    }

    @Test(timeout = 4000)
    public void test2720() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 2454;
        intArray0[1] = 113;
        intArray0[2] = 3051;
        intArray0[3] = 173;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
        assertEquals(337485482, multidimensionalCounter0.getSize());
    }

    @Test(timeout = 4000)
    public void test2721() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 2454;
        intArray0[1] = 113;
        intArray0[2] = 3051;
        intArray0[3] = 173;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2722() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 2454;
        intArray0[1] = 113;
        intArray0[2] = 3051;
        intArray0[3] = 173;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
        assertEquals((-1), multidimensionalCounter_Iterator0.getCount());
    }

    @Test(timeout = 4000)
    public void test2823() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = (-322);
        intArray0[1] = 127;
        intArray0[2] = 412;
        intArray0[3] = 1362;
        intArray0[4] = (-1799);
        intArray0[5] = (-1462);
        intArray0[6] = 9958;
        intArray0[7] = 1099;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Integer integer0 = new Integer(127);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        multidimensionalCounter_Iterator0.hasNext();
        assertEquals((-1), multidimensionalCounter_Iterator0.getCount());
    }

    @Test(timeout = 4000)
    public void test2824() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = (-322);
        intArray0[1] = 127;
        intArray0[2] = 412;
        intArray0[3] = 1362;
        intArray0[4] = (-1799);
        intArray0[5] = (-1462);
        intArray0[6] = 9958;
        intArray0[7] = 1099;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Integer integer0 = new Integer(127);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        multidimensionalCounter_Iterator0.hasNext();
        int[] intArray1 = multidimensionalCounter0.getCounts(182);
        assertEquals(239459520, multidimensionalCounter0.getSize());
    }

    @Test(timeout = 4000)
    public void test2825() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = (-322);
        intArray0[1] = 127;
        intArray0[2] = 412;
        intArray0[3] = 1362;
        intArray0[4] = (-1799);
        intArray0[5] = (-1462);
        intArray0[6] = 9958;
        intArray0[7] = 1099;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Integer integer0 = new Integer(127);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        multidimensionalCounter_Iterator0.hasNext();
        int[] intArray1 = multidimensionalCounter0.getCounts(182);
        assertArrayEquals(new int[] { 0, 8, 5, 1, 1, 0, 5412, 44 }, intArray1);
    }

    @Test(timeout = 4000)
    public void test2926() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 2504;
        intArray0[1] = 8;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.spliterator();
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts((-4029));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -4,029 out of [0, 20,032] range
        }
    }

    @Test(timeout = 4000)
    public void test3027() throws Throwable {
        int[] intArray0 = new int[5];
        int int0 = 2083;
        intArray0[0] = 2083;
        intArray0[1] = 879;
        intArray0[2] = 0;
        intArray0[3] = 0;
        intArray0[4] = 2047;
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
        }
    }

    @Test(timeout = 4000)
    public void test3128() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 0;
        intArray0[1] = 0;
        intArray0[2] = (-1464);
        intArray0[3] = 1495;
        intArray0[4] = (-1);
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
        }
    }

    @Test(timeout = 4000)
    public void test3229() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 0;
        intArray0[1] = 2128;
        intArray0[2] = 565;
        intArray0[3] = (-1505);
        intArray0[4] = 874;
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
        }
    }

    @Test(timeout = 4000)
    public void test3330() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 3064;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        int[] intArray1 = new int[5];
        intArray1[0] = 3064;
        multidimensionalCounter0.getSizes();
        intArray1[1] = 3064;
        int int0 = 0;
        try {
            multidimensionalCounter0.getCount(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 3,064 out of [0, 3,063] range
        }
    }

    @Test(timeout = 4000)
    public void test3431() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 1215;
        intArray0[1] = 8388607;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.spliterator();
        multidimensionalCounter0.getSize();
        multidimensionalCounter0.getCounts(8388607);
        multidimensionalCounter0.getDimension();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter_Iterator0.getCounts();
        multidimensionalCounter_Iterator0.getCounts();
        // Undeclared exception!
        try {
            multidimensionalCounter0.toString();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 != 2
        }
    }
}
