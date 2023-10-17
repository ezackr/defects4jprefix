/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 03:07:48 GMT 2023
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.NumberUtils;
import org.junit.runner.RunWith;

public class NumberUtilsTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = "?G<-2z'j@xi_AAjO/6";
        NumberUtils.isNumber("?G<-2z'j@xi_AAjO/6");
        try {
            NumberUtils.createNumber("?G<-2z'j@xi_AAjO/6");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // Illegal embedded sign character
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = "";
        NumberUtils.stringToInt("");
        String string1 = "zp";
        // Undeclared exception!
        try {
            NumberUtils.createDouble("zp");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = "kQR.S(5FA9+qO7";
        NumberUtils.stringToInt("kQR.S(5FA9+qO7", (-1));
        NumberUtils.maximum(2628, (-1), 2628);
        NumberUtils.minimum((-1), 2628, 570);
        NumberUtils.maximum((-1), (-1), (-10));
        NumberUtils.stringToInt("kQR.S(5FA9+qO7", 2628);
        NumberUtils.stringToInt("kQR.S(5FA9+qO7", (-1486));
        String string1 = "";
        NumberUtils.createBigDecimal("");
        long long0 = 427L;
        long long1 = 1311L;
        NumberUtils.minimum(long0, long1, long0);
        NumberUtils.createBigInteger(string0);
        NumberUtils numberUtils0 = null;
        try {
            numberUtils0 = new NumberUtils();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        int int0 = (-1);
        int int1 = (-2342);
        NumberUtils.maximum((-1), (-1), (-2342));
        String string0 = "";
        NumberUtils.isNumber("");
        NumberUtils.createInteger("0x");
        // Undeclared exception!
        try {
            NumberUtils.stringToInt(string0, int0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"\"
        }
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        String string0 = "?@{%;&56t6i";
        try {
            NumberUtils.createNumber("?@{%;&56t6i");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // ?@{%;&56t6i is not a valid number.
        }
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        String string0 = " f71I9!oAMBoC)8pkBv";
        // Undeclared exception!
        try {
            NumberUtils.createFloat(" f71I9!oAMBoC)8pkBv");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test136() throws Throwable {
        String string0 = "";
        // Undeclared exception!
        try {
            NumberUtils.createBigDecimal("");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test147() throws Throwable {
        String string0 = null;
        // Undeclared exception!
        try {
            NumberUtils.createBigInteger((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test158() throws Throwable {
        int int0 = 1919;
        NumberUtils.maximum(1919, 1, 1919);
        String string0 = "";
        NumberUtils.createDouble("");
        try {
            NumberUtils.createNumber(string0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test219() throws Throwable {
        long long0 = 168L;
        NumberUtils.maximum((-767L), 168L, 168L);
        String string0 = "MDw.`n~_g|U=[{<D";
        NumberUtils.createNumber("MDw.`n~_g|U=[{<D");
        // Undeclared exception!
        try {
            NumberUtils.stringToInt(string0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // MDw.`n~_g|U=[{<D is not a valid number.
        }
    }

    @Test(timeout = 4000)
    public void test3010() throws Throwable {
        long long0 = 6024L;
        NumberUtils.minimum(6024L, 6024L, 1L);
        int int0 = 68;
        NumberUtils.stringToInt("", 68);
        NumberUtils.stringToInt("twdW3Wh[ 3]7", (-227));
        NumberUtils.createBigDecimal("");
        NumberUtils.minimum(long0, (long) int0, (long) int0);
        String string0 = "";
        NumberUtils.isNumber(string0);
        String string1 = "oL";
        try {
            NumberUtils.createNumber(string1);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3311() throws Throwable {
        NumberUtils.compare((-38.4689), (-38.4689));
        int int0 = NumberUtils.compare((-38.4689), (-3928.3036262));
        NumberUtils.maximum(1, 0, 0);
        String string0 = "";
        NumberUtils.createBigDecimal("");
        NumberUtils.isDigits(string0);
        double double0 = 0.0;
        // Undeclared exception!
        try {
            NumberUtils.compare((double) int0, double0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3812() throws Throwable {
        String string0 = null;
        // Undeclared exception!
        try {
            NumberUtils.createInteger((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3913() throws Throwable {
        String string0 = " is not a valid number.";
        NumberUtils.isNumber(" is not a valid number.");
        // Undeclared exception!
        try {
            NumberUtils.createDouble(" is not a valid number.");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4114() throws Throwable {
        String string0 = "0x";
        NumberUtils.isNumber("0x");
        // Undeclared exception!
        try {
            NumberUtils.createBigDecimal("0x");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test4215() throws Throwable {
        NumberUtils.createNumber("=~S~Le");
        NumberUtils numberUtils0 = null;
        try {
            numberUtils0 = new NumberUtils();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // =~S~Le is not a valid number.
        }
    }

    @Test(timeout = 4000)
    public void test4316() throws Throwable {
        int int0 = (-5222);
        NumberUtils.maximum((-5222), (-5222), (-5222));
        NumberUtils.maximum((long) (-5222), 0L, 0L);
        NumberUtils.createDouble((String) null);
        String string0 = null;
        // Undeclared exception!
        try {
            NumberUtils.isDigits(string0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4717() throws Throwable {
        String string0 = "-0x6D(CP2dt";
        NumberUtils.isNumber("-0x6D(CP2dt");
        NumberUtils.createLong((String) null);
        // Undeclared exception!
        try {
            NumberUtils.createLong(string0);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // null
        }
    }

    @Test(timeout = 4000)
    public void test4818() throws Throwable {
        NumberUtils.compare((-1.0F), (-1.0F));
        NumberUtils.stringToInt("pE|&");
        String string0 = "...";
        NumberUtils.isNumber("...");
        NumberUtils.stringToInt("0x");
        NumberUtils.createNumber("0x");
        NumberUtils.createBigInteger(string0);
        String string1 = " \t\r\n\b";
        // Undeclared exception!
        try {
            NumberUtils.createBigInteger(string1);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"\"
        }
    }
}
