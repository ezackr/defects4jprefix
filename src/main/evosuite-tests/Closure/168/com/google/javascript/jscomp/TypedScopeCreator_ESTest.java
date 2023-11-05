/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 08:30:30 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.TypedScopeCreator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      Compiler compiler0 = new Compiler();
      TypedScopeCreator typedScopeCreator0 = null;
      try {
        typedScopeCreator0 = new TypedScopeCreator(compiler0, jqueryCodingConvention0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }
}
