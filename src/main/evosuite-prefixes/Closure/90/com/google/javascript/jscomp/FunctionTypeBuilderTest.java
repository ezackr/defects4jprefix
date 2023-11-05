/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 04:25:47 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;

public class FunctionTypeBuilderTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("gA+h-s/yF&[<t/N_@");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("gA+h-s/yF&[<t/N_@", compiler0, node0, "gA+h-s/yF&[<t/N_@", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setSourceNode(node0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("rsT*.f:u}P7j");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rsT*.f:u}P7j", compiler0, node0, "rsT*.f:u}P7j", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction((FunctionType) null, node0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
        functionTypeBuilder1.inferFromOverriddenFunction(functionType0, (Node) null);
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
        functionTypeBuilder1.inferFromOverriddenFunction(functionType0, (Node) null);
        functionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("JSC_THIS_TYPE_NON_OBJECT", "JSC_THIS_TYPE_NON_OBJECT");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_THIS_TYPE_NON_OBJECT", compiler0, node0, "JSC_THIS_TYPE_NON_OBJECT", (Scope) null);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
        FunctionType functionType1 = functionTypeBuilder1.buildAndRegister();
        functionType1.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("JSC_THIS_TYPE_NON_OBJECT", "JSC_THIS_TYPE_NON_OBJECT");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_THIS_TYPE_NON_OBJECT", compiler0, node0, "JSC_THIS_TYPE_NON_OBJECT", (Scope) null);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
        FunctionType functionType1 = functionTypeBuilder1.buildAndRegister();
        functionType1.getMaxArguments();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("", "");
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        JSType[] jSTypeArray0 = new JSType[4];
        JSTypeNative jSTypeNative0 = JSTypeNative.SYNTAX_ERROR_TYPE;
        ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
        jSTypeArray0[0] = (JSType) objectType0;
        jSTypeArray0[1] = (JSType) objectType0;
        EnumType enumType0 = jSTypeRegistry0.createEnumType("Not declared as a constructor", jSTypeArray0[0]);
        EnumElementType enumElementType0 = enumType0.getElementsType();
        FunctionType functionType0 = enumElementType0.getConstructor();
        jSTypeArray0[2] = (JSType) functionType0;
        jSTypeArray0[3] = (JSType) enumElementType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Named type with empty name component", compiler0, node0, "Not declared as a constructor", (Scope) null);
        functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node1);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("prefix must start with one of: ");
        TightenTypes tightenTypes0 = new TightenTypes(compiler0);
        JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
        LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
        Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
        Node node2 = new Node(0, node0, node1);
        ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
        Scope scope0 = new Scope(node1, objectType0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "Not declared as a type name", scope0);
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, (Node) null);
        functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node2);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("JSC_INVLID_MARKER_UAGE");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_INVLID_MARKER_UAGE", compiler0, node0, "JSC_INVLID_MARKER_UAGE", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        functionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("JSC_INVLID_MARKER_UAGE");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_INVLID_MARKER_UAGE", compiler0, node0, "JSC_INVLID_MARKER_UAGE", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        JSType[] jSTypeArray0 = new JSType[1];
        jSTypeArray0[0] = (JSType) functionType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        functionTypeBuilder1.inferFromOverriddenFunction(functionType0, node1);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("gooLg.typedwef", "gooLg.typedwef");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("gooLg.typedwef", compiler0, node0, "gooLg.typedwef", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnStatementsAsLastResort((Node) null);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        Compiler compiler0 = new Compiler();
        CompilerOptions compilerOptions0 = new CompilerOptions();
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
        compiler0.compile(jSSourceFile0, jSSourceFile0, compilerOptions0);
        Node node0 = compiler0.parseTestCode("");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder((String) null, compiler0, node0, (String) null, (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnStatementsAsLastResort(node0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        Compiler compiler0 = new Compiler();
        CompilerOptions compilerOptions0 = new CompilerOptions();
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
        Charset charset0 = Charset.defaultCharset();
        JSSourceFile jSSourceFile1 = JSSourceFile.fromFile("", charset0);
        compiler0.compile(jSSourceFile1, jSSourceFile0, compilerOptions0);
        Node node0 = compiler0.parseTestCode("// Input %num%");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, (String) null, (Scope) null);
        functionTypeBuilder0.inferReturnStatementsAsLastResort(node0);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        Compiler compiler0 = new Compiler();
        CompilerOptions compilerOptions0 = new CompilerOptions();
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
        Node node0 = compiler0.parseSyntheticCode("", "!f^*Hk)N@gccgYO?]");
        JSSourceFile jSSourceFile1 = JSSourceFile.fromCode("!f^*Hk)N@gccgYO?]", (String) null);
        compiler0.compile(jSSourceFile1, jSSourceFile0, compilerOptions0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, (String) null, (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnStatementsAsLastResort(node0);
        FunctionTypeBuilder functionTypeBuilder2 = functionTypeBuilder1.inferReturnStatementsAsLastResort(node0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferInheritance((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        functionTypeBuilder0.inferInheritance(jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("\"h");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("\"h", compiler0, node0, "\"h", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (JSType) null);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("prefix must start with one of: ");
        TightenTypes tightenTypes0 = new TightenTypes(compiler0);
        JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
        ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
        Scope scope0 = new Scope(node0, objectType0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "Not declared as a type name", scope0);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, objectType0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("rsT*.f:u}P7j");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rsT*.f:u}P7j", compiler0, node0, "rsT*.f:u}P7j", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
        functionTypeBuilder1.inferThisType((JSDocInfo) null, functionType0);
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("rsT*.f:u}P7j");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("rsT*.f:u}P7j", compiler0, node0, "rsT*.f:u}P7j", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
        FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
        functionTypeBuilder1.inferThisType((JSDocInfo) null, functionType0);
        functionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("XD+veW*l#=w[qQ");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("XD+veW*l#=w[qQ", compiler0, node0, "XD+veW*l#=w[qQ", (Scope) null);
        functionTypeBuilder0.inferThisType((JSDocInfo) null, node0);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("g=g.typedef");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("g=g.typedef", compiler0, node0, "g=g.typedef", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (Node) null);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("yeq");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("yeq", compiler0, node0, "yeq", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        Node node1 = new Node(42, 13, 15);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, node1);
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, (JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("2", "2");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("2", compiler0, node0, "2", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        functionType0.isReturnTypeInferred();
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("2", "2");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("2", compiler0, node0, "2", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        functionType0.hasCachedValues();
    }

    @Test(timeout = 4000)
    public void test2429() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("2", "2");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("2", compiler0, node0, "2", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
        FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        JSType[] jSTypeArray0 = new JSType[1];
        jSTypeArray0[0] = (JSType) functionType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        functionTypeBuilder1.inferParameterTypes(node1, (JSDocInfo) null);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("JSC_THIS_TYPE_NON_OBJECT", "JSC_THIS_TYPE_NON_OBJECT");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_THIS_TYPE_NON_OBJECT", compiler0, node0, "JSC_THIS_TYPE_NON_OBJECT", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
        JSType[] jSTypeArray0 = new JSType[3];
        jSTypeArray0[0] = (JSType) functionType0;
        jSTypeArray0[1] = (JSType) functionType0;
        jSTypeArray0[2] = (JSType) functionType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
        functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("JSC_THIS_TYPE_NON_OBJECT", "JSC_THIS_TYPE_NON_OBJECT");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_THIS_TYPE_NON_OBJECT", compiler0, node0, "JSC_THIS_TYPE_NON_OBJECT", (Scope) null);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node0);
        functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
        JSType[] jSTypeArray0 = new JSType[3];
        jSTypeArray0[0] = (JSType) functionType0;
        jSTypeArray0[1] = (JSType) functionType0;
        jSTypeArray0[2] = (JSType) functionType0;
        Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
        functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("0");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("0", compiler0, node0, "0", (Scope) null);
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("prefix must start with one of: ");
        TightenTypes tightenTypes0 = new TightenTypes(compiler0);
        JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
        ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
        Scope scope0 = new Scope(node0, objectType0);
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "Not declared as a type name", scope0);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Cy9eq]");
        FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Cy9eq]", compiler0, node0, "Cy9eq]", (Scope) null);
        functionTypeBuilder0.buildAndRegister();
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        boolean boolean0 = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
    }
}
