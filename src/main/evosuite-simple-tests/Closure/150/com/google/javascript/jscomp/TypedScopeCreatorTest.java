/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 07:15:06 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Stack;
import org.junit.runner.RunWith;

public class TypedScopeCreatorTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(120);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node0, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = new Node(118, node0, 2, 23);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("com.google.ja9ascript.jscomj.ypedDcopeCrxator");
        node0.addSuppression("com.google.ja9ascript.jscomj.ypedDcopeCrxator");
        Node node1 = new Node(118, node0, 0, 8);
        node1.clonePropsFrom(node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(VAR):  [testcode] :0:8
            // [source unknown]
            //   Parent: NULL
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnAg_vaue}}");
        node0.setType(86);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = compiler0.parseTestCode("8");
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(41);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertFalse(scope0.isLocal());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnAg_vaue}}");
        node0.setType(43);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(44);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(47);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(69);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = new Node(122);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        Node node0 = new Node(64);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        typedScopeCreator0.createScope(node0, (Scope) null);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertFalse(scope0.isLocal());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.JSError$1");
        Node node1 = new Node(37, node0, 13, 5);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}", "function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[4];
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("JSC_MALFORMED_TYPEDEF", "msg.instanceof.bad.prototype");
        jSSourceFileArray0[0] = jSSourceFile0;
        SourceFile.Generator sourceFile_Generator0 = mock(SourceFile.Generator.class, new ViolatedAssumptionAnswer());
        JSSourceFile jSSourceFile1 = JSSourceFile.fromGenerator("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}", sourceFile_Generator0);
        jSSourceFileArray0[1] = jSSourceFile1;
        jSSourceFileArray0[2] = jSSourceFile1;
        jSSourceFileArray0[3] = jSSourceFileArray0[0];
        CompilerOptions compilerOptions0 = compiler0.options;
        compiler0.compile(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = compiler0.parseSyntheticCode("Dwe.plate=ype", "Dwe.plate=ype");
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node0 = compiler0.parseTestCode("TemplateType");
        node0.addSuppression("TemplateType");
        Node node1 = new Node(86, node0, 4, 0);
        node1.clonePropsFrom(node0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertFalse(scope0.isLocal());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("var t;");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = node0.removeChildren();
        node1.addSuppression((String) null);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node2 = new Node(18, node0, node1, 25, 2);
        Scope scope0 = typedScopeCreator0.createScope(node2, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node2 = new Node(18, node1, node0, 25, 2);
        typedScopeCreator0.createScope(node2, (Scope) null);
        assertEquals(1, compiler0.getWarningCount());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder$CollectProperties", "com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder$CollectProperties");
        compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("goog.typedef");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertFalse(scope0.isLocal());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        Stack<JSType> stack0 = new Stack<JSType>();
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
        Node node1 = new Node(20, node0, node0, node0, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createInitialScope(node1);
        Node node2 = new Node(2, node1, 47, 4095);
        Scope scope1 = typedScopeCreator0.createScope(node2, scope0);
        assertFalse(scope1.isGlobal());
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        Node node0 = new Node(118);
        Node node1 = new Node(30, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, scope0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.getErrorManager();
        Node node0 = new Node((byte) 120);
        Node node1 = new Node(27, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, scope0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = node0.removeChildren();
        Node node2 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node2, (Scope) null);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, scope0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = node0.removeChildren();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node2 = new Node(18, node0, node1, 25, 2);
        Scope scope0 = typedScopeCreator0.createScope(node2, (Scope) null);
        Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
        Scope scope2 = typedScopeCreator0.createScope(node0, scope1);
        Scope scope3 = typedScopeCreator0.createScope(node1, scope2);
        assertEquals(1, scope3.getVarCount());
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSComler_reLurnArg(JSCompilHi_rturnAr_vale) {  return function(){return JSCompiler_returnArg_vaue}}");
        Node node1 = node0.removeChildren();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node2 = new Node(18, node0, node1, 25, 2);
        Scope scope0 = typedScopeCreator0.createScope(node2, (Scope) null);
        Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
        Scope scope2 = typedScopeCreator0.createScope(node0, scope1);
        Scope scope3 = typedScopeCreator0.createScope(node1, scope2);
        assertEquals(2, scope1.getVarCount());
    }
}
