/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 02:21:09 GMT 2023
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

public class DateTimeZoneTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes((-621), 59);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("-08:00");
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone.setDefault(dateTimeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(549);
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        timeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(549);
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        long long0 = fixedDateTimeZone0.previousTransition(0L);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        long long0 = fixedDateTimeZone0.previousTransition(2189L);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        long long0 = dateTimeZone0.previousTransition(1);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.UTC.nextTransition(0L);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.nextTransition(637L);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
        dateTimeZone0.nextTransition((-2180L));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        boolean boolean0 = dateTimeZone0.isFixed();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.isFixed();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        int int0 = dateTimeZone0.getStandardOffset((-266L));
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
        int int0 = dateTimeZone0.getStandardOffset(0L);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
        int int0 = dateTimeZone0.getStandardOffset(0L);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1314));
        int int0 = dateTimeZone0.getStandardOffset((-1314));
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1314));
        int int0 = dateTimeZone0.getStandardOffset((-1314));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        int int0 = dateTimeZone0.UTC.getOffsetFromLocal(1);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        int int0 = dateTimeZone0.getOffsetFromLocal(0L);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        int int0 = dateTimeZone0.getOffsetFromLocal(0L);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
        int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
        dateMidnight0.getMillis();
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
        int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        int int0 = dateTimeZone0.getOffset(0L);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1189);
        int int0 = dateTimeZone0.getOffset(2587L);
    }

    @Test(timeout = 4000)
    public void test2227() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1189);
        int int0 = dateTimeZone0.getOffset(2587L);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test2328() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffset(162L);
    }

    @Test(timeout = 4000)
    public void test2429() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
        dateTimeZone0.getNameKey(918518400000L);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        String string0 = dateTimeZone0.getNameKey((-2642L));
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        boolean boolean0 = dateTimeZone0.equals(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
        long long0 = dateTimeZone0.convertUTCToLocal(15778800000L);
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.UTC.convertLocalToUTC(0L, false, 0L);
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone dateTimeZone0 = uTCProvider0.getZone("UTC");
        long long0 = dateTimeZone0.convertLocalToUTC((-1L), false, (-1L));
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
    }

    @Test(timeout = 4000)
    public void test3238() throws Throwable {
        DateTimeZone.forOffsetHours((-1585));
    }

    @Test(timeout = 4000)
    public void test3339() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
        dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 0L);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test3440() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.convertLocalToUTC(0L, false, 9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test3541() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1841));
        long long0 = dateTimeZone0.convertUTCToLocal(1);
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1841));
        long long0 = dateTimeZone0.convertUTCToLocal(1);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        long long0 = dateTimeZone0.convertUTCToLocal(0L);
    }

    @Test(timeout = 4000)
    public void test3744() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test3845() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        int int0 = dateTimeZone0.getOffsetFromLocal((-1L));
    }

    @Test(timeout = 4000)
    public void test3946() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName(465L, (Locale) null);
    }

    @Test(timeout = 4000)
    public void test3947() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.getName(465L, (Locale) null);
    }

    @Test(timeout = 4000)
    public void test4048() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1778));
        String string0 = dateTimeZone0.getShortName(793L, (Locale) null);
    }

    @Test(timeout = 4000)
    public void test4149() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("-08:00");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test4250() throws Throwable {
        DateTimeZone.forID("Eg&");
    }

    @Test(timeout = 4000)
    public void test4351() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("MST");
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test4452() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        String string0 = dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test4553() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        boolean boolean0 = fixedDateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
    }

    @Test(timeout = 4000)
    public void test4654() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
        boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
    }

    @Test(timeout = 4000)
    public void test4755() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3185));
        long long0 = dateTimeZone0.convertLocalToUTC((long) (-3185), true);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test4756() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3185));
        long long0 = dateTimeZone0.convertLocalToUTC((long) (-3185), true);
    }

    @Test(timeout = 4000)
    public void test4857() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
    }

    @Test(timeout = 4000)
    public void test4958() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        long long0 = dateTimeZone0.convertLocalToUTC(249L, false);
    }

    @Test(timeout = 4000)
    public void test5059() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(256);
        dateTimeZone0.convertUTCToLocal(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test5160() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = fixedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, 9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test5261() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-580L));
    }

    @Test(timeout = 4000)
    public void test5262() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        long long0 = dateTimeZone0.getMillisKeepLocal((DateTimeZone) null, (-580L));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test5363() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        boolean boolean0 = fixedDateTimeZone0.isStandardOffset(1L);
    }

    @Test(timeout = 4000)
    public void test5464() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
    }

    @Test(timeout = 4000)
    public void test5465() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test5566() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 2);
        int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test5567() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 2);
        int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
    }

    @Test(timeout = 4000)
    public void test5668() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        DateMidnight dateMidnight0 = new DateMidnight(0L, (DateTimeZone) fixedDateTimeZone0);
        int int0 = fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
    }

    @Test(timeout = 4000)
    public void test5769() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        Locale locale0 = Locale.ROOT;
        String string0 = dateTimeZone0.getName(877L, locale0);
    }

    @Test(timeout = 4000)
    public void test5870() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        String string0 = dateTimeZone0.getShortName(877L);
    }

    @Test(timeout = 4000)
    public void test5971() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Locale locale0 = Locale.ITALY;
        String string0 = fixedDateTimeZone0.getShortName(0L, locale0);
    }

    @Test(timeout = 4000)
    public void test5972() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Locale locale0 = Locale.ITALY;
        String string0 = fixedDateTimeZone0.getShortName(0L, locale0);
    }

    @Test(timeout = 4000)
    public void test6073() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-28378000));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test6474() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00:00.024");
        dateTimeZone1.toString();
    }

    @Test(timeout = 4000)
    public void test6475() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(24);
        DateTimeZone dateTimeZone1 = DateTimeZone.forID("+00:00:00.024");
    }

    @Test(timeout = 4000)
    public void test6576() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test6677() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test6678() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test6779() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        TimeZone timeZone0 = fixedDateTimeZone0.UTC.toTimeZone();
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test6880() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test6981() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(89, 75);
    }

    @Test(timeout = 4000)
    public void test7082() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(0, (-4177984));
    }

    @Test(timeout = 4000)
    public void test7183() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test7284() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 1);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test7385() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
    }

    @Test(timeout = 4000)
    public void test7386() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test7487() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test7588() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test7689() throws Throwable {
        DateTimeZone.setDefault((DateTimeZone) null);
    }

    @Test(timeout = 4000)
    public void test7890() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
    }

    @Test(timeout = 4000)
    public void test7991() throws Throwable {
        Provider provider0 = DateTimeZone.getProvider();
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
        dateTimeZone0.equals(provider0);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test8092() throws Throwable {
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
    }

    @Test(timeout = 4000)
    public void test8193() throws Throwable {
        Set<String> set0 = DateTimeZone.getAvailableIDs();
        set0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test8294() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        String string0 = fixedDateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test8395() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2831, "hsZfnd<-{UF+T");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
        String string0 = dateTimeZone0.getName((long) 807);
    }

    @Test(timeout = 4000)
    public void test8396() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2831, "hsZfnd<-{UF+T");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
        String string0 = dateTimeZone0.getName((long) 807);
    }

    @Test(timeout = 4000)
    public void test8497() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-589));
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test8598() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        Object object0 = fixedDateTimeZone0.UTC.writeReplace();
    }
}
