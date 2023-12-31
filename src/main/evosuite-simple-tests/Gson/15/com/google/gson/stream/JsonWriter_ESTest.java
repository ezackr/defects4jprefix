/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 16:41:12 GMT 2023
 */
package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        JsonWriter jsonWriter2 = jsonWriter1.name("Xvw&Uz};,bZFt!42");
        // Undeclared exception!
        try {
            jsonWriter2.beginArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        // Undeclared exception!
        try {
            jsonWriter0.endObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value("pUiZ2e5Aj< ");
        assertEquals("\"pUiZ2e5Aj< \"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.value(true);
        assertEquals("true", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value(true);
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.value(true);
        assertEquals("true", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.value("=1A5/g7.E^");
        assertEquals("\"=1A5/g7.E^\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Double double0 = new Double((-2415.298894));
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value((Number) double0);
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Double double0 = new Double((-2415.298894));
        jsonWriter0.setSerializeNulls(false);
        JsonWriter jsonWriter1 = jsonWriter0.value((Number) double0);
        assertFalse(jsonWriter1.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.value((Boolean) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Boolean boolean0 = Boolean.FALSE;
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value(boolean0);
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Boolean boolean0 = Boolean.FALSE;
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.value(boolean0);
        assertEquals("false", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        JsonWriter jsonWriter1 = jsonWriter0.value((long) 0);
        assertTrue(jsonWriter1.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value((long) 'p');
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.value((-1766L));
        assertEquals("-1766", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.beginObject();
        jsonWriter0.endObject();
        jsonWriter0.value(0.0);
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.value(0.0);
        assertEquals("0.0", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.nullValue();
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.nullValue();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.nullValue();
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.nullValue();
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        JsonWriter jsonWriter1 = jsonWriter0.name("&");
        assertTrue(jsonWriter1.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.name("&");
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        JsonWriter jsonWriter1 = jsonWriter0.name("");
        assertFalse(jsonWriter1.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.jsonValue("=1A5/g7.E^");
        assertEquals("=1A5/g7.E^", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.jsonValue("=1A5/g7.E^");
        assertEquals("=1A5/g7.E^", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.jsonValue("=1A5/g7.E^");
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        jsonWriter0.jsonValue("=1A5/g7.E^");
        assertEquals("=1A5/g7.E^", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.isLenient();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        boolean boolean0 = jsonWriter0.isHtmlSafe();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        boolean boolean0 = jsonWriter0.getSerializeNulls();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        jsonWriter0.beginObject();
        jsonWriter0.endObject();
        assertEquals("{}", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        jsonWriter1.setHtmlSafe(true);
        jsonWriter0.endObject();
        assertTrue(jsonWriter0.isHtmlSafe());
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.endArray();
        assertEquals("[]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.name("");
        jsonWriter2.setHtmlSafe(true);
        jsonWriter0.beginArray();
        jsonWriter2.endArray();
        assertEquals("{\"\":[]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setSerializeNulls(false);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.endObject();
        jsonWriter2.endArray();
        assertEquals("[{}]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        // Undeclared exception!
        try {
            jsonWriter0.value(true);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value(false);
        Boolean boolean0 = Boolean.valueOf(false);
        // Undeclared exception!
        try {
            jsonWriter1.value(boolean0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Byte byte0 = new Byte((byte) (-27));
        JsonWriter jsonWriter1 = jsonWriter0.value((Number) byte0);
        // Undeclared exception!
        try {
            jsonWriter1.value((-1L));
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        JsonWriter jsonWriter1 = jsonWriter0.endArray();
        // Undeclared exception!
        try {
            jsonWriter1.value((-1.0));
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.setIndent((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value((-1.0));
        jsonWriter1.setLenient(true);
        jsonWriter1.value("");
        assertEquals("-1.0\"\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        jsonWriter0.name("");
        Short short0 = new Short((short) 10);
        jsonWriter1.value((Number) short0);
        Float float0 = new Float((float) 0);
        // Undeclared exception!
        try {
            jsonWriter1.value((Number) float0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        // Undeclared exception!
        try {
            jsonWriter0.jsonValue("=1A5/g7.E^");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.jsonValue(":V");
        assertEquals("[:V", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.jsonValue(":V");
        Double double0 = new Double((-2415.298894));
        jsonWriter1.value((Number) double0);
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.name("b");
        JsonWriter jsonWriter3 = jsonWriter2.value(true);
        jsonWriter3.name(">V{+[ex");
        jsonWriter1.value("b");
        assertEquals("{\"b\":true,\">V{+[ex\":\"b\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter0.setIndent("X,8]k-K?ut{o0C6o)");
        jsonWriter1.value(2441L);
        assertEquals("[\nX,8]k-K?ut{o0C6o)2441", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Incomplete document
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4549() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        try {
            jsonWriter0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Incomplete document
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4650() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(38);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value(0L);
        jsonWriter1.close();
        // Undeclared exception!
        try {
            jsonWriter0.flush();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test4751() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.flush();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test4852() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Double double0 = new Double((-2415.298894));
        jsonWriter0.setLenient(true);
        jsonWriter0.value((Number) double0);
        assertTrue(jsonWriter0.isLenient());
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value((Number) null);
        // Undeclared exception!
        try {
            jsonWriter1.beginObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5054() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value((-1.0));
        // Undeclared exception!
        try {
            jsonWriter1.value("");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5155() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Boolean boolean0 = Boolean.TRUE;
        jsonWriter0.value(boolean0);
        assertEquals("true", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5256() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("w");
        assertTrue(jsonWriter1.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test5257() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("w");
        jsonWriter1.setSerializeNulls(false);
        assertFalse(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test5258() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("w");
        jsonWriter1.setSerializeNulls(false);
        jsonWriter0.nullValue();
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5359() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.name("w");
        // Undeclared exception!
        try {
            jsonWriter0.nullValue();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5460() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.jsonValue((String) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5561() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value((String) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5562() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value((String) null);
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test5663() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.jsonValue("");
        jsonWriter0.close();
        // Undeclared exception!
        try {
            jsonWriter0.name("YhZIkLSDJ /X7,}r");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5764() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("YhZIkLSDJ /X7,}r");
        // Undeclared exception!
        try {
            jsonWriter1.name("YhZIkLSDJ /X7,}r");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5865() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.name((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // name == null
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test5966() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(38);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value(0L);
        jsonWriter1.close();
        // Undeclared exception!
        try {
            jsonWriter1.endArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test6067() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setIndent("");
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test6168() throws Throwable {
        JsonWriter jsonWriter0 = null;
        try {
            jsonWriter0 = new JsonWriter((Writer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // out == null
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test6269() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.name("");
        JsonWriter jsonWriter3 = jsonWriter0.beginArray();
        jsonWriter3.name(">V{+[ex");
        // Undeclared exception!
        try {
            jsonWriter2.endArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Dangling name: >V{+[ex
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test6370() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.endObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test6471() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1348);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        boolean boolean0 = jsonWriter0.getSerializeNulls();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6572() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isLenient();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test6673() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        assertEquals("[", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test6674() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        Double double0 = new Double((-2415.298894));
        jsonWriter1.value((Number) double0);
        jsonWriter1.jsonValue("=1A5/g7.E^");
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test6775() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isHtmlSafe();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test6876() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value("=1A5/g7.E^");
        assertEquals("\"\\u003d1A5/g7.E^\"", stringWriter0.toString());
    }
}
