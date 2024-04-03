/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 07:05:07 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeValue('\'');
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.toString();
      Token.EOF token_EOF0 = null;
      try {
        token_EOF0 = new Token.EOF();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = (Token.StartTag)token_StartTag0.reset();
      token_StartTag1.reset();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      char[] charArray0 = new char[3];
      charArray0[1] = 'W';
      StringBuffer stringBuffer0 = new StringBuffer("");
      Token.EndTag token_EndTag1 = new Token.EndTag();
      token_EndTag0.appendAttributeValue(charArray0);
      token_EndTag1.appendAttributeName('W');
      token_EndTag0.getAttributes();
      token_EndTag0.finaliseTag();
      token_EndTag1.isStartTag();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.EOF token_EOF0 = new Token.EOF();
      token_StartTag0.appendTagName('^');
      token_EOF0.isDoctype();
      token_StartTag0.toString();
      token_StartTag0.toString();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = (Token.StartTag)token_StartTag0.reset();
      Token.StartTag token_StartTag2 = token_StartTag1.asStartTag();
      token_StartTag2.reset();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName('`');
      token_EndTag0.getAttributes();
      token_EndTag0.isStartTag();
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      token_EOF1.tokenType();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getName();
      token_Doctype0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Token.TokenType.valueOf("StartTag");
      Token.TokenType.values();
      Token.TokenType.valueOf("StartTag");
      Token.TokenType.values();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.tokenType();
      Token.EndTag token_EndTag1 = (Token.EndTag)token_EndTag0.name("StartTag");
      token_EndTag1.newAttribute();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData((String) null);
      Token.CData token_CData1 = (Token.CData)token_CData0.reset();
      Token.EndTag token_EndTag0 = token_CData1.asEndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.newAttribute();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$CData cannot be cast to org.jsoup.parser.Token$EndTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData((String) null);
      Token.StartTag token_StartTag0 = token_CData0.asStartTag();
      // Undeclared exception!
      try { 
        token_StartTag0.newAttribute();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$CData cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = new Token.EOF();
      token_EOF1.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendTagName("nwrap");
      token_EOF1.isEOF();
      token_EndTag0.isDoctype();
      token_EOF1.isDoctype();
      token_EndTag0.isDoctype();
      token_EndTag0.newAttribute();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getSystemIdentifier();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      token_EOF0.isEOF();
      token_EndTag0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_Comment0.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      boolean boolean0 = token_Comment0.bogus;
      token_EndTag0.appendAttributeValue("Comment");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_Comment0.tokenType();
      boolean boolean0 = token_Comment0.bogus;
      token_StartTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      // Undeclared exception!
      try { 
        token_Doctype0.asCharacter();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$Doctype cannot be cast to org.jsoup.parser.Token$Character
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.forceQuirks = true;
      token_Doctype0.reset();
      token_Doctype0.isDoctype();
      Token.TokenType.values();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.name("|w,3");
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("");
      Token.Character token_Character0 = token_CData0.data("6zGQ?+REZ");
      token_Character0.toString();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = new Token.EOF();
      token_EOF1.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendTagName("");
      token_EndTag0.isEOF();
      token_EndTag0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      char[] charArray0 = new char[0];
      token_EndTag0.appendAttributeValue(charArray0);
      token_EndTag0.setEmptyAttributeValue();
      Token.TokenType token_TokenType0 = Token.TokenType.EndTag;
      token_EndTag0.type = token_TokenType0;
      token_EndTag0.setEmptyAttributeValue();
      token_EndTag0.type = token_TokenType0;
      String string0 = "org.jsoup.parser.Token$1";
      token_EndTag0.tagName = "org.jsoup.parser.Token$1";
      token_EndTag0.isEndTag();
      boolean boolean0 = token_EndTag0.selfClosing;
      token_EndTag0.appendAttributeName('?');
      token_EndTag0.asStartTag();
      char char0 = 'q';
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('`');
      token_EndTag0.getAttributes();
      token_EndTag0.isStartTag();
      token_EndTag0.setEmptyAttributeValue();
      token_EndTag0.newAttribute();
      Token.TokenType.values();
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_Comment0.toString();
      boolean boolean0 = token_Comment0.bogus;
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isDoctype();
      // Undeclared exception!
      try { 
        token_StartTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("");
      Token.CData token_CData1 = (Token.CData)token_CData0.reset();
      token_CData1.isCharacter();
      Token.EndTag token_EndTag0 = token_CData1.asEndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.reset();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$CData cannot be cast to org.jsoup.parser.Token$EndTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Token.TokenType.values();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("iqz6$<CQI>Y}C|", attributes0);
      token_StartTag1.newAttribute();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("", attributes0);
      Token.Doctype token_Doctype0 = token_StartTag1.asDoctype();
      // Undeclared exception!
      try { 
        token_Doctype0.reset();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$StartTag cannot be cast to org.jsoup.parser.Token$Doctype
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.reset();
      token_Doctype0.getPublicIdentifier();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendTagName("w<LIr%i\"+Oz64");
      token_EndTag0.asCharacter();
      // Undeclared exception!
      try { 
        token_Doctype0.isForceQuirks();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EndTag cannot be cast to org.jsoup.parser.Token$Character
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.pubSysKey = "-->";
      token_Doctype0.pubSysKey = "ps`yF#Kv45HM>QG";
      Token.Doctype token_Doctype1 = (Token.Doctype)token_Doctype0.reset();
      token_Doctype1.tokenType();
      token_Doctype0.tokenType();
      Token.TokenType token_TokenType0 = Token.TokenType.StartTag;
      token_Doctype0.type = token_TokenType0;
      token_Doctype0.getPublicIdentifier();
      token_Doctype0.tokenType();
      token_Doctype0.getName();
      token_Doctype1.isCharacter();
      Token.StartTag token_StartTag0 = token_Doctype0.asStartTag();
      token_StartTag0.toString();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      int[] intArray0 = new int[4];
      intArray0[0] = (int) 'e';
      intArray0[1] = (int) 'e';
      intArray0[2] = (int) 'e';
      intArray0[3] = 2;
      token_EndTag0.appendAttributeValue(intArray0);
      token_EndTag0.appendAttributeName('e');
      token_EndTag0.getAttributes();
      token_EndTag0.finaliseTag();
      token_EndTag0.isStartTag();
      Token.TokenType.values();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.EndTag token_EndTag1 = (Token.EndTag)token_EndTag0.name("B-V'bpfmY");
      Token.EndTag token_EndTag2 = (Token.EndTag)token_EndTag1.name("B-V'bpfmY");
      token_EndTag1.finaliseTag();
      token_EndTag1.finaliseTag();
      Token.EndTag token_EndTag3 = new Token.EndTag();
      token_EndTag0.appendTagName("caption");
      token_EndTag2.appendAttributeValue("");
      token_EndTag2.isDoctype();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.Comment token_Comment1 = (Token.Comment)token_Comment0.reset();
      // Undeclared exception!
      try { 
        token_Comment1.asStartTag();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$Comment cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      token_EndTag0.appendTagName("StartTag");
      boolean boolean0 = token_Comment0.bogus;
      Token.StartTag token_StartTag1 = new Token.StartTag();
      token_StartTag1.normalName();
      Attributes attributes0 = token_StartTag0.getAttributes();
      token_StartTag0.nameAttr((String) null, attributes0);
      token_StartTag1.isDoctype();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('`');
      token_EndTag0.appendAttributeName('`');
      token_EndTag0.getAttributes();
      token_EndTag0.isStartTag();
      token_EndTag0.newAttribute();
      Token.TokenType.valueOf("");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      Token.EOF token_EOF2 = new Token.EOF();
      token_EOF1.isDoctype();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.Comment token_Comment0 = new Token.Comment();
      token_Comment0.isComment();
      token_EndTag0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      token_EOF1.tokenType();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPubSysKey();
      token_Doctype0.isStartTag();
      boolean boolean0 = token_Doctype0.forceQuirks;
      token_Doctype0.tokenType();
      Token.CData token_CData0 = new Token.CData((String) null);
      // Undeclared exception!
      try { 
        token_CData0.asStartTag();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$CData cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      String string0 = token_EOF1.tokenType();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPubSysKey();
      token_Doctype0.isStartTag();
      token_Doctype0.isEndTag();
      Token.Doctype token_Doctype1 = new Token.Doctype();
      token_Doctype1.tokenType();
      Token.EndTag token_EndTag0 = token_EOF1.asEndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.appendTagName(string0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$EndTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.forceQuirks = true;
      token_Doctype0.reset();
      token_Doctype0.isForceQuirks();
      Token.TokenType.values();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.name("|w,3");
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.reset();
      token_StartTag0.newAttribute();
      token_StartTag0.finaliseTag();
      Token.CData token_CData0 = new Token.CData("Lcq");
      token_CData0.isComment();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      token_EOF1.tokenType();
      token_EOF1.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      token_EndTag0.appendTagName("nowrap");
      token_EOF1.isEOF();
      token_EOF0.isDoctype();
      token_EndTag0.appendAttributeValue("");
      token_EndTag0.appendAttributeValue("");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('e');
      token_EndTag0.finaliseTag();
      Token.EOF token_EOF0 = new Token.EOF();
      token_EndTag0.isSelfClosing();
      Token.StartTag token_StartTag0 = token_EOF0.asStartTag();
      // Undeclared exception!
      try { 
        token_StartTag0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.tokenType();
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      token_EndTag0.appendTagName("StartTag");
      token_StartTag0.isEOF();
      token_EndTag0.appendAttributeValue("Fsk!p,-c3hQ\"~ejLg;");
      token_Comment0.isComment();
      token_EndTag0.isCData();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.getAttributes();
      token_EndTag0.finaliseTag();
      token_EndTag0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isDoctype();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.EndTag token_EndTag1 = new Token.EndTag();
      Attributes attributes0 = token_EndTag1.attributes;
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("", (Attributes) null);
      token_StartTag1.toString();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('e');
      token_EndTag0.getAttributes();
      token_EndTag0.finaliseTag();
      token_EndTag0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.tokenType();
      token_StartTag0.appendAttributeName("StartTag");
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.reset((StringBuilder) null);
      token_EndTag0.appendTagName("StartTag");
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("", (Attributes) null);
      Token.StartTag token_StartTag2 = (Token.StartTag)token_StartTag1.reset();
      token_StartTag2.isEOF();
      token_EndTag0.isDoctype();
      Token.Character token_Character0 = new Token.Character();
      token_Character0.toString();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.TokenType token_TokenType0 = Token.TokenType.Doctype;
      token_EOF0.tokenType();
      token_EOF0.type = token_TokenType0;
      token_EOF0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.getAttributes();
      token_StartTag0.isStartTag();
      Token.StartTag token_StartTag1 = new Token.StartTag();
      token_StartTag1.toString();
      // Undeclared exception!
      try { 
        token_StartTag0.newAttribute();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeValue("g>);`1t7%`s");
      char[] charArray0 = new char[4];
      charArray0[0] = 'C';
      token_StartTag0.appendAttributeValue("");
      charArray0[1] = ')';
      charArray0[2] = '#';
      charArray0[3] = 'c';
      token_StartTag0.appendAttributeValue(charArray0);
      token_StartTag0.appendAttributeValue("g>);`1t7%`s");
      token_StartTag0.appendAttributeValue("g>);`1t7%`s");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeValue("<!--");
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('O');
      token_EndTag0.finaliseTag();
      token_EndTag0.getAttributes();
      token_EndTag0.finaliseTag();
      token_EndTag0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
      token_EndTag0.appendAttributeName('e');
      token_EndTag0.finaliseTag();
      Token.EOF token_EOF0 = new Token.EOF();
      token_EndTag0.finaliseTag();
      token_EndTag0.isStartTag();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Attributes attributes0 = token_EndTag0.attributes;
      token_EndTag0.newAttribute();
      token_StartTag0.nameAttr("yP;s!F", attributes0);
      Token.TokenType.values();
      token_StartTag0.toString();
  }
}
