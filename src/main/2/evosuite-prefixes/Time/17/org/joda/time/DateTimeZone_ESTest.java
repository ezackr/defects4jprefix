/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 05:09:27 GMT 2024
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Object object0 = dateTimeZone0.UTC.writeReplace();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-562));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.UTC.getName(47258736L);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        String string0 = dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Set<String> set0 = DateTimeZone.getAvailableIDs();
        set0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        Provider provider0 = DateTimeZone.getProvider();
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.isFixed();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone.setDefault(dateTimeZone0);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        DateTimeZone.setDefault((DateTimeZone) null);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
        dateTimeZone0.isFixed();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("-08:00");
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("-08:00");
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(0, 2363);
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes((-46), (-46));
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(125);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test2025() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.UTC;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test2126() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test2227() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        TimeZone timeZone0 = TimeZone.getTimeZone("EST");
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test2328() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.MIN;
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone1.toString();
    }

    @Test(timeout = 4000)
    public void test2431() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1024, "le~yAG(;wrrxal7ZC");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2432() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1024, "le~yAG(;wrrxal7ZC");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test2634() throws Throwable {
        DateTimeZone.setProvider((Provider) null);
    }

    @Test(timeout = 4000)
    public void test2735() throws Throwable {
        DateTimeZone.setNameProvider((NameProvider) null);
    }

    @Test(timeout = 4000)
    public void test2836() throws Throwable {
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        DateTimeZone.setNameProvider(defaultNameProvider0);
    }

    @Test(timeout = 4000)
    public void test2937() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1757));
        long long0 = dateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, (-1757));
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1757));
        long long0 = dateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, (-1757));
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(12825000);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test3140() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Locale locale0 = Locale.ITALY;
        String string0 = dateTimeZone0.getShortName(28800000L, locale0);
    }

    @Test(timeout = 4000)
    public void test3242() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(59);
        String string0 = dateTimeZone0.getShortName((long) 59);
    }

    @Test(timeout = 4000)
    public void test3343() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(572);
        Locale locale0 = Locale.CANADA_FRENCH;
        String string0 = dateTimeZone0.getName((long) 572, locale0);
    }

    @Test(timeout = 4000)
    public void test3444() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTime dateTime0 = new DateTime();
        int int0 = dateTimeZone0.UTC.getOffset((ReadableInstant) dateTime0);
    }

    @Test(timeout = 4000)
    public void test3545() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.UTC.getOffset((ReadableInstant) null);
    }

    @Test(timeout = 4000)
    public void test3646() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.isStandardOffset(15778476000L);
    }

    @Test(timeout = 4000)
    public void test3747() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-7));
        dateTimeZone0.UTC.isStandardOffset((-7));
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test3748() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-7));
        dateTimeZone0.UTC.isStandardOffset((-7));
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test3849() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
        boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
    }

    @Test(timeout = 4000)
    public void test3950() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(986119199999L);
    }

    @Test(timeout = 4000)
    public void test4051() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test4152() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Australia/Darwin");
        int int0 = dateTimeZone0.getOffsetFromLocal((-9223372036854775796L));
    }

    @Test(timeout = 4000)
    public void test4253() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Australia/Darwin");
        int int0 = dateTimeZone0.getOffsetFromLocal(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test4354() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
        CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(1);
    }

    @Test(timeout = 4000)
    public void test4455() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Africa/Addis_Ababa");
        int int0 = dateTimeZone0.getOffsetFromLocal((-1928L));
    }

    @Test(timeout = 4000)
    public void test4556() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.adjustOffset(9223372036854775807L, false);
    }

    @Test(timeout = 4000)
    public void test4657() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
    }

    @Test(timeout = 4000)
    public void test4758() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
    }

    @Test(timeout = 4000)
    public void test4859() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Australia/Darwin");
        dateTimeZone0.convertLocalToUTC((-9223372036854775796L), false);
    }

    @Test(timeout = 4000)
    public void test4960() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("Australia/Darwin");
        dateTimeZone0.convertLocalToUTC((-9223372036854775796L), true);
    }

    @Test(timeout = 4000)
    public void test5061() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1200));
        long long0 = dateTimeZone0.convertLocalToUTC((long) (-1200), true);
        dateTimeZone0.getID();
    }

    @Test(timeout = 4000)
    public void test5062() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1200));
        long long0 = dateTimeZone0.convertLocalToUTC((long) (-1200), true);
    }

    @Test(timeout = 4000)
    public void test5163() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-3127L));
    }

    @Test(timeout = 4000)
    public void test5264() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        boolean boolean0 = dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
    }

    @Test(timeout = 4000)
    public void test5365() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2804L), true);
    }

    @Test(timeout = 4000)
    public void test5466() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        long long0 = dateTimeZone0.adjustOffset((-2819L), false);
    }
}
