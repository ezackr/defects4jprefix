/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:22:11 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("ws<o/</o^ .RR.5H.3vU", "ws<o/</o^ .RR.5H.3vU");
      assertEquals("ws<o/</o^ .RR.5H.3vU", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Parser.parse("<!", "<!");
      assertEquals("<!", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("<![CDATA[", "<![CDATA[");
      assertEquals("<![CDATA[", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Parser.parse("<!--", "<!--");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Parser.parse("<?", "<?");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Parser.parse("#E<!---", "#E<!---");
      assertEquals("#E<!---", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Parser.parse("</", "</");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parse("q<)--", "q<)--");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("Os<e///>N .RRk5H*3t", "Os<e///>N .RRk5H*3t");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parse(" w<b-2$=26~B>", " w<b-2$=26~B>");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = Parser.parse("W<aQ?1Gd='*}xUE;39", "W<aQ?1Gd='*}xUE;39");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Parser.parse("/w<4-2y=\"6>zp2B>", "/w<4-2y=\"6>zp2B>");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("0<b2.=2 ~{L", "0<b2.=2 ~{L");
      assertEquals("0<b2.=2 ~{L", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Parser.parse("W<y*?1Gd=My}x6H23K", "W<y*?1Gd=My}x6H23K");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Parser.parse("a]Y)<BaSe</Kkt,T~K!Q", "a]Y)<BaSe</Kkt,T~K!Q");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = Parser.parse("4l]<dXr<B#V5<p@`yF", "4l]<dXr<B#V5<p@`yF");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Parser.parse("hO/</o/ .yTRk5H3(P", "hO/</o/ .yTRk5H3(P");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Parser.parse("Os<e/</oN .RRk5HP3t", "Os<e/</oN .RRk5HP3t");
      assertEquals("#document", document0.nodeName());
  }
}
