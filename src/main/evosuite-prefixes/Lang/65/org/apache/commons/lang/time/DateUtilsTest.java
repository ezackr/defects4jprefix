/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:33:48 GMT 2023
 */
package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.junit.runner.RunWith;

public class DateUtilsTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockDate mockDate0 = new MockDate(3576, 3576, 3576, 3576, (-282));
        DateUtils.iterator((Object) mockDate0, 3576);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MockDate mockDate0 = new MockDate((-1), (-1), (-1), (-202), (-1));
        Date date0 = DateUtils.round((Date) mockDate0, 5);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String[] stringArray0 = new String[4];
        stringArray0[0] = "y >";
        stringArray0[1] = "";
        DateUtils.parseDate("y >", stringArray0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
        boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        mockGregorianCalendar0.toString();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        mockGregorianCalendar0.setTimeInMillis(9);
        boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        String[] stringArray0 = new String[8];
        stringArray0[0] = "";
        Date date0 = DateUtils.parseDate("", stringArray0);
        Locale locale0 = new Locale("", "");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Date date1 = mockGregorianCalendar0.getGregorianChange();
        boolean boolean0 = DateUtils.isSameInstant(date0, date1);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Locale locale0 = Locale.KOREAN;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.truncate(calendar0, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
        calendar1.toString();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        Locale locale0 = Locale.KOREAN;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.truncate(calendar0, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        MockDate mockDate1 = new MockDate((-988), (-988), (-988));
        boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        Calendar calendar0 = MockCalendar.getInstance();
        calendar0.setLenient(false);
        Calendar calendar1 = DateUtils.truncate(calendar0, 0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        Calendar calendar0 = MockCalendar.getInstance();
        calendar0.setLenient(false);
        Calendar calendar1 = DateUtils.truncate(calendar0, 0);
        calendar1.equals((Object) calendar0);
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        mockGregorianCalendar0.setLenient(false);
        Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 11);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4084, 4084, 4084, 4084, 4084, 4084);
        mockGregorianCalendar0.setLenient(false);
        DateUtils.truncate((Object) mockGregorianCalendar0, 4084);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        mockGregorianCalendar0.set(0, 305);
        DateUtils.round((Calendar) mockGregorianCalendar0, 0);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        String[] stringArray0 = new String[4];
        stringArray0[0] = "a-w:_'P#fU2u2;R";
        DateUtils.parseDate("", stringArray0);
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1767), (-1767), (-1767), 889, (-912));
        mockGregorianCalendar0.setLenient(false);
        DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        DateUtils.addYears((Date) null, 0);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        DateUtils.addWeeks((Date) null, 149);
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        DateUtils.addSeconds((Date) null, 6);
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        DateUtils.addMonths((Date) null, 0);
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        DateUtils.addMilliseconds((Date) null, 1000);
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        DateUtils.addHours((Date) null, 0);
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        DateUtils.addDays((Date) null, 2028);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        MockDate mockDate0 = new MockDate((-1081), (-1081), 0, (-745), 5226, 0);
        DateUtils.add(mockDate0, (-348), (-348));
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1990, (-1306), 1990);
        DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        mockGregorianCalendar0.toString();
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1990, (-1306), 1990);
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        mockGregorianCalendar0.toString();
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        Locale locale0 = Locale.CHINA;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4085);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ROOT;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        mockGregorianCalendar0.toString();
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        DateUtils.add((Date) null, 2091, 2091);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        MockDate mockDate0 = new MockDate();
        Date date0 = DateUtils.add(mockDate0, 11, 0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2337, 2337, 2337, 2337, 2337);
        MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2337, 2337, 2337, 0, 0, 0);
        boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, (-988), 0, 0);
        DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
        dateUtils_DateIterator0.next();
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
        dateUtils_DateIterator0.next();
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1990, (-1306), 1990);
        DateUtils.iterator((Object) mockGregorianCalendar0, (-1306));
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        DateUtils.iterator((Object) null, 0);
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        MockDate mockDate0 = new MockDate(1990, 1990, 1990, 1990, 1990);
        Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        MockDate mockDate0 = new MockDate((-988), (-988), (-988));
        Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 6);
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1990, (-1306), 1990);
        Date date0 = mockGregorianCalendar0.getGregorianChange();
        Iterator iterator0 = DateUtils.iterator(date0, 4);
    }

    @Test(timeout = 4000)
    public void test3842() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ROOT;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
    }

    @Test(timeout = 4000)
    public void test3943() throws Throwable {
        Calendar calendar0 = MockCalendar.getInstance();
        DateUtils.iterator(calendar0, 2);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test4044() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        DateUtils.iterator((Calendar) null, 4);
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        DateUtils.iterator((Date) null, (-1));
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        mockGregorianCalendar0.set(220, 220, 14, 960, 52);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        Date date0 = DateUtils.addHours(mockDate0, (-988));
        Date date1 = DateUtils.round(date0, 1001);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test4449() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        Date date0 = DateUtils.addHours(mockDate0, (-988));
        Date date1 = DateUtils.round(date0, 1001);
        date1.toString();
    }

    @Test(timeout = 4000)
    public void test4550() throws Throwable {
        MockDate mockDate0 = new MockDate(3, 1145, 0, 1, 60000, 1145);
        Date date0 = DateUtils.round((Date) mockDate0, 1001);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test4651() throws Throwable {
        MockDate mockDate0 = new MockDate((-1), (-1), (-1), (-202), (-1));
        Date date0 = DateUtils.round((Date) mockDate0, 1);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test4752() throws Throwable {
        MockDate mockDate0 = new MockDate(3, 6, 0, 1, 0, 6);
        Date date0 = DateUtils.round((Date) mockDate0, 1001);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test4853() throws Throwable {
        MockDate mockDate0 = new MockDate(280000000, (-2548), 280000000);
        DateUtils.truncate((Date) mockDate0, 1398);
    }

    @Test(timeout = 4000)
    public void test4954() throws Throwable {
        Locale locale0 = Locale.ROOT;
        DateUtils.truncate((Object) locale0, (-838));
    }

    @Test(timeout = 4000)
    public void test5055() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        Date date0 = DateUtils.truncate((Object) mockDate0, 0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test5156() throws Throwable {
        DateUtils.truncate((Object) null, 887);
    }

    @Test(timeout = 4000)
    public void test5257() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4084, "");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
        DateUtils.truncate((Object) mockGregorianCalendar0, 4084);
    }

    @Test(timeout = 4000)
    public void test5358() throws Throwable {
        DateUtils.truncate((Calendar) null, 1707);
    }

    @Test(timeout = 4000)
    public void test5459() throws Throwable {
        DateUtils.truncate((Date) null, 4);
    }

    @Test(timeout = 4000)
    public void test5560() throws Throwable {
        MockDate mockDate0 = new MockDate((-2840), (-2840), 0);
        Date date0 = DateUtils.truncate((Date) mockDate0, 0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test5661() throws Throwable {
        DateUtils.round((Object) "GMT", 0);
    }

    @Test(timeout = 4000)
    public void test5762() throws Throwable {
        MockDate mockDate0 = new MockDate();
        DateUtils.round((Object) mockDate0, 2542);
    }

    @Test(timeout = 4000)
    public void test5863() throws Throwable {
        DateUtils.round((Object) null, 54);
    }

    @Test(timeout = 4000)
    public void test5964() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 11);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test6065() throws Throwable {
        DateUtils.round((Calendar) null, 0);
    }

    @Test(timeout = 4000)
    public void test6166() throws Throwable {
        DateUtils.round((Date) null, 1177);
    }

    @Test(timeout = 4000)
    public void test6267() throws Throwable {
        DateUtils.addMinutes((Date) null, 0);
    }

    @Test(timeout = 4000)
    public void test6368() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "y6:%K HE$`~w";
        stringArray0[1] = "y6:%K HE$`~w";
        DateUtils.parseDate("y6:%K HE$`~w", stringArray0);
    }

    @Test(timeout = 4000)
    public void test6469() throws Throwable {
        DateUtils.parseDate("cy} ^()rN'LRm", (String[]) null);
    }

    @Test(timeout = 4000)
    public void test6570() throws Throwable {
        String[] stringArray0 = new String[4];
        DateUtils.parseDate((String) null, stringArray0);
    }

    @Test(timeout = 4000)
    public void test6671() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ROOT;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        mockGregorianCalendar0.roll(3, true);
        MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
        boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test6772() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1969, 1969, (-1), (-105));
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
        boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test6773() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1969, 1969, (-1), (-105));
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
        boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test6874() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 11);
        boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test6875() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.UK;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
        Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 11);
        boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
    }

    @Test(timeout = 4000)
    public void test6976() throws Throwable {
        Locale locale0 = Locale.CHINA;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test7077() throws Throwable {
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test7178() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test7179() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test7280() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("");
        Calendar calendar0 = MockCalendar.getInstance(timeZone0);
        DateUtils.isSameInstant(calendar0, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test7381() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(19);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Calendar calendar0 = MockCalendar.getInstance(timeZone0);
        boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
    }

    @Test(timeout = 4000)
    public void test7482() throws Throwable {
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test7583() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1990, (-1306), 1990);
        Date date0 = mockGregorianCalendar0.getGregorianChange();
        DateUtils.isSameInstant(date0, (Date) null);
    }

    @Test(timeout = 4000)
    public void test7684() throws Throwable {
        MockDate mockDate0 = new MockDate(1898, 2774, 1898);
        boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test7785() throws Throwable {
        DateUtils.isSameInstant((Date) null, (Date) null);
    }

    @Test(timeout = 4000)
    public void test7886() throws Throwable {
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.round(calendar0, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
        calendar1.toString();
    }

    @Test(timeout = 4000)
    public void test7887() throws Throwable {
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.round(calendar0, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
    }

    @Test(timeout = 4000)
    public void test7988() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.round(calendar0, 0);
        calendar1.set(0, 0, (-1), 1821, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
        calendar1.toString();
    }

    @Test(timeout = 4000)
    public void test7989() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        Calendar calendar0 = MockCalendar.getInstance(locale0);
        Calendar calendar1 = DateUtils.round(calendar0, 0);
        calendar1.set(0, 0, (-1), 1821, 0);
        boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
    }

    @Test(timeout = 4000)
    public void test8090() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test8191() throws Throwable {
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
    }

    @Test(timeout = 4000)
    public void test8292() throws Throwable {
        MockDate mockDate0 = new MockDate();
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
    }

    @Test(timeout = 4000)
    public void test8393() throws Throwable {
        MockDate mockDate0 = new MockDate((-1360L));
        boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test8494() throws Throwable {
        DateUtils.isSameDay((Date) null, (Date) null);
    }

    @Test(timeout = 4000)
    public void test8595() throws Throwable {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, (-988), 0, 0);
        DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
        dateUtils_DateIterator0.hasNext();
        mockGregorianCalendar0.toString();
    }

    @Test(timeout = 4000)
    public void test8696() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Calendar calendar0 = MockCalendar.getInstance(timeZone0);
        DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
        dateUtils_DateIterator0.remove();
    }

    @Test(timeout = 4000)
    public void test8797() throws Throwable {
        Calendar calendar0 = MockCalendar.getInstance();
        DateUtils.iterator(calendar0, 5);
        calendar0.toString();
    }

    @Test(timeout = 4000)
    public void test8898() throws Throwable {
        MockDate mockDate0 = new MockDate(1898, 2774, 1898);
        Date date0 = DateUtils.addHours(mockDate0, 1898);
        boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test8899() throws Throwable {
        MockDate mockDate0 = new MockDate(1898, 2774, 1898);
        Date date0 = DateUtils.addHours(mockDate0, 1898);
        boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
    }

    @Test(timeout = 4000)
    public void test89100() throws Throwable {
        MockDate mockDate0 = new MockDate((-1360L));
        Date date0 = DateUtils.addSeconds(mockDate0, 0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test90101() throws Throwable {
        MockDate mockDate0 = new MockDate();
        Date date0 = DateUtils.addMonths(mockDate0, 0);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test91102() throws Throwable {
        MockDate mockDate0 = new MockDate(1, (-5), (-5));
        Date date0 = DateUtils.addDays(mockDate0, 1);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test92103() throws Throwable {
        MockDate mockDate0 = new MockDate(0L);
        Date date0 = DateUtils.addMilliseconds(mockDate0, 7);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test93104() throws Throwable {
        MockDate mockDate0 = new MockDate(0L);
        Date date0 = DateUtils.addYears(mockDate0, 5);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test94105() throws Throwable {
        MockDate mockDate0 = new MockDate((-1360L));
        Date date0 = DateUtils.addWeeks(mockDate0, 19);
        Date date1 = DateUtils.addMinutes(mockDate0, 19);
        boolean boolean0 = DateUtils.isSameDay(date0, date1);
    }

    @Test(timeout = 4000)
    public void test94106() throws Throwable {
        MockDate mockDate0 = new MockDate((-1360L));
        Date date0 = DateUtils.addWeeks(mockDate0, 19);
        Date date1 = DateUtils.addMinutes(mockDate0, 19);
        boolean boolean0 = DateUtils.isSameDay(date0, date1);
        date1.toString();
    }

    @Test(timeout = 4000)
    public void test94107() throws Throwable {
        MockDate mockDate0 = new MockDate((-1360L));
        Date date0 = DateUtils.addWeeks(mockDate0, 19);
        Date date1 = DateUtils.addMinutes(mockDate0, 19);
        boolean boolean0 = DateUtils.isSameDay(date0, date1);
        date0.toString();
    }

    @Test(timeout = 4000)
    public void test95108() throws Throwable {
        DateUtils dateUtils0 = new DateUtils();
        DateUtils.iterator((Object) dateUtils0, 0);
    }
}
