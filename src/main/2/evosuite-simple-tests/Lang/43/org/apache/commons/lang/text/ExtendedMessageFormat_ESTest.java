/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 14:39:31 GMT 2024
 */
package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ExtendedMessageFormat_ESTest extends ExtendedMessageFormat_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HashMap<ChoiceFormat, Integer> hashMap0 = new HashMap<ChoiceFormat, Integer>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        try {
            extendedMessageFormat0 = new ExtendedMessageFormat("=p{9,e&!^", hashMap0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unterminated format element at position 5
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = Locale.ROOT;
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("joAaP?", locale0);
        // Undeclared exception!
        try {
            extendedMessageFormat0.setFormatsByArgumentIndex((Format[]) null);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
        Locale locale0 = Locale.CHINESE;
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("Invalid format argument index at position ", locale0);
        // Undeclared exception!
        try {
            extendedMessageFormat0.setFormat(34, numberFormat0);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("", (Map) null);
        String string0 = extendedMessageFormat0.toPattern();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Format[] formatArray0 = new Format[7];
        HashMap<ChoiceFormat, Integer> hashMap0 = new HashMap<ChoiceFormat, Integer>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("GS(u1S", hashMap0);
        // Undeclared exception!
        try {
            extendedMessageFormat0.setFormats(formatArray0);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(" \t\n\"\f");
        // Undeclared exception!
        try {
            extendedMessageFormat0.setFormatByArgumentIndex(2, (Format) null);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        HashMap<ChoiceFormat, Integer> hashMap0 = new HashMap<ChoiceFormat, Integer>();
        ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("@4mc1-T'%7.'adJ%", hashMap0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        HashMap<Object, NumberFormat> hashMap0 = new HashMap<Object, NumberFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        try {
            extendedMessageFormat0 = new ExtendedMessageFormat("dU:X#ju.?t[{ ,R", hashMap0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format argument index at position 12:  ,
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        HashMap<Object, NumberFormat> hashMap0 = new HashMap<Object, NumberFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        try {
            extendedMessageFormat0 = new ExtendedMessageFormat("dU:,z.?[T{ 9", hashMap0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unterminated format element at position 10
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        HashMap<MockSimpleDateFormat, NumberFormat> hashMap0 = new HashMap<MockSimpleDateFormat, NumberFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        try {
            extendedMessageFormat0 = new ExtendedMessageFormat("|{}", hashMap0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid format argument index at position 2: }
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        HashMap<String, MockDateFormat> hashMap0 = new HashMap<String, MockDateFormat>();
        ExtendedMessageFormat extendedMessageFormat0 = null;
        try {
            extendedMessageFormat0 = new ExtendedMessageFormat("dU,z.?[T{ ", hashMap0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unterminated format element at position 9
            //
            verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
        }
    }
}
