/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:13:09 GMT 2024
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecordType_ESTest extends RecordType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      hashMap0.put((String) null, (RecordTypeBuilder.RecordProperty) null);
      RecordType recordType0 = null;
      try {
        recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // RecordProperty associated with a property should not be null!
         //
         verifyException("com.google.javascript.rhino.jstype.RecordType", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, recordType0, "Unknown class name");
      recordType0.getGreatestSubtypeHelper(enumElementType0);
      assertFalse(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = new Node(0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType1, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty1);
      RecordType recordType2 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getGreatestSubtypeHelper(recordType2);
      assertFalse(recordType2.equals((Object)recordType1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType0.defineProperty("Unknown class name", recordType0, false, (Node) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType jSType0 = jSTypeRegistry0.createOptionalType(recordType0);
      JSType jSType1 = recordType0.getLeastSupertype(jSType0);
      assertSame(jSType1, jSType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) recordType0, "Named type with empty name component", "Unknown class name", 4095, 29);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, (Node) null);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getLeastSupertype(recordType1);
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = new Node(1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getLeastSupertype(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertFalse(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) recordType0, "Named type with empty name component", "Unknown class name", 4095, 29);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, (Node) null);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType1 = recordType1.resolveInternal(simpleErrorReporter0, recordType0);
      RecordType recordType2 = jSTypeRegistry0.createRecordType(hashMap0);
      jSType1.getLeastSupertype(recordType2);
      assertFalse(recordType2.equals((Object)jSType1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = new Node(0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getGreatestSubtypeHelper(recordType1);
      assertTrue(recordType1.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = Node.newString(0, "Not declared as a type name", 1, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.getGreatestSubtypeHelper(recordType0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = Node.newString("Unknown class name");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getGreatestSubtypeHelper(recordType1);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      JSType jSType0 = recordType0.getGreatestSubtypeHelper(noResolvedType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = new Node(1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "Not declared as a constructor");
      recordType1.getGreatestSubtypeHelper(unresolvedTypeExpression0);
      assertFalse(recordType1.equals((Object)recordType0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = recordType1.removeProperty("Not declared as a type name");
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean1 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
      assertFalse(recordType1.equals((Object)recordType0));
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = Node.newString("Unknown class name");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
      assertFalse(recordType1.equals((Object)recordType0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = Node.newString(0, "Not declared as a type name", 1, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      boolean boolean0 = RecordType.isSubtype((ObjectType) recordType1, recordType1);
      assertTrue(recordType1.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      Node node0 = Node.newString("Not declared as a constructor", 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
      hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
      RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType1.resolve(simpleErrorReporter0, recordType0);
      assertTrue(recordType0.isResolved());
      assertFalse(recordType0.equals((Object)recordType1));
  }
}
