/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:54:20 GMT 2023
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FunctionBuilder_ESTest extends FunctionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FunctionBuilder functionBuilder0 = new FunctionBuilder((JSTypeRegistry) null);
      FunctionBuilder functionBuilder1 = functionBuilder0.withTemplateName("");
      assertSame(functionBuilder0, functionBuilder1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FunctionBuilder functionBuilder0 = new FunctionBuilder((JSTypeRegistry) null);
      Node node0 = new Node((-2007), 0, 28);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression((JSTypeRegistry) null, node0, "for", false);
      FunctionBuilder functionBuilder1 = functionBuilder0.withTypeOfThis(unresolvedTypeExpression0);
      assertSame(functionBuilder1, functionBuilder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      FunctionParamBuilder functionParamBuilder0 = new FunctionParamBuilder(jSTypeRegistry0);
      FunctionBuilder functionBuilder1 = functionBuilder0.withParams(functionParamBuilder0);
      assertSame(functionBuilder0, functionBuilder1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      FunctionBuilder functionBuilder1 = functionBuilder0.forConstructor();
      assertSame(functionBuilder0, functionBuilder1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      // Undeclared exception!
      try { 
        functionBuilder0.copyFromOtherFunction((FunctionType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.FunctionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      FunctionBuilder functionBuilder1 = functionBuilder0.withInferredReturnType(voidType0);
      assertSame(functionBuilder1, functionBuilder0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      Node node0 = Node.newNumber((-369.6053255252), (-291), (-1828));
      FunctionBuilder functionBuilder1 = functionBuilder0.withSourceNode(node0);
      assertSame(functionBuilder0, functionBuilder1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      FunctionBuilder functionBuilder1 = functionBuilder0.withName("x_X:ctZ;Lq\"1%Yo");
      assertSame(functionBuilder1, functionBuilder0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
      FunctionBuilder functionBuilder1 = functionBuilder0.forNativeType();
      assertSame(functionBuilder1, functionBuilder0);
  }
}
