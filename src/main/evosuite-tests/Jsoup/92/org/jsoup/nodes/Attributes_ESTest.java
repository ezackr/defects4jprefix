/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 31 03:59:30 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Attributes_ESTest extends Attributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.dataset();
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.hashCode();
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      boolean boolean0 = attributes1.equals(attributes0);
      assertTrue(boolean0);
      assertNotSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("(k$x {", "R54DlR@:L@<");
      attributes1.put("org.jsoup.nodes.Attributes$Dataset", "org.jsoup.nodes.Attributes$Dataset");
      Attributes attributes2 = attributes0.put("R54DlR@:L@<", "org.jsoup.nodes.Attributes$Dataset");
      attributes2.addAll(attributes0);
      assertEquals(3, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("(k$x {", "R54DlR@:L@<");
      attributes1.put("org.jsoup.nodes.Attributes$Dataset", "org.jsoup.nodes.Attributes$Dataset");
      Attributes attributes2 = attributes0.put("R54DlR@:L@<", "org.jsoup.nodes.Attributes$Dataset");
      Attributes attributes3 = attributes2.clone();
      attributes2.addAll(attributes3);
      assertEquals(3, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("[5h1d0.", "=\"");
      attributes1.putIgnoreCase("=\"", "[5h1d0.");
      attributes0.remove("[5h1d0.");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("J{rc", "J{rc");
      String string0 = attributes1.getIgnoreCase("J{rc");
      assertEquals(1, attributes0.size());
      assertEquals("J{rc", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Attributes.checkNotNull((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("K3R2a'68P3E", "K3R2a'68P3E");
      String string0 = attributes1.get("K3R2a'68P3E");
      assertEquals(1, attributes0.size());
      assertEquals("K3R2a'68P3E", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.get("K3R2a'68P3E");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.getIgnoreCase("+g[K8fPGWL ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("A<rU;(", "A<rU;(");
      attributes1.putIgnoreCase("A<rU;(", "A<rU;(");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("A<rU;(", "A<rU;(");
      attributes1.normalize();
      attributes1.putIgnoreCase("A<rU;(", "A<rU;(");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("", false);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("s9NZ", true);
      List<Attribute> list0 = attributes1.asList();
      assertEquals(1, attributes0.size());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("[5h1d0.", "=\"");
      assertEquals(1, attributes0.size());
      
      attributes0.remove("[5h1d0.");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.removeIgnoreCase("Je{rc");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put(",8z{|", ",8z{|");
      assertEquals(1, attributes0.size());
      
      attributes0.removeIgnoreCase(",8z{|");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKey("q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = "I\\uJVldf";
      Attributes attributes1 = attributes0.put(string0, string0);
      boolean boolean0 = attributes1.hasKey(string0);
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKeyIgnoreCase("R5*HlR@:L@4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("K3R2a'68P3E", "K3R2a'68P3E");
      boolean boolean0 = attributes1.hasKeyIgnoreCase("K3R2a'68P3E");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.addAll(attributes0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      List<Attribute> list0 = attributes0.asList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("", "");
      // Undeclared exception!
      try { 
        attributes0.asList();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("3cP}?q_-/0 UQbP", true);
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      attributes1.html((Appendable) stringWriter0, document_OutputSettings0);
      assertEquals(1, attributes0.size());
      assertEquals(" 3cP}?q_-/0 UQbP", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("3cP}?q_-/0 UQbP", true);
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      attributes1.html((Appendable) stringWriter0, document_OutputSettings0);
      assertEquals(1, attributes0.size());
      assertEquals(" 3cP}?q_-/0 UQbP=\"\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put(",8z{|", ",8z{|");
      String string0 = attributes1.toString();
      assertEquals(1, attributes0.size());
      assertEquals(" ,8z{|=\",8z{|\"", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals(attributes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Object object0 = new Object();
      boolean boolean0 = attributes0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      assertEquals(0, attributes1.size());
      
      attributes1.put("0:&PV ?z=Uf", "0:&PV ?z=Uf");
      boolean boolean0 = attributes1.equals(attributes0);
      assertEquals(1, attributes1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("34`~^]*/", "34`~^]*/");
      Attributes attributes1 = attributes0.clone();
      boolean boolean0 = attributes1.equals(attributes0);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }
}
