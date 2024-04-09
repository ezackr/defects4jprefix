/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 06:05:44 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse("-<?-Ka{HfW;", "-<?-Ka{HfW;");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      List<Node> list0 = xmlTreeBuilder0.parseFragment("^+smSszQsZ}ek|y", "^+smSszQsZ}ek|y", parseErrorList0, parseSettings0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Doctype0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("W_<b-6_O>]=p,DZN!+Z", "#document");
      assertEquals(2, document0.childNodeSize());
      assertEquals("#document", document0.baseUri());
      
      boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("m6?^<C$w/>W v4uMijA", "m6?^<C$w/>W v4uMijA");
      assertEquals(3, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("basefnt", "basefnt");
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = (Token.StartTag)token_StartTag0.name("basefnt");
      token_StartTag1.selfClosing = true;
      token_StartTag1.name("ul");
      boolean boolean0 = xmlTreeBuilder0.process(token_StartTag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("<!--", "<!--");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("7x,Eiy!cP;J</*", "7x,Eiy!cP;J</*");
      assertEquals("7x,Eiy!cP;J</*", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("7xOkaS]2+~D|</!Do]", "7xOkaS]2+~D|</!Do]");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse("7xO&Eiy+)cP</*]", "7xO&Eiy+)cP</*]");
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      xmlTreeBuilder0.parse("basefont", "basefont");
      boolean boolean0 = xmlTreeBuilder0.processEndTag("basefont");
      assertTrue(boolean0);
  }
}
