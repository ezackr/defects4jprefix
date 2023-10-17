/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:24:26 GMT 2023
 */
package com.google.gson.internal.bind.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.junit.runner.RunWith;

public class ISO8601UtilsTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = ISO8601Utils.parse("1866-04-29T23:59:59.969-00:00", parsePosition0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = ISO8601Utils.parse("1899-12-31T00:00:00Z", parsePosition0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockDate mockDate0 = new MockDate(60000, 60000, 60000, 16, 16);
        String string0 = ISO8601Utils.format((Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ISO8601Utils.parse("MM", (ParsePosition) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        MockDate mockDate0 = new MockDate(3903L);
        ISO8601Utils.format((Date) mockDate0, true, (TimeZone) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ISO8601Utils.format((Date) null, false);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(1);
        ISO8601Utils.parse("-00:00", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(0);
        ISO8601Utils.parse("Mismatching time zone indicator: ", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(2147483645);
        ISO8601Utils.parse("4", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(3);
        ISO8601Utils.parse("", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition((-1201));
        ISO8601Utils.parse((String) null, parsePosition0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(0);
        ISO8601Utils.parse("3938-06-04T16:18:16.000Z", parsePosition0);
        ISO8601Utils.parse("Mismatching time zone indicator: ", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = ISO8601Utils.parse("1901-02-01T00:00:00+00:00", parsePosition0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        ParsePosition parsePosition0 = new ParsePosition(1);
        ISO8601Utils.parse("+0000", parsePosition0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        MockDate mockDate0 = new MockDate(1, 1, 1);
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "1901-02-01T00:00:00Z");
        String string0 = ISO8601Utils.format((Date) mockDate0, false, (TimeZone) simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockDate mockDate0 = new MockDate((-48), (-48), (-48), (-48), (-48), (-48));
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-48), "1847-11-10T23:11:12Z");
        String string0 = ISO8601Utils.format((Date) mockDate0, true, (TimeZone) simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        MockDate mockDate0 = new MockDate(2254, (-2123), 2254, (-2123), (-496));
        TimeZone timeZone0 = TimeZone.getDefault();
        String string0 = ISO8601Utils.format((Date) mockDate0, true, timeZone0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        MockDate mockDate0 = new MockDate(2254, (-2123), 2254, (-2123), (-496));
        String string0 = ISO8601Utils.format((Date) mockDate0, false);
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        ISO8601Utils.format((Date) null);
    }
}
