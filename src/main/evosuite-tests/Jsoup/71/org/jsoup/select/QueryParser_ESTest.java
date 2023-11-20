/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 06:13:10 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueryParser_ESTest extends QueryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":eq(%d)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("Ya~pm*");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":containsData(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":lt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(">D.P0,4#-Us>+M%r`_");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '4#-Us': unexpected token at 'Us'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":gt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":has(el) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":contains(texI)qWerymust not be emty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(",DU k~PbAFo>5L7,WsGd");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("ygv+o-Stn,qOPl");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("hy~u~:nth-child(n)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("Znv,Qda@[{Zs");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at '{Zs'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("*|~pre");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s~=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":containsOwn(%s)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matches(regex) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matchesOwn(%s)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-child(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-child");
      assertEquals(":first-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-child");
      assertEquals(":last-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-of-type");
      assertEquals(":first-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-of-type");
      assertEquals(":last-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-child");
      assertEquals(":only-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-of-type");
      assertEquals(":only-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":empty");
      assertEquals(":empty", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":root");
      assertEquals(":root", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("r|");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[^-a-zA-Z0-9_:.]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("option[selected]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s!=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s^=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s$=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s*=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("8 t>:nth-child(eVEn)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(">:nth-child(0)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }
}
