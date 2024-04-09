/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 16:39:10 GMT 2024
 */
package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.IOException;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonWriteContext_ESTest extends JsonWriteContext_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getCurrentName();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getCurrentName();
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getDupDetector();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getDupDetector();
        assertTrue(jsonWriteContext0.inRoot());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        StringReader stringReader0 = new StringReader("write a raw (uencoded) value");
        jsonWriteContext0.setCurrentValue(stringReader0);
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        StringReader stringReader0 = new StringReader("write a raw (uencoded) value");
        jsonWriteContext0.setCurrentValue(stringReader0);
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        String string0 = jsonWriteContext0.toString();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        String string0 = jsonWriteContext0.toString();
        assertEquals("/", string0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        String string0 = jsonWriteContext0.toString();
        assertTrue(jsonWriteContext0.inRoot());
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.getParent();
        assertNull(jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.getParent();
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test0411() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.getParent();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0512() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getCurrentValue();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0513() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.getCurrentValue();
        assertTrue(jsonWriteContext0.inRoot());
    }

    @Test(timeout = 4000)
    public void test0614() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertTrue(jsonWriteContext1.inArray());
    }

    @Test(timeout = 4000)
    public void test0615() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertEquals(0, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0616() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertNotNull(jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0617() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildArrayContext();
        assertEquals(0, jsonWriteContext2.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0618() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildArrayContext();
        assertSame(jsonWriteContext2, jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0619() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildArrayContext();
        assertFalse(jsonWriteContext0.inArray());
    }

    @Test(timeout = 4000)
    public void test0620() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
        JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildArrayContext();
        assertTrue(jsonWriteContext2.inArray());
    }

    @Test(timeout = 4000)
    public void test0721() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertNotNull(jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0722() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertEquals("ARRAY", jsonWriteContext1.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test0723() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildObjectContext();
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0724() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildObjectContext();
        assertEquals("OBJECT", jsonWriteContext2.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test0725() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildObjectContext();
        assertSame(jsonWriteContext2, jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0826() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        assertNotNull(jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test0827() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext1.writeValue();
        assertEquals(1, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0828() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext1.writeValue();
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test0929() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        assertEquals(0, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test0930() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test0931() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        assertEquals("OBJECT", jsonWriteContext1.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test1032() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        int int0 = jsonWriteContext0.writeFieldName("MG){4ekX&dlgj-R");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1033() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        int int0 = jsonWriteContext0.writeFieldName("MG){4ekX&dlgj-R");
        int int1 = jsonWriteContext0.writeFieldName("write a raw (unencoded) value");
        assertEquals(4, int1);
    }

    @Test(timeout = 4000)
    public void test1034() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        int int0 = jsonWriteContext0.writeFieldName("MG){4ekX&dlgj-R");
        int int1 = jsonWriteContext0.writeFieldName("write a raw (unencoded) value");
        assertEquals(0, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1035() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        int int0 = jsonWriteContext0.writeFieldName("MG){4ekX&dlgj-R");
        int int1 = jsonWriteContext0.writeFieldName("write a raw (unencoded) value");
        assertTrue(jsonWriteContext0.inRoot());
    }

    @Test(timeout = 4000)
    public void test1136() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, (Object) null, false);
        StringReader stringReader0 = new StringReader("write a raw (unencoded) value");
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, (-1399), stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) readerBasedJsonParser0);
        JsonWriteContext jsonWriteContext1 = new JsonWriteContext((-4560), jsonWriteContext0, dupDetector0);
        jsonWriteContext1.writeFieldName("MG){4ekX&dlgj-R");
        JsonWriteContext jsonWriteContext2 = jsonWriteContext0.withDupDetector(dupDetector0);
        try {
            jsonWriteContext2.writeFieldName("MG){4ekX&dlgj-R");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Duplicate field 'MG){4ekX&dlgj-R'
            //
            verifyException("com.fasterxml.jackson.core.json.JsonWriteContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1237() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.writeValue();
        int int0 = jsonWriteContext0.writeFieldName((String) null);
        assertEquals(1, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1238() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.writeValue();
        int int0 = jsonWriteContext0.writeFieldName((String) null);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1339() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        assertNotNull(jsonWriteContext1);
    }

    @Test(timeout = 4000)
    public void test1340() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        jsonWriteContext1.writeValue();
        int int0 = jsonWriteContext1.writeValue();
        assertEquals(2, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1341() throws Throwable {
        DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        jsonWriteContext1.writeValue();
        int int0 = jsonWriteContext1.writeValue();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1442() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.writeValue();
        int int0 = jsonWriteContext0.writeValue();
        assertEquals(2, jsonWriteContext0.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1443() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        jsonWriteContext0.writeValue();
        int int0 = jsonWriteContext0.writeValue();
        assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test1544() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        String string0 = jsonWriteContext1.toString();
        assertEquals("{?}", string0);
    }

    @Test(timeout = 4000)
    public void test1545() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        String string0 = jsonWriteContext1.toString();
        assertEquals(0, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1546() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        String string0 = jsonWriteContext1.toString();
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test1647() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext0._child.writeFieldName("/");
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1648() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext0._child.writeFieldName("/");
        String string0 = jsonWriteContext1.toString();
        assertEquals("{\"/\"}", string0);
    }

    @Test(timeout = 4000)
    public void test1649() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext0._child.writeFieldName("/");
        String string0 = jsonWriteContext1.toString();
        assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
    }

    @Test(timeout = 4000)
    public void test1650() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
        int int0 = jsonWriteContext0._child.writeFieldName("/");
        String string0 = jsonWriteContext1.toString();
        assertEquals(0, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1751() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        String string0 = jsonWriteContext1.toString();
        assertEquals(0, jsonWriteContext1.getEntryCount());
    }

    @Test(timeout = 4000)
    public void test1752() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        String string0 = jsonWriteContext1.toString();
        assertEquals("[0]", string0);
    }

    @Test(timeout = 4000)
    public void test1753() throws Throwable {
        JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
        JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
        String string0 = jsonWriteContext1.toString();
        assertTrue(jsonWriteContext0.inRoot());
    }
}
