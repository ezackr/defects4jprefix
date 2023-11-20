/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:54:20 GMT 2023
 */
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
import org.junit.runner.RunWith;

public class FunctionBuilderTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FunctionBuilder functionBuilder0 = new FunctionBuilder((JSTypeRegistry) null);
        FunctionBuilder functionBuilder1 = functionBuilder0.withTemplateName("");
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FunctionBuilder functionBuilder0 = new FunctionBuilder((JSTypeRegistry) null);
        Node node0 = new Node((-2007), 0, 28);
        UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression((JSTypeRegistry) null, node0, "for", false);
        FunctionBuilder functionBuilder1 = functionBuilder0.withTypeOfThis(unresolvedTypeExpression0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        FunctionParamBuilder functionParamBuilder0 = new FunctionParamBuilder(jSTypeRegistry0);
        FunctionBuilder functionBuilder1 = functionBuilder0.withParams(functionParamBuilder0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        FunctionBuilder functionBuilder1 = functionBuilder0.forConstructor();
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        functionBuilder0.copyFromOtherFunction((FunctionType) null);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        VoidType voidType0 = new VoidType(jSTypeRegistry0);
        FunctionBuilder functionBuilder1 = functionBuilder0.withInferredReturnType(voidType0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        Node node0 = Node.newNumber((-369.6053255252), (-291), (-1828));
        FunctionBuilder functionBuilder1 = functionBuilder0.withSourceNode(node0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        FunctionBuilder functionBuilder1 = functionBuilder0.withName("x_X:ctZ;Lq\"1%Yo");
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
        FunctionBuilder functionBuilder0 = new FunctionBuilder(jSTypeRegistry0);
        FunctionBuilder functionBuilder1 = functionBuilder0.forNativeType();
    }
}
