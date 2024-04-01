/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 01:01:47 GMT 2023
 */
package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.PhoneticEngine;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PhoneticEngine_ESTest extends PhoneticEngine_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        linkedHashSet0.add("r");
        Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
        PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
        Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
        assertFalse(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        NameType nameType0 = NameType.ASHKENAZI;
        RuleType ruleType0 = RuleType.APPROX;
        PhoneticEngine phoneticEngine0 = null;
        try {
            phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
            fail("Expecting exception: NoClassDefFoundError");
        } catch (NoClassDefFoundError e) {
            //
            // Could not initialize class org.apache.commons.codec.language.bm.Lang
            //
            verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
        phoneticEngine_PhonemeBuilder0.append("");
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
        LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
        Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
        phoneticEngine_PhonemeBuilder0.apply(rule_PhonemeList0, 1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
        Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", (Languages.LanguageSet) null);
        // Undeclared exception!
        try {
            phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 2);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
        String string0 = phoneticEngine_PhonemeBuilder0.makeString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        NameType nameType0 = NameType.ASHKENAZI;
        RuleType ruleType0 = RuleType.RULES;
        PhoneticEngine phoneticEngine0 = null;
        try {
            phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // ruleType must not be RULES
            //
            verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
        }
    }
}
