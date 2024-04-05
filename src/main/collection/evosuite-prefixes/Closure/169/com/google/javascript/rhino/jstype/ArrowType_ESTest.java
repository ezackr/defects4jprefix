/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 08:37:42 GMT 2023
 */
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.Visitor;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ArrowType_ESTest extends ArrowType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, " ");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        arrowType0.canTestForShallowEqualityWith(errorFunctionType0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "kZ`KLSp?)N`4");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        arrowType0.getTypesUnderInequality(errorFunctionType0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Cf#H}W#3(QZ09g9");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        arrowType0.getLeastSupertype(errorFunctionType0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        String string0 = arrowType0.toString();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        arrowType0.visit((Visitor<ParameterizedType>) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        JSType jSType0 = arrowType0.getRestrictedTypeGivenToBooleanOutcome(true);
        jSType0.isBooleanValueType();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType((Node) null, arrowType0);
        boolean boolean0 = arrowType1.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
        ArrowType arrowType1 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
        ArrowType arrowType1 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
        errorFunctionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("o6\"!#FpE/724I):");
        Node node1 = new Node(0, node0, node0, node0, node0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        boolean boolean0 = arrowType0.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("");
        Node node1 = new Node(29, node0, node0, 2, 12);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType((Node) null);
        boolean boolean0 = arrowType1.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "kZ`KLSp?)N`4");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        errorFunctionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "kZ`KLSp?)N`4");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        JSType[] jSTypeArray0 = new JSType[1];
        jSTypeArray0[0] = (JSType) arrowType0;
        Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType(node0, (JSType) null);
        boolean boolean0 = arrowType1.isSubtype(jSTypeArray0[0]);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "kZ`KLSp?)N`4");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType0);
        errorFunctionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "kZ`KLSp?)N`4");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("o6\"!#FpE/724I):");
        Node node1 = new Node(0, node0, node0, node0, node0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType((Node) null);
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("");
        Node node1 = new Node(29, node0, node0, 2, 12);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
        ArrowType arrowType1 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("");
        Node node1 = new Node(29, node0, node0, 2, 12);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Not declared as a constructor");
        ArrowType arrowType1 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
        errorFunctionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        boolean boolean0 = arrowType0.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "O3P");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        Node node0 = Node.newNumber((double) 0);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType(node0);
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
        errorFunctionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "O3P");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        Node node0 = Node.newNumber((double) 0);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType(node0);
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "O3P");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        Node node0 = Node.newNumber((double) 0);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType(node0);
        boolean boolean0 = arrowType0.isSubtype(arrowType1);
        errorFunctionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = new Node(58, 58, 58);
        Node node1 = new Node(55, node0, node0, node0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        ArrowType arrowType1 = jSTypeRegistry0.createArrowType(node1);
        boolean boolean0 = arrowType1.isSubtype(arrowType0);
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        Node node0 = Node.newString("com.google.javascript.rhino.jstype.ArrowType", 3321, 3321);
        ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, node0, (JSType) null, true);
        arrowType0.returnType = null;
        arrowType0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "\"/}e[");
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) templateType0, (JSType) templateType0, (JSType) templateType0);
        Node node0 = jSTypeRegistry0.createParameters((List<JSType>) immutableList0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        arrowType0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        Node node0 = Node.newNumber((double) 334);
        Node node1 = new Node(334, node0, node0, node0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        arrowType0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "\"/}e[");
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) templateType0, (JSType) templateType0, (JSType) templateType0);
        Node node0 = jSTypeRegistry0.createParameters((List<JSType>) immutableList0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
        arrowType0.resolveInternal((ErrorReporter) null, errorFunctionType0);
        templateType0.isResolved();
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("o6\"!#FpE/724I):");
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("o6\"!#FpE/724I):");
        Node node1 = new Node(0, node0, node0, node0, node0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
        errorFunctionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
        ArrowType arrowType0 = errorFunctionType0.getInternalArrowType();
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        Node node0 = Node.newString("com.google.javascript.rhino.jstype.ArrowType", 3321, 3321);
        ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, node0, (JSType) null, true);
        arrowType0.returnType = null;
        boolean boolean0 = arrowType0.hasUnknownParamsOrReturn();
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        TemplateType templateType0 = new TemplateType(jSTypeRegistry0, " o8@WQ;+yC");
        ArrowType arrowType0 = new ArrowType(jSTypeRegistry0, (Node) null, templateType0);
        boolean boolean0 = arrowType0.hasAnyTemplateInternal();
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "\"/}e[");
        ImmutableList<JSType> immutableList0 = ImmutableList.of((JSType) templateType0, (JSType) templateType0, (JSType) templateType0, (JSType) templateType0);
        Node node0 = jSTypeRegistry0.createParameters((List<JSType>) immutableList0);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node0);
        boolean boolean0 = arrowType0.hasAnyTemplateInternal();
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        Node node0 = Node.newString("OBJECT_FUNCTION_TYPE");
        Node node1 = new Node(39, node0, node0, node0, 49, 38);
        ArrowType arrowType0 = jSTypeRegistry0.createArrowType(node1);
        boolean boolean0 = arrowType0.hasAnyTemplateInternal();
    }
}
