/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 18:32:25 GMT 2023
 */
package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class JsonPointer_ESTest extends JsonPointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        assertEquals("~UxRS~L`&zjDqX", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        assertFalse(jsonPointer0.mayMatchElement());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        assertEquals("UxRS~L`&zjDqX/", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseQuotedTail("", 2);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        assertEquals("\"9 *EsdbB", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        assertEquals("9 *Esd~B", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2wKWi", 0);
        jsonPointer0.hashCode();
        assertEquals("~2wKWi", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2wKWi", 0);
        jsonPointer0.hashCode();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        assertEquals("", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test0411() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        assertEquals("\"", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test0413() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0514() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        assertEquals("om.fasterxml.jackson.core.JsonPointer", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test0515() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        assertEquals("com.fasterxml.jackson.core.JsonPointer", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test0516() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0517() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test0518() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test0619() throws Throwable {
        try {
            JsonPointer.compile("\" can not be represented as BigDecimal");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid input: JSON Pointer expression must start with '/': \"\" can not be represented as BigDecimal\"
            //
            verifyException("com.fasterxml.jackson.core.JsonPointer", e);
        }
    }

    @Test(timeout = 4000)
    public void test0720() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        String string0 = jsonPointer0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test0821() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        assertEquals("~'", jsonPointer2.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test0822() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        assertEquals((-1), jsonPointer2.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0823() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        assertEquals("'", jsonPointer2.toString());
    }

    @Test(timeout = 4000)
    public void test0824() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        assertNotNull(jsonPointer2);
    }

    @Test(timeout = 4000)
    public void test0925() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        assertEquals((-1), jsonPointer2.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0926() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        assertEquals((-1), jsonPointer1.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test0927() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        assertNotNull(jsonPointer2);
    }

    @Test(timeout = 4000)
    public void test0928() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        assertEquals(")FP\"Z", jsonPointer2.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test1029() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test1030() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        assertEquals("3F*^fz99E<t;!CB;/", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test1031() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        assertEquals("~3F*^fz99E<t;!CB;", string0);
    }

    @Test(timeout = 4000)
    public void test1032() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test1133() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test1134() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        assertEquals("H", jsonPointer1.toString());
    }

    @Test(timeout = 4000)
    public void test1135() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        assertEquals("0", jsonPointer1.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test1136() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1137() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        assertFalse(jsonPointer1.matches());
    }

    @Test(timeout = 4000)
    public void test1238() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test1239() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        assertEquals("04", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test1240() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test1241() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        assertEquals("G04", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test1342() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        assertEquals("G0", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test1343() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        assertTrue(jsonPointer0.mayMatchElement());
    }

    @Test(timeout = 4000)
    public void test1344() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        assertEquals("0", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test1345() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test1446() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer.valueOf("Invalid input: JSON Pointer expression must start with '/': \"");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid input: JSON Pointer expression must start with '/': \"Invalid input: JSON Pointer expression must start with '/': \"\"
            //
            verifyException("com.fasterxml.jackson.core.JsonPointer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1547() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseTail("");
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1648() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseTail("p7[506");
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"7[506\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1749() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseTail((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.JsonPointer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1850() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseQuotedTail((String) null, 646);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.JsonPointer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1951() throws Throwable {
        // Undeclared exception!
        try {
            JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 1143);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // start 1, end 1142, s.length() 15
            //
            verifyException("java.lang.AbstractStringBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test2052() throws Throwable {
        JsonPointer jsonPointer0 = null;
        try {
            jsonPointer0 = new JsonPointer("3!7E", "3!7E", (JsonPointer) null);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"3!7E\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test2153() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        JsonPointer jsonPointer1 = null;
        try {
            jsonPointer1 = new JsonPointer((String) null, (String) null, jsonPointer0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.core.JsonPointer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2254() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        assertEquals("PV8}XI{l'YJO9E($", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2255() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2256() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2257() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        assertEquals("/PV8}XI{l'YJO9E($", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2358() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("");
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertNull(jsonPointer1);
    }

    @Test(timeout = 4000)
    public void test2459() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2460() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        assertEquals("2.2250738585072012e-308", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2461() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        assertFalse(jsonPointer0.mayMatchElement());
    }

    @Test(timeout = 4000)
    public void test2462() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        assertEquals(".2250738585072/2e-308", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2563() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2564() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2565() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        assertEquals("Re<Syn?x~0Gpvyl", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2566() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        assertEquals("~Re<Syn?x~Gpvyl", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2667() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        assertEquals("ZxSb~", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2668() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2669() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2670() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        assertEquals("$ZxSb~", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2771() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        assertEquals("|)z_l/&t?Lhvg~9=PF", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2772() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2773() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        assertEquals(")z_l", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2774() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2875() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        assertEquals("F*^fz99E<t;!CB;", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2876() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test2877() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2878() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        assertEquals("3F*^fz99E<t;!CB;/", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2979() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test2980() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        assertEquals("~)kx^$<MFG", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test2981() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        assertEquals(")kx^$<MFG", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test2982() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test3083() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        Object object0 = new Object();
        boolean boolean0 = jsonPointer0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3184() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        JsonPointer jsonPointer1 = new JsonPointer((String) null, "3F*^fz99E<t;!CB;/", (JsonPointer) null);
        // Undeclared exception!
        try {
            jsonPointer1.equals(jsonPointer0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3285() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test3286() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        assertEquals("~3F*^fz99E<t;!CB;", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test3287() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test3288() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3289() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        assertEquals("3F*^fz99E<t;!CB;/", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test3390() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
        boolean boolean0 = jsonPointer0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3491() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchElement((-1));
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test3592() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchElement(0);
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test3693() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        assertEquals("~cB%", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test3694() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test3695() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        assertEquals("pcB%", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test3696() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        assertNull(jsonPointer1);
    }

    @Test(timeout = 4000)
    public void test3797() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        assertTrue(jsonPointer1.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test3798() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        assertEquals((-1), jsonPointer2.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test3799() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        assertNotNull(jsonPointer2);
    }

    @Test(timeout = 4000)
    public void test37100() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        assertEquals((-1), jsonPointer1.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test37101() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        assertSame(jsonPointer2, jsonPointer0);
    }

    @Test(timeout = 4000)
    public void test38102() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchProperty("");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test39103() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertEquals("04", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test39104() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test39105() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertTrue(jsonPointer0.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test39106() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test39107() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertEquals("G04", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test40108() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        boolean boolean0 = jsonPointer0.mayMatchElement();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41109() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
        boolean boolean0 = jsonPointer0.matches();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test42110() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test42111() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        assertEquals("04", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test42112() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        assertEquals("G04", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test42113() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        assertEquals(4, jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test42114() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        assertTrue(jsonPointer0.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test43115() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        assertTrue(jsonPointer0.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test43116() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        assertEquals("/", jsonPointer0.toString());
    }

    @Test(timeout = 4000)
    public void test43117() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test43118() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        assertEquals("", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test43119() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test44120() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("");
        assertEquals("", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test45121() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        int int0 = jsonPointer0.getMatchingIndex();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test46122() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertEquals("G04", string0);
    }

    @Test(timeout = 4000)
    public void test46123() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test46124() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertEquals("04", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test46125() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertTrue(jsonPointer0.mayMatchElement());
    }

    @Test(timeout = 4000)
    public void test46126() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertFalse(jsonPointer0.matches());
    }

    @Test(timeout = 4000)
    public void test46127() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        assertTrue(jsonPointer0.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test47128() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertNotNull(jsonPointer1);
    }

    @Test(timeout = 4000)
    public void test47129() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertEquals("~$ZxSb~", jsonPointer0.getMatchingProperty());
    }

    @Test(timeout = 4000)
    public void test47130() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }

    @Test(timeout = 4000)
    public void test47131() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertTrue(jsonPointer0.mayMatchProperty());
    }

    @Test(timeout = 4000)
    public void test47132() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        assertEquals("", jsonPointer1.toString());
    }

    @Test(timeout = 4000)
    public void test48133() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.getMatchingProperty();
        assertEquals((-1), jsonPointer0.getMatchingIndex());
    }
}
