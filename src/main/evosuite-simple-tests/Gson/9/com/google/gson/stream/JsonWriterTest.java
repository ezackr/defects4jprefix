/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 02:32:33 GMT 2023
 */
package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.runner.RunWith;

public class JsonWriterTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setHtmlSafe(true);
        jsonWriter0.value(")^wQlvn.6&bgO5Tv");
        assertEquals("\")^wQlvn.6\\u0026bgO5Tv\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.setLenient(true);
        Byte byte0 = new Byte((byte) 98);
        jsonWriter0.value((Number) byte0);
        assertTrue(jsonWriter0.isLenient());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isHtmlSafe();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        jsonWriter0.endObject();
        assertEquals("{}", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        jsonWriter0.endObject();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1042);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.isLenient();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(1042);
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        boolean boolean0 = jsonWriter0.getSerializeNulls();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value(0L);
        assertTrue(jsonWriter1.getSerializeNulls());
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
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginArray();
        JsonWriter jsonWriter1 = jsonWriter0.nullValue();
        jsonWriter1.endArray();
        assertEquals("[null]", stringWriter0.toString());
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
        jsonWriter0.beginObject();
        JsonWriter jsonWriter1 = jsonWriter0.name("");
        // Undeclared exception!
        try {
            jsonWriter1.endObject();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Dangling name:
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        JsonWriter jsonWriter2 = jsonWriter0.beginArray();
        JsonWriter jsonWriter3 = jsonWriter2.beginArray();
        JsonWriter jsonWriter4 = jsonWriter0.beginArray();
        JsonWriter jsonWriter5 = jsonWriter0.beginArray();
        JsonWriter jsonWriter6 = jsonWriter1.beginArray();
        JsonWriter jsonWriter7 = jsonWriter5.beginArray();
        JsonWriter jsonWriter8 = jsonWriter5.beginArray();
        jsonWriter0.beginArray();
        jsonWriter2.beginArray();
        jsonWriter8.beginArray();
        JsonWriter jsonWriter9 = jsonWriter4.beginArray();
        jsonWriter3.beginArray();
        JsonWriter jsonWriter10 = jsonWriter3.beginArray();
        jsonWriter1.beginArray();
        JsonWriter jsonWriter11 = jsonWriter8.beginArray();
        JsonWriter jsonWriter12 = jsonWriter1.beginArray();
        jsonWriter6.beginArray();
        jsonWriter10.beginArray();
        JsonWriter jsonWriter13 = jsonWriter11.beginArray();
        jsonWriter12.beginArray();
        jsonWriter7.beginArray();
        jsonWriter9.beginArray();
        JsonWriter jsonWriter14 = jsonWriter5.beginArray();
        jsonWriter11.beginArray();
        jsonWriter3.beginArray();
        jsonWriter9.beginArray();
        jsonWriter7.beginArray();
        jsonWriter8.beginArray();
        JsonWriter jsonWriter15 = jsonWriter14.beginArray();
        jsonWriter15.beginArray();
        jsonWriter13.beginObject();
        assertEquals("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[{", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        jsonWriter0.close();
        // Undeclared exception!
        try {
            jsonWriter0.beginArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        // Undeclared exception!
        try {
            jsonWriter0.name((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // name == null
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.name("");
        // Undeclared exception!
        try {
            jsonWriter0.name("");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.value("mrJB]qbqw-OXu%L");
        jsonWriter1.close();
        // Undeclared exception!
        try {
            jsonWriter0.name("mrJB]qbqw-OXu%L");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value((String) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.jsonValue((String) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.jsonValue((String) null);
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.name("");
        // Undeclared exception!
        try {
            jsonWriter0.nullValue();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
        }
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("java.lang.Double@0000000003");
        assertTrue(jsonWriter1.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("java.lang.Double@0000000003");
        jsonWriter1.setSerializeNulls(false);
        assertFalse(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.name("java.lang.Double@0000000003");
        jsonWriter1.setSerializeNulls(false);
        jsonWriter0.nullValue();
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value(false);
        assertEquals("false", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value(true);
        assertEquals("true", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value((double) (byte) (-13));
        assertEquals("-13.0", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value((Number) null);
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.flush();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        Long long0 = new Long((-2362L));
        jsonWriter0.value((Number) long0);
        jsonWriter0.close();
        // Undeclared exception!
        try {
            jsonWriter0.flush();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JsonWriter is closed.
        }
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        try {
            jsonWriter0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Incomplete document
        }
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        jsonWriter0.close();
        jsonWriter0.close();
        assertEquals("null", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        jsonWriter0.close();
        jsonWriter0.close();
        assertTrue(jsonWriter0.getSerializeNulls());
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.close();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Incomplete document
        }
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.value("\"");
        assertEquals("\"\\\"\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3136() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.setIndent("cjLBdW]A`W.l}iOj@h");
        jsonWriter1.beginArray();
        assertEquals("[\ncjLBdW]A`W.l}iOj@h[", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3237() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        JsonWriter jsonWriter1 = jsonWriter0.name("");
        jsonWriter1.value("");
        jsonWriter1.name("");
        jsonWriter1.beginArray();
        assertEquals("{\"\":\"\",\"\":[", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3338() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        JsonWriter jsonWriter1 = jsonWriter0.beginArray();
        jsonWriter1.jsonValue("cjLBdW]A`W.l}iOj@h");
        jsonWriter0.beginObject();
        assertEquals("[cjLBdW]A`W.l}iOj@h,{", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3439() throws Throwable {
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
        }
    }

    @Test(timeout = 4000)
    public void test3540() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.beginObject();
        JsonWriter jsonWriter1 = jsonWriter0.name("");
        jsonWriter0.nullValue();
        // Undeclared exception!
        try {
            jsonWriter1.beginArray();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Nesting problem.
        }
    }

    @Test(timeout = 4000)
    public void test3641() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        // Undeclared exception!
        try {
            jsonWriter0.nullValue();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // JSON must have only one top-level value.
        }
    }

    @Test(timeout = 4000)
    public void test3742() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        jsonWriter0.setLenient(true);
        jsonWriter0.nullValue();
        assertEquals("nullnull", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3743() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.nullValue();
        jsonWriter0.setLenient(true);
        jsonWriter0.nullValue();
        assertTrue(jsonWriter0.getSerializeNulls());
    }
}
