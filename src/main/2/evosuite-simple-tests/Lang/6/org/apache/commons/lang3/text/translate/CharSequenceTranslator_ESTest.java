/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 11:35:18 GMT 2024
 */
package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(48, 48);
        String string0 = unicodeEscaper0.translate((CharSequence) "30");
        assertEquals("3\\u0030", string0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(48, 48);
        String string0 = unicodeEscaper0.translate((CharSequence) "30");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[0];
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
        CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
        CharSequenceTranslator charSequenceTranslator0 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
        assertNotNull(charSequenceTranslator0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        CharSequence[][] charSequenceArray0 = new CharSequence[0][3];
        LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        String string0 = lookupTranslator0.translate((CharSequence) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-427), (-427));
        // Undeclared exception!
        try {
            numericEntityEscaper0.translate((CharSequence) "", (Writer) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null
            //
            verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
        }
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        OctalUnescaper octalUnescaper0 = new OctalUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
        assertEquals("", stringWriter0.toString());
    }
}
