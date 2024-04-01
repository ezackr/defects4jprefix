/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:03:42 GMT 2023
 */
package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.CHINA;
        FastDateParser fastDateParser0 = new FastDateParser("K$jW8s?#", timeZone0, locale0);
        assertEquals("K$jW8s?#", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2327, "0VrUXQ*z", 2327, 0, 0, 2327, 4, 0, 3533, (-2280), 3533);
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("0VrUXQ*z", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(4);
        Object object0 = fastDateParser0.parseObject("\" does not match ", parsePosition0);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("<#L';fdTB&OKlfSwF ", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parseObject("<#L';fdTB&OKlfSwF ", parsePosition0);
        assertEquals(2, parsePosition0.getIndex());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("<#L';fdTB&OKlfSwF ", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parseObject("<#L';fdTB&OKlfSwF ", parsePosition0);
        assertEquals("java.text.ParsePosition[index=2,errorIndex=-1]", parsePosition0.toString());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("0#MOIST", timeZone0, locale0);
        boolean boolean0 = fastDateParser0.isNextNumber();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "GMTCNT");
        Locale locale0 = Locale.JAPANESE;
        FastDateParser fastDateParser0 = new FastDateParser("GMTCNT", simpleTimeZone0, locale0);
        TimeZone timeZone0 = fastDateParser0.getTimeZone();
        assertSame(simpleTimeZone0, timeZone0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(108, "");
        Locale locale0 = Locale.forLanguageTag("");
        FastDateParser fastDateParser0 = new FastDateParser("9micCGWVp6hJi3:", simpleTimeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parse("9micCGWVp6hJi3:", (ParsePosition) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("$L.iK6,KS@0uqa/", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parse((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Locale locale0 = Locale.CHINA;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("_BD1'(V@~3", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.getFieldWidth();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
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
    public void test0910() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ROOT;
        FastDateParser fastDateParser0 = new FastDateParser("zkf+qpgno/ RW", timeZone0, locale0);
        assertEquals("zkf+qpgno/ RW", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("+OJq9i?");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("];fCcOt", timeZone0, locale0);
        assertEquals("];fCcOt", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.US;
        FastDateParser fastDateParser0 = new FastDateParser("$*9vp+j", timeZone0, locale0);
        assertEquals("$*9vp+j", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-164));
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        FastDateParser fastDateParser0 = new FastDateParser("6Mm|t6AO&", timeZone0, locale0);
        assertEquals("6Mm|t6AO&", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.TAIWAN;
        FastDateParser fastDateParser0 = new FastDateParser("[!2?B", timeZone0, locale0);
        assertEquals("[!2?B", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2327, "0VrUXQ*z", 2327, 0, 0, 2327, 4, 0, 3533, (-2280), 3533);
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("0VrUXQ*z", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(4);
        Date date0 = fastDateParser0.parse("0VrUXQ*z", parsePosition0);
        assertNull(date0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parse("1xB{r[zmHb.(", parsePosition0);
        assertEquals(1, parsePosition0.getIndex());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(0);
        fastDateParser0.parse("1xB{r[zmHb.(", parsePosition0);
        assertEquals("java.text.ParsePosition[index=1,errorIndex=-1]", parsePosition0.toString());
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("0#MOIST", timeZone0, locale0);
        try {
            fastDateParser0.parse("0#MOIST");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Unparseable date: \"0#MOIST\" does not match 0#(\\p{IsNd}++)
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("`b{Fp1epV!Dih");
        Locale locale0 = Locale.CHINESE;
        FastDateParser fastDateParser0 = new FastDateParser("`b{Fp1epV!Dih", timeZone0, locale0);
        assertEquals("`b{Fp1epV!Dih", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.FRANCE;
        FastDateParser fastDateParser0 = new FastDateParser("\"K>=/L(ei:8HpA.;e", timeZone0, locale0);
        assertEquals("\"K>=/L(ei:8HpA.;e", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2517, "D;0%RsvvZ+v");
        Locale locale0 = Locale.GERMANY;
        FastDateParser fastDateParser0 = new FastDateParser("D;0%RsvvZ+v", simpleTimeZone0, locale0);
        assertEquals("D;0%RsvvZ+v", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("-huR");
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        FastDateParser fastDateParser0 = new FastDateParser("8 <Ao08wp9B)", timeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(116);
        // Undeclared exception!
        try {
            fastDateParser0.parse("8 <Ao08wp9B)", parsePosition0);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Locale locale0 = Locale.PRC;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("a7", timeZone0, locale0);
        assertEquals("a7", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
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
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("1xB{r[zmHb.(", simpleTimeZone0, locale0);
        Date date0 = fastDateParser0.parse("1xB{r[zmHb.(");
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("+OJq9i?");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("s.P8I]5lA", timeZone0, locale0);
        assertEquals("s.P8I]5lA", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1101, ",yJc<i^P7.4%9B{J");
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        FastDateParser fastDateParser0 = new FastDateParser(",yJc<i^P7.4%9B{J", simpleTimeZone0, locale0);
        ParsePosition parsePosition0 = new ParsePosition(1101);
        // Undeclared exception!
        try {
            fastDateParser0.parseObject(",yJc<i^P7.4%9B{J", parsePosition0);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("+OJq9i?");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("z }p1UzA61<RLqPYX", timeZone0, locale0);
        int int0 = fastDateParser0.adjustYear((-2011));
        assertEquals((-11), int0);
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("+OJq9i?");
        Locale locale0 = Locale.PRC;
        FastDateParser fastDateParser0 = new FastDateParser("z p1^UzA61<RL)qPYXL", timeZone0, locale0);
        Object object0 = fastDateParser0.parseObject("GMTJST");
        assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("");
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser fastDateParser0 = new FastDateParser("(p{IsNd}++)", timeZone0, locale0);
        try {
            fastDateParser0.parse("\" does not match ");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
            // Unparseable date: \"\" does not match \" does not match \\(
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{h5z :fAa", timeZone0, locale0);
        try {
            fastDateParser0.parseObject(":EW{h5z :fAa");
            fail("Expecting exception: ParseException");
        } catch (ParseException e) {
            //
            // Unparseable date: \":EW{h5z :fAa\" does not match :(\uAE08|\uAE08\uC694\uC77C|\uBAA9|\uBAA9\uC694\uC77C|\uC218|\uC218\uC694\uC77C|\uC6D4|\uC6D4\uC694\uC77C|\uC77C|\uC77C\uC694\uC77C|\uD1A0|\uD1A0\uC694\uC77C|\uD654|\uD654\uC694\uC77C)(\\p{IsNd}++)\\{(\\p{IsNd}{1}+)5(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|ACST|ACT|ACWST|ADT|AEDT|AEST|AFT|AKDT|AKST|ALMT|AMT|ANAT|AQTT|ART|AST|Australian\\s*+Eastern\\s*+Daylight\\s*+Time\\s*+\\(Macquarie\\)|Australian\\s*+Eastern\\s*+Standard\\s*+Time\\s*+\\(Macquarie\\)|AWST|AZOST|AZOT|AZT|BDT|BNT|BOT|Bougainville\\s*+Standard\\s*+Time|BRT|BST|BTT|CAT|CCT|CDT|Central\\s*+African\\s*+Time|CEST|CET|CHADT|CHAST|Chatham\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|Chatham\\s*+\uD45C\uC900\uC2DC|Choibalsan\\s*+\uC2DC\uAC04|CHOT|ChST|CHUT|CKT|CLST|CLT|COT|CST|CVT|CXT|Davis\\s*+\uC2DC\uAC04|DAVT|DDUT|EASST|EAST|Easter\\s*+Is\\.\\s*+\uC2DC\uAC04|Easter\\s*+Is\\.\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|EAT|ECT|EDT|EEST|EET|EGST|EGT|EST|Fernando\\s*+de\\s*+Noronha\\s*+\uC2DC\uAC04|FJT|FKT|FNT|GALT|GAMT|GET|GFT|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|GST|GYT|HDT|HKT|Hovd\\s*+\uC2DC\uAC04|HOVT|HST|ICT|IDT|IOT|IRKT|IRST|IST|JST|KGT|KOST|Kostanay\\s*+Standard\\s*+Time|KRAT|KST|LHDT|LHST|LINT|MAGT|MART|MAWT|MDT|MEST|MET|MHT|MMT|MSK|MST|MUT|MVT|MYT|NCT|NDT|NFST|NFT|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|Omsk\\s*+\uC2DC\uAC04|OMST|Oral\\s*+\uD45C\uC900\uC2DC|ORAT|PDT|PET|PETT|PGT|Philippines\\s*+Standard\\s*+Time|PHOT|Pitcairn\\s*+\uD45C\uC900\uC2DC|PKT|PMDT|PMST|PONT|PST|PWT|PYST|PYT|QOST|QYZT|Qyzylorda\\s*+\uD45C\uC900\uC2DC|RET|ROTT|SAKT|SAMT|SAST|SBT|SCT|SGT|Srednekolymsk\\s*+Time|SRET|SRT|SST|SYOT|Syowa\\s*+\uC2DC\uAC04|TAHT|TFT|TJT|TKT|TLT|TMT|TOT|TVT|ULAT|UTC|UYT|UZT|VET|VLAT|VOST|Vostok\\s*+\uC2DC\uAC04|VUT|WAKT|WAT|WEST|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSST|XJT|YAKT|YEKT|\uAC00\uB098\\s*+\uD45C\uC900\uC2DC|\uAC00\uC774\uC544\uB098\\s*+\uC2DC\uAC04|\uAC08\uB77C\uD30C\uACE0\uC2A4\\s*+\uC2DC\uAC04|\uAC10\uBE44\uC544\\s*+\uC2DC\uAC04|\uAC78\uD504\uB9CC\\s*+\uD45C\uC900\uC2DC|\uADF8\uB8E8\uC9C0\uC57C\\s*+\uC2DC\uAC04|\uADF8\uB9AC\uB2C8\uCE58\\s*+\uD45C\uC900\uC2DC|\uAE38\uBC84\uD2B8\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uAE4C\uBF40\uBCA0\uB974\uB370\\s*+\uC2DC\uAC04|\uB098\uC6B0\uB8E8\\s*+\uC2DC\uAC04|\uB0A8\uC544\uD504\uB9AC\uCE74\\s*+\uD45C\uC900\uC2DC|\uB124\uD314\\s*+\uC2DC\uAC04|\uB178\uBE0C\uC2DC\uBE4C\uC2A4\uD06C\\s*+\uC2DC\uAC04|\uB178\uD37D\\s*+\uC2DC\uAC04|\uB178\uD37D\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB274\\s*+\uCE7C\uB808\uB3C4\uB2C8\uC544\\s*+\uC2DC\uAC04|\uB274\uC9C8\uB79C\uB4DC\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB274\uC9C8\uB79C\uB4DC\\s*+\uD45C\uC900\uC2DC|\uB274\uD380\uB4E4\uB79C\uB4DC\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB274\uD380\uB4E4\uB79C\uB4DC\\s*+\uD45C\uC900\uC2DC|\uB2C8\uC6B0\uC5D0\\s*+\uC2DC\uAC04|\uB300\uC11C\uC591\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB300\uC11C\uC591\\s*+\uD45C\uC900\uC2DC|\uB3D9\uBD80\\s*+\uADF8\uB9B0\uB79C\uB4DC\\s*+\uC2DC\uAC04|\uB3D9\uBD80\\s*+\uADF8\uB9B0\uB79C\uB4DC\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB3D9\uBD80\\s*+\uC544\uD504\uB9AC\uCE74\\s*+\uC2DC\uAC04|\uB3D9\uBD80\\s*+\uC778\uB3C4\uB124\uC2DC\uC544\\s*+\uC2DC\uAC04|\uB3D9\uBD80\\s*+\uC77C\uAD11\\s*+\uC808\uC57D\\s*+\uC2DC\uAC04\\(\uB274\uC0AC\uC6B0\uC2A4\uC6E8\uC77C\uC988\\)|\uB3D9\uBD80\\s*+\uC77C\uAD11\\s*+\uC808\uC57D\\s*+\uC2DC\uAC04\\(\uBE45\uD1A0\uB9AC\uC544\\)|\uB3D9\uBD80\\s*+\uC77C\uAD11\\s*+\uC808\uC57D\\s*+\uC2DC\uAC04\\(\uD0DC\uC988\uBA54\uC774\uB2C8\uC544\\)|\uB3D9\uBD80\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB3D9\uBD80\\s*+\uD45C\uC900\uC2DC|\uB3D9\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uB274\uC0AC\uC6B0\uC2A4\uC6E8\uC77C\uC988\\)|\uB3D9\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uBE45\uD1A0\uB9AC\uC544\\)|\uB3D9\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uD038\uC990\uB79C\uB4DC\\)|\uB3D9\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uD0DC\uC988\uBA54\uC774\uB2C8\uC544\\)|\uB3D9\uC720\uB7FD\\s*+\uC2DC\uAC04|\uB3D9\uC720\uB7FD\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB4A4\uBABD\\s*+\uB4A4\uB974\uBE4C\\s*+\uC2DC\uAC04|\uB77C\uC778\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uB85C\uB4DC\\s*+\uD558\uC6B0\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uB85C\uB4DC\\s*+\uD558\uC6B0\\s*+\uD45C\uC900\uC2DC|\uB85C\uC81C\uB77C\\s*+\uD45C\uC900\uC2DC|\uB9AC\uC720\uB2C8\uC5B8\\s*+\uC2DC\uAC04|\uB9C8\uAC00\uB2E8\\s*+\uC2DC\uAC04|\uB9C8\uB974\uCF00\uC0AC\uC2A4\\s*+\uC2DC\uAC04|\uB9C8\uC15C\uC81C\uB3C4\\s*+\uC2DC\uAC04|\uB9D0\uB808\uC774\uC2DC\uC544\\s*+\uC2DC\uAC04|\uBAA8\uB9AC\uC154\uC2A4\\s*+\uC2DC\uAC04|\uBAA8\uC2A4\uD06C\uBC14\\s*+\uD45C\uC900\uC2DC|\uBAA8\uC2A8\\s*+\uC2DC\uAC04|\uBAB0\uB514\uBE0C\\s*+\uC2DC\uAC04|\uBBF8\uC580\uB9C8\\s*+\uC2DC\uAC04|\uBC29\uAE00\uB77C\uB370\uC2DC\\s*+\uC2DC\uAC04|\uBCA0\uB124\uC218\uC5D8\uB77C\\s*+\uC2DC\uAC04|\uBCFC\uB9AC\uBE44\uC544\\s*+\uC2DC\uAC04|\uBD80\uD0C4\\s*+\uC2DC\uAC04|\uBE0C\uB77C\uC9C8\uB9AC\uC544\\s*+\uC2DC\uAC04|\uBE0C\uB8E8\uB098\uC774\\s*+\uC2DC\uAC04|\uBE14\uB77C\uB514\uBCF4\uC2A4\uD1A1\\s*+\uC2DC\uAC04|\uBE44\uB204\uC544\uD22C\\s*+\uC2DC\uAC04|\uC0AC\uB9C8\uB77C\\s*+\uC2DC\uAC04|\uC0AC\uBAA8\uC544\\s*+\uD45C\uC900\uC2DC|\uC0AC\uC6B0\uC2A4\\s*+\uC870\uC9C0\uC544\\s*+\uD45C\uC900\uC2DC|\uC0AC\uD560\uB9B0\\s*+\uC2DC\uAC04|\uC0B0\uC9C0\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC0B0\uC9C0\\s*+\uD45C\uC900\uC2DC|\uC11C\uBD80\\s*+\uADF8\uB9B0\uB79C\uB4DC\\s*+\uC2DC\uAC04|\uC11C\uBD80\\s*+\uADF8\uB9B0\uB79C\uB4DC\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC11C\uBD80\\s*+\uC544\uD504\uB9AC\uCE74\\s*+\uC2DC\uAC04|\uC11C\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544\\)|\uC11C\uC0AC\uBAA8\uC544\\s*+\uC2DC\uAC04|\uC11C\uC720\uB7FD\\s*+\uC2DC\uAC04|\uC11C\uC720\uB7FD\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC11C\uC778\uB3C4\uB124\uC2DC\uC544\\s*+\uC2DC\uAC04|\uC138\uACC4\\s*+\uD45C\uC900\uC2DC|\uC138\uC774\uC140\\s*+\uC2DC\uAC04|\uC194\uB85C\uBAAC\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uC218\uB9AC\uB0A8\\s*+\uC2DC\uAC04|\uC2F1\uAC00\uD3EC\uB974\\s*+\uC2DC\uAC04|\uC544\uB098\uB514\uB974\\s*+\uC2DC\uAC04|\uC544\uB78D\\s*+\uD45C\uC900\uC2DC|\uC544\uB974\uBA54\uB2C8\uC544\\s*+\uC2DC\uAC04|\uC544\uB974\uD5E8\uD2F0\uB098\\s*+\uC2DC\uAC04|\uC544\uB9C8\uC874\\s*+\uC2DC\uAC04|\uC544\uC77C\uB79C\uB4DC\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC544\uC81C\uB974\uBC14\uC774\uC794\\s*+\uC2DC\uAC04|\uC544\uC870\uB808\uC2A4\\s*+\uC2DC\uAC04|\uC544\uC870\uB808\uC2A4\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC544\uD504\uAC00\uB2C8\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uC545\uD0C0\uC6B0\\s*+\uC2DC\uAC04|\uC545\uD1A0\uBE0C\\s*+\uC2DC\uAC04|\uC54C\uB798\uC2A4\uCE74\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC54C\uB798\uC2A4\uCE74\\s*+\uD45C\uC900\uC2DC|\uC54C\uB9C8\uC544\uD0C0\\s*+\uC2DC\uAC04|\uC57C\uCE20\uD06C\\s*+\uC2DC\uAC04|\uC5D0\uC774\uCEE4\\s*+\uC2DC\uAC04|\uC5D0\uCFE0\uC544\uB3C4\uB974\\s*+\uC2DC\uAC04|\uC601\uAD6D\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC601\uC778\uB3C4\\s*+\uC81C\uB3C4\\s*+\uC2DC\uAC04|\uC608\uCE74\uD14C\uB9B0\uBC84\uADF8\\s*+\uC2DC\uAC04|\uC6B0\uB8E8\uACFC\uC774\\s*+\uC2DC\uAC04|\uC6B0\uC2A4\uD2F0\uB124\uB77C\\s*+\uD45C\uC900\uC2DC|\uC6B0\uC988\uBCA0\uD0A4\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uC6B8\uB780\uBC14\uD0C0\uB974\\s*+\uC2DC\uAC04|\uC6D4\uB9AC\uC2A4\\s*+\uD6C4\uD22C\uB098\\s*+\uC2DC\uAC04|\uC6E8\uC774\uD06C\\s*+\uC2DC\uAC04|\uC774\uB780\\s*+\uD45C\uC900\uC2DC|\uC774\uB974\uCFE0\uCE20\uD06C\\s*+\uC2DC\uAC04|\uC774\uC2A4\uB77C\uC5D8\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC774\uC2A4\uB77C\uC5D8\\s*+\uD45C\uC900\uC2DC|\uC778\uB3C4\\s*+\uD45C\uC900\uC2DC|\uC778\uB3C4\uCC28\uC774\uB098\\s*+\uBC18\uB3C4\\s*+\uC2DC\uAC04|\uC77C\uBCF8\\s*+\uD45C\uC900\uC2DC|\uC911\uAD6D\\s*+\uD45C\uC900\uC2DC|\uC911\uBD80\\s*+\uC720\uB7FD\\s*+\uC2DC\uAC04|\uC911\uBD80\\s*+\uC720\uB7FD\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC911\uBD80\\s*+\uC77C\uAD11\\s*+\uC808\uC57D\\s*+\uC2DC\uAC04\\(\uB0A8\uBD80\\s*+\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544\\)|\uC911\uBD80\\s*+\uC77C\uAD11\\s*+\uC808\uC57D\\s*+\uC2DC\uAC04\\(\uB0A8\uBD80\\s*+\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544/\uB274\uC0AC\uC6B0\uC2A4\uC6E8\uC77C\uC988\\)|\uC911\uBD80\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC911\uBD80\\s*+\uD45C\uC900\uC2DC|\uC911\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uB0A8\uBD80\\s*+\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544\\)|\uC911\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uB0A8\uBD80\\s*+\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544/\uB274\uC0AC\uC6B0\uC2A4\uC6E8\uC77C\uC988\\)|\uC911\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uBD81\uBD80\\s*+\uC9C0\uC5ED\\)|\uC911\uC559\\s*+\uC11C\uBD80\\s*+\uD45C\uC900\uC2DC\\(\uC624\uC2A4\uD2B8\uB808\uC77C\uB9AC\uC544\\)|\uC911\uC559\\s*+\uC544\uD504\uB9AC\uCE74\\s*+\uC2DC\uAC04|\uC911\uC559\\s*+\uC720\uB7FD\\s*+\uC2DC\uAC04|\uC911\uC559\\s*+\uC720\uB7FD\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uC911\uC559\\s*+\uC778\uB3C4\uB124\uC2DC\uC544\\s*+\uC2DC\uAC04|\uCC28\uBAA8\uB85C\\s*+\uD45C\uC900\uC2DC|\uCD94\uD06C\\s*+\uD45C\uC900\uC2DC|\uCE60\uB808\\s*+\uC2DC\uAC04|\uCE60\uB808\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uCF54\uC2A4\uB798\\s*+\uC2DC\uAC04|\uCF54\uCF54\uC2A4\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uCF5C\uB86C\uBE44\uC544\\s*+\uC2DC\uAC04|\uCFE0\uBC14\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uCFE0\uBC14\\s*+\uD45C\uC900\uC2DC|\uCFE0\uD06C\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uD06C\uB77C\uC2A4\uB178\uC57C\uB974\uC2A4\uD06C\\s*+\uC2DC\uAC04|\uD06C\uB9AC\uC2A4\uB9C8\uC2A4\uC12C\\s*+\uC2DC\uAC04|\uD0A4\uB974\uD0A4\uC988\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uD0C0\uC9C0\uD0A4\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uD0C0\uD788\uD2F0\\s*+\uC2DC\uAC04|\uD0DC\uD3C9\uC591\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uD0DC\uD3C9\uC591\\s*+\uD45C\uC900\uC2DC|\uD1A0\uCF08\uB77C\uC6B0\\s*+\uC2DC\uAC04|\uD1B5\uAC00\\s*+\uC2DC\uAC04|\uD22C\uB974\uD06C\uBA54\uB2C8\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uD22C\uBC1C\uB8E8\\s*+\uC2DC\uAC04|\uD2F0\uBAA8\uB974-\uB808\uC2A4\uD14C\\s*+\uC2DC\uAC04|\uD30C\uB77C\uACFC\uC774\\s*+\uC2DC\uAC04|\uD30C\uB77C\uACFC\uC774\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uD30C\uD0A4\uC2A4\uD0C4\\s*+\uC2DC\uAC04|\uD30C\uD478\uC544\uB274\uAE30\uB2C8\\s*+\uC2DC\uAC04|\uD314\uB77C\uC6B0\\s*+\uC2DC\uAC04|\uD398\uB8E8\\s*+\uC2DC\uAC04|\uD398\uD2B8\uB85C\uD30C\uBE14\uB85C\uD504\uC2A4\uD06C-\uCE84\uCC28\uCE20\uD0A4\\s*+\uC2DC\uAC04|\uD3EC\uD074\uB79C\uB4DC\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uD3F0\uD398\uC774\\s*+\uD45C\uC900\uC2DC|\uD504\uB791\uC2A4\\s*+\uB0A8\uBD80\\s*+\uC9C0\uBC29\\s*+\uBC0F\\s*+\uB0A8\uADF9\\s*+\uC9C0\uC5ED\\s*+\uC2DC\uAC04|\uD504\uB791\uC2A4\uB839\\s*+\uAE30\uC544\uB098\\s*+\uC2DC\uAC04|\uD53C\uB2C9\uC2A4\\s*+\uAD70\uB3C4\\s*+\uC2DC\uAC04|\uD53C\uC5D0\uB974\\s*+\uBBF8\uD06C\uB860\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uD53C\uC5D0\uB974\\s*+\uBBF8\uD06C\uB860\\s*+\uD45C\uC900\uC2DC|\uD53C\uC9C0\\s*+\uC2DC\uAC04|\uD558\uC640\uC774\\s*+\uC77C\uAD11\uC808\uC57D\uC2DC\uAC04|\uD558\uC640\uC774\\s*+\uD45C\uC900\uC2DC|\uD55C\uAD6D\\s*+\uD45C\uC900\uC2DC|\uD64D\uCF69\\s*+\uC2DC\uAC04)\\s*+:
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("$L.iK6,KS@0uqa/", timeZone0, locale0);
        boolean boolean0 = fastDateParser0.equals(timeZone0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.KOREAN;
        FastDateParser fastDateParser0 = null;
        try {
            fastDateParser0 = new FastDateParser("", timeZone0, locale0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid pattern
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.GERMAN;
        FastDateParser fastDateParser0 = new FastDateParser("9nr$`", timeZone0, locale0);
        Pattern pattern0 = fastDateParser0.getParsePattern();
        assertEquals("9", pattern0.pattern());
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.JAPAN;
        FastDateParser fastDateParser0 = new FastDateParser("$L.iK6,KS@0uqa/", timeZone0, locale0);
        Locale locale1 = fastDateParser0.getLocale();
        assertEquals("", locale1.getVariant());
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = new Locale(" ", " ", " ");
        FastDateParser fastDateParser0 = new FastDateParser(" ", timeZone0, locale0);
        String string0 = fastDateParser0.getPattern();
        assertEquals(" ", string0);
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{hTz :fAa", timeZone0, locale0);
        // Undeclared exception!
        try {
            fastDateParser0.parseObject("", (ParsePosition) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang3.time.FastDateParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        TimeZone timeZone0 = TimeZone.getTimeZone("7LZTCNw`0NKgw*");
        Locale locale0 = Locale.ITALY;
        FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
        String string0 = fastDateParser0.toString();
        assertEquals("FastDateParser[D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++,it_IT,GMT]", string0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3359);
        TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
        Locale locale0 = Locale.KOREA;
        FastDateParser fastDateParser0 = new FastDateParser(":EW{h5z :fAa", timeZone0, locale0);
        fastDateParser0.hashCode();
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        ZoneId zoneId0 = ZoneId.systemDefault();
        TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
        Locale locale0 = Locale.ROOT;
        FastDateParser fastDateParser0 = new FastDateParser("?w?yKGM<B=9%9IL)CL", timeZone0, locale0);
        int int0 = fastDateParser0.adjustYear(825);
        assertEquals(2725, int0);
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = new Locale("36", "y>0m-0L0K)", "3sUSw_PJd2]a#wEY\f");
        FastDateParser fastDateParser0 = new FastDateParser("FZ=5?Et#%bJ]<D/", timeZone0, locale0);
        assertEquals("FZ=5?Et#%bJ]<D/", fastDateParser0.getPattern());
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = Locale.ITALIAN;
        FastDateParser fastDateParser0 = new FastDateParser("k/Zp#v;7", timeZone0, locale0);
        assertEquals("k/Zp#v;7", fastDateParser0.getPattern());
    }
}
