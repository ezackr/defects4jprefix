/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 20:19:23 GMT 2024
 */
package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MultidimensionalCounter_ESTest extends MultidimensionalCounter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        int[] intArray0 = new int[5];
        MultidimensionalCounter multidimensionalCounter0 = null;
        try {
            multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 21;
        intArray0[1] = 17;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter_Iterator0.next();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.iterator();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator0.remove();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        int[] intArray1 = new int[1];
        intArray1[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        multidimensionalCounter0.getCounts(1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = 1;
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.getCounts(56);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        int[] intArray1 = new int[1];
        intArray1[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.iterator();
        Integer integer0 = new Integer(1);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        int[] intArray1 = new int[1];
        intArray1[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        multidimensionalCounter0.toString();
        multidimensionalCounter0.getCounts(1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        int[] intArray1 = new int[5];
        intArray1[0] = (-5312);
        intArray1[1] = (-5312);
        intArray1[2] = 2300;
        intArray1[3] = 2300;
        intArray1[4] = 2300;
        try {
            multidimensionalCounter0.getCount(intArray1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -5,312 out of [0, 0] range
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        int[] intArray1 = new int[1];
        intArray1[0] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts((-768292000));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -768,292,000 out of [0, 2,300] range
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.getSizes();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        try {
            multidimensionalCounter0.getCount(intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 out of [0, 0] range
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        intArray0[1] = 1688;
        intArray0[2] = (-5312);
        intArray0[3] = 56;
        intArray0[4] = 2300;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        multidimensionalCounter_Iterator0.getCount();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 1;
        intArray0[1] = 4612;
        intArray0[2] = 639;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        // Undeclared exception!
        try {
            multidimensionalCounter0.toString();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 1 != 3
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        int[] intArray1 = new int[1];
        intArray1[0] = 2704;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts(2704);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // 2,704 out of [0, 2,704] range
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 1;
        int[] intArray1 = new int[1];
        intArray1[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.iterator();
        multidimensionalCounter0.getDimension();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 2724;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.forEach(consumer0);
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        Integer integer0 = new Integer(2724);
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator0.getCount(2672);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2672
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 49;
        intArray0[1] = 2661;
        intArray0[2] = 89;
        intArray0[3] = 2690;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.spliterator();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter0.getSize();
        multidimensionalCounter0.getCounts(89);
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter_Iterator0.getCounts();
        int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter0.getCount(intArray1);
        multidimensionalCounter_Iterator0.getCounts();
        // Undeclared exception!
        try {
            multidimensionalCounter0.getCounts((-1656));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // -1,656 out of [0, 1,151,659,418] range
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        multidimensionalCounter0.spliterator();
        multidimensionalCounter0.forEach(consumer0);
        multidimensionalCounter0.toString();
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        multidimensionalCounter_Iterator0.next();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 4172;
        intArray0[1] = 28;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        multidimensionalCounter0.spliterator();
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        MultidimensionalCounter multidimensionalCounter1 = new MultidimensionalCounter(intArray0);
        // Undeclared exception!
        multidimensionalCounter1.forEach(consumer0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = (-23);
        int int0 = 2691;
        int[] intArray1 = new int[1];
        intArray1[0] = 2691;
        MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
        Integer integer0 = new Integer(2691);
        multidimensionalCounter_Iterator0.next();
        multidimensionalCounter_Iterator0.forEachRemaining(consumer0);
        multidimensionalCounter_Iterator0.next();
        // Undeclared exception!
        try {
            multidimensionalCounter_Iterator0.getCount(2672);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2672
            //
            verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
        }
    }
}
