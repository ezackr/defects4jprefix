/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 05:10:28 GMT 2023
 */
package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.util.Primitives;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Primitives_ESTest extends Primitives_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Class<Short> class0 = Short.class;
        Short short0 = Primitives.primitiveWrapperOf(class0);
        assertEquals((short) 0, (short) short0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<Integer> class1 = Primitives.primitiveTypeOf(class0);
        Integer integer0 = Primitives.primitiveValueOrNullFor(class1);
        assertNotNull(integer0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<Integer> class1 = Primitives.primitiveTypeOf(class0);
        Integer integer0 = Primitives.primitiveValueOrNullFor(class1);
        assertNotSame(class0, class1);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Class<Long> class0 = Long.class;
        Class<Long> class1 = Primitives.primitiveTypeOf(class0);
        Class<Long> class2 = Primitives.primitiveTypeOf(class1);
        assertEquals("long", class2.toString());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<Integer> class1 = Primitives.primitiveTypeOf(class0);
        boolean boolean0 = Primitives.isPrimitiveWrapper(class1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Class<Float> class0 = Float.class;
        boolean boolean0 = Primitives.isPrimitiveWrapper(class0);
        assertTrue(boolean0);
    }
}
