/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 03:07:48 GMT 2023
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = "?G<-2z'j@xi_AAjO/6";
        NumberUtils.isNumber("?G<-2z'j@xi_AAjO/6");
        NumberUtils.createNumber("?G<-2z'j@xi_AAjO/6");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = "";
        NumberUtils.stringToInt("");
        String string1 = "zp";
        NumberUtils.createDouble("zp");
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
        numberUtils0 = new NumberUtils();
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        int int0 = (-1);
        int int1 = (-2342);
        NumberUtils.maximum((-1), (-1), (-2342));
        String string0 = "";
        NumberUtils.isNumber("");
        NumberUtils.createInteger("0x");
        NumberUtils.stringToInt(string0, int0);
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        String string0 = "?@{%;&56t6i";
        NumberUtils.createNumber("?@{%;&56t6i");
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        String string0 = " f71I9!oAMBoC)8pkBv";
        NumberUtils.createFloat(" f71I9!oAMBoC)8pkBv");
    }

    @Test(timeout = 4000)
    public void test136() throws Throwable {
        String string0 = "";
        NumberUtils.createBigDecimal("");
    }

    @Test(timeout = 4000)
    public void test147() throws Throwable {
        String string0 = null;
        NumberUtils.createBigInteger((String) null);
    }

    @Test(timeout = 4000)
    public void test158() throws Throwable {
        int int0 = 1919;
        NumberUtils.maximum(1919, 1, 1919);
        String string0 = "";
        NumberUtils.createDouble("");
        NumberUtils.createNumber(string0);
    }

    @Test(timeout = 4000)
    public void test219() throws Throwable {
        long long0 = 168L;
        NumberUtils.maximum((-767L), 168L, 168L);
        String string0 = "MDw.`n~_g|U=[{<D";
        NumberUtils.createNumber("MDw.`n~_g|U=[{<D");
        NumberUtils.stringToInt(string0);
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
        NumberUtils.createNumber(string1);
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
        NumberUtils.compare((double) int0, double0);
    }

    @Test(timeout = 4000)
    public void test3812() throws Throwable {
        String string0 = null;
        NumberUtils.createInteger((String) null);
    }

    @Test(timeout = 4000)
    public void test3913() throws Throwable {
        String string0 = " is not a valid number.";
        NumberUtils.isNumber(" is not a valid number.");
        NumberUtils.createDouble(" is not a valid number.");
    }

    @Test(timeout = 4000)
    public void test4114() throws Throwable {
        String string0 = "0x";
        NumberUtils.isNumber("0x");
        NumberUtils.createBigDecimal("0x");
    }

    @Test(timeout = 4000)
    public void test4215() throws Throwable {
        NumberUtils.createNumber("=~S~Le");
        NumberUtils numberUtils0 = null;
        numberUtils0 = new NumberUtils();
    }

    @Test(timeout = 4000)
    public void test4316() throws Throwable {
        int int0 = (-5222);
        NumberUtils.maximum((-5222), (-5222), (-5222));
        NumberUtils.maximum((long) (-5222), 0L, 0L);
        NumberUtils.createDouble((String) null);
        String string0 = null;
        NumberUtils.isDigits(string0);
    }

    @Test(timeout = 4000)
    public void test4717() throws Throwable {
        String string0 = "-0x6D(CP2dt";
        NumberUtils.isNumber("-0x6D(CP2dt");
        NumberUtils.createLong((String) null);
        NumberUtils.createLong(string0);
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
        NumberUtils.createBigInteger(string1);
    }
}
