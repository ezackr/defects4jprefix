/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:05:39 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.runner.RunWith;

public class FunctionTypeBuilderTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("sXhDx", "sXhDx");
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        JSTypeNative jSTypeNative0 = JSTypeNative.LEAST_FUNCTION_TYPE;
        FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("sXhDx", compiler0, node0, "Not declared as a type name", (Scope) null);
        functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
        JSType[] jSTypeArray0 = new JSType[9];
        Node node1 = jSTypeRegistry0.createParameters(jSTypeArray0);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "nX},~Uv=[d", "nX},~Uv=[d");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("nX},~Uv=[d", compiler0, node0, "nX},~Uv=[d", (Scope) null);
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents(node0);
        functionTypeBuilder0.setContents(functionTypeBuilder_AstFunctionContents0);
        functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        functionTypeBuilder0.buildAndRegister();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        functionTypeBuilder_AstFunctionContents0.recordNonEmptyReturn();
        functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
        Iterable<String> iterable0 = functionTypeBuilder_UnknownFunctionContents0.getEscapedVarNames();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean0 = functionTypeBuilder_UnknownFunctionContents0.mayBeFromExterns();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("D", "D");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("D", compiler0, node0, "D", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setContents((FunctionTypeBuilder.FunctionContents) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("D", "D");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("D", compiler0, node0, "D", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction((FunctionType) null, node0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("namespace \"{0}\" cannot be provided twice");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("namespace \"{0}\" cannot be provided twice", compiler0, node0, "namespace \"{0}\" cannot be provided twice", (Scope) null);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("namespace \"{0}\" cannot be provided twice", (Node) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, (Node) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("LENDS");
        node0.addChildToBack(node0);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
        FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Unknown class name", compiler0, node0, "Not declared as a constructor", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("R");
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        JSType jSType0 = jSTypeRegistry0.createNamedType("K1ON`sljh<[", "R", 285, 15);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Named type with empty name component", compiler0, node0, "k`:C)p", (Scope) null);
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, node0);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@(yx;,5 f", "`NhU@(yx;,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@(yx;,5 f", compiler0, node0, "`NhU@(yx;,5 f", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("R");
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Named type with empty name component", compiler0, node0, "k`:C)p", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@(yx;,5 f", "`NhU@(yx;,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@(yx;,5 f", compiler0, node0, "`NhU@(yx;,5 f", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferInheritance((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@B3x;x,5 f", "`NhU@B3x;x,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@B3x;x,5 f", compiler0, node0, "`NhU@B3x;x,5 f", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        functionTypeBuilder0.inferInheritance(jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("9[J`)mW[");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("9[J`)mW[", compiler0, node0, "9[J`)mW[", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        FunctionTypeBuilder functionTypeBuilder2 = functionTypeBuilder0.inferThisType(jSDocInfo0, functionType0);
        functionTypeBuilder2.inferThisType(jSDocInfo0, functionType0);
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@B3x;x,5 f", "`NhU@B3x;x,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@B3x;x,5 f", compiler0, node0, "`NhU@B3x;x,5 f", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (JSType) null);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@(yx;x,5 f", "`NhU@(yx;x,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@(yx;x,5 f", compiler0, node0, "`NhU@(yx;x,5 f", (Scope) null);
        functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
        functionTypeBuilder0.inferThisType((JSDocInfo) null, functionType0);
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("@this tyue of a functiondmu}t e an object\nActual type: {0}");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("@this tyue of a functiondmu}t e an object\nActual type: {0}", compiler0, node0, "@this tyue of a functiondmu}t e an object\nActual type: {0}", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`NhU@(yx;,5 f", "`NhU@(yx;,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@(yx;,5 f", compiler0, node0, "`NhU@(yx;,5 f", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, (JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function");
        TightenTypes tightenTypes0 = new TightenTypes(compiler0);
        JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
        JSType jSType0 = jSTypeRegistry0.createNamedType("TightenTypes pass appears to be stuck in an infinite loop.", "TightenTypes pass appears to be stuck in an infinite loop.", 31, 54);
        JSType[] jSTypeArray0 = new JSType[1];
        jSTypeArray0[0] = jSType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Unknown class name", compiler0, node0, "Not declared as a type name", (Scope) null);
        functionTypeBuilder0.inferParameterTypes(node1, (JSDocInfo) null);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("R");
        SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
        JSType jSType0 = jSTypeRegistry0.createNamedType("K1ON`sljh<[", "R", 285, 15);
        JSType[] jSTypeArray0 = new JSType[5];
        jSTypeArray0[0] = jSType0;
        jSTypeArray0[1] = jSType0;
        jSTypeArray0[2] = jSType0;
        jSTypeArray0[3] = jSType0;
        jSTypeArray0[4] = jSType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Named type with empty name component", compiler0, node1, "k`:C)p", (Scope) null);
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, node0);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node1);
        functionTypeBuilder1.inferParameterTypes(node1, jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        Compiler compiler0 = new Compiler();
        JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
        compiler0.defaultCodingConvention = (CodingConvention) jqueryCodingConvention0;
        Node node0 = compiler0.parseTestCode("function");
        TightenTypes tightenTypes0 = new TightenTypes(compiler0);
        JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
        JSType jSType0 = jSTypeRegistry0.createNamedType("TightenTypes pass appears to be stuck in an infinite loop.", "TightenTypes pass appears to be stuck in an infinite loop.", 31, 54);
        JSType[] jSTypeArray0 = new JSType[1];
        jSTypeArray0[0] = jSType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Unknown class name", compiler0, node0, "Not declared as a type name", (Scope) null);
        functionTypeBuilder0.inferParameterTypes(node1, (JSDocInfo) null);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("`NhU@B3x;x,5 f", "`NhU@B3x;x,5 f");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`NhU@B3x;x,5 f", compiler0, node0, "`NhU@B3x;x,5 f", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("R");
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Named type with empty name component", compiler0, node0, "k`:C)p", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`Nh@(yx;,5 ef", "`Nh@(yx;,5 ef");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`Nh@(yx;,5 ef", compiler0, node0, "`Nh@(yx;,5 ef", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        functionTypeBuilder1.buildAndRegister();
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "`Nh@(yx;,5 ef", "`Nh@(yx;,5 ef");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("`Nh@(yx;,5 ef", compiler0, node0, "`Nh@(yx;,5 ef", (Scope) null);
        functionTypeBuilder0.buildAndRegister();
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        boolean boolean0 = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("m");
        Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
        iterable0.contains("m");
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("m");
        Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
        functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
        functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns();
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
        functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("LIBRARY_SCOPE");
        functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("Z@PJXG7W,a");
        functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns();
    }
}
