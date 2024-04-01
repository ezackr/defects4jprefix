/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 02:27:01 GMT 2023
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.value("gk;lz");
        assertEquals("[\"gk;lz\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        assertTrue(jsonWriter0.isLenient());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        Byte byte0 = new Byte((byte) (-112));
        jsonWriter0.value((Number) byte0);
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isHtmlSafe();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter0.nullValue();
        jsonWriter1.endArray();
        assertEquals("[null]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isLenient();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(38);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        boolean boolean0 = jsonWriter0.getSerializeNulls();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.value((-4334L));
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must start with an array or an object.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
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
    public void test089() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        jsonWriter1.name("Q#F[!zn<");
        // Undeclared exception!
        try {
            jsonWriter1.endObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Dangling name: Q#F[!zn<
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
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
    public void test1011() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setIndent("");
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.endArray();
        jsonWriter1.close();
        Integer integer0 = new Integer(897);
        // Undeclared exception!
        try {
            jsonWriter0.value((Number) integer0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        JsonWriter jsonWriter2 = jsonWriter1.beginArray();
        JsonWriter jsonWriter3 = jsonWriter0.beginArray();
        JsonWriter jsonWriter4 = jsonWriter0.beginArray();
        jsonWriter1.beginArray();
        jsonWriter3.beginArray();
        JsonWriter jsonWriter5 = jsonWriter1.beginArray();
        JsonWriter jsonWriter6 = jsonWriter3.beginArray();
        JsonWriter jsonWriter7 = jsonWriter6.beginArray();
        jsonWriter2.beginArray();
        JsonWriter jsonWriter8 = jsonWriter7.beginArray();
        jsonWriter7.beginArray();
        JsonWriter jsonWriter9 = jsonWriter4.beginArray();
        JsonWriter jsonWriter10 = jsonWriter2.beginArray();
        jsonWriter8.beginArray();
        jsonWriter1.beginArray();
        JsonWriter jsonWriter11 = jsonWriter5.beginArray();
        JsonWriter jsonWriter12 = jsonWriter2.beginArray();
        jsonWriter7.beginArray();
        JsonWriter jsonWriter13 = jsonWriter9.beginArray();
        jsonWriter0.beginArray();
        jsonWriter4.beginArray();
        jsonWriter9.beginArray();
        jsonWriter11.beginArray();
        jsonWriter9.beginArray();
        jsonWriter7.beginArray();
        jsonWriter12.beginArray();
        jsonWriter13.beginArray();
        JsonWriter jsonWriter14 = jsonWriter6.beginArray();
        jsonWriter14.beginArray();
        jsonWriter10.beginArray();
        jsonWriter3.beginObject();
        assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[{", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
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
    public void test1415() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.name("java.lang.Float@0000000002");
        // Undeclared exception!
        try {
            jsonWriter0.name("java.lang.Float@0000000002");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        JsonWriter jsonWriter2 = jsonWriter1.endArray();
        jsonWriter1.close();
        // Undeclared exception!
        try {
            jsonWriter2.name("");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.value((String) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must start with an array or an object.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.jsonValue((String) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must start with an array or an object.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("rQ,v ~\"`Q2Dokvq+");
        // Undeclared exception!
        try {
            jsonWriter1.nullValue();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("rQ,v ~\"`Q2Dokvq+");
        jsonWriter1.setSerializeNulls(false);
        JsonWriter jsonWriter2 = jsonWriter1.nullValue();
        assertSame(jsonWriter2, jsonWriter1);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.value(false);
        assertEquals("[false", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.value(true);
        assertEquals("[true", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.value((Number) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must start with an array or an object.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.flush();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.endArray();
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
    public void test2526() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        try {
            jsonWriter1.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Incomplete document
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.endArray();
        jsonWriter0.close();
        jsonWriter1.close();
        assertEquals("[]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
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
    public void test2829() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.name("gN*c;lz");
        jsonWriter2.jsonValue("gN*c;lz");
        // Undeclared exception!
        try {
            jsonWriter1.value("gN*c;lz");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        jsonWriter0.value("\"");
        jsonWriter0.beginArray();
        assertEquals("[\"\\\"\",[", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        jsonWriter0.setIndent("aHISaG@*8?\"p");
        jsonWriter0.nullValue();
        assertEquals("[\naHISaG@*8?\"pnull", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginObject();
        JsonWriter jsonWriter2 = jsonWriter1.name("gN*c;z");
        jsonWriter2.jsonValue("gN*c;z");
        jsonWriter2.name("gN*c;z");
        jsonWriter1.beginObject();
        assertEquals("{\"gN*c;z\":gN*c;z,\"gN*c;z\":{", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        // Undeclared exception!
        try {
            jsonWriter0.beginObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        JsonWriter jsonWriter1 = jsonWriter0.endArray();
        // Undeclared exception!
        try {
            jsonWriter1.beginArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
            //
            verifyException("com.google.gson.stream.JsonWriter", e);
        }
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        JsonWriter jsonWriter1 = jsonWriter0.value(0.0);
        jsonWriter1.value(0.0);
        assertEquals("0.00.0", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        JsonWriter jsonWriter1 = jsonWriter0.value(0.0);
        jsonWriter1.value(0.0);
        assertTrue(jsonWriter0.getSerializeNulls());
    }
}
