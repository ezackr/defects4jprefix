/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:34:45 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = new Document(">z;+@");
      // Undeclared exception!
      try { 
        document0.before((Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:!m%\"iczur", "abs:!m%\"iczur");
      dataNode0.setBaseUri("abs:!m%\"iczur");
      assertEquals(0, dataNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = new Document("abs:!m%\"icz9u$");
      // Undeclared exception!
      try { 
        document0.after((Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Document.createShell("ohbMr");
      document0.parentNode = (Node) document0;
      document0.parentNode.after("ohbMr");
      assertEquals(0, document0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Document.createShell("#text");
      document0.parentNode = (Node) document0;
      assertEquals(0, document0.parentNode.siblingIndex());
      
      Node node0 = document0.unwrap();
      assertEquals(0, node0.siblingIndex());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("abs:!m\"c5");
      DocumentType documentType0 = new DocumentType("abs:!m\"c5", "abs:!m\"c5", "abs:!m\"c5", "");
      stringBuilder0.append((Object) documentType0);
      assertEquals("abs:!m\"c5<!DOCTYPE abs:!m\"c5 PUBLIC \"abs:!m\"c5\" \"abs:!m\"c5\">", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:m%icz9u$", "abs:m%icz9u$");
      Node node0 = dataNode0.removeAttr("abs:m%icz9u$");
      assertEquals(0, node0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = new TextNode("@GyjTv2s", "@GyjTv2s");
      String string0 = textNode0.toString();
      assertEquals("@GyjTv2s", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("abs:!m%\"icz9u$");
      String string0 = document0.outerHtml();
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:!m%\"iczur", "abs:!m%\"iczur");
      // Undeclared exception!
      try { 
        dataNode0.siblingNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:!m%\"iczur", "abs:!m%\"iczur");
      Attributes attributes0 = dataNode0.attributes();
      assertNotNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("h", "h");
      String string0 = textNode0.absUrl("abs:h");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("h", "h");
      Node node0 = textNode0.attr("h", "h");
      String string0 = node0.absUrl("abs:h");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextNode textNode0 = new TextNode("h", "h");
      textNode0.setParentNode(textNode0);
      // Undeclared exception!
      try { 
        textNode0.before("h");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = new Document("abs:!m%\"iczur");
      // Undeclared exception!
      try { 
        document0.wrap("abs:!m%\"iczur");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = Document.createShell("Y");
      Element element0 = document0.head();
      assertNotNull(element0);
      
      Element element1 = element0.wrap("Y");
      assertEquals(0, element1.siblingIndex());
      assertNotNull(element1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell("Y");
      document0.setParentNode(document0);
      Element element0 = document0.wrap("Y");
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document("txt");
      document0.parentNode = (Node) document0;
      // Undeclared exception!
      try { 
        document0.unwrap();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = Document.createShell("Y");
      Element element0 = document0.head();
      element0.setParentNode(document0);
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataNode dataNode0 = new DataNode("v2@S", "v2@S");
      // Undeclared exception!
      try { 
        dataNode0.replaceChild(dataNode0, dataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("Y");
      Element element0 = document0.head();
      element0.replaceWith(document0);
      assertEquals(0, document0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:!m%\"icz9u$", "abs:!m%\"icz9u$");
      // Undeclared exception!
      try { 
        dataNode0.removeChild(dataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = Document.createShell(">+@");
      document0.parentNode = (Node) document0;
      Node node0 = document0.parentNode.previousSibling();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataNode dataNode0 = new DataNode("v2@S", "v2@S");
      DataNode dataNode1 = dataNode0.setWholeData("v2@S");
      dataNode0.setSiblingIndex(607);
      dataNode1.parentNode = (Node) dataNode0;
      // Undeclared exception!
      try { 
        dataNode1.previousSibling();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 606, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:!m%\"iczur", "abs:!m%\"iczur");
      boolean boolean0 = dataNode0.equals("#data");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded(">cz@9R", ">cz@9R");
      boolean boolean0 = dataNode0.equals(dataNode0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TextNode textNode0 = new TextNode("succJneqq", "succJneqq");
      textNode0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = Document.createShell("lqV?8Gyj");
      document0.parentNode = (Node) document0;
      // Undeclared exception!
      document0.parentNode.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration(">cz@9R", ">cz@9R", false);
      xmlDeclaration0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document document0 = Document.createShell("abs:!m%iczr");
      Element element0 = document0.prependText("abs:!m%iczr");
      Document document1 = document0.clone();
      assertNotSame(document1, element0);
  }
}
