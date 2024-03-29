/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:20:12 GMT 2023
 */
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import java.util.HashMap;
import java.util.LinkedList;
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
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.getGreatestSubtypeHelper(instanceObjectType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.getGreatestSubtypeHelper(instanceObjectType0);
        recordType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("9", (RecordTypeBuilder.RecordProperty) null);
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        RecordType recordType0 = null;
        recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType0, node0);
        recordType1.getGreatestSubtypeHelper(instanceObjectType0);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType0.getGreatestSubtypeHelper(recordType1);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(1, "Named type with empty name component", 0, 1);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType1, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty1);
        RecordType recordType2 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType2.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Not declared as a constructor", 0, 0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Dnj|btf");
        boolean boolean0 = recordType0.defineProperty("Not declared as a type name", errorFunctionType0, true, node0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getLeastSupertype(recordType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getLeastSupertype(recordType0);
        recordType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.getLeastSupertype(recordType0);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getLeastSupertype(recordType1);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        jSType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.getGreatestSubtypeHelper(recordType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1, 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.getGreatestSubtypeHelper(recordType0);
        recordType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.getGreatestSubtypeHelper(recordType1);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(noResolvedType0);
        jSType0.isEnumType();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType0, (Node) null);
        LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
        FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType1, (List<JSType>) linkedList0);
        recordType1.getGreatestSubtypeHelper(functionType0);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        Node node0 = Node.newString(0, "Not declared as a constructor", 0, 0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
        JSType jSType0 = errorFunctionType0.getPropertyType("N~J=@Iv");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
        ErrorFunctionType errorFunctionType1 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType1);
        instanceObjectType0.defineDeclaredProperty("Not declared as a type name", jSType0, node0);
        recordType0.getGreatestSubtypeHelper(jSType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Not declared as a constructor", 0, 0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        InstanceObjectType instanceObjectType0 = (InstanceObjectType) recordType0.getLeastSupertype(recordType1);
        instanceObjectType0.defineDeclaredProperty("Unknown class name", recordType1, node0);
        recordType1.resolve(simpleErrorReporter0, recordType0);
        recordType1.getGreatestSubtypeHelper(instanceObjectType0);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        NullType nullType0 = new NullType(jSTypeRegistry0);
        recordType0.getLeastSupertype(nullType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getLeastSupertype(recordType1);
        boolean boolean0 = recordType1.removeProperty("Not declared as a type name");
        NoObjectType noObjectType0 = (NoObjectType) recordType1.getGreatestSubtypeHelper(jSType0);
        boolean boolean1 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getLeastSupertype(recordType1);
        boolean boolean0 = recordType1.removeProperty("Not declared as a type name");
        NoObjectType noObjectType0 = (NoObjectType) recordType1.getGreatestSubtypeHelper(jSType0);
        boolean boolean1 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
        recordType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getLeastSupertype(recordType1);
        boolean boolean0 = recordType1.removeProperty("Not declared as a type name");
        NoObjectType noObjectType0 = (NoObjectType) recordType1.getGreatestSubtypeHelper(jSType0);
        boolean boolean1 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
    }

    @Test(timeout = 4000)
    public void test1825() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getLeastSupertype(recordType1);
        NoObjectType noObjectType0 = (NoObjectType) recordType1.getGreatestSubtypeHelper(jSType0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1826() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getLeastSupertype(recordType1);
        NoObjectType noObjectType0 = (NoObjectType) recordType1.getGreatestSubtypeHelper(jSType0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType1);
    }

    @Test(timeout = 4000)
    public void test1927() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = new Node(1);
        JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) recordType0, "Not declared as a constructor", "Unknown class name", 4095, 29);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType1 = recordType1.resolveInternal(simpleErrorReporter0, recordType0);
        jSType1.equals((Object) recordType0);
    }
}
