/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:51:30 GMT 2024
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdDateFormat_ESTest extends StdDateFormat_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.CHINA;
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0);
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getISO8601Format(timeZone0);
        mockSimpleDateFormat0.toPattern();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getRFC1123Format((TimeZone) null);
        mockSimpleDateFormat0.toLocalizedPattern();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        TimeZone timeZone0 = stdDateFormat0.getTimeZone();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone((TimeZone) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Locale locale0 = Locale.US;
        StdDateFormat stdDateFormat1 = stdDateFormat0.instance.withLocale(locale0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
        stdDateFormat1.setTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.setTimeZone(timeZone0);
        stdDateFormat0.isLenient();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        boolean boolean0 = stdDateFormat0.isLenient();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse(".10");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("-");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Date date0 = stdDateFormat0.parse("00");
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("1266-10-26T00:00:00.000+0000", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseObject("00");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseObject("-");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        MockDate mockDate0 = new MockDate((-583), (-583), (-583));
        String string0 = stdDateFormat0.instance.format((Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        String string0 = stdDateFormat0.toString();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.PRC;
        Boolean boolean0 = Boolean.FALSE;
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0, boolean0);
        String string0 = stdDateFormat0.toString();
        stdDateFormat0.isLenient();
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.PRC;
        Boolean boolean0 = Boolean.FALSE;
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0, locale0, boolean0);
        String string0 = stdDateFormat0.toString();
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("3@\"!{'O/A@h0u");
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        boolean boolean0 = stdDateFormat0.looksLikeISO8601("9cj1+c K^! |");
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("00", (ParsePosition) null, true);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        String string0 = "%yWyMM-dO'TbHm:sTZ";
        ParsePosition parsePosition0 = new ParsePosition((-40));
        stdDateFormat0.parseAsISO8601("%yWyMM-dO'TbHm:sTZ", parsePosition0, true);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(1702);
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("0&iC,1: x-5:`;", parsePosition0, false);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        ParsePosition parsePosition0 = new ParsePosition((-1033));
        stdDateFormat0.parseAsISO8601("5`I8e&L+>x", parsePosition0, true);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parse("7MC4-|^");
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("yhy-M-dd", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("yhy-M;-dd", (ParsePosition) null, true);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("v8]3GD'&+X$'k", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("~&W_4G!d+[|RCL", (ParsePosition) null, true);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("J'BQWs*q;-W.>W9", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601(" iOrb5<>0D", (ParsePosition) null, true);
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("j?R}r3zs{o`", (ParsePosition) null, true);
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("|", (ParsePosition) null, false);
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Date date0 = stdDateFormat0.parse("2014-02-14T20:21:21.320+0000");
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Locale locale0 = Locale.CANADA;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
        stdDateFormat1.parse("%?8sAWJ`lXASlQN[");
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        Locale locale0 = Locale.FRANCE;
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getISO8601Format(timeZone0, locale0);
        mockSimpleDateFormat0.toLocalizedPattern();
    }
}
