/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:58:08 GMT 2023
 */
package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Object object0 = new Object();
        HashCodeBuilder.unregister(object0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(0L);
        long[] longArray0 = new long[3];
        HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(longArray0);
        hashCodeBuilder2.append(1.5);
        int int0 = hashCodeBuilder2.toHashCode();
        assertEquals((-2042902491), int0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        String[] stringArray0 = new String[5];
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, stringArray0);
        assertEquals(23464, int0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        String[] stringArray0 = new String[5];
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, stringArray0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        int int0 = HashCodeBuilder.reflectionHashCode((Object) "nhHYnbZ]a0&$2C", true);
        assertEquals((-2091075101), int0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) "Mx!2Tjcwc.MP^5nK", (Collection<String>) linkedHashSet0);
        assertEquals((-218711832), int0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        int int0 = HashCodeBuilder.reflectionHashCode((Object) ";|$n06_hN");
        assertEquals((-97024550), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        Class<Object> class0 = Object.class;
        int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false, (Class<? super Object>) class0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        Class<Object> class0 = Object.class;
        int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) hashCodeBuilder0, false, (Class<? super Object>) class0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((int) (byte) (-1), (int) (byte) (-1), (Object) hashCodeBuilder0, false);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((int) (byte) (-1), (int) (byte) (-1), (Object) hashCodeBuilder0, false);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        Integer integer0 = new Integer((-1965));
        int int0 = HashCodeBuilder.reflectionHashCode((-1965), (-1965), (Object) integer0, false);
        assertEquals(3861230, int0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((-1933), 1, (Object) hashCodeBuilder0, true);
        assertEquals((-1922), int0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((-1933), 1, (Object) hashCodeBuilder0, true);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((int) (byte) (-1), (int) (byte) (-1), (Object) hashCodeBuilder0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((int) (byte) (-1), (int) (byte) (-1), (Object) hashCodeBuilder0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode(7, 37, (Object) hashCodeBuilder0);
        assertEquals(9774, int0);
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode(7, 37, (Object) hashCodeBuilder0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        Integer integer0 = new Integer(2379);
        int int0 = HashCodeBuilder.reflectionHashCode(17, (-1933), (Object) integer0);
        assertEquals((-32856), int0);
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        boolean boolean0 = HashCodeBuilder.isRegistered((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        boolean boolean0 = HashCodeBuilder.isRegistered(hashCodeBuilder0);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        boolean boolean0 = HashCodeBuilder.isRegistered(hashCodeBuilder0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1522() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
        hashCodeBuilder0.appendSuper((-1));
        assertEquals(0, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1623() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(2175.596F);
        HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append((-2218));
        hashCodeBuilder2.appendSuper((-2218));
        assertEquals(665929746, hashCodeBuilder2.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1724() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((double) (byte) (-1));
        hashCodeBuilder1.append((boolean[]) null);
        assertEquals((-1112515863), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1825() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        short[] shortArray0 = new short[7];
        hashCodeBuilder0.append(shortArray0);
        assertEquals((-1065792035), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(3415.51215627);
        int[] intArray0 = new int[4];
        hashCodeBuilder1.append(intArray0);
        assertEquals((-419157570), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((byte) (-1));
        float[] floatArray0 = new float[5];
        floatArray0[1] = (float) (byte) (-1);
        hashCodeBuilder1.append(floatArray0);
        assertEquals((-181808508), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1933), (-1933));
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = (double) (-1933L);
        hashCodeBuilder0.append(doubleArray0);
        assertEquals((-420431637), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        char[] charArray0 = new char[7];
        charArray0[0] = 'H';
        charArray0[2] = '*';
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(charArray0);
        hashCodeBuilder1.append(true);
        assertEquals((-359935093), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append(0.0F);
        hashCodeBuilder0.append((short) (-1413));
        assertEquals(21860, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2431() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append(919.2571F);
        hashCodeBuilder0.append((Object) null);
        assertEquals((-491291731), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2532() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(98.38F);
        hashCodeBuilder1.append(0L);
        assertEquals((-1502578284), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2633() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
        hashCodeBuilder0.append((float) (-1));
        hashCodeBuilder0.append((double) (-1));
        assertEquals(7340031, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2734() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((-1.0));
        hashCodeBuilder0.append('s');
        assertEquals((-1112515748), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2835() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append((-1.0F));
        hashCodeBuilder1.append((byte) 0);
        assertEquals((-1384097047), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test2936() throws Throwable {
        String[] stringArray0 = new String[2];
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((Object) null, stringArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The object to build a hash code for must not be null
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3037() throws Throwable {
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((Object) null, false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The object to build a hash code for must not be null
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((Object) null, (Collection<String>) linkedHashSet0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The object to build a hash code for must not be null
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Class<Object> class0 = Object.class;
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((-974), 2, linkedHashSet0, true, (Class<? super LinkedHashSet<String>>) class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((Object) hashCodeBuilder0);
        assertEquals(630, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        char[] charArray0 = new char[5];
        hashCodeBuilder0.append(charArray0);
        assertEquals(1178847269, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder(2049, (-686));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd multiplier
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder((-461), 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires a non zero multiplier
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3744() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = null;
        try {
            hashCodeBuilder0 = new HashCodeBuilder(32, 1250);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test3845() throws Throwable {
        Class<Object> class0 = Object.class;
        int int0 = HashCodeBuilder.reflectionHashCode((int) (-1), (int) (-1), "Mv:HWr-n)Q-)Nrl+0e", false, (Class<? super String>) class0, (String[]) null);
        assertEquals((-201), int0);
    }

    @Test(timeout = 4000)
    public void test3946() throws Throwable {
        Class<Object> class0 = Object.class;
        String[] stringArray0 = new String[5];
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode(57, 57, (IDKey) null, false, (Class<? super IDKey>) class0, stringArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The object to build a hash code for must not be null
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test4047() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((short) (-3652));
        assertEquals((-3023), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4148() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append('|');
        assertEquals(753, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4249() throws Throwable {
        String[] stringArray0 = new String[2];
        int int0 = HashCodeBuilder.reflectionHashCode((Object) "HashCodeBuilder requires an odd initial value", stringArray0);
        assertEquals((-1217694443), int0);
    }

    @Test(timeout = 4000)
    public void test4350() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = hashCodeBuilder0.toHashCode();
        assertEquals(17, int0);
    }

    @Test(timeout = 4000)
    public void test4451() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(0L);
        long[] longArray0 = new long[3];
        HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append(longArray0);
        hashCodeBuilder2.append(longArray0);
        assertEquals((-1065792035), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4552() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
        hashCodeBuilder0.append((short[]) null);
        assertEquals(289, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4653() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((Object[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4754() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        Object[] objectArray0 = new Object[20];
        hashCodeBuilder0.append(objectArray0);
        assertEquals((-1430351423), hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4855() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
        hashCodeBuilder0.append((long[]) null);
        assertEquals(289, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test4956() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int[] intArray0 = new int[1];
        hashCodeBuilder0.append(intArray0);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5057() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((int[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5158() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        float[] floatArray0 = new float[4];
        hashCodeBuilder0.append(floatArray0);
        assertEquals(31860737, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5259() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
        hashCodeBuilder0.append((float[]) null);
        assertEquals(289, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5360() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((double[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5461() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((char[]) null);
        assertEquals(629, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5562() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
        hashCodeBuilder0.append((byte[]) null);
        assertEquals(289, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5663() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.append((boolean[]) null);
        hashCodeBuilder0.append((-3865));
        assertEquals(19408, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5764() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        boolean[] booleanArray0 = new boolean[2];
        hashCodeBuilder0.append(booleanArray0);
        assertEquals(23311, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5865() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(17, 17);
        hashCodeBuilder0.append(true);
        assertEquals(289, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test5966() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(false);
        hashCodeBuilder1.append((byte) (-37));
        byte[] byteArray0 = new byte[8];
        hashCodeBuilder1.append(byteArray0);
        assertEquals((-2120005431), hashCodeBuilder1.toHashCode());
    }

    @Test(timeout = 4000)
    public void test6067() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode(37, 1152, (Object) hashCodeBuilder0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd multiplier
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test6168() throws Throwable {
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
    public void test6269() throws Throwable {
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
    public void test6370() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, true);
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test6371() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0, true);
        assertEquals(23464, int0);
    }

    @Test(timeout = 4000)
    public void test6472() throws Throwable {
        Object[] objectArray0 = new Object[5];
        objectArray0[0] = (Object) 'q';
        int int0 = HashCodeBuilder.reflectionHashCode(objectArray0[0]);
        assertEquals(634, int0);
    }

    @Test(timeout = 4000)
    public void test6573() throws Throwable {
        Integer integer0 = new Integer((-11));
        HashCodeBuilder.register(integer0);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) integer0, (Collection<String>) linkedList0);
        assertEquals(17, int0);
    }

    @Test(timeout = 4000)
    public void test6674() throws Throwable {
        Class<Object> class0 = Object.class;
        int int0 = HashCodeBuilder.reflectionHashCode((-2541), (-2541), "+\nSkS5rv", false, (Class<? super String>) class0);
        assertEquals(1820823473, int0);
    }

    @Test(timeout = 4000)
    public void test6775() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        // Undeclared exception!
        try {
            HashCodeBuilder.reflectionHashCode((int) '2', (int) (short) 36, (Object) hashCodeBuilder0, true);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // HashCodeBuilder requires an odd initial value
            //
            verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test6876() throws Throwable {
        Set<IDKey> set0 = HashCodeBuilder.getRegistry();
        int int0 = HashCodeBuilder.reflectionHashCode((Object) set0, false);
        assertEquals(17, int0);
    }

    @Test(timeout = 4000)
    public void test6977() throws Throwable {
        Class<String> class0 = String.class;
        String[] stringArray0 = new String[9];
        int int0 = HashCodeBuilder.reflectionHashCode((-3865), (-3865), "<HK@rCR`,*++SI15_+", false, (Class<? super String>) class0, stringArray0);
        assertEquals(195149834, int0);
    }

    @Test(timeout = 4000)
    public void test7078() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.hashCode();
        assertEquals(17, hashCodeBuilder0.toHashCode());
    }

    @Test(timeout = 4000)
    public void test7179() throws Throwable {
        HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
        hashCodeBuilder0.appendSuper(Integer.MAX_VALUE);
        assertEquals((-2147483020), hashCodeBuilder0.toHashCode());
    }
}
