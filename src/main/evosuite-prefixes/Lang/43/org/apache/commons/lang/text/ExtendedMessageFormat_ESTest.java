/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 02:45:27 GMT 2023
 */
package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.BiFunction;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        HashMap<Locale.LanguageRange, Locale> hashMap0 = new HashMap<Locale.LanguageRange, Locale>();
        HashMap<Locale.LanguageRange, Locale> hashMap1 = new HashMap<Locale.LanguageRange, Locale>(hashMap0);
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("htC{kh", locale0, hashMap1);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("2<@Xu");
        Format[] formatArray0 = new Format[8];
        formatArray0[0] = (Format) extendedMessageFormat0;
        formatArray0[1] = (Format) extendedMessageFormat0;
        formatArray0[2] = (Format) extendedMessageFormat0;
        formatArray0[3] = (Format) extendedMessageFormat0;
        formatArray0[4] = (Format) extendedMessageFormat0;
        formatArray0[5] = (Format) extendedMessageFormat0;
        formatArray0[6] = (Format) extendedMessageFormat0;
        formatArray0[7] = (Format) extendedMessageFormat0;
        extendedMessageFormat0.setFormats(formatArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        HashMap<String, Locale> hashMap0 = new HashMap<String, Locale>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("g0E_WlA_<r,-T59|}", hashMap0);
        int int0 = 184;
        ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat("g0E_WlA_<r,-T59|}", hashMap0);
        extendedMessageFormat0.setFormatByArgumentIndex(184, extendedMessageFormat1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Locale locale0 = Locale.forLanguageTag("");
        HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0, hashMap0);
        int int0 = 102;
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
        Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
        hashMap0.putIfAbsent((Object) null, (String) null);
        HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
        ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat("", hashMap1);
        extendedMessageFormat0.setFormat(102, extendedMessageFormat1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        HashMap<ChronoLocalDate, Object> hashMap0 = new HashMap<ChronoLocalDate, Object>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(":<1]dg|4J_~x(D~E&^", hashMap0);
        Format[] formatArray0 = new Format[4];
        formatArray0[0] = (Format) extendedMessageFormat0;
        Locale locale0 = Locale.ENGLISH;
        DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols(locale0);
        MockSimpleDateFormat mockSimpleDateFormat0 = null;
        mockSimpleDateFormat0 = new MockSimpleDateFormat(":<1]dg|4J_~x(D~E&^", dateFormatSymbols0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
        hashMap0.put((Integer) null, "");
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", hashMap0);
        extendedMessageFormat0.applyPattern("--;{,i");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String string0 = "CRf]nwH\\uWS";
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Locale) null);
        Format[] formatArray0 = new Format[2];
        Object object0 = new Object();
        extendedMessageFormat0.format(object0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        HashMap<MockDateFormat, MessageFormat> hashMap0 = new HashMap<MockDateFormat, MessageFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("L!4EWV]xDAc?,fWity", locale0, hashMap0);
        Format[] formatArray0 = new Format[0];
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("Z(Rqm{HtS$", hashMap0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
        Locale locale1 = Locale.JAPANESE;
        NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale1);
        extendedMessageFormat0.setFormat(0, numberFormat0);
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        HashMap<MessageFormat, String> hashMap0 = new HashMap<MessageFormat, String>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("org.apache.commons.lang.text.StrMatcher$StringMatcher", hashMap0);
        extendedMessageFormat0.applyPattern("org.apache.commons.lang.text.StrMatcher$StringMatcher");
        NumberFormat numberFormat0 = NumberFormat.getInstance();
        extendedMessageFormat0.setFormat(0, numberFormat0);
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("(le[JyF'8FT#C;Sb");
        Format[] formatArray0 = new Format[2];
        formatArray0[0] = (Format) extendedMessageFormat0;
        formatArray0[1] = (Format) extendedMessageFormat0;
        extendedMessageFormat0.setFormats(formatArray0);
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        String string0 = null;
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null);
    }

    @Test(timeout = 4000)
    public void test1613() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("a)BS[<b_S%1#Z7e}.");
        Format[] formatArray0 = new Format[5];
        formatArray0[0] = (Format) extendedMessageFormat0;
        formatArray0[1] = (Format) extendedMessageFormat0;
        formatArray0[2] = (Format) extendedMessageFormat0;
        formatArray0[3] = (Format) extendedMessageFormat0;
        formatArray0[4] = (Format) extendedMessageFormat0;
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
    }

    @Test(timeout = 4000)
    public void test1914() throws Throwable {
        Locale locale0 = Locale.KOREA;
        HashMap<MockDateFormat, Integer> hashMap0 = new HashMap<MockDateFormat, Integer>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, locale0, hashMap0);
    }

    @Test(timeout = 4000)
    public void test2015() throws Throwable {
        String string0 = null;
        int int0 = 1433;
        HashMap<Integer, MockSimpleDateFormat> hashMap0 = new HashMap<Integer, MockSimpleDateFormat>(1433, 1433);
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, hashMap0);
    }

    @Test(timeout = 4000)
    public void test2216() throws Throwable {
        Locale locale0 = Locale.CHINA;
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", locale0);
        MessageFormat messageFormat0 = new MessageFormat("", locale0);
        extendedMessageFormat0.setFormatByArgumentIndex((-1), messageFormat0);
    }

    @Test(timeout = 4000)
    public void test2317() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("IA6{k");
    }

    @Test(timeout = 4000)
    public void test2418() throws Throwable {
        String string0 = "{t!";
        Locale locale0 = Locale.TAIWAN;
        HashMap<NumberFormat, ChoiceFormat> hashMap0 = new HashMap<NumberFormat, ChoiceFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("{t!", locale0, hashMap0);
    }

    @Test(timeout = 4000)
    public void test2519() throws Throwable {
        Locale locale0 = new Locale("org.apache.commons.lang.text.StrMatcher$CharSetMatcher", "org.apache.commons.lang.text.StrMatcher$CharSetMatcher");
        HashMap<NumberFormat, String> hashMap0 = new HashMap<NumberFormat, String>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("JS@oDv3U,B ", locale0, hashMap0);
        extendedMessageFormat0.parse("JS@oDv3U,B ");
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Set<String> set0 = locale0.getUnicodeLocaleKeys();
        Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
        DateFormat dateFormat0 = MockDateFormat.getDateInstance();
        extendedMessageFormat0.setFormatByArgumentIndex(0, dateFormat0);
    }

    @Test(timeout = 4000)
    public void test2620() throws Throwable {
        String string0 = null;
        Locale locale0 = Locale.JAPAN;
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat((String) null, locale0);
    }

    @Test(timeout = 4000)
    public void test2721() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("-P)u4%'Z\":d*gb.0KJ");
        extendedMessageFormat0.toPattern();
        extendedMessageFormat0.applyPattern((String) null);
    }

    @Test(timeout = 4000)
    public void test2822() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("X{f``0u+\nSkS5", locale0);
    }

    @Test(timeout = 4000)
    public void test2923() throws Throwable {
        HashMap<DecimalFormat, Integer> hashMap0 = new HashMap<DecimalFormat, Integer>();
        DecimalFormat decimalFormat0 = new DecimalFormat();
        int int0 = 2031;
        Integer integer0 = new Integer(2031);
        hashMap0.put(decimalFormat0, integer0);
        DecimalFormat decimalFormat1 = new DecimalFormat();
        BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(biFunction0).apply(any(), anyInt());
        hashMap0.computeIfPresent(decimalFormat1, biFunction0);
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("RRc{3^0ZZ", hashMap0);
    }

    @Test(timeout = 4000)
    public void test3124() throws Throwable {
        HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
        hashMap0.put((Integer) null, "");
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("");
        extendedMessageFormat0.applyPattern("--;{,i");
    }

    @Test(timeout = 4000)
    public void test3225() throws Throwable {
        String string0 = "{!";
        Locale locale0 = Locale.TAIWAN;
        HashMap<NumberFormat, ChoiceFormat> hashMap0 = new HashMap<NumberFormat, ChoiceFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        extendedMessageFormat0 = new ExtendedMessageFormat("{!", locale0, hashMap0);
    }
}
