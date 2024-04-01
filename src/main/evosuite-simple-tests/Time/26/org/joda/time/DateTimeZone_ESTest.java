/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 12:32:17 GMT 2023
 */
package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
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
        dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 9223372036854775773L);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DateTimeZone.setNameProvider((NameProvider) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DateTimeZone.forID((String) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getName(764L);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DateTimeZone.forOffsetHours(57);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        NameProvider nameProvider0 = DateTimeZone.getNameProvider();
        DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.UTC.getShortName(764L);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        Locale locale0 = Locale.ITALY;
        dateTimeZone0.getName((-28378000L), locale0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DateTimeZone.getDefault();
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        DateTimeZone.setNameProvider(defaultNameProvider0);
        dateTimeZone0.toString();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DateTimeZone.forOffsetMillis((-430));
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(3600L, false);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        TimeZone timeZone0 = dateTimeZone0.toTimeZone();
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        buddhistChronology0.getZone();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        DateTimeZone.forID("Bm&Tg $?baRci+e3q");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        DateTimeZone.getDefault();
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        DateTimeZone.getAvailableIDs();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
        dateTimeZone0.convertUTCToLocal(1L);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        DateTimeZone.setProvider((Provider) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        DateTimeZone.getDefault();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(45, "w#c)d f}r[Td");
        DateTimeZone.forTimeZone(simpleTimeZone0);
        DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.UTC.writeReplace();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        DateTimeZone.getProvider();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(770);
        dateTimeZone0.getName((long) 770);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        fixedDateTimeZone0.isFixed();
        fixedDateTimeZone0.convertUTCToLocal((-31L));
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes((-75837680), (-75837680));
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        DateTimeZone.forOffsetHours((-347));
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getOffsetFromLocal(2348L);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        DateTimeZone.forOffsetMillis(0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        fixedDateTimeZone0.getShortName(0L, locale0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        DateTimeZone.forTimeZone((TimeZone) null);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalDateTime localDateTime0 = new LocalDateTime(24L);
        dateTimeZone0.getShortName(24L);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getOffsetFromLocal(9223372036854775804L);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.isStandardOffset(9223372036854775807L);
        dateTimeZone0.isFixed();
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(60, 60);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.UTC.isStandardOffset(1268L);
        DateTimeZone.setDefault(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
        DateTimeZone.forTimeZone(timeZone0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        DateTimeZone.setDefault(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC((-28377968L), false);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(13, 13);
        DateTimeZone.forOffsetHoursMinutes(13, 13);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("-[C!,</~4gjti");
        // Undeclared exception!
        try {
            DateTimeZone.setDefault(dateTimeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format: \"-[C!,</~4gjti\" is malformed at \"[C!,</~4gjti\"
            //
            verifyException("org.joda.time.format.DateTimeFormatter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(13, 13);
        dateTimeZone0.getShortName((long) 13);
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+Ri");
        // Undeclared exception!
        try {
            DateTimeZone.setDefault(dateTimeZone0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format: \"+Ri\" is malformed at \"Ri\"
            //
            verifyException("org.joda.time.format.DateTimeFormatter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "");
        DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(29280000, "-7");
        DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        DateTimeZone.forOffsetMillis(25);
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        DateTimeZone.forID("UTC");
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(0, 0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getName(9223372036854775804L);
        DateTimeZone.forID("-07:00");
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID("+00:00");
        dateTimeZone0.convertLocalToUTC((-4209L), true);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        // Undeclared exception!
        try {
            DateTimeZone.setDefault(dateTimeZone0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.DateTimeZone", e);
        }
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.UTC.isLocalDateTimeGap((LocalDateTime) null);
        DateTimeZone.setDefault(dateTimeZone0);
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        DateTimeZone.forOffsetHoursMinutes(0, 2147483645);
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(13, 13);
        Instant instant0 = new Instant((long) 13);
        dateTimeZone0.UTC.getOffset((ReadableInstant) instant0);
        dateTimeZone0.getShortName((long) 13);
        dateTimeZone0.nextTransition(13);
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        DateTimeZone.setDefault((DateTimeZone) null);
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getOffset((ReadableInstant) null);
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.UTC.getMillisKeepLocal((DateTimeZone) null, 9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test5656() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.getShortName((-9223372036826397812L));
    }

    @Test(timeout = 4000)
    public void test5757() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2506, "GMT-");
        DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test5858() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
    }

    @Test(timeout = 4000)
    public void test5959() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, true);
    }

    @Test(timeout = 4000)
    public void test6060() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(830, "JST");
        DateTimeZone.forTimeZone(simpleTimeZone0);
    }

    @Test(timeout = 4000)
    public void test6161() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        dateTimeZone0.convertUTCToLocal((-9223372036829575809L));
    }

    @Test(timeout = 4000)
    public void test6262() throws Throwable {
        UTCProvider uTCProvider0 = new UTCProvider();
        DateTimeZone.setProvider(uTCProvider0);
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        TimeZone timeZone0 = TimeZone.getTimeZone("America/Denver");
        DateTimeZone.forTimeZone(timeZone0);
        long long0 = 4434L;
    }

    @Test(timeout = 4000)
    public void test6363() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("PRT");
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
        dateTimeZone0.previousTransition(604800L);
        dateTimeZone0.convertLocalToUTC((-765399600001L), false);
    }
}
