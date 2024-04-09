/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 11:24:00 GMT 2024
 */
package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0000() throws Throwable {
        float float0 = NumberUtils.max((-2164.98F), 0.0F, (-2164.98F));
        assertEquals(0.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test0011() throws Throwable {
        float float0 = NumberUtils.min(0.0F, 0.0F, 0.0F);
        assertEquals(0.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test0022() throws Throwable {
        double double0 = NumberUtils.toDouble("");
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0033() throws Throwable {
        double double0 = NumberUtils.min(0.0, 0.0, (double) 0L);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0044() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
        byte[] byteArray0 = new byte[7];
        byteArray0[5] = (byte) numberUtils0.BYTE_MINUS_ONE;
        byte byte0 = NumberUtils.min(byteArray0);
        assertEquals((byte) (-1), byte0);
    }

    @Test(timeout = 4000)
    public void test0055() throws Throwable {
        byte byte0 = NumberUtils.toByte((String) null);
        assertEquals((byte) 0, byte0);
    }

    @Test(timeout = 4000)
    public void test0066() throws Throwable {
        double double0 = NumberUtils.max((double) 0L, (double) 0L, (double) 0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0077() throws Throwable {
        long long0 = NumberUtils.toLong("");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test0088() throws Throwable {
        int int0 = NumberUtils.toInt("PpFB]r[E&mk[h-T");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test0099() throws Throwable {
        float float0 = NumberUtils.toFloat("");
        assertEquals(0.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test01010() throws Throwable {
        short short0 = NumberUtils.toShort((String) null);
        assertEquals((short) 0, short0);
    }

    @Test(timeout = 4000)
    public void test01111() throws Throwable {
        int int0 = NumberUtils.toInt((String) null);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test01212() throws Throwable {
        long long0 = NumberUtils.toLong((String) null, 2046L);
        assertEquals(2046L, long0);
    }

    @Test(timeout = 4000)
    public void test01313() throws Throwable {
        float float0 = NumberUtils.toFloat((String) null, 1.0F);
        assertEquals(1.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test01414() throws Throwable {
        double double0 = NumberUtils.toDouble((String) null);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01515() throws Throwable {
        byte byte0 = NumberUtils.toByte("", (byte) 58);
        assertEquals((byte) 58, byte0);
    }

    @Test(timeout = 4000)
    public void test01616() throws Throwable {
        short short0 = NumberUtils.toShort("/GC`", (short) 2);
        assertEquals((short) 2, short0);
    }

    @Test(timeout = 4000)
    public void test01717() throws Throwable {
        try {
            NumberUtils.createNumber("0.PC-_#e.");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test01818() throws Throwable {
        Number number0 = NumberUtils.createNumber((String) null);
        assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test01919() throws Throwable {
        try {
            NumberUtils.createNumber("");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // A blank string is not a valid number
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test02020() throws Throwable {
        try {
            NumberUtils.createNumber("-#*KV:B8'Q0fxtshzh.E");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"*KV:\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test02121() throws Throwable {
        try {
            NumberUtils.createNumber("-0Xx2Uux9_i4WF{");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"-x2Uux9_i4WF{\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test02222() throws Throwable {
        try {
            NumberUtils.createNumber("-0x-");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // Sign character in wrong position
            //
            verifyException("java.lang.Integer", e);
        }
    }

    @Test(timeout = 4000)
    public void test02323() throws Throwable {
        try {
            NumberUtils.createNumber("0eF");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // 0eF is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test02424() throws Throwable {
        try {
            NumberUtils.createNumber(".k7NPz\".hMHTLIcC3s2");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test02525() throws Throwable {
        try {
            NumberUtils.createNumber(" is not a valid number.");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            //  is not a valid number. is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test02626() throws Throwable {
        try {
            NumberUtils.createNumber(":.VE0',Ke2");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // :.VE0',Ke2 is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test02727() throws Throwable {
        Number number0 = NumberUtils.createNumber("-0l");
        assertEquals(0L, number0);
    }

    @Test(timeout = 4000)
    public void test02828() throws Throwable {
        try {
            NumberUtils.createNumber("}$\"3aeZG5fF7QnE");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // }$\"3aeZG5fF7QnE is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test02929() throws Throwable {
        try {
            NumberUtils.createNumber("0e");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // 0e is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03030() throws Throwable {
        try {
            NumberUtils.createNumber(";NEd3Dz9:<D");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // ;NEd3Dz9:<D is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03131() throws Throwable {
        try {
            NumberUtils.createNumber("($L");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // ($L is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03232() throws Throwable {
        try {
            NumberUtils.createNumber("-)}z/d?q$pYqd");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // -)}z/d?q$pYqd is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03333() throws Throwable {
        try {
            NumberUtils.createNumber("f");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // f is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03434() throws Throwable {
        try {
            NumberUtils.createNumber("@Voc$P9p1(%r6L.^{\"l");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // @Voc$P9p1(%r6L.^{\"l is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03535() throws Throwable {
        try {
            NumberUtils.createNumber("Strings must not be null");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // Strings must not be null is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03636() throws Throwable {
        try {
            NumberUtils.createNumber("-Il");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // -Il is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test03737() throws Throwable {
        Number number0 = NumberUtils.createNumber("0l");
        assertEquals(0L, number0);
    }

    @Test(timeout = 4000)
    public void test03838() throws Throwable {
        Number number0 = NumberUtils.createNumber("0F");
        assertEquals((byte) 0, number0.byteValue());
    }

    @Test(timeout = 4000)
    public void test03939() throws Throwable {
        Number number0 = NumberUtils.createNumber("5F");
        assertEquals(5.0F, number0);
    }

    @Test(timeout = 4000)
    public void test04040() throws Throwable {
        try {
            NumberUtils.createNumber("p^E 0K.me?B5");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test04141() throws Throwable {
        try {
            NumberUtils.createNumber("--#EBz6+I9[\"SEuimqj&\u0005");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // --#EBz6+I9[\"SEuimqj&\u0005 is not a valid number.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test04242() throws Throwable {
        Number number0 = NumberUtils.createNumber("6");
        assertEquals(6, number0);
    }

    @Test(timeout = 4000)
    public void test04343() throws Throwable {
        Number number0 = NumberUtils.createNumber("0.");
        assertEquals(0.0F, number0);
    }

    @Test(timeout = 4000)
    public void test04444() throws Throwable {
        Number number0 = NumberUtils.createNumber("10.");
        assertEquals(10.0F, number0);
    }

    @Test(timeout = 4000)
    public void test04545() throws Throwable {
        Number number0 = NumberUtils.createNumber("-0.");
        assertEquals((short) 0, number0.shortValue());
    }

    @Test(timeout = 4000)
    public void test04646() throws Throwable {
        Float float0 = NumberUtils.createFloat((String) null);
        assertNull(float0);
    }

    @Test(timeout = 4000)
    public void test04747() throws Throwable {
        Double double0 = NumberUtils.createDouble((String) null);
        assertNull(double0);
    }

    @Test(timeout = 4000)
    public void test04848() throws Throwable {
        Integer integer0 = NumberUtils.createInteger((String) null);
        assertNull(integer0);
    }

    @Test(timeout = 4000)
    public void test04949() throws Throwable {
        Long long0 = NumberUtils.createLong((String) null);
        assertNull(long0);
    }

    @Test(timeout = 4000)
    public void test05050() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
        assertNull(bigInteger0);
    }

    @Test(timeout = 4000)
    public void test05151() throws Throwable {
        try {
            NumberUtils.createNumber("-0xThe Array must not be null");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"The A\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test05252() throws Throwable {
        // Undeclared exception!
        try {
            NumberUtils.createBigInteger("-)35\"j{p.fIsvN?!pcU");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \")35\"j{p.f\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test05353() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("06");
        assertEquals((short) 6, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test05454() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        assertEquals((byte) 0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test05555() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
        assertNull(bigDecimal0);
    }

    @Test(timeout = 4000)
    public void test05656() throws Throwable {
        long[] longArray0 = new long[4];
        longArray0[0] = (long) 33;
        long long0 = NumberUtils.min(longArray0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test05757() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 65;
        int int0 = NumberUtils.min(intArray0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test05858() throws Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[0] = (short) 56;
        short short0 = NumberUtils.min(shortArray0);
        assertEquals((short) 0, short0);
    }

    @Test(timeout = 4000)
    public void test05959() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byte byte0 = NumberUtils.min(byteArray0);
        assertEquals((byte) 0, byte0);
    }

    @Test(timeout = 4000)
    public void test06060() throws Throwable {
        double[] doubleArray0 = new double[26];
        doubleArray0[5] = Double.NaN;
        double double0 = NumberUtils.min(doubleArray0);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06161() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = (double) (-2448L);
        double double0 = NumberUtils.min(doubleArray0);
        assertEquals((-2448.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06262() throws Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[8] = Float.NaN;
        float float0 = NumberUtils.min(floatArray0);
        assertEquals(Float.NaN, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test06363() throws Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[0] = 1019.4F;
        float float0 = NumberUtils.min(floatArray0);
        assertEquals(0.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test06464() throws Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = (-1492L);
        long long0 = NumberUtils.max(longArray0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test06565() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
        int[] intArray0 = new int[4];
        intArray0[1] = (int) (byte) numberUtils0.BYTE_ONE;
        int int0 = NumberUtils.max(intArray0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test06666() throws Throwable {
        short[] shortArray0 = new short[13];
        shortArray0[1] = (short) 18;
        short short0 = NumberUtils.max(shortArray0);
        assertEquals((short) 18, short0);
    }

    @Test(timeout = 4000)
    public void test06767() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = (byte) (-57);
        byte byte0 = NumberUtils.max(byteArray0);
        assertEquals((byte) 0, byte0);
    }

    @Test(timeout = 4000)
    public void test06868() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = Double.NaN;
        double double0 = NumberUtils.max(doubleArray0);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06969() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = (-3025.2);
        double double0 = NumberUtils.max(doubleArray0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07070() throws Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[1] = Float.NaN;
        float float0 = NumberUtils.max(floatArray0);
        assertEquals(Float.NaN, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test07171() throws Throwable {
        float[] floatArray0 = new float[6];
        floatArray0[1] = 1808.6904F;
        float float0 = NumberUtils.max(floatArray0);
        assertEquals(1808.6904F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test07272() throws Throwable {
        // Undeclared exception!
        try {
            NumberUtils.max((double[]) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Array must not be null
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07373() throws Throwable {
        float[] floatArray0 = new float[0];
        // Undeclared exception!
        try {
            NumberUtils.min(floatArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Array cannot be empty.
            //
            verifyException("org.apache.commons.lang3.math.NumberUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07474() throws Throwable {
        long long0 = NumberUtils.min(2L, 2L, (-957L));
        assertEquals((-957L), long0);
    }

    @Test(timeout = 4000)
    public void test07575() throws Throwable {
        long long0 = NumberUtils.min((-1L), (-1662L), (-957L));
        assertEquals((-1662L), long0);
    }

    @Test(timeout = 4000)
    public void test07676() throws Throwable {
        int int0 = NumberUtils.min(3908, 3908, (-2703));
        assertEquals((-2703), int0);
    }

    @Test(timeout = 4000)
    public void test07777() throws Throwable {
        int int0 = NumberUtils.min((int) (byte) 0, (-1032), (int) (byte) 0);
        assertEquals((-1032), int0);
    }

    @Test(timeout = 4000)
    public void test07878() throws Throwable {
        short short0 = NumberUtils.min((short) 4, (short) 4, (short) (-16952));
        assertEquals((short) (-16952), short0);
    }

    @Test(timeout = 4000)
    public void test07979() throws Throwable {
        short short0 = NumberUtils.min((short) 100, (short) 4, (short) 4);
        assertEquals((short) 4, short0);
    }

    @Test(timeout = 4000)
    public void test08080() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
        byte byte0 = NumberUtils.min((byte) 7, (byte) numberUtils0.BYTE_ZERO, (byte) 2);
        assertEquals((byte) 0, byte0);
    }

    @Test(timeout = 4000)
    public void test08181() throws Throwable {
        byte byte0 = NumberUtils.min((byte) (-43), (byte) (-43), (byte) (-48));
        assertEquals((byte) (-48), byte0);
    }

    @Test(timeout = 4000)
    public void test08282() throws Throwable {
        long long0 = NumberUtils.max((-1658L), (-1658L), 2481L);
        assertEquals(2481L, long0);
    }

    @Test(timeout = 4000)
    public void test08383() throws Throwable {
        long long0 = NumberUtils.max((-820L), (-300L), (-820L));
        assertEquals((-300L), long0);
    }

    @Test(timeout = 4000)
    public void test08484() throws Throwable {
        int int0 = NumberUtils.max((-504), (-504), 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test08585() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
        int int0 = NumberUtils.max((int) numberUtils0.BYTE_ZERO, (int) numberUtils0.BYTE_ONE, (int) numberUtils0.BYTE_ONE);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test08686() throws Throwable {
        short short0 = NumberUtils.max((short) (byte) (-1), (short) 45, (short) 3);
        assertEquals((short) 45, short0);
    }

    @Test(timeout = 4000)
    public void test08787() throws Throwable {
        short short0 = NumberUtils.max((short) 0, (short) 0, (short) 995);
        assertEquals((short) 995, short0);
    }

    @Test(timeout = 4000)
    public void test08888() throws Throwable {
        byte byte0 = NumberUtils.max((byte) 96, (byte) 107, (byte) (-64));
        assertEquals((byte) 107, byte0);
    }

    @Test(timeout = 4000)
    public void test08989() throws Throwable {
        byte byte0 = NumberUtils.max((byte) 68, (byte) 68, (byte) 117);
        assertEquals((byte) 117, byte0);
    }

    @Test(timeout = 4000)
    public void test09090() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09191() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-56E.$K");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09292() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09393() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0d");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test09494() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09595() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x8E6-jY");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09696() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09797() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xf");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test09898() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x}`u*Pg@n\"(Z%S*");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09999() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test100100() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("5EK");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test101101() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test102102() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("8eEw");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test103103() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("9E+P+3G`s]N5Bfa");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test104104() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("EV8bphL=_");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test105105() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--,Fb");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test106106() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("..");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test107107() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("06");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test108108() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test109109() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test110110() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test111111() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test112112() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test113113() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("1F");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test114114() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0l");
        assertTrue(boolean0);
    }
}
