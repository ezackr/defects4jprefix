/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:54:37 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedList0);
      Document document0 = Document.createShell("i`g%R6{fv:n");
      Evaluator.Id evaluator_Id0 = new Evaluator.Id("");
      combiningEvaluator_Or0.add(evaluator_Id0);
      Document document1 = document0.clone();
      boolean boolean0 = combiningEvaluator_Or0.matches(document1, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      CombiningEvaluator.Or combiningEvaluator_Or1 = new CombiningEvaluator.Or(linkedHashSet0);
      combiningEvaluator_Or0.add(combiningEvaluator_Or1);
      boolean boolean0 = combiningEvaluator_Or0.matches((Element) null, (Element) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      linkedList0.add((Evaluator) combiningEvaluator_And0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedList0);
      Document document0 = new Document("/yXv?|[jko");
      boolean boolean0 = combiningEvaluator_Or0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      linkedList0.add((Evaluator) combiningEvaluator_And0);
      linkedList0.add((Evaluator) combiningEvaluator_And0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      Evaluator[] evaluatorArray0 = new Evaluator[5];
      evaluatorArray0[0] = (Evaluator) combiningEvaluator_Or0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Document document0 = Document.createShell("$Uc^fz}?");
      boolean boolean0 = combiningEvaluator_And0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      linkedList0.add((Evaluator) combiningEvaluator_And0);
      CombiningEvaluator.And combiningEvaluator_And1 = new CombiningEvaluator.And(linkedList0);
      Document document0 = new Document("/yXv?|[jko");
      boolean boolean0 = combiningEvaluator_And1.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      String string0 = combiningEvaluator_And0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[5];
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Document document0 = Document.createShell("$Uc^fz}?");
      Element element0 = document0.head();
      // Undeclared exception!
      try { 
        combiningEvaluator_And0.matches(element0, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.CombiningEvaluator$And", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      String string0 = combiningEvaluator_Or0.toString();
      assertEquals(":or[]", string0);
  }
}
