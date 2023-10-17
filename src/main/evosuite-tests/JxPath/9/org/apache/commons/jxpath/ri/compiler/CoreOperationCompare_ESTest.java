/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:17:34 GMT 2023
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      Float float0 = new Float(937.38);
      boolean boolean0 = nameAttributeTest0.equal(float0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThan0, constant0);
      boolean boolean0 = coreOperationEqual0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThan0, constant0);
      int int0 = coreOperationEqual0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      boolean boolean0 = nameAttributeTest0.equal((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2134), expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationUnion0;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[3], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = coreOperationNotEqual0.contains(evalContext0, expressionArray0[3]);
      assertEquals(1, evalContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2134), expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[3], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(evalContext0, rootContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("Ouu(;");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationMod0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, extensionFunction0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("B4");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      // Undeclared exception!
      try { 
        nameAttributeTest0.findMatch(precedingOrFollowingContext0, (Iterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreFunction0);
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(selfContext0, 2, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(evalContext0, coreFunction0, nameAttributeTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-after()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("y.]1r55=Tq>J<Z)HU", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[3];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, expressionArray0[1]);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, expressionArray0[2]);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNotEqual0, locationPath0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(parentContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(attributeContext0, expressionArray0[1], expressionArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAdd0, coreOperationAdd0);
      coreOperationLessThanOrEqual0.args = expressionArray0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(selfContext0, coreOperationLessThanOrEqual0, coreOperationAdd0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationAnd0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal((EvalContext) null, coreOperationAnd0, coreOperationMod0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Byte byte0 = new Byte((byte)119);
      Constant constant0 = new Constant(byte0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      QName qName0 = new QName("k|0.EZ[#$czYu", "k|0.EZ[#$czYu");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(byte0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: k|0.EZ[#$czYu:k|0.EZ[#$czYu
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Constant constant0 = new Constant("i%P");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[2] = (Expression) coreFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationNotEqual0);
      // Undeclared exception!
      nameAttributeTest0.equal(coreFunction0, "i%P");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, coreOperationDivide0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThanOrEqual0, coreOperationDivide0);
      Short short0 = new Short((short)2596);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) short0);
      QName qName0 = new QName("2cU", "5Q&/~w{EeY +x&I");
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "5Q&/~w{EeY +x&I", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(rootContext0, double0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1815));
      Step step0 = new Step(2533, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[2] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal("i%P", stepArray0[2]);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Constant constant0 = new Constant("i%P");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationNotEqual0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(coreFunction0, "i%P");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionPath0, expressionArray0[0]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      ChildContext childContext0 = new ChildContext(rootContext0, processingInstructionTest0, true, true);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.contains(childContext0, jXPathContextReferenceImpl0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant constant0 = new Constant("W.<9sEY^59\"n!r");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      QName qName0 = new QName("'W.<9sEY^59\"n!r'", "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'W.<9sEY^59\"n!r'");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.contains(selfContext0, predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      Object object0 = new Object();
      boolean boolean0 = coreOperationEqual0.equal((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Constant constant0 = new Constant("bf7}>");
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationAnd0);
      boolean boolean0 = nameAttributeTest0.equal((EvalContext) null, constant0, coreFunction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2134), expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[3], (Pointer) null);
      Float float0 = new Float(1426.0F);
      boolean boolean0 = coreOperationNotEqual0.equal(jXPathContextReferenceImpl0, float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationAnd0);
      Object object0 = nameAttributeTest0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("G8;4l0Xqg");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, variableReference0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationNotEqual0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Object object0 = variableReference0.compute(rootContext0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(object0, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'G8;4l0Xqg'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2134), expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationUnion0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationNotEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[3], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = new Object();
      nameAttributeTest0.contains(evalContext0, object0);
      InitialContext initialContext0 = new InitialContext(evalContext0);
      assertEquals(2, evalContext0.getPosition());
      
      boolean boolean0 = coreOperationNotEqual0.findMatch(evalContext0, initialContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2134), expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationUnion0;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[3], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      InitialContext initialContext0 = new InitialContext(evalContext0);
      boolean boolean0 = coreOperationNotEqual0.findMatch(evalContext0, initialContext0);
      assertEquals(1, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("G8;4l0Xqg");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, variableReference0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationNotEqual0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      InitialContext initialContext0 = (InitialContext)variableReference0.compute(rootContext0);
      boolean boolean0 = coreOperationNotEqual0.equal(initialContext0, variableReference0, nameAttributeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("G8;4l0Xqg");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, variableReference0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationNotEqual0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Object object0 = coreOperationNotEqual0.compute(rootContext0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant constant0 = new Constant("W.<9sEY^59\"n!r");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      boolean boolean0 = coreOperationEqual0.equal((EvalContext) null, constant0, nameAttributeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.JXPathContextFactory");
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, expressionPath0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }
}
