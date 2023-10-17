/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:01:37 GMT 2023
 */
package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.runner.RunWith;

public class FastDateParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        FastDateParser fastDateParser1 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        boolean boolean0 = fastDateParser0.equals(fastDateParser1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = Locale.forLanguageTag("");
        ParsePosition parsePosition0 = new ParsePosition(0);
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "MIT");
        FastDateParser fastDateParser0 = new FastDateParser("GMTPLT", simpleTimeZone0, locale0);
        Object object0 = fastDateParser0.parseObject("ART", parsePosition0);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Locale locale0 = Locale.forLanguageTag("");
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        FastDateParser fastDateParser0 = new FastDateParser("GMTPLT", simpleTimeZone0, locale0);
        boolean boolean0 = fastDateParser0.isNextNumber();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Locale locale0 = Locale.forLanguageTag("");
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "MIT");
        FastDateParser fastDateParser0 = new FastDateParser("GMTPLT", simpleTimeZone0, locale0);
        TimeZone timeZone0 = fastDateParser0.getTimeZone();
        assertEquals("java.util.SimpleTimeZone[id=MIT,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2517, "D;0%RsvvZ+v");
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("D;0%RsvvZ+v", simpleTimeZone0, locale0);
        int int0 = fastDateParser0.adjustYear((-2126));
        assertEquals((-126), int0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2517, "D;0%_RsvvZ+v");
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("D;0%_RsvvZ+v", simpleTimeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parseObject((String) null, (ParsePosition) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.ROOT;
        FastDateParser fastDateParser0 = new FastDateParser(":W4tH7$Ghf;D$g", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parseObject((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ITALY;
        FastDateParser fastDateParser0 = new FastDateParser("`V;I`35Rf", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.getFieldWidth();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = null;
        try {
            fastDateParser0 = new FastDateParser("", (TimeZone) null, locale0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ROOT;
        FastDateParser fastDateParser0 = new FastDateParser("zkf+qpgno/ RW", timeZone0, locale0);
        assertEquals("zkf+qpgno/ RW", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("(p{IsNd}{");
        Locale locale0 = Locale.ITALY;
        FastDateParser fastDateParser0 = new FastDateParser("(p{IsNd}{", timeZone0, locale0);
        assertEquals("(p{IsNd}{", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2517, "D;0%RsvvZ+v");
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("D;0%RsvvZ+v", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        Date date0 = fastDateParser0.parse("D;0%RsvvZ+v", parsePosition0);
        assertNull(date0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parse("1xB{r[zmHb.(", parsePosition0);
        assertEquals("java.text.ParsePosition[index=1,errorIndex=-1]", parsePosition0.toString());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parse("1xB{r[zmHb.(", parsePosition0);
        assertEquals(1, parsePosition0.getIndex());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.KOREAN;
        FastDateParser fastDateParser0 = new FastDateParser("(d0_&", timeZone0, locale0);
        assertEquals("(d0_&", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("`b{Fp1epV!Dih");
        Locale locale0 = Locale.CHINESE;
        FastDateParser fastDateParser0 = new FastDateParser("`b{Fp1epV!Dih", timeZone0, locale0);
        assertEquals("`b{Fp1epV!Dih", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(110, "F{Hm(%q)7_+Oghi");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("F{Hm(%q)7_+Oghi", simpleTimeZone0, locale0);
        assertEquals("F{Hm(%q)7_+Oghi", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("<#L';fdTB&OKlfSwF ", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parseObject("<#L';fdTB&OKlfSwF ", parsePosition0);
        assertEquals("java.text.ParsePosition[index=2,errorIndex=-1]", parsePosition0.toString());
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("<#L';fdTB&OKlfSwF ", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parseObject("<#L';fdTB&OKlfSwF ", parsePosition0);
        assertEquals(2, parsePosition0.getIndex());
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Locale locale0 = Locale.CANADA;
        TimeZone timeZone0 = TimeZone.getTimeZone("hQ$_,auW,te");
        FastDateParser fastDateParser0 = new FastDateParser("K97g#1", timeZone0, locale0);
        try {
            fastDateParser0.parse("Invalid field value ");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Unparseable date: \"Invalid field value \" does not match (\\p{IsNd}{1}+)97
        }
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDateParser$2");
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("8", simpleTimeZone0, locale0);
        assertEquals("8", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(93);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("7 R~", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(439);
        // Undeclared exception!
        try {
            fastDateParser0.parse("GMTVST", parsePosition0);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "org.apache.commons.lang3.time.FastDateParser$2");
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("5", simpleTimeZone0, locale0);
        assertEquals("5", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("3aa");
        Locale locale0 = Locale.FRENCH;
        FastDateParser fastDateParser0 = new FastDateParser("3aa", timeZone0, locale0);
        assertEquals("3aa", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        Date date0 = fastDateParser0.parse("1xB{r[zmHb.(");
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.KOREAN;
        FastDateParser fastDateParser0 = new FastDateParser("0.&", timeZone0, locale0);
        assertEquals("0.&", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.KOREAN;
        FastDateParser fastDateParser0 = new FastDateParser(".", timeZone0, locale0);
        assertEquals(".", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser("-", timeZone0, locale0);
        assertEquals("-", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1235);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        FastDateParser fastDateParser0 = new FastDateParser(",J%B02lSG", timeZone0, locale0);
        assertEquals(",J%B02lSG", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser fastDateParser0 = new FastDateParser("(p{IsNd}++)", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parse((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        int int0 = fastDateParser0.adjustYear(3359);
        assertEquals(5259, int0);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("|k_M6Sk6}c");
        Locale locale0 = Locale.FRANCE;
        FastDateParser fastDateParser0 = new FastDateParser("|k_M6Sk6}c", timeZone0, locale0);
        assertEquals("|k_M6Sk6}c", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.KOREAN;
        FastDateParser fastDateParser0 = new FastDateParser("^#YK.", timeZone0, locale0);
        assertEquals("^#YK.", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2447, "");
        FastDateParser fastDateParser0 = new FastDateParser("Z[kQoFG|3r4_", simpleTimeZone0, locale0);
        assertEquals("Z[kQoFG|3r4_", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("k_M6Sk6}c");
        Locale locale0 = Locale.GERMAN;
        FastDateParser fastDateParser0 = new FastDateParser("+?x1bg", timeZone0, locale0);
        assertEquals("+?x1bg", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.US;
        FastDateParser fastDateParser0 = new FastDateParser("$*9vp+j", timeZone0, locale0);
        assertEquals("$*9vp+j", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test3536() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("");
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser fastDateParser0 = new FastDateParser(")", timeZone0, locale0);
        try {
            fastDateParser0.parse("org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
            // Unparseable date: \"org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy\" does not match \\)
        }
    }

    @Test(timeout = 4000)
    public void test3637() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3097);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.CHINA;
        FastDateParser fastDateParser0 = new FastDateParser("/*x#w]*4qA", timeZone0, locale0);
        Object object0 = fastDateParser0.parseObject("/*x#w]*4qA");
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
    }

    @Test(timeout = 4000)
    public void test3738() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        boolean boolean0 = fastDateParser0.equals(locale_FilteringMode0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3839() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.CHINESE;
        FastDateParser fastDateParser0 = null;
        try {
            fastDateParser0 = new FastDateParser("", timeZone0, locale0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid pattern
        }
    }

    @Test(timeout = 4000)
    public void test3940() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        Pattern pattern0 = fastDateParser0.getParsePattern();
        assertEquals(":(\uAE08|\uAE08\uC694\uC77C|\uBAA9|\uBAA9\uC694\uC77C|\uC218|\uC218\uC694\uC77C|\uC6D4|\uC6D4\uC694\uC77C|\uC77C|\uC77C\uC694\uC77C|\uD1A0|\uD1A0\uC694\uC77C|\uD654|\uD654\uC694\uC77C)(\\p{IsNd}++)\\{(\\p{IsNd}++)", pattern0.pattern());
    }

    @Test(timeout = 4000)
    public void test4041() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2517, "D;0%RsvvZ+v");
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("D;0%RsvvZ+v", simpleTimeZone0, locale0);
        TimeZone timeZone0 = fastDateParser0.getTimeZone();
        assertEquals("java.util.SimpleTimeZone[id=D;0%RsvvZ+v,offset=2517,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test4142() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ITALIAN;
        FastDateParser fastDateParser0 = new FastDateParser("4B9o", timeZone0, locale0);
        try {
            fastDateParser0.parseObject(";u|F");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Unparseable date: \";u|F\" does not match 4
        }
    }

    @Test(timeout = 4000)
    public void test4243() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ITALIAN;
        FastDateParser fastDateParser0 = new FastDateParser("4B9o", timeZone0, locale0);
        Locale locale1 = fastDateParser0.getLocale();
        assertEquals("", locale1.getISO3Country());
    }

    @Test(timeout = 4000)
    public void test4344() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ITALIAN;
        FastDateParser fastDateParser0 = new FastDateParser("4B9o", timeZone0, locale0);
        String string0 = fastDateParser0.getPattern();
        assertEquals("4B9o", string0);
    }

    @Test(timeout = 4000)
    public void test4445() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("s@zD6D]");
        ParsePosition parsePosition0 = new ParsePosition((-1521));
        Locale locale0 = Locale.FRENCH;
        FastDateParser fastDateParser0 = new FastDateParser("s@zD6D]", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parseObject("W", parsePosition0);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4546() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        String string0 = fastDateParser0.toString();
        assertEquals("FastDateParser[:EW{hTz :fAa,ko_KR,GMT]", string0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("z p1^UzA61<RL)qPYXL");
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("saR#-_1'KPl{ii0|1#", timeZone0, locale0);
        FastDateParser fastDateParser1 = new FastDateParser("z p1^UzA61<RL)qPYXL", timeZone0, locale0);
        boolean boolean0 = fastDateParser0.equals(fastDateParser1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hzT:fAj", timeZone0, locale0);
        assertEquals(":EW{hzT:fAj", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("+OJq9i?");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("z p1^UzA61<RL)qPYXL", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(7);
        // Undeclared exception!
        try {
            fastDateParser0.parse((String) null, parsePosition0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
