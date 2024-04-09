/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:30:36 GMT 2024
 */
package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdDateFormat_ESTest extends StdDateFormat_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.JAPAN;
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0);
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
        assertSame(stdDateFormat1, stdDateFormat0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        boolean boolean0 = stdDateFormat0.equals(stdDateFormat1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getISO8601Format(timeZone0);
        assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSZ", mockSimpleDateFormat0.toLocalizedPattern());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getRFC1123Format(timeZone0);
        assertEquals("EEE, dd MMM yyyy HH:mm:ss zzz", mockSimpleDateFormat0.toPattern());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        TimeZone timeZone0 = stdDateFormat0.getTimeZone();
        assertNull(timeZone0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        TimeZone timeZone0 = TimeZone.getDefault();
        stdDateFormat0.setTimeZone(timeZone0);
        assertEquals("GMT", timeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone((TimeZone) null);
        assertNotSame(stdDateFormat1, stdDateFormat0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.hashCode();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
        assertNotSame(stdDateFormat1, stdDateFormat0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Locale locale0 = Locale.CHINESE;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
        assertNotSame(stdDateFormat1, stdDateFormat0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        Locale locale0 = Locale.US;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
        assertSame(stdDateFormat1, stdDateFormat0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.setLenient(false);
        assertFalse(stdDateFormat0.isLenient());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        boolean boolean0 = stdDateFormat0.isLenient();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        try {
            stdDateFormat0.parse("1Uk1-^?M$E");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"1Uk1-:00.000^?M$E\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Date date0 = stdDateFormat0.parse("0");
        assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        Date date0 = stdDateFormat0.parse("-1");
        assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        try {
            stdDateFormat0.parse(".600");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \".600\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Object object0 = stdDateFormat0.parseObject("2014-02-14T20:21:21.320+0000");
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseObject("-");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"-\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        try {
            stdDateFormat0.parseObject("00");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Format.parseObject(String) failed
            //
            verifyException("java.text.Format", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        MockDate mockDate0 = new MockDate();
        String string0 = stdDateFormat0.format((Date) mockDate0);
        assertEquals("2014-02-14T20:21:21.320+0000", string0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        String string0 = stdDateFormat0.toString();
        assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", string0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        boolean boolean0 = stdDateFormat0.equals(stdDateFormat0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        try {
            stdDateFormat0.parse("8K7o8WX1KX>AtvL.q*");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"8K7o8WX1KX>AtvL.q*\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        boolean boolean0 = stdDateFormat0.looksLikeISO8601("2.2250738585072012e-308");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", (ParsePosition) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(118);
        try {
            stdDateFormat0.parseAsISO8601("IC6Jbj.L]z:60Z", parsePosition0, false);
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"IC6Jbj.L]z:60.000Z\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("VB7L8D^q/WH-4+:7#", (ParsePosition) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(90);
        try {
            stdDateFormat0.parseAsISO8601("]=;((Ti|p* @+E8", parsePosition0, false);
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"]=;((Ti|p* @:00.00000.000+E800\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        try {
            stdDateFormat0.parse("1Uk1-ME");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"1Uk1-ME00\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(6);
        try {
            stdDateFormat0.parseAsISO8601("|gcdUq]-Io", parsePosition0, false);
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"|gcdUq]-Io00\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("\"5*Oordy-w%n8", (ParsePosition) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(14);
        try {
            stdDateFormat0.parseAsISO8601("P(+7w--Yu+wl`M", parsePosition0, true);
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"P(+7w--Yu000+wl`M\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("\"5*LOordy-w%n8K", (ParsePosition) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        try {
            stdDateFormat0.parse("1Uk1-^?N.M$E");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"1Uk1-^?N.M$EZ\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("\"(w@Rzy7<", (ParsePosition) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("!@:m5K}J7", (ParsePosition) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        try {
            stdDateFormat0.parse("1Uk1-^N.M$E");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"1Uk1-^N.M$E000Z\": while it seems to fit format 'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'', parsing fails (leniency? null)
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("N", (ParsePosition) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        // Undeclared exception!
        try {
            stdDateFormat0.parseAsISO8601("5O+K:*B[", (ParsePosition) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        try {
            stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")
            //
            verifyException("com.fasterxml.jackson.databind.util.StdDateFormat", e);
        }
    }
}
