/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 15:18:59 GMT 2024
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Locale locale0 = new Locale("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils");
        boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Locale locale0 = new Locale("org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils", "org.apache.commons.lang.LocaleUtils");
        boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
        List list0 = LocaleUtils.countriesByLanguage("org.apache.commons.lang.LocaleUtils");
        LinkedList<LinkedList<Locale.LanguageRange>> linkedList0 = new LinkedList<LinkedList<Locale.LanguageRange>>();
        List list1 = LocaleUtils.countriesByLanguage("org.apache.commons.lang.LocaleUtils");
        assertSame(list1, list0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        LocaleUtils localeUtils0 = new LocaleUtils();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Locale locale0 = new Locale("MK", "MK", "MK");
        List list0 = LocaleUtils.localeLookupList(locale0);
        assertEquals(3, list0.size());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale("hn_SJ_^YytI");
        assertNotNull(locale0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale("hn_SJ_^YytI");
        assertEquals("SJM", locale0.getISO3Country());
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale((String) null);
        assertNull(locale0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale("cb");
        assertEquals("cb", locale0.toString());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale("hn_SJ");
        assertEquals("hn_SJ", locale0.toString());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format:
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("RHIuCE}Z(LyN`D_]qV");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: RHIuCE}Z(LyN`D_]qV
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("4@A+wD2Rf7r4f");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: 4@A+wD2Rf7r4f
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("g/I}=");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: g/I}=
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("w|]K]Q{%h68");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: w|]K]Q{%h68
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("gp^{:T6UR^jb1");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: gp^{:T6UR^jb1
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("hn_:ZSJ]|[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: hn_:ZSJ]|[
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("hn_`3S[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: hn_`3S[
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("hn_S'4[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: hn_S'4[
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("hn_S[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: hn_S[
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        // Undeclared exception!
        try {
            LocaleUtils.toLocale("hn_SJ1[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid locale format: hn_SJ1[
            //
            verifyException("org.apache.commons.lang.LocaleUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        List list0 = LocaleUtils.localeLookupList((Locale) null);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        List list0 = LocaleUtils.localeLookupList(locale0, locale0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        List list0 = LocaleUtils.localeLookupList(locale0, (Locale) null);
        assertEquals(2, list0.size());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Set set0 = LocaleUtils.availableLocaleSet();
        Set set1 = LocaleUtils.availableLocaleSet();
        assertSame(set1, set0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        Locale locale0 = Locale.PRC;
        boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        List list0 = LocaleUtils.languagesByCountry((String) null);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        List list0 = LocaleUtils.languagesByCountry("TH");
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        List list0 = LocaleUtils.countriesByLanguage((String) null);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        List list0 = LocaleUtils.countriesByLanguage("th");
        assertFalse(list0.isEmpty());
    }
}
