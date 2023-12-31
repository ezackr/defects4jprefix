/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:00:38 GMT 2023
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Locale locale0 = Locale.UK;
        Locale locale1 = new Locale("#qW*!lH", "E,f~iv|j!27l", "uC");
        List list0 = LocaleUtils.localeLookupList(locale1, locale0);
        list0.size();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale("ga");
        locale0.toString();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LocaleUtils.toLocale("zz8'D$`MFp1}`,go<)");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LocaleUtils.toLocale("XTYrx $");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Locale locale0 = Locale.ITALY;
        LocaleUtils.localeLookupList(locale0, locale0);
        LocaleUtils.isAvailableLocale(locale0);
        List list0 = LocaleUtils.localeLookupList(locale0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Set<String> set0 = locale0.getUnicodeLocaleAttributes();
        Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
        List list1 = LocaleUtils.countriesByLanguage((String) null);
        list1.equals((Object) list0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        LocaleUtils.availableLocaleList();
        LocaleUtils localeUtils0 = new LocaleUtils();
        Locale locale0 = new Locale("2hKYK@W L", "2hKYK@W L");
        List list0 = LocaleUtils.localeLookupList(locale0);
        List list1 = LocaleUtils.languagesByCountry((String) null);
        list1.equals((Object) list0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        List list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        LocaleUtils.countriesByLanguage("mk");
        LocaleUtils.countriesByLanguage("mk");
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        Locale locale0 = LocaleUtils.toLocale("mk");
        locale0.getISO3Country();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        List list0 = LocaleUtils.languagesByCountry("JP");
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        List list0 = LocaleUtils.languagesByCountry("French (Canada)");
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Set set0 = LocaleUtils.availableLocaleSet();
        Set set1 = LocaleUtils.availableLocaleSet();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        Locale locale1 = Locale.forLanguageTag("zu?");
        List list0 = LocaleUtils.localeLookupList(locale1, locale0);
        list0.size();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        LocaleUtils.toLocale("k[h-TF7SK6V?R o|=");
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        LocaleUtils.toLocale("~-");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        LocaleUtils.toLocale("");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        LocaleUtils.toLocale("`kN+h");
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Locale locale0 = LocaleUtils.toLocale((String) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        LocaleUtils.toLocale("m{\"+EEDJFybIf;}zD");
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        LocaleUtils.availableLocaleList();
        LinkedList<LinkedList<Integer>> linkedList0 = new LinkedList<LinkedList<Integer>>();
        LocaleUtils.countriesByLanguage("be");
        LocaleUtils.countriesByLanguage("ja");
        LocaleUtils.toLocale("aJ)v\"XPsG)");
    }
}
