/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 15:07:58 GMT 2024
 */
package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FastDateFormat_ESTest extends FastDateFormat_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0);
        fastDateFormat0.getPattern();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        int int0 = fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        fastDateFormat0.toString();
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Locale locale0 = Locale.CHINA;
        FastDateFormat.getDateTimeInstance(111, 111, locale0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("M219Z");
        boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null);
        fastDateFormat0.getTimeZone();
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Locale locale0 = Locale.UK;
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
        String string0 = fastDateFormat0.format((-2081L));
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        Long long0 = new Long(0);
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(long0);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        Long long0 = new Long(0);
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(long0);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        Long long0 = new Long(0);
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(long0);
        attributedCharacterIterator0.getEndIndex();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1143, 1143);
        String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateFormat.getDateTimeInstance(1999, 1999, timeZone0);
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("zzZ", timeZone0);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("zzZ", timeZone0);
        String string0 = fastDateFormat0.format(0L);
    }

    @Test(timeout = 4000)
    public void test1217() throws Throwable {
        Locale locale0 = Locale.ROOT;
        FastDateFormat.getInstance("AY`,8", locale0);
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("kzz");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("kzz");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, timeZone0);
        fastDateFormat0.format((Calendar) null);
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        fastDateFormat0.parseObject("org.apache.commons.lang.time.FastDateFormat$CharacterLiteral");
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        fastDateFormat0.getLocale();
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        Locale locale0 = Locale.FRENCH;
        FastDateFormat.getDateInstance(103, locale0);
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null, locale0);
        String string0 = fastDateFormat0.getPattern();
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("{MM d, yEyy");
        String string0 = fastDateFormat0.format((-2658L));
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
        fastDateFormat1.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
        fastDateFormat1.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test2028() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
    }

    @Test(timeout = 4000)
    public void test2129() throws Throwable {
        FastDateFormat.getInstance((String) null);
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        FastDateFormat.getInstance("B");
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        FastDateFormat.getInstance("*CET6=r/t~!'aSK9YE!");
    }

    @Test(timeout = 4000)
    public void test2432() throws Throwable {
        FastDateFormat.getInstance("D8c}FA");
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        FastDateFormat.getInstance("FastDateFormat[");
    }

    @Test(timeout = 4000)
    public void test2634() throws Throwable {
        FastDateFormat.getInstance("kG0Z<O\"U");
    }

    @Test(timeout = 4000)
    public void test2735() throws Throwable {
        FastDateFormat.getInstance(".WI2f");
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        FastDateFormat.getInstance("Jgv8O^tw.k!dd  _k");
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        FastDateFormat.getInstance("#Ke(k`V,a'c6");
    }

    @Test(timeout = 4000)
    public void test3038() throws Throwable {
        FastDateFormat.getInstance("[EL");
    }

    @Test(timeout = 4000)
    public void test3139() throws Throwable {
        FastDateFormat.getInstance("N\"2U:Uc-}KV/v,)6");
    }

    @Test(timeout = 4000)
    public void test3240() throws Throwable {
        FastDateFormat.getInstance("S68P&'fk.");
    }

    @Test(timeout = 4000)
    public void test3341() throws Throwable {
        FastDateFormat.getInstance("G8/3Q");
    }

    @Test(timeout = 4000)
    public void test3442() throws Throwable {
        FastDateFormat.getInstance("7.Rw %Y");
    }

    @Test(timeout = 4000)
    public void test3543() throws Throwable {
        FastDateFormat.getInstance("\"TSi");
    }

    @Test(timeout = 4000)
    public void test3644() throws Throwable {
        FastDateFormat.getInstance("h{U_x+GM");
    }

    @Test(timeout = 4000)
    public void test3745() throws Throwable {
        FastDateFormat.getInstance("Va9tPLM?}g1^r");
    }

    @Test(timeout = 4000)
    public void test3846() throws Throwable {
        FastDateFormat.getInstance("XU|j");
    }

    @Test(timeout = 4000)
    public void test3947() throws Throwable {
        FastDateFormat.getInstance("Y`]8");
    }

    @Test(timeout = 4000)
    public void test4048() throws Throwable {
        FastDateFormat.getInstance("8s|3&:b");
    }

    @Test(timeout = 4000)
    public void test4149() throws Throwable {
        FastDateFormat.getInstance("Z#f.f K#;mve?,K");
    }

    @Test(timeout = 4000)
    public void test4250() throws Throwable {
        FastDateFormat.getInstance("gn");
    }

    @Test(timeout = 4000)
    public void test4351() throws Throwable {
        FastDateFormat.getInstance("5s~ai#mkcrj!XkAq");
    }

    @Test(timeout = 4000)
    public void test4452() throws Throwable {
        FastDateFormat.getInstance("-\"j");
    }

    @Test(timeout = 4000)
    public void test4553() throws Throwable {
        FastDateFormat.getInstance("lo");
    }

    @Test(timeout = 4000)
    public void test4654() throws Throwable {
        FastDateFormat.getInstance("<+&.6E~|nE");
    }

    @Test(timeout = 4000)
    public void test4755() throws Throwable {
        FastDateFormat.getInstance("|G:o");
    }

    @Test(timeout = 4000)
    public void test4856() throws Throwable {
        FastDateFormat.getInstance("pTf");
    }

    @Test(timeout = 4000)
    public void test4957() throws Throwable {
        FastDateFormat.getInstance("qr(<Dsv*sdoO>d>");
    }

    @Test(timeout = 4000)
    public void test5058() throws Throwable {
        FastDateFormat.getInstance("=r5Ah|");
    }

    @Test(timeout = 4000)
    public void test5159() throws Throwable {
        FastDateFormat.getInstance("<ul>");
    }

    @Test(timeout = 4000)
    public void test5260() throws Throwable {
        FastDateFormat.getInstance("&+{v$J)QwN->w=p");
    }

    @Test(timeout = 4000)
    public void test5361() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("a21wZ");
    }

    @Test(timeout = 4000)
    public void test5462() throws Throwable {
        FastDateFormat.getInstance("xVO\"B$:Xd");
    }

    @Test(timeout = 4000)
    public void test5563() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("zzZZ");
        String string0 = fastDateFormat0.format((long) 2);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test5564() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("zzZZ");
        String string0 = fastDateFormat0.format((long) 2);
    }

    @Test(timeout = 4000)
    public void test5665() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy'\u5E74'M'\u6708'd'\u65E5'");
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test5766() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        MockDate mockDate0 = new MockDate(3, 0, 2, 1, 2);
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test5767() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        MockDate mockDate0 = new MockDate(3, 0, 2, 1, 2);
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
        attributedCharacterIterator0.getRunLimit();
    }

    @Test(timeout = 4000)
    public void test5868() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("+z^Z");
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockGregorianCalendar0);
        attributedCharacterIterator0.getRunLimit();
    }

    @Test(timeout = 4000)
    public void test5969() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        fastDateFormat0.formatToCharacterIterator((Object) null);
    }

    @Test(timeout = 4000)
    public void test6070() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        Object object0 = new Object();
        fastDateFormat0.formatToCharacterIterator(object0);
    }

    @Test(timeout = 4000)
    public void test6171() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 1);
        fastDateFormat0.equals(mockGregorianCalendar0);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test6172() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 1);
        fastDateFormat0.equals(mockGregorianCalendar0);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6273() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(2, 2);
    }

    @Test(timeout = 4000)
    public void test6274() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(2, 2);
        fastDateFormat0.equals(fastDateFormat1);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6275() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(2, 2);
        fastDateFormat0.equals(fastDateFormat1);
        fastDateFormat1.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6376() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        fastDateFormat0.equals(fastDateFormat0);
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6477() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("MMM d,yyy");
        Locale locale0 = Locale.TAIWAN;
        FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("MMM d,yyy", (TimeZone) null, locale0);
        boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
        fastDateFormat1.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6478() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("MMM d,yyy");
        Locale locale0 = Locale.TAIWAN;
        FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("MMM d,yyy", (TimeZone) null, locale0);
        boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
    }

    @Test(timeout = 4000)
    public void test6579() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("_=aS");
        String string0 = fastDateFormat0.format((-737L));
    }

    @Test(timeout = 4000)
    public void test6580() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("_=aS");
        String string0 = fastDateFormat0.format((-737L));
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test6681() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        String string0 = fastDateFormat0.format((long) (-609));
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test6682() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        String string0 = fastDateFormat0.format((long) (-609));
        fastDateFormat0.getMaxLengthEstimate();
    }

    @Test(timeout = 4000)
    public void test6683() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
        String string0 = fastDateFormat0.format((long) (-609));
    }

    @Test(timeout = 4000)
    public void test6784() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 1);
        String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test6885() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
        String string0 = fastDateFormat0.format((long) 0);
    }

    @Test(timeout = 4000)
    public void test6986() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("`zkW");
        String string0 = fastDateFormat0.format((long) 2);
        fastDateFormat0.getTimeZoneOverridesCalendar();
    }

    @Test(timeout = 4000)
    public void test6987() throws Throwable {
        FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("`zkW");
        String string0 = fastDateFormat0.format((long) 2);
    }

    @Test(timeout = 4000)
    public void test7088() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "1", 1, 1, 1, 1, 1, 1, 1, 1, 1);
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0);
        String string0 = fastDateFormat0.format((long) 1);
    }

    @Test(timeout = 4000)
    public void test7189() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, timeZone0);
        String string0 = fastDateFormat0.format((long) 1);
    }

    @Test(timeout = 4000)
    public void test7290() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "1", 1, 1, 1, 1, 1, 1, 1, 1, 1);
        simpleTimeZone0.setEndRule(1, 1, 110);
        FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0);
        String string0 = fastDateFormat0.format((long) 1);
    }
}
