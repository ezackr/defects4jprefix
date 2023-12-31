/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 03:57:21 GMT 2023
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "=@|T\"e P");
      assertEquals("=@|T\\\"e P", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava(".-I{75.|SH5's[");
      assertEquals(".-I{75.|SH5's[", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("wd?%");
      assertEquals("wd?%", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, "M $dE{_NnI!E");
      assertEquals("M $dE{_NnI!E", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "x<,");
      assertEquals("x<,", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "[{_-7ewOCzUtA\\T0");
      assertEquals("[{_-7ewOCzUtAT0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "\\u000";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertEquals("\\u000", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertEquals("\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "Q+3q\\u==+CQ{";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ==+C
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "Q+3q\\u==+CQ{";
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ==+C
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJavaScript((Writer) null, "*FCz*8fg$85vkSW56N(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJavaScript((Writer) null, "8206");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "\\u0");
      assertEquals("\\u0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, "PV0T?BM%|b>Edq'bC");
      assertEquals("PV0T?BM%|b&gt;Edq'bC", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(16);
      String string0 = "j\\uoH=lX@";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: oH=l
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "\\u0";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertEquals("\\\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeSql("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, "925");
      assertEquals("925", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeXml((Writer) null, "pEQwj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeXml("Mw:U@A~]A\"+'T=k<DH");
      assertEquals("Mw:U@A~]A&quot;+&apos;T=k&lt;DH", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, "rang");
      assertEquals("rang", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeXml((Writer) null, "org.apache.commons.lang.StringEscapeUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeHtml((Writer) null, "sigma");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeHtml("m?a4");
      assertEquals("m?a4", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeHtml((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeHtml("!eMgGmVz");
      assertNotNull(string0);
      assertEquals("!eMgGmVz", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("5'{GEwz?V]A[/hbiDW");
      assertEquals("5'{GEwz?V]A[/hbiDW", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = StringEscapeUtils.unescapeJava("Mw:U@A~]A\\\"+'T=k<DH");
      assertEquals("Mw:U@A~]A\"+'T=k<DH", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = "Q+3q\\u==+CQ{";
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: ==+C
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.unescapeJava((Writer) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava("S\ra");
      assertEquals("S\\ra", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringEscapeUtils.escapeJava((Writer) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang.StringEscapeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript("Axn(5sbLt,J'}");
      assertEquals("Axn(5sbLt,J\\'}", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJava((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringEscapeUtils.escapeJava((Writer) stringWriter0, "CYl\u0006d");
      assertEquals("CYl\\u0006d", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = StringEscapeUtils.escapeJavaScript((String) null);
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertNull(string1);
  }
}
