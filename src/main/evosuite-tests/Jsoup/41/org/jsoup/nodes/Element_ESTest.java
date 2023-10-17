/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:38:27 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsByAttributeValueMatching("6W`u@AC s8.y'", "6W`u@AC s8.y'");
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = new Document("tmtA| u'=y~[.c9");
      Element element0 = document0.prepend("tmtA| u'=y~[.c9");
      assertSame(document0, element0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = new Document("R*9j");
      Element element0 = document0.clone();
      assertFalse(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("#");
      // Undeclared exception!
      try { 
        document0.html("#");
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("3o UAb])u3J8n");
      Element element0 = document0.toggleClass("F~+?x1bgjG2'0");
      assertSame(element0, document0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = new Document("R*9j");
      TextNode textNode0 = new TextNode("s+", "");
      Element element0 = document0.prependChild(textNode0);
      String string0 = element0.text();
      assertEquals("s+", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = new Document("dl");
      Element element0 = document0.tagName("dl");
      assertEquals("dl", element0.baseUri());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = new Document("org.jsoup.select.Collector$Accumulator");
      Tag tag0 = document0.tag();
      assertFalse(tag0.preserveWhitespace());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tag tag0 = Tag.valueOf("small");
      TextNode textNode0 = TextNode.createFromEncoded("#root", "#root");
      Attributes attributes0 = textNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "small", attributes0);
      Tag tag1 = formElement0.tag();
      assertEquals("small", tag1.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("");
      Element element0 = document0.removeClass("");
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = new Document("");
      LinkedList<DocumentType> linkedList0 = new LinkedList<DocumentType>();
      Element element0 = document0.insertChildren(0, linkedList0);
      assertEquals("#root", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = new Document("DssVG34\"5~cIH#JECW");
      String string0 = document0.id();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = new Document("Q6R[X");
      boolean boolean0 = document0.hasClass("*Zw,Ltk\"~<P2*eYD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("sn9py<9Q{QjY]>d");
      Elements elements0 = document0.getElementsByTag("#root");
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = new Document("$`m?EumDF");
      Elements elements0 = document0.getElementsByAttributeValueStarting("$`m?EumDF", "org.jsoup.nodes.Element");
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = new Document("3,A]Bf\"A^");
      Elements elements0 = document0.getElementsByAttributeValueEnding("G(H ftG-", "3,A]Bf\"A^");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = new Document("e}&@bY9!");
      Elements elements0 = document0.getElementsByAttributeValueContaining("?}aW``Y6ACjEjd5R", "?}aW``Y6ACjEjd5R");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document("zu:[Vv:3/");
      Document document1 = (Document)document0.appendText("-` x01Muxea]r");
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) document1;
      nodeArray0[1] = (Node) document0;
      nodeArray0[2] = (Node) document0;
      nodeArray0[3] = (Node) document1;
      nodeArray0[4] = (Node) document1;
      document1.addChildren(nodeArray0);
      Document document2 = (Document)document0.empty();
      assertSame(document0, document2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("dl");
      Document document1 = new Document("dl");
      document0.appendChild(document0);
      document0.before((Node) document1);
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document("body");
      Element element0 = document0.attr("EgVO=Y|", "EgVO=Y|");
      assertEquals("#root", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = new Document("tmtA| u'=y~[.c9");
      Element element0 = document0.appendElement("tmtA| u'=y~[.c9");
      assertFalse(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = new Document("dl");
      document0.appendChild(document0);
      Element element0 = document0.before((Node) document0);
      assertEquals(1, element0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = new Document("body");
      Element element0 = document0.addClass("body");
      assertFalse(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = new Document("e}&@bY9!");
      // Undeclared exception!
      try { 
        document0.wrap("?}aW``Y6ACjEjd5R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = new Document("\"+[K%b~~*TGL");
      // Undeclared exception!
      try { 
        document0.val((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document document0 = new Document("Ll$%pgWv9(NSt&IZ!");
      // Undeclared exception!
      try { 
        document0.toggleClass((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = new Document("DeQ?lm\"0kArR,?Sd");
      document0.prependChild(document0);
      // Undeclared exception!
      document0.toString();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = new Document("u^l c4;oYk=9XJG`wd");
      // Undeclared exception!
      try { 
        document0.select("u^l c4;oYk=9XJG`wd");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'u^l c4;oYk=9XJG`wd': unexpected token at '^l c4;oYk=9XJG`wd'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = new Document("R*9j");
      // Undeclared exception!
      try { 
        document0.removeClass((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Tag tag0 = Tag.valueOf("org.jsoup.nodes.Element$1");
      TextNode textNode0 = new TextNode("org.jsoup.nodes.Element$1", "org.jsoup.nodes.Element$1");
      Attributes attributes0 = textNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.nodes.Element$1", attributes0);
      // Undeclared exception!
      try { 
        formElement0.prepend((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = new Document("3,A]Bf\"A^");
      // Undeclared exception!
      try { 
        document0.lastElementSibling();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Tag tag0 = Tag.valueOf("0N<(Ot=:HKA:t");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "sW5r17!w]sC9", attributes0);
      // Undeclared exception!
      try { 
        formElement0.getElementsMatchingText("~&7|VL5id8(Mai");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern syntax error: ~&7|VL5id8(Mai
         //
         verifyException("org.jsoup.nodes.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Tag tag0 = Tag.valueOf("eC");
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "eC", attributes0);
      // Undeclared exception!
      try { 
        element0.getElementsByClass((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = new Document("P[AFUSpAi`,\"_g2");
      // Undeclared exception!
      try { 
        document0.getElementsByAttributeValueNot("", "r=C|Ouk)~G0!vqzXGY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = new Document("zI`2E`");
      // Undeclared exception!
      try { 
        document0.getElementsByAttributeValueEnding("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Document document0 = new Document("DssVG34\"5~cIH#JECW");
      document0.prependChild(document0);
      // Undeclared exception!
      document0.getElementsByAttributeValue("DssVG34\"5~cIH#JECW", "iM[2");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Document document0 = new Document("$`m?EumDF");
      // Undeclared exception!
      try { 
        document0.getElementsByAttributeValue("`jwc", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Document document0 = new Document("");
      // Undeclared exception!
      try { 
        document0.getElementsByAttributeStarting("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Tag tag0 = Tag.valueOf(" \"");
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "<", attributes0);
      // Undeclared exception!
      try { 
        element0.child(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document document0 = new Document("J?(JzYNZQ");
      // Undeclared exception!
      try { 
        document0.before("J?(JzYNZQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Pattern syntax error: ");
      Element element0 = new Element(tag0, "q:N'*%oF");
      element0.reparentChild(element0);
      // Undeclared exception!
      try { 
        element0.after((Node) element0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Element element0 = null;
      try {
        element0 = new Element((Tag) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Tag tag0 = Tag.valueOf("a.jb1AOICWz}PWEo8j}");
      Element element0 = new Element(tag0, "?EF'5F+\"");
      DocumentType documentType0 = new DocumentType("-b?J?(Y{}H>~;tY+U", "-b?J?(Y{}H>~;tY+U", "-b?J?(Y{}H>~;tY+U", "head");
      boolean boolean0 = element0.equals(documentType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Document document0 = new Document("R*9j");
      boolean boolean0 = document0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Document document0 = new Document("wWwT]'I\"Bbb]/Y");
      Elements elements0 = document0.getElementsByIndexLessThan(60);
      // Undeclared exception!
      try { 
        document0.insertChildren(60, elements0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Insert position out of bounds.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Tag tag0 = Tag.valueOf(",o-'~|)F;y5jFW");
      Element element0 = new Element(tag0, " > ");
      Document document0 = new Document("u^l c4;oYk=9XJG`wd");
      Element element1 = element0.prependChild(document0);
      List<TextNode> list0 = element1.textNodes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Document document0 = new Document("");
      Elements elements0 = document0.getElementsByAttributeStarting("6W`u@AC s8.y'");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Document document0 = new Document("R*9j");
      Elements elements0 = document0.getElementsByTag("R*9j");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Document document0 = new Document("5F1}$>CNgUA3WZ*K%&p");
      Element element0 = document0.prependText("");
      assertEquals("#root", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Document document0 = new Document("org.jsoup.select.Collector$Accumulator");
      boolean boolean0 = document0.isBlock();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Element element0 = null;
      try {
        element0 = new Element((Tag) null, "", attributes0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Document document0 = new Document("3,A]Bf\"A^");
      Pattern pattern0 = Pattern.compile("body", (-2));
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Tag tag0 = Tag.valueOf("%s");
      Element element0 = new Element(tag0, "%s");
      String string0 = element0.nodeName();
      assertEquals("%s", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Document document0 = new Document("DssVG34\"5~cIH#JECW");
      Element element0 = document0.append("e8(,OEgY0+y^6R!");
      assertSame(element0, document0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Document document0 = new Document("dl");
      // Undeclared exception!
      try { 
        document0.appendElement((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Document document0 = new Document("zu:[Vv:3/");
      Set<String> set0 = document0.classNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      document0.val("1NsD^'|");
      String string0 = document0.val();
      assertEquals("1NsD^'|", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      String string0 = document0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      boolean boolean0 = Element.preserveWhitespace(textNode0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Document document0 = new Document("DssVG34\"5~cIH#JECW");
      Element element0 = document0.prependChild(document0);
      String string0 = element0.ownText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Document document0 = new Document("sn9py<9Q{QjY]>d");
      Element element0 = document0.getElementById("sn9py<9Q{QjY]>d");
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Document document0 = new Document("sn9py<9Q{QjY]>d");
      Elements elements0 = document0.getElementsByIndexGreaterThan(163);
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Document document0 = new Document("zu:[Vv:3/");
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) document0;
      nodeArray0[1] = (Node) document0;
      nodeArray0[2] = (Node) document0;
      nodeArray0[3] = (Node) document0;
      nodeArray0[4] = (Node) document0;
      document0.addChildren(nodeArray0);
      Element element0 = document0.firstElementSibling();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Document document0 = new Document("sn9py<9Q{QjY]>d");
      String string0 = document0.cssSelector();
      assertEquals("#root", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Tag tag0 = Tag.valueOf("%s");
      Element element0 = new Element(tag0, "%s");
      LinkedList<FormElement> linkedList0 = new LinkedList<FormElement>();
      // Undeclared exception!
      try { 
        element0.insertChildren((-140), linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Insert position out of bounds.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Document document0 = new Document("R*9j");
      TextNode textNode0 = new TextNode("s+", "");
      document0.prependChild(textNode0);
      List<TextNode> list0 = document0.textNodes();
      assertTrue(list0.contains(textNode0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Document document0 = new Document("sn9py<9Q{QjY]>d");
      Elements elements0 = document0.parents();
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Document document0 = new Document("DeQ?lm\"0kArR,?Sd");
      String string0 = document0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Pattern syntax error: ");
      Element element0 = new Element(tag0, "q:N'*%oF");
      // Undeclared exception!
      try { 
        element0.after((Node) element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      // Undeclared exception!
      try { 
        document0.after("1NsD^'|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Tag tag0 = Tag.valueOf("org.jsoup.nodes.Element$1");
      TextNode textNode0 = new TextNode("org.jsoup.nodes.Element$1", "org.jsoup.nodes.Element$1");
      Attributes attributes0 = textNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "org.jsoup.nodes.Element$1", attributes0);
      Pattern pattern0 = Pattern.compile("org.jsoup.nodes.Element$1");
      Elements elements0 = formElement0.getElementsMatchingOwnText(pattern0);
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Document document0 = new Document("R*9j");
      Elements elements0 = document0.select("compact");
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Document document0 = new Document("DssVG34\"5~cIH#JECW");
      Elements elements0 = document0.getElementsByAttributeValue("DssVG34\"5~cIH#JECW", "iM[2");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      Map<String, String> map0 = document0.dataset();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      Element element0 = document0.prependElement("1NsD^'|");
      assertEquals("1nsd^'|", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      Elements elements0 = document0.getElementsMatchingText("1NsD^'|");
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Document document0 = new Document("1NsD^'|");
      document0.appendText("_nKYJAgb,");
      String string0 = document0.ownText();
      assertEquals("_nKYJAgb,", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      // Undeclared exception!
      try { 
        Document.createShell("iframe");
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
