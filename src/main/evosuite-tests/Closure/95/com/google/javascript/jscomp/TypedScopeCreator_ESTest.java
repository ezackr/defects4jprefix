/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 02:59:15 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.jscomp.UnfoldCompoundAssignments;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator((AbstractCompiler) null);
      int int0 = (-584);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator((AbstractCompiler) null, defaultCodingConvention0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator((AbstractCompiler) null, (CodingConvention) null);
      int int0 = 17;
  }
}
