/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 19:47:19 GMT 2023
 */
package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0000() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.round(Float.NaN, 1354, 13);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid rounding method.
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0401() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.round((double) (-1), 0, 3677);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid rounding mode
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.lcm(0, 0);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0423() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.lcm(1972, 2146517618);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: mul
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0484() throws Throwable {
        double double0 = MathUtils.nextAfter((-249.9531578), 0);
        assertEquals((-249.95315779999999), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0495() throws Throwable {
        double double0 = MathUtils.nextAfter((-1.0), (-1.0));
        assertEquals((-1.0000000000000002), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0506() throws Throwable {
        double double0 = MathUtils.nextAfter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0517() throws Throwable {
        long long0 = MathUtils.mulAndCheck((-873L), (long) (short) 1);
        assertEquals((-873L), long0);
    }

    @Test(timeout = 4000)
    public void test0528() throws Throwable {
        long long0 = MathUtils.mulAndCheck((-2696L), (-2696L));
        assertEquals(7268416L, long0);
    }

    @Test(timeout = 4000)
    public void test0539() throws Throwable {
        int int0 = MathUtils.mulAndCheck(731142, 1359);
        assertEquals(993621978, int0);
    }

    @Test(timeout = 4000)
    public void test05410() throws Throwable {
        float float0 = MathUtils.indicator((float) (-1630L));
        assertEquals((-1.0F), float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test05511() throws Throwable {
        float float0 = MathUtils.indicator((float) (short) 1);
        assertEquals(1.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test05612() throws Throwable {
        int int0 = MathUtils.gcd((-1956), (-1956));
        assertEquals(1956, int0);
    }

    @Test(timeout = 4000)
    public void test05713() throws Throwable {
        double double0 = MathUtils.factorialLog(1359);
        assertEquals(8450.037750891279, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05814() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.factorialDouble((-3253));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= 0 for n!
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test05915() throws Throwable {
        double double0 = MathUtils.factorialDouble(3297);
        assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06016() throws Throwable {
        boolean boolean0 = MathUtils.equals(0.464843750003638, 0.464843750003638);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test06117() throws Throwable {
        double double0 = MathUtils.binomialCoefficientLog(1535, 15);
        assertEquals(82.07639319888865, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06218() throws Throwable {
        double double0 = MathUtils.binomialCoefficientLog(1, 0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06319() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficientLog((-1800), 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= k for binomial coefficient (n,k)
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test06420() throws Throwable {
        int int0 = MathUtils.subAndCheck(0, 1);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test06521() throws Throwable {
        short short0 = MathUtils.sign((short) (-1));
        assertEquals((short) (-1), short0);
    }

    @Test(timeout = 4000)
    public void test06622() throws Throwable {
        short short0 = MathUtils.sign((short) 0);
        assertEquals((short) 0, short0);
    }

    @Test(timeout = 4000)
    public void test06723() throws Throwable {
        short short0 = MathUtils.sign((short) 899);
        assertEquals((short) 1, short0);
    }

    @Test(timeout = 4000)
    public void test06824() throws Throwable {
        long long0 = MathUtils.sign((-1L));
        assertEquals((-1L), long0);
    }

    @Test(timeout = 4000)
    public void test06925() throws Throwable {
        long long0 = MathUtils.sign(0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test07026() throws Throwable {
        long long0 = MathUtils.sign((long) (short) 1);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test07127() throws Throwable {
        int int0 = MathUtils.sign((-1593));
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test07228() throws Throwable {
        int int0 = MathUtils.sign(0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test07329() throws Throwable {
        int int0 = MathUtils.sign(2);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test07430() throws Throwable {
        float float0 = MathUtils.sign((-1138.658F));
        assertEquals((-1.0F), float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test07531() throws Throwable {
        float float0 = MathUtils.sign(0.0F);
        assertEquals(0.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test07632() throws Throwable {
        float float0 = MathUtils.sign((float) (short) 1);
        assertEquals(1.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test07733() throws Throwable {
        double double0 = MathUtils.sign((-759.6439791));
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07834() throws Throwable {
        double double0 = MathUtils.sign(0.0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07935() throws Throwable {
        double double0 = MathUtils.sign(Double.NaN);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08036() throws Throwable {
        double double0 = MathUtils.sign((double) 38);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08137() throws Throwable {
        byte byte0 = MathUtils.sign((byte) 31);
        assertEquals((byte) 1, byte0);
    }

    @Test(timeout = 4000)
    public void test08238() throws Throwable {
        byte byte0 = MathUtils.sign((byte) 0);
        assertEquals((byte) 0, byte0);
    }

    @Test(timeout = 4000)
    public void test08339() throws Throwable {
        byte byte0 = MathUtils.sign((byte) (-41));
        assertEquals((byte) (-1), byte0);
    }

    @Test(timeout = 4000)
    public void test08440() throws Throwable {
        float float0 = MathUtils.round((float) 120, (int) (short) (-1), 5);
        assertEquals(120.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test08541() throws Throwable {
        float float0 = MathUtils.round(1.0F, 0, 0);
        assertEquals(2.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test08642() throws Throwable {
        double double0 = MathUtils.round(Double.NEGATIVE_INFINITY, 1, 570);
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08743() throws Throwable {
        double double0 = MathUtils.round(Double.NaN, (-2742), 356);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08844() throws Throwable {
        double double0 = MathUtils.scalb(1186.58, 0);
        assertEquals(1186.58, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08945() throws Throwable {
        double double0 = MathUtils.scalb(0.0, 0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09046() throws Throwable {
        double double0 = MathUtils.nextAfter(1.0, 0.0);
        assertEquals(0.9999999999999999, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09147() throws Throwable {
        double double0 = MathUtils.nextAfter(0L, (-1386));
        assertEquals((-4.9E-324), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09248() throws Throwable {
        double double0 = MathUtils.nextAfter(Double.NaN, 0.0);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09349() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.mulAndCheck(4503599627370495L, 2969L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: multiply
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09450() throws Throwable {
        long long0 = MathUtils.mulAndCheck(0L, 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test09551() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.mulAndCheck(2432902008176640000L, (long) (-1337364193));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: multiply
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09652() throws Throwable {
        long long0 = MathUtils.mulAndCheck((-1L), (long) 0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test09753() throws Throwable {
        long long0 = MathUtils.mulAndCheck((long) 21, (-2588L));
        assertEquals((-54348L), long0);
    }

    @Test(timeout = 4000)
    public void test09854() throws Throwable {
        long long0 = MathUtils.mulAndCheck((long) 19, (long) 19);
        assertEquals(361L, long0);
    }

    @Test(timeout = 4000)
    public void test09955() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.mulAndCheck((-150), (-1046936661));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: mul
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test10056() throws Throwable {
        short short0 = MathUtils.indicator((short) 899);
        assertEquals((short) 1, short0);
    }

    @Test(timeout = 4000)
    public void test10157() throws Throwable {
        short short0 = MathUtils.indicator((short) (-1));
        assertEquals((short) (-1), short0);
    }

    @Test(timeout = 4000)
    public void test10258() throws Throwable {
        long long0 = MathUtils.indicator(517L);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test10359() throws Throwable {
        long long0 = MathUtils.indicator((-455L));
        assertEquals((-1L), long0);
    }

    @Test(timeout = 4000)
    public void test10460() throws Throwable {
        int int0 = MathUtils.indicator((int) (byte) 0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test10561() throws Throwable {
        int int0 = MathUtils.indicator((-5480));
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test10662() throws Throwable {
        float float0 = MathUtils.round(784.95306F, (int) (short) 1);
        assertEquals(785.0F, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test10763() throws Throwable {
        float float0 = MathUtils.indicator(Float.NaN);
        assertEquals(Float.NaN, float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test10864() throws Throwable {
        double double0 = MathUtils.indicator((-5235.0));
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10965() throws Throwable {
        double double0 = MathUtils.indicator(Double.NaN);
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11066() throws Throwable {
        double double0 = MathUtils.indicator((double) 0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11167() throws Throwable {
        byte byte0 = MathUtils.indicator((byte) 0);
        assertEquals((byte) 1, byte0);
    }

    @Test(timeout = 4000)
    public void test11268() throws Throwable {
        byte byte0 = MathUtils.indicator((byte) (-1));
        assertEquals((byte) (-1), byte0);
    }

    @Test(timeout = 4000)
    public void test11369() throws Throwable {
        int int0 = MathUtils.gcd(2, 21);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test11470() throws Throwable {
        int int0 = MathUtils.lcm(840, 840);
        assertEquals(840, int0);
    }

    @Test(timeout = 4000)
    public void test11571() throws Throwable {
        int int0 = MathUtils.gcd((-405), 0);
        assertEquals(405, int0);
    }

    @Test(timeout = 4000)
    public void test11672() throws Throwable {
        int int0 = MathUtils.gcd(0, 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11773() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.factorialLog((-2545));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n > 0 for n!
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test11874() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.factorial((short) (-1));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= 0 for n!
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test11975() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.factorial(570);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // factorial value is too large to fit in a long
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test12076() throws Throwable {
        long long0 = MathUtils.factorial(0);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test12177() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[0];
        boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12278() throws Throwable {
        boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test12379() throws Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12480() throws Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12581() throws Throwable {
        boolean boolean0 = MathUtils.equals(Double.NaN, 738.67692);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12682() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = Double.NaN;
        boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test12783() throws Throwable {
        boolean boolean0 = MathUtils.equals(379.65915000474, 0.0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12884() throws Throwable {
        double double0 = MathUtils.binomialCoefficientLog(1638, (byte) 1);
        assertEquals(7.401231264413015, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12985() throws Throwable {
        double double0 = MathUtils.binomialCoefficientDouble(17, 0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13086() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficientLog((-1109), (-1109));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= 0 for binomial coefficient (n,k)
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13187() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficientDouble(0, 1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= k for binomial coefficient (n,k)
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13288() throws Throwable {
        long long0 = MathUtils.binomialCoefficient(1, (-1));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test13389() throws Throwable {
        long long0 = MathUtils.binomialCoefficient(0, (-1));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test13490() throws Throwable {
        long long0 = MathUtils.binomialCoefficient(19, 0);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test13591() throws Throwable {
        long long0 = MathUtils.binomialCoefficient(31, 31);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test13692() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficient((-176), (-1207));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= 0 for binomial coefficient (n,k)
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13793() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficient(7, 2826);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // must have n >= k for binomial coefficient (n,k)
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13894() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.binomialCoefficient(974, 840);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // result too large to represent in a long integer
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test13995() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.addAndCheck(9223372036854775807L, 9223372036854775807L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: add
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test14096() throws Throwable {
        long long0 = MathUtils.subAndCheck((long) 0, (long) 0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test14197() throws Throwable {
        long long0 = MathUtils.subAndCheck((long) 1, 517L);
        assertEquals((-516L), long0);
    }

    @Test(timeout = 4000)
    public void test14298() throws Throwable {
        // Undeclared exception!
        try {
            MathUtils.addAndCheck(2147390916, 2147390916);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // overflow: add
            //
            verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test14399() throws Throwable {
        int int0 = MathUtils.addAndCheck((int) (byte) 1, 0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test144100() throws Throwable {
        double double0 = MathUtils.log(0.9999999999999999, 1.0);
        assertEquals(-0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test145101() throws Throwable {
        double double0 = MathUtils.round((double) 0, 6);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test146102() throws Throwable {
        float float0 = MathUtils.round((-717.957F), 11);
        assertEquals((-717.957F), float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test147103() throws Throwable {
        double double0 = MathUtils.normalizeAngle(0L, 2.2909552562);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test148104() throws Throwable {
        double double0 = MathUtils.sinh(6);
        assertEquals(201.71315737027922, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test149105() throws Throwable {
        long long0 = MathUtils.addAndCheck((-1528L), (-1528L));
        assertEquals((-3056L), long0);
    }

    @Test(timeout = 4000)
    public void test150106() throws Throwable {
        float float0 = MathUtils.round((float) (-1528L), (int) (short) 1, (int) (short) 1);
        assertEquals((-1527.9F), float0, 0.01F);
    }

    @Test(timeout = 4000)
    public void test151107() throws Throwable {
        double[] doubleArray0 = new double[2];
        int int0 = MathUtils.hash(doubleArray0);
        assertEquals(961, int0);
    }

    @Test(timeout = 4000)
    public void test152108() throws Throwable {
        int int0 = MathUtils.hash((double) (-1528L));
        assertEquals((-1063788544), int0);
    }
}
