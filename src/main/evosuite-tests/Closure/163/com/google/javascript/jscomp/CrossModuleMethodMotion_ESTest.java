/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 06:12:33 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CrossModuleMethodMotion;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CrossModuleMethodMotion_ESTest extends CrossModuleMethodMotion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      crossModuleMethodMotion_IdGenerator0.newId();
      crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
      CrossModuleMethodMotion crossModuleMethodMotion0 = new CrossModuleMethodMotion((AbstractCompiler) null, crossModuleMethodMotion_IdGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
      CrossModuleMethodMotion crossModuleMethodMotion0 = new CrossModuleMethodMotion((AbstractCompiler) null, crossModuleMethodMotion_IdGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      CrossModuleMethodMotion crossModuleMethodMotion0 = new CrossModuleMethodMotion((AbstractCompiler) null, crossModuleMethodMotion_IdGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
      CrossModuleMethodMotion crossModuleMethodMotion0 = new CrossModuleMethodMotion((AbstractCompiler) null, crossModuleMethodMotion_IdGenerator0, false);
      int int0 = 50;
      int int1 = 0;
  }
}
