/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 11:07:54 GMT 2024
 */
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RecordType_ESTest extends RecordType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("^[NAvd. :e_~FM");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^[NAvd. :e_~FM");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>(54);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        errorFunctionType0.defineInferredProperty("Not declared as a type name", recordType0, node0);
        recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("f 5R^t29#t)HB", (RecordTypeBuilder.RecordProperty) null);
        RecordType recordType0 = null;
        recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Named type with empty name component");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType1);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Named type with empty name component");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType1);
        jSType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        boolean boolean0 = recordType0.isSynthetic();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0, false);
        boolean boolean0 = recordType0.isSynthetic();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
        PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "urzFG7i_it", unknownType0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, (Node) null);
        hashMap0.put("urzFG7i_it", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = new Node((-2), (-2), (-2));
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(arrowType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        UnknownType unknownType0 = new UnknownType(jSTypeRegistry0, true);
        PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "urzFG7i_it", unknownType0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(prototypeObjectType0, (Node) null);
        hashMap0.put("urzFG7i_it", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType0, (Node) null);
        hashMap0.put("urzFG7i_it", recordTypeBuilder_RecordProperty1);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType0.getGreatestSubtypeHelper(recordType1);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        boolean boolean0 = recordType0.defineProperty("Not declared as a constructor", recordType0, false, (Node) null);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString("Not declared as a constructor");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString("Not declared as a constructor");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType1.getGreatestSubtypeHelper(recordType0);
        jSType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString("Not declared as a constructor");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
        jSType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString("Not declared as a constructor");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType1);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "nNO8D#,?");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        NoObjectType noObjectType0 = (NoObjectType) recordType0.getGreatestSubtypeHelper(jSType0);
        noObjectType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("nNO8D#,?");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "nNO8D#,?");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("nNO8D#,?", recordTypeBuilder_RecordProperty0);
        errorFunctionType0.defineSynthesizedProperty("nNO8D#,?", (JSType) null, node0);
        jSTypeRegistry0.registerPropertyOnType("nNO8D#,?", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        NoObjectType noObjectType0 = (NoObjectType) recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("nNO8D#,?");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "nNO8D#,?");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("nNO8D#,?", recordTypeBuilder_RecordProperty0);
        errorFunctionType0.defineSynthesizedProperty("nNO8D#,?", (JSType) null, node0);
        jSTypeRegistry0.registerPropertyOnType("nNO8D#,?", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        NoObjectType noObjectType0 = (NoObjectType) recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        noObjectType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("^[NAvd. :e_~FM");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^[NAvd. :e_~FM");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        jSTypeRegistry0.registerPropertyOnType("Not declared as a type name", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        ObjectType objectType0 = errorFunctionType0.getTypeOfThis();
        errorFunctionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("^[NAvd. :e_~FM");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^[NAvd. :e_~FM");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        jSTypeRegistry0.registerPropertyOnType("Not declared as a type name", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        ObjectType objectType0 = errorFunctionType0.getTypeOfThis();
        recordType0.getGreatestSubtypeHelper(objectType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("!+WZ,");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "!+WZ,");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        NamedType namedType0 = new NamedType(jSTypeRegistry0, "Not declared as a type name", "Not declared as a constructor", 4, 520);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(namedType0, node0);
        hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
        jSTypeRegistry0.registerPropertyOnType("Not declared as a constructor", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("nNO8D#,?");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "nNO8D#,?");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("nNO8D#,?", recordTypeBuilder_RecordProperty0);
        jSTypeRegistry0.registerPropertyOnType("nNO8D#,?", errorFunctionType0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("urzFG7i_it");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "urzFG7i_it");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        errorFunctionType0.defineInferredProperty("Named type with empty name component", errorFunctionType0, node0);
        recordType0.getGreatestSubtypeHelper(errorFunctionType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        JSType jSType0 = recordType0.getGreatestSubtypeHelper(recordType0);
        boolean boolean0 = recordType0.isSubtype(jSType0);
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("E+ZB");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noResolvedType0, recordType0);
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("E+ZB");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noResolvedType0, node0);
        hashMap0.put("Named type with empty name component", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noResolvedType0, recordType0);
        noResolvedType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("E+ZB");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "E+ZB");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, recordType0);
        errorFunctionType0.defineInferredProperty("Not declared as a type name", indexedType0, node0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) errorFunctionType0, recordType0);
        recordType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("E+ZB");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "E+ZB");
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, recordType0, recordType0);
        errorFunctionType0.defineInferredProperty("Not declared as a type name", indexedType0, node0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) errorFunctionType0, recordType0);
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("+!UZbyVBqi", 1, 1);
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(arrowType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty1 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty1);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.equals((Object) recordType0);
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = new Node(1, 1, 1);
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(arrowType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
        boolean boolean0 = RecordType.isSubtype((ObjectType) noObjectType0, recordType0);
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Named type with empty name component");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.resolveInternal(simpleErrorReporter0, recordType0);
        recordType0.isResolved();
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        Node node0 = Node.newString(0, "Named type with empty name component");
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(recordType0, node0);
        hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
        RecordType recordType1 = new RecordType(jSTypeRegistry0, hashMap0);
        recordType1.resolveInternal(simpleErrorReporter0, recordType0);
        recordType0.equals((Object) recordType1);
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        Node node0 = Node.newString("^[NAEDvd. Ae_~M");
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^[NAEDvd. Ae_~M");
        JSType jSType0 = jSTypeRegistry0.getType((StaticScope<JSType>) errorFunctionType0, "Unknown class name", "Unknown class name", 15, 15);
        RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
        HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        hashMap0.put("Unknown class name", recordTypeBuilder_RecordProperty0);
        RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
        JSType jSType1 = recordType0.resolveInternal(simpleErrorReporter0, errorFunctionType0);
        jSType1.isNumberValueType();
    }
}
