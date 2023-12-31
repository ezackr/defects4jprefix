/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 22:01:22 GMT 2023
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.Property;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NamedType_ESTest extends NamedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "", "", 5, 5);
      boolean boolean0 = namedType0.isNamedType();
      assertEquals("", namedType0.getReferenceName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Object", "Object", 2048, 2048);
      String string0 = namedType0.toAnnotationString();
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Named type with empty name component", "Named type with empty name component", 1, 0);
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, (JSType) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("Not declared as a constructor", (Node) null, namedType0);
      parameterizedType0.defineSynthesizedProperty("Named type with empty name component", enumType0, (Node) null);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a constructor", "Named type with empty name component", 0, 1);
      namedType0.isImplicitPrototype(noObjectType0);
      assertEquals("Not declared as a constructor", namedType0.getReferenceName());
      assertTrue(namedType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Named type with empty name component", "Unknown class name", 1, 1);
      boolean boolean0 = namedType0.defineInferredProperty("Unknown class name", noResolvedType0, (Node) null);
      assertEquals("Named type with empty name component", namedType0.getReferenceName());
      assertTrue(namedType0.hasReferenceName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "-X,at+!,h:Y'i.0O{,", (String) null, 1886, 1886);
      namedType0.hashCode();
      assertEquals("-X,at+!,h:Y'i.0O{,", namedType0.getReferenceName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      jSTypeRegistry0.forwardDeclareType("Unknown class name");
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Named type with empty name component", 1, 1);
      namedType0.defineSynthesizedProperty("Named type with empty name component", noResolvedType0, (Node) null);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, ".?#7b`4XDE[>+9B'o{x", ".?#7b`4XDE[>+9B'o{x", (-23), (-23));
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      Node node0 = new Node(0, 160, 1);
      namedType0.defineProperty("Named type with empty name component", objectType0, false, node0);
      boolean boolean0 = namedType0.defineProperty("Not declared as a constructor", objectType0, false, node0);
      assertTrue(boolean0);
      assertEquals(".?#7b`4XDE[>+9B'o{x", namedType0.getReferenceName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "void", "void", 1, 0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertEquals("void", namedType0.getReferenceName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      jSTypeRegistry0.forwardDeclareType("Not declared as a constructor");
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a constructor", "Unknown class name", 1, 0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Object", "Object", 2138, 2138);
      jSTypeRegistry0.setLastGeneration(false);
      namedType0.resolveInternal(simpleErrorReporter0, namedType0);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      jSTypeRegistry0.setLastGeneration(false);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Named type with empty name component", 1, 1);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noResolvedType0, noResolvedType0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(functionType0, noResolvedType0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
      parameterizedType0.defineSynthesizedProperty("Named type with empty name component", errorFunctionType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Named type with empty name component", "^zG4ow'8W7", 1, 1);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noResolvedType0, noResolvedType0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(functionType0, noResolvedType0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
      FunctionType functionType1 = errorFunctionType0.getBindReturnType(1);
      parameterizedType0.defineSynthesizedProperty("Named type with empty name component", functionType1, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Named type with empty name component", "^zG4ow'8W7", 1, 1);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noResolvedType0, noResolvedType0);
      ParameterizedType parameterizedType0 = jSTypeRegistry0.createParameterizedType(functionType0, noResolvedType0);
      FunctionType functionType1 = jSTypeRegistry0.createInterfaceType("Unknown class name", (Node) null);
      parameterizedType0.defineSynthesizedProperty("Named type with empty name component", functionType1, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Named type with empty name component", "Unknown class name", 1, 1);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newString(1, "#s0+k&c%dur", 1, 1);
      noResolvedType0.setPrototype(noObjectType0, node0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "prototype", "Not declared as a type name", 1, 0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "prototype", "Named type with empty name component", 1, 0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      parameterizedType0.defineSynthesizedProperty("Not declared as a constructor", (JSType) null, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a constructor", "Not declared as a type name", 0, 1);
      namedType0.resolveInternal(simpleErrorReporter0, objectType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      AllType allType0 = new AllType(jSTypeRegistry0);
      parameterizedType0.defineSynthesizedProperty("Unknown class name", allType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Unknown class name", "Not declared as a constructor", 0, 1);
      namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      NoType noType0 = new NoType(jSTypeRegistry0);
      Node node0 = Node.newString(1, "#s0+k&c%dur", 1, 0);
      noResolvedType0.setPrototype(noType0, node0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "prototype", "Not declared as a type name", 1, 0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Object", "Object", 2068, 2068);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      namedType0.setValidator(predicate0);
      namedType0.resolveInternal(simpleErrorReporter0, namedType0);
      assertTrue(namedType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      ParameterizedType parameterizedType0 = new ParameterizedType(jSTypeRegistry0, objectType0, objectType0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("Not declared as a type name", (Node) null, parameterizedType0);
      parameterizedType0.defineSynthesizedProperty("Not declared as a type name", enumType0, (Node) null);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a type name", "Not declared as a constructor", 1, 1);
      // Undeclared exception!
      try { 
        namedType0.resolveInternal(simpleErrorReporter0, parameterizedType0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.jstype.UnknownType cannot be cast to com.google.javascript.rhino.jstype.EnumElementType
         //
         verifyException("com.google.javascript.rhino.jstype.EnumType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      jSTypeRegistry0.forwardDeclareType("Not declared as a constructor");
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a constructor", "Unknown class name", 1, 0);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      namedType0.setValidator(predicate0);
      namedType0.resolveInternal(simpleErrorReporter0, noResolvedType0);
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, "CONSTRUCTOR", "CONSTRUCTOR", 1099, 1099);
      Node node0 = Node.newString("CONSTRUCTOR");
      Property property0 = new Property("Named type with empty name component", (JSType) null, false, node0);
      namedType0.getTypedefType(simpleErrorReporter0, property0, "CONSTRUCTOR");
      assertTrue(namedType0.isResolved());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NamedType namedType0 = new NamedType(jSTypeRegistry0, ".?#7b`4XDE[>+9B'o{x", ".?#7b`4XDE[>+9B'o{x", 0, 0);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      namedType0.resolveInternal(simpleErrorReporter0, objectType0);
      Predicate<JSType> predicate0 = (Predicate<JSType>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).apply(any(com.google.javascript.rhino.jstype.JSType.class));
      boolean boolean0 = namedType0.setValidator(predicate0);
      assertTrue(namedType0.isResolved());
      assertFalse(boolean0);
  }
}
