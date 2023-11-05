/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 05:44:07 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DisambiguateProperties_ESTest extends DisambiguateProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      Map<String, CheckLevel> map0 = compilerOptions0.propertyInvalidationErrors;
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, map0);
      disambiguateProperties0.renameProperties();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Map<String, CheckLevel> map0 = compilerOptions0.propertyInvalidationErrors;
      Node node0 = new Node(3021);
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      TightenTypes.ConcreteScope tightenTypes_ConcreteScope0 = tightenTypes0.new ConcreteScope((TightenTypes.ConcreteScope) null);
      ConcreteType concreteType0 = tightenTypes0.inferConcreteType(tightenTypes_ConcreteScope0, node0);
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, map0);
      ConcreteType concreteType1 = disambiguateProperties0.getTypeWithProperty("N", concreteType0);
      assertNotNull(concreteType1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DisambiguateProperties.Warnings disambiguateProperties_Warnings0 = new DisambiguateProperties.Warnings();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      hashMap0.put(")@J\"uNbn`YUqeO9<", checkLevel0);
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertNotNull(disambiguateProperties0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Map<String, CheckLevel> map0 = compilerOptions0.propertyInvalidationErrors;
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, map0);
      // Undeclared exception!
      try { 
        disambiguateProperties0.process((Node) null, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Map<String, CheckLevel> map0 = compilerOptions0.propertyInvalidationErrors;
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, map0);
      Multimap<String, Collection<JSType>> multimap0 = disambiguateProperties0.getRenamedTypesForTesting();
      assertNotNull(multimap0);
  }
}
