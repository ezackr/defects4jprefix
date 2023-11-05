/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 16:30:29 GMT 2023
 */
package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.runner.RunWith;

public class StdDateFormatTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat((TimeZone) null);
        String string0 = stdDateFormat0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getBlueprintRFC1123Format();
        mockSimpleDateFormat0.toPattern();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getISO8601Format(timeZone0);
        mockSimpleDateFormat0.toLocalizedPattern();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getRFC1123Format(timeZone0);
        mockSimpleDateFormat0.toLocalizedPattern();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getBlueprintISO8601Format();
        mockSimpleDateFormat0.toPattern();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        TimeZone timeZone0 = TimeZone.getDefault();
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withTimeZone((TimeZone) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        Locale locale0 = Locale.CHINA;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Locale locale0 = Locale.US;
        StdDateFormat stdDateFormat1 = stdDateFormat0.withLocale(locale0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0);
        stdDateFormat0.setTimeZone(timeZone0);
        timeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        TimeZone timeZone0 = TimeZone.getDefault();
        stdDateFormat0.setTimeZone(timeZone0);
        timeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        Date date0 = stdDateFormat0.parse("0");
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("-");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("{");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.instance.format((Date) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.instance.format((Date) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        TimeZone timeZone0 = StdDateFormat.getDefaultTimeZone();
        StdDateFormat stdDateFormat0 = new StdDateFormat(timeZone0);
        String string0 = stdDateFormat0.toString();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parse("0;sJ%][*cF#}-");
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("2.25073858507202-308");
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parse("6Bt3-Xab<{e4");
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601(".000", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(43);
        Date date0 = stdDateFormat0.parseAsISO8601("-wa!HW:$[Z", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        ParsePosition parsePosition0 = new ParsePosition(10);
        Date date0 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(10);
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        Date date0 = stdDateFormat0.parseAsISO8601("\"9z!^-$W2\"-H<:90", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        ParsePosition parsePosition0 = new ParsePosition(10);
        Date date0 = stdDateFormat0.parseAsISO8601("jqpsB+41v;grwj4*+(R", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parse("8.;2-{G");
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("l.", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        StdDateFormat stdDateFormat0 = StdDateFormat.instance;
        stdDateFormat0.parseAsISO8601("mk$X+@+Le4}f", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        ParsePosition parsePosition0 = new ParsePosition(2);
        Date date0 = stdDateFormat0.parseAsISO8601("\"z!^)$(823+:90'", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        StdDateFormat stdDateFormat0 = new StdDateFormat();
        stdDateFormat0.parseAsISO8601("zd891_YWNnn-56^'", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Locale locale0 = Locale.JAPAN;
        MockSimpleDateFormat mockSimpleDateFormat0 = (MockSimpleDateFormat) StdDateFormat.getRFC1123Format((TimeZone) null, locale0);
        mockSimpleDateFormat0.toPattern();
    }
}
