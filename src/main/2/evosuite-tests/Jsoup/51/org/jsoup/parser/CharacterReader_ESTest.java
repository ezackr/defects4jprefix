/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 05:26:42 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharacterReader_ESTest extends CharacterReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:qE)pl|!");
      characterReader0.rewindToMark();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(F}");
      characterReader0.mark();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      characterReader0.advance();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      String string0 = characterReader0.toString();
      assertEquals("*jG$ws -?s", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("`:qv5)al|!");
      String string0 = characterReader0.consumeAsString();
      assertEquals("`", string0);
      
      boolean boolean0 = characterReader0.matchesIgnoreCase("`:qv5)al|!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Mu e YaBl");
      String string0 = characterReader0.consumeTo('H');
      assertEquals("Mu e YaBl", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(F}");
      int int0 = characterReader0.pos();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("A", string0);
      
      char[] charArray0 = new char[9];
      charArray0[1] = ':';
      boolean boolean0 = characterReader0.matchesAny(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("!: ");
      char char0 = characterReader0.current();
      assertEquals('!', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      char char0 = characterReader0.current();
      assertEquals('\uFFFF', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("05");
      char char0 = characterReader0.consume();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      char char0 = characterReader0.consume();
      assertEquals('\uFFFF', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      String string0 = characterReader0.consumeTo('s');
      assertEquals("*jG$w", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("O @[J");
      boolean boolean0 = characterReader0.containsIgnoreCase("O @[J");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$w*ss -?s");
      boolean boolean0 = characterReader0.containsIgnoreCase("*jG$w*ss -?s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("us e fate");
      String string0 = characterReader0.consumeTo("kK@Ym<M[LPo#<");
      assertEquals("us e fate", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q R)Rl|!");
      String string0 = characterReader0.consumeTo("A:q R)Rl|!");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("$qci!JDc8L1WXw");
      char[] charArray0 = new char[2];
      charArray0[1] = 'w';
      String string0 = characterReader0.consumeToAny(charArray0);
      assertEquals("$qci!JDc8L1WX", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("MM_H");
      String string0 = characterReader0.consumeTagName();
      assertEquals("MM_H", string0);
      
      char[] charArray0 = new char[0];
      String string1 = characterReader0.consumeToAny(charArray0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      char[] charArray0 = new char[0];
      String string0 = characterReader0.consumeToAnySorted(charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Sting must not be empty");
      char[] charArray0 = new char[1];
      String string0 = characterReader0.consumeToAnySorted(charArray0);
      assertEquals("Sting must not be empty", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Sting must not be empty");
      char[] charArray0 = new char[1];
      charArray0[0] = 'u';
      String string0 = characterReader0.consumeToAnySorted(charArray0);
      assertEquals("Sting m", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("H<!Cc~nOH=b\u0006");
      String string0 = characterReader0.consumeData();
      assertEquals("H", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      String string0 = characterReader0.consumeData();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#U`#!x; ,}6t&r;O");
      String string0 = characterReader0.consumeTagName();
      assertEquals("#U`#!x;", string0);
      
      String string1 = characterReader0.consumeData();
      assertEquals(" ,}6t", string1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("!cr/XrcH");
      String string0 = characterReader0.consumeTagName();
      assertEquals("!cr", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("[-,j)]YMk\u0003>$");
      String string0 = characterReader0.consumeTagName();
      assertEquals("[-,j)]YMk\u0003", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      String string0 = characterReader0.consumeTagName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("N");
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("r|");
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("r", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("~E;n1xu$?x^(vYX");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("kL8SZ&u/");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("kL8", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("5 s");
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("5", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("t[");
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("f>-qyF!\"9{Pt%");
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("f", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      characterReader0.matchConsume("*jG$ws -?s");
      String string0 = characterReader0.consumeDigitSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("8lB8");
      String string0 = characterReader0.consumeDigitSequence();
      assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      String string0 = characterReader0.consumeDigitSequence();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      boolean boolean0 = characterReader0.matches('_');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("ov<");
      boolean boolean0 = characterReader0.matches('a');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("org", string0);
      
      boolean boolean0 = characterReader0.matches('.');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Must be true");
      boolean boolean0 = characterReader0.matchConsumeIgnoreCase("Must be true");
      assertTrue(boolean0);
      
      boolean boolean1 = characterReader0.matchConsume("Must be true");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("*jG$ws -?s");
      boolean boolean0 = characterReader0.matchConsume("apc1h^]BKl");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("String must not be empty");
      boolean boolean0 = characterReader0.matchConsumeIgnoreCase("wE'L!El&2H8YL_jj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      char[] charArray0 = new char[9];
      boolean boolean0 = characterReader0.matchesAny(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("_Z3,Y");
      String string0 = characterReader0.consumeData();
      assertEquals("_Z3,Y", string0);
      
      boolean boolean0 = characterReader0.matchesAny((char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("_Z3,Y");
      boolean boolean0 = characterReader0.matchConsume("_Z3,Y");
      assertTrue(boolean0);
      
      boolean boolean1 = characterReader0.matchesAnySorted((char[]) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      char[] charArray0 = new char[9];
      boolean boolean0 = characterReader0.matchesAnySorted(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("A", string0);
      
      char[] charArray0 = new char[9];
      charArray0[1] = ':';
      charArray0[4] = '{';
      boolean boolean0 = characterReader0.matchesAnySorted(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("\"VycY");
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("gy+}m{");
      boolean boolean0 = characterReader0.matchesLetter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("H<!Cc~nOH=b\u0006");
      boolean boolean0 = characterReader0.matchesLetter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("}\"VycY");
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#\"VycY");
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("`:qv5)al|!");
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("10T_?TG]/S");
      boolean boolean0 = characterReader0.matchesDigit();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("jnry");
      boolean boolean0 = characterReader0.containsIgnoreCase("jnry");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("A:q )Rl|!");
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("A", string0);
      
      characterReader0.unconsume();
      String string1 = characterReader0.consumeHexSequence();
      assertEquals("A", string1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Must be false");
      boolean boolean0 = characterReader0.rangeEquals(12, 12, "Must be true");
      assertFalse(boolean0);
  }
}
