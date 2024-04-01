/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 23:55:47 GMT 2023
 */
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import java.util.HashMap;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RecordType_ESTest extends RecordType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, noType0);
        recordType0.getGreatestSubtypeHelper(indexedType0);
        assertTrue(recordType0.hasCachedValues());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put((String) null, (RecordTypeBuilder.RecordProperty) null);
        RecordType recordType0 = null;
        try {
            recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // RecordProperty associated with a property should not be null!
            //
            verifyException("com.google.javascript.rhino.jstype.RecordType", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        boolean boolean0 = recordType0.isSynthetic();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
        boolean boolean0 = recordType0.isSynthetic();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
        Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) immutableList0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("com.google.javascript.rhino.jstype.RecordType", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        assertTrue(recordType1.equals((Object) recordType0));
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "=lwk'");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        assertFalse(recordType1.equals((Object) recordType0));
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        boolean boolean0 = recordType0.defineProperty("Not declared as a constructor", recordType0, true, (Node) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, (Node) null);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = recordType0.canTestForShallowEqualityWith(errorFunctionType0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = Node.newString(1, "Named type with empty name component", 0, 1);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap1.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap1);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        assertTrue(jSType0.equals((Object) recordType1));
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = Node.newString(1, "Named type with empty name component", 0, 1);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap1 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap1.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        RecordType recordType1 = jSTypeRegistry0.createRecordType(hashMap1);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        assertFalse(recordType1.equals((Object) recordType0));
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
        Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) immutableList0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("com.google.javascript.rhino.jstype.RecordType", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, noType0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("com.google.javascript.rhino.jstype.RecordType", recordTypeBuilder_RecordProperty1);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getGreatestSubtypeHelper(indexedType0);
        assertTrue(noType0.hasCachedValues());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0, (JSType) noType0);
        Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) immutableList0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("com.google.javascript.rhino.jstype.RecordType", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, noType0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("com.google.javascript.rhino.jstype.RecordType", recordTypeBuilder_RecordProperty1);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getGreatestSubtypeHelper(indexedType0);
        assertFalse(recordType0.equals((Object) recordType1));
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        Node node0 = Node.newString("Not declared as a constructor");
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
        assertFalse(recordType1.equals((Object) recordType0));
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        Node node0 = Node.newString("Not declared as a constructor");
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
        assertTrue(jSType0.equals((Object) recordType1));
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        NoObjectType noObjectType0 = (NoObjectType) recordType0.getGreatestSubtypeHelper(noType0);
        assertNull(noObjectType0.getReferenceName());
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
        boolean boolean0 = recordType0.isSubtype(jSType0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
        Node node0 = Node.newString("Named type with empty name component", 1, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noResolvedType0, recordType0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
        Node node0 = Node.newString("Named type with empty name component", 1, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noResolvedType0, recordType0);
        assertFalse(noResolvedType0.hasCachedValues());
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0);
        UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "Not declared as a type name");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(unresolvedTypeExpression0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noType0, recordType0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noType0, recordType0);
        assertTrue(noType0.hasCachedValues());
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noType0, recordType0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        JSType jSType0 = recordType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
        assertFalse(jSType0.isTemplateType());
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NoType noType0 = new NoType(jSTypeRegistry0);
        Node node0 = new Node(0, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, true);
        ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
        JSType jSType0 = modificationVisitor0.caseAllType();
        noType0.setResolvedTypeInternal(jSType0);
        JSType jSType1 = recordType0.resolveInternal(simpleErrorReporter0, (StaticScope<JSType>) null);
        assertFalse(jSType1.isStringValueType());
    }
}
