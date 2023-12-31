/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 18:21:29 GMT 2023
 */
package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.io.NumberInput;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class NumberInput_ESTest extends NumberInput_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        long long0 = NumberInput.parseAsLong("9\"ba(", 9223372036854775807L);
        assertEquals(9223372036854775807L, long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberInput.parseAsLong("$)z)>r7$#$Gn^Nd\",", 730L);
        assertEquals(730L, long0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        int int0 = NumberInput.parseAsInt("0", 15);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        int int0 = NumberInput.parseAsInt("9k&W%0apzCxj0zPGA", 44);
        assertEquals(44, int0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        int int0 = NumberInput.parseAsInt("\"@DU4j 9[~t/j~6+", (-1870));
        assertEquals((-1870), int0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong("m5]._Gfgt");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"m5]._Gfgt\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("793l7Ryo");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"793l7Ryo\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("9K1[u8aeI");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"9K1[u8aeI\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong("*eX5A[");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"*eX5A[\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        char[] charArray0 = new char[3];
        int int0 = NumberInput.parseInt(charArray0, 1, 1);
        assertEquals((-48), int0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        double double0 = NumberInput.parseAsDouble("w#c)d f}r[Td", 0.0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        long long0 = NumberInput.parseLong("0");
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        long long0 = NumberInput.parseLong("4");
        assertEquals(4L, long0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        char[] charArray0 = new char[7];
        charArray0[0] = 'r';
        int int0 = NumberInput.parseInt(charArray0, 0, 0);
        assertEquals(66, int0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        int int0 = NumberInput.parseInt("0");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        char[] charArray0 = new char[1];
        charArray0[0] = '9';
        BigDecimal bigDecimal0 = NumberInput.parseBigDecimal(charArray0);
        assertEquals((short) 9, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BigDecimal bigDecimal0 = NumberInput.parseBigDecimal("2.2250738585072012e-308");
        assertEquals((byte) 0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BigDecimal bigDecimal0 = NumberInput.parseBigDecimal("6");
        assertEquals((byte) 6, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        long long0 = NumberInput.parseAsLong("", (-1355L));
        assertEquals((-1355L), long0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong((char[]) null, 1241, 1736);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong("");
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt((char[]) null, (-406), (-406));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("");
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        try {
            NumberInput.parseDouble("8B4fGkT`E+&!ht~*}");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseDouble((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseBigDecimal((char[]) null, 2028, 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseBigDecimal((char[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseBigDecimal((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.inLongRange((String) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        double double0 = NumberInput.parseDouble("2.2250738585072012e-308");
        assertEquals(4.9E-324, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        double double0 = NumberInput.parseDouble("0");
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("75.|SH");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"75.|SH\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        char[] charArray0 = new char[1];
        try {
            NumberInput.parseBigDecimal(charArray0, (-3510), (-3510));
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // Bad offset or len arguments for char[] input.
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        double double0 = NumberInput.parseAsDouble("", 0.0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        double double0 = NumberInput.parseAsDouble((String) null, (-3593.177975));
        assertEquals((-3593.177975), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        double double0 = NumberInput.parseAsDouble("2.2250738585072012e-308", (-3593.177975));
        assertEquals(4.9E-324, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        long long0 = NumberInput.parseAsLong("2.2250738585072012e-308", (-1355L));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        long long0 = NumberInput.parseAsLong("-^d/ep]7s9T9];}!3h", 2017L);
        assertEquals(2017L, long0);
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        long long0 = NumberInput.parseAsLong("+d", 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        long long0 = NumberInput.parseAsLong((String) null, 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        long long0 = NumberInput.parseAsLong("0", 2017L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        int int0 = NumberInput.parseAsInt("-^d/ep]7s9T9];}!3h", 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        int int0 = NumberInput.parseAsInt("+", 23);
        assertEquals(23, int0);
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        int int0 = NumberInput.parseAsInt("", 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        int int0 = NumberInput.parseAsInt((String) null, 50);
        assertEquals(50, int0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        boolean boolean0 = NumberInput.inLongRange("hmE%tkd0#,Z}M;zfFm4", true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        boolean boolean0 = NumberInput.inLongRange("com.fasterxml.jackson.core.io.NumberInput", false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        boolean boolean0 = NumberInput.inLongRange("-^d/ep]7s9T9];}!3h", true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        boolean boolean0 = NumberInput.inLongRange("u6!-dhq#Ryzo#vF;xN", true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        char[] charArray0 = new char[5];
        charArray0[0] = 'V';
        boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 19, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        char[] charArray0 = new char[5];
        boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 19, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        char[] charArray0 = new char[5];
        boolean boolean0 = NumberInput.inLongRange(charArray0, (-5137), 512, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        char[] charArray0 = new char[19];
        boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 6, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseLong("-^d/ep]7s9T9];}!3h");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"-^d/ep]7s9T9];}!3h\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test5656() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("73l7Ryo");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"73l7Ryo\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test5757() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("737#vQly");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"737#vQly\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test5858() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("2(F");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"2(F\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test5959() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("/ApglaL>]");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"/ApglaL>]\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test6060() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("2.2250738585072012e-308");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"2.2250738585072012e-308\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test6161() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("-P");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"-P\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test6262() throws Throwable {
        // Undeclared exception!
        try {
            NumberInput.parseInt("-^d/ep]7s9T9];}!3h");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"-^d/ep]7s9T9];}!3h\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test6363() throws Throwable {
        int int0 = NumberInput.parseInt("6");
        assertEquals(6, int0);
    }

    @Test(timeout = 4000)
    public void test6464() throws Throwable {
        char[] charArray0 = new char[8];
        // Undeclared exception!
        try {
            NumberInput.parseInt(charArray0, 0, 43);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 8
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test6565() throws Throwable {
        char[] charArray0 = new char[8];
        int int0 = NumberInput.parseInt(charArray0, 5, 2);
        assertEquals((-528), int0);
    }

    @Test(timeout = 4000)
    public void test6666() throws Throwable {
        char[] charArray0 = new char[19];
        int int0 = NumberInput.parseInt(charArray0, 6, 6);
        assertEquals((-5333328), int0);
    }

    @Test(timeout = 4000)
    public void test6867() throws Throwable {
        try {
            NumberInput.parseBigDecimal("w#c)d f}r[Td");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test6968() throws Throwable {
        char[] charArray0 = new char[3];
        // Undeclared exception!
        try {
            NumberInput.parseLong(charArray0, 0, (-1));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -10
            //
            verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
        }
    }

    @Test(timeout = 4000)
    public void test7069() throws Throwable {
        char[] charArray0 = new char[5];
        try {
            NumberInput.parseBigDecimal(charArray0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }
}
