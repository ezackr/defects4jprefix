/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 01:51:54 GMT 2024
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      Evaluator.Class evaluator_Class0 = new Evaluator.Class("_u8H8Uw+z;i`>");
      linkedList0.add((Evaluator) evaluator_Class0);
      linkedList0.add((Evaluator) evaluator_Class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedList0);
      String string0 = combiningEvaluator_Or0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      Document document0 = Document.createShell("<@]7\"SL)mnnj5ih-xp");
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      boolean boolean0 = combiningEvaluator_And0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[6];
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      evaluatorArray0[0] = (Evaluator) structuralEvaluator_Root0;
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluatorArray0[0]);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Parent0);
      evaluatorArray0[1] = (Evaluator) structuralEvaluator_ImmediatePreviousSibling0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      boolean boolean0 = combiningEvaluator_And0.matches((Element) null, (Element) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[6];
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluatorArray0[0]);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Parent0);
      evaluatorArray0[1] = (Evaluator) structuralEvaluator_ImmediatePreviousSibling0;
      LinkedHashSet<Evaluator.ContainsOwnText> linkedHashSet0 = new LinkedHashSet<Evaluator.ContainsOwnText>();
      LinkedHashSet<Evaluator> linkedHashSet1 = new LinkedHashSet<Evaluator>(linkedHashSet0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet1);
      combiningEvaluator_Or0.add(evaluatorArray0[1]);
      boolean boolean0 = combiningEvaluator_Or0.matches((Element) null, (Element) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(linkedHashSet0);
      Evaluator.IndexGreaterThan evaluator_IndexGreaterThan0 = new Evaluator.IndexGreaterThan(0);
      evaluator_IndexGreaterThan0.index = (-1);
      combiningEvaluator_Or0.add(evaluator_IndexGreaterThan0);
      Document document0 = Document.createShell("");
      boolean boolean0 = combiningEvaluator_Or0.matches(document0, document0);
      assertTrue(boolean0);
  }
}
