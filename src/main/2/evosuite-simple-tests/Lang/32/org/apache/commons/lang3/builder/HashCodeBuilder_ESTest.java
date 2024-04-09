/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 13:49:06 GMT 2024
 */
package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        byte[] byteArray0 = new byte[6];
        hashCodeBuilder0.append(byteArray0);
        assertEquals(667675993, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.appendSuper(37);
        assertEquals(666, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, (Collection<String>) linkedHashSet0);
        assertEquals(23654, int0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
        hashCodeBuilder0.hashCode();
        assertEquals((-1), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((-1275), (-1275), (Object) hashCodeBuilder0);
        assertEquals((-2072678244), int0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((-1275), (-1275), (Object) hashCodeBuilder0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        float[] floatArray0 = new float[1];
        hashCodeBuilder0.append(floatArray0);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((Object) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The object to build a hash code for must not be null
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        short[] shortArray0 = new short[1];
        hashCodeBuilder0.append(shortArray0);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, true);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, true);
        assertEquals(23464, int0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int[] intArray0 = new int[8];
        hashCodeBuilder0.append(intArray0);
        assertEquals((-779599631), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((-3844), (-3844), (Object) hashCodeBuilder0, false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Object object0 = new Object();
        Class<Object> class0 = Object.class;
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((-28), (-28), object0, true, (Class<? super Object>) class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        int int0 = HashCodeBuilder.reflectionHashCode((Object) 'w', (String[]) null);
        assertEquals(634, int0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Class<Object> class0 = Object.class;
        int int0 = HashCodeBuilder.reflectionHashCode((Object) class0, (String[]) null);
        assertEquals(17, int0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Class<String> class0 = String.class;
        int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), "path.separator", false, (Class<? super String>) class0, (String[]) null);
        assertEquals((-86), int0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder(0, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires a non zero initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder(1685, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires a non zero multiplier
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder((-1), (-1096));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd multiplier
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
        hashCodeBuilder0.append(false);
        assertEquals(2, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append(true);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        boolean[] booleanArray0 = new boolean[1];
        hashCodeBuilder0.append(booleanArray0);
        assertEquals(630, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((boolean[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((byte[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((char[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        double[] doubleArray0 = new double[1];
        hashCodeBuilder0.append(doubleArray0);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((double[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((float[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((int[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        long[] longArray0 = new long[10];
        hashCodeBuilder0.append(longArray0);
        assertEquals((-2120005431), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((long[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        Object[] objectArray0 = new Object[2];
        hashCodeBuilder0.append(objectArray0);
        assertEquals(23273, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((Object[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((short[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }
}
