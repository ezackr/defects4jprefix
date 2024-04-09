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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonWriteContext_ESTest extends JsonWriteContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      jsonWriteContext0.getCurrentName();
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      jsonWriteContext0.getDupDetector();
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertTrue(jsonWriteContext0.inRoot());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      StringReader stringReader0 = new StringReader("write a raw (uencoded) value");
      jsonWriteContext0.setCurrentValue(stringReader0);
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
      assertEquals(0, jsonWriteContext0.getEntryCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      String string0 = jsonWriteContext0.toString();
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertEquals("/", string0);
      assertTrue(jsonWriteContext0.inRoot());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.getParent();
      assertNull(jsonWriteContext1);
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
      assertEquals(0, jsonWriteContext0.getEntryCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      jsonWriteContext0.getCurrentValue();
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertTrue(jsonWriteContext0.inRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DupDetector dupDetector0 = DupDetector.rootDetector((JsonParser) null);
      JsonWriteContext jsonWriteContext0 = new JsonWriteContext(0, (JsonWriteContext) null, dupDetector0);
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
      assertTrue(jsonWriteContext1.inArray());
      assertEquals(0, jsonWriteContext1.getEntryCount());
      assertNotNull(jsonWriteContext1);
      
      JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildArrayContext();
      assertEquals(0, jsonWriteContext2.getEntryCount());
      assertSame(jsonWriteContext2, jsonWriteContext1);
      assertFalse(jsonWriteContext0.inArray());
      assertTrue(jsonWriteContext2.inArray());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
      assertNotNull(jsonWriteContext1);
      assertEquals("ARRAY", jsonWriteContext1.getTypeDesc());
      
      JsonWriteContext jsonWriteContext2 = jsonWriteContext0.createChildObjectContext();
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertEquals("OBJECT", jsonWriteContext2.getTypeDesc());
      assertSame(jsonWriteContext2, jsonWriteContext1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
      assertNotNull(jsonWriteContext1);
      
      int int0 = jsonWriteContext1.writeValue();
      assertEquals(1, jsonWriteContext1.getEntryCount());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
      assertEquals(0, jsonWriteContext1.getEntryCount());
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
      assertEquals("OBJECT", jsonWriteContext1.getTypeDesc());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      int int0 = jsonWriteContext0.writeFieldName("MG){4ekX&dlgj-R");
      assertEquals(0, int0);
      
      int int1 = jsonWriteContext0.writeFieldName("write a raw (unencoded) value");
      assertEquals(4, int1);
      assertEquals(0, jsonWriteContext0.getEntryCount());
      assertTrue(jsonWriteContext0.inRoot());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
      
      } catch(IOException e) {
         //
         // Duplicate field 'MG){4ekX&dlgj-R'
         //
         verifyException("com.fasterxml.jackson.core.json.JsonWriteContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      jsonWriteContext0.writeValue();
      int int0 = jsonWriteContext0.writeFieldName((String) null);
      assertEquals(1, jsonWriteContext0.getEntryCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DupDetector dupDetector0 = DupDetector.rootDetector((JsonGenerator) null);
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext(dupDetector0);
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
      assertNotNull(jsonWriteContext1);
      
      jsonWriteContext1.writeValue();
      int int0 = jsonWriteContext1.writeValue();
      assertEquals(2, jsonWriteContext1.getEntryCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      jsonWriteContext0.writeValue();
      int int0 = jsonWriteContext0.writeValue();
      assertEquals(2, jsonWriteContext0.getEntryCount());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
      String string0 = jsonWriteContext1.toString();
      assertEquals("{?}", string0);
      assertEquals(0, jsonWriteContext1.getEntryCount());
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildObjectContext();
      int int0 = jsonWriteContext0._child.writeFieldName("/");
      assertEquals(0, int0);
      
      String string0 = jsonWriteContext1.toString();
      assertEquals("{\"/\"}", string0);
      assertEquals("ROOT", jsonWriteContext0.getTypeDesc());
      assertEquals(0, jsonWriteContext1.getEntryCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonWriteContext jsonWriteContext0 = JsonWriteContext.createRootContext();
      JsonWriteContext jsonWriteContext1 = jsonWriteContext0.createChildArrayContext();
      String string0 = jsonWriteContext1.toString();
      assertEquals(0, jsonWriteContext1.getEntryCount());
      assertEquals("[0]", string0);
      assertTrue(jsonWriteContext0.inRoot());
  }
}
