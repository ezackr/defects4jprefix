/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:16:18 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableSortedSet;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GlobalNamespace_ESTest extends GlobalNamespace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("Ordering.natural().reverse()", "Ordering.natural().reverse()");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      ImmutableSortedSet<Node> immutableSortedSet0 = ImmutableSortedSet.of();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      globalNamespace0.scanNewNodes(scope0, immutableSortedSet0);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = null;
      try {
        globalNamespace_Ref0 = new GlobalNamespace.Ref((NodeTraversal) null, (Node) null, globalNamespace_Ref_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalNamespace$Ref", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.getTwin();
      assertNull(globalNamespace_Ref1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      globalNamespace0.getNameForest();
      List<GlobalNamespace.Name> list0 = globalNamespace0.getNameForest();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("$VAUES", "$VAUES");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      globalNamespace0.getNameForest();
      Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
      Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("CALL_GET");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(38, (-354), 40);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      // Undeclared exception!
      try { 
        globalNamespace0.getNameForest();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(33, 33, 33);
      Compiler compiler0 = new Compiler();
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      // Undeclared exception!
      try { 
        globalNamespace0.getNameIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
      GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty("}9:x5", false);
      assertNotNull(globalNamespace_Name2);
      assertNotSame(globalNamespace_Name2, globalNamespace_Name1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("SlUfZ9", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.declaration = globalNamespace_Ref0;
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.declaration = globalNamespace_Ref0;
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.addRefInternal(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, true);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.canEliminate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:5", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.setIsClassOrEnum();
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
      assertNotNull(globalNamespace_Name1);
      
      boolean boolean0 = globalNamespace_Name1.canCollapse();
      assertFalse(boolean0);
      assertNotSame(globalNamespace_Name1, globalNamespace_Name0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("\"GWz8", (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.localSets = 415;
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("SlUfZ9", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.shouldKeepKeys();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("H}hcvx>rY\"d{chtWT*!", (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.globalSets = 115;
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("JSC_INEXISTENT_PROPERTY", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("JSC_INEXISTENT_PROPERTY", (GlobalNamespace.Name) null, true);
      globalNamespace_Name0.localSets = 98;
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
      globalNamespace_Name1.setIsClassOrEnum();
      boolean boolean0 = globalNamespace_Name0.isNamespace();
      assertFalse(boolean0);
      assertNotSame(globalNamespace_Name0, globalNamespace_Name1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.isNamespace();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("> 2$q @(zkv()&", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Name globalNamespace_Name1 = new GlobalNamespace.Name(".p[ototy!e", globalNamespace_Name0, true);
      boolean boolean0 = globalNamespace_Name1.isSimpleName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("> 2$q @(zkv()&", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.isSimpleName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
      String string0 = globalNamespace_Name1.toString();
      assertEquals("}9:x5.}9:x5 (OTHER): globalSets=0, localSets=0, totalGets=0, aliasingGets=0, callGets=0", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      // Undeclared exception!
      try { 
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
      GlobalNamespace.Ref.markTwins(globalNamespace_Ref1, globalNamespace_Ref0);
      assertFalse(globalNamespace_Ref0.equals((Object)globalNamespace_Ref1));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      // Undeclared exception!
      try { 
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref1 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type1);
      GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
      assertFalse(globalNamespace_Ref1.equals((Object)globalNamespace_Ref0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
      GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
      assertFalse(globalNamespace_Ref0.equals((Object)globalNamespace_Ref1));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
      GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
      assertFalse(globalNamespace_Ref1.equals((Object)globalNamespace_Ref0));
  }
}
