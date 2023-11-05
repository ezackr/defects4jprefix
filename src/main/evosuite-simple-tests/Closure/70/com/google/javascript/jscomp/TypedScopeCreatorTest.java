/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 03:26:43 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.LinkedFlowScope;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;

public class TypedScopeCreatorTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "goog.isArray", "goog.isArray");
        Node node1 = new Node(13, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createInitialScope(node1);
        Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
        assertEquals(1, scope1.getVarCount());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.common.collect.Iterat=rs", "com.google.common.collect.Iterat=rs");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Hgoog.bjectcreate");
        Node node1 = new Node(37, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        node0.setType(69);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Variable {0} not de{mared before @lendsanntation.");
        Node node1 = new Node(43, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Hgoog.bjectcreate");
        Node node1 = new Node(44, node0);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertEquals(34, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("1");
        Node node1 = new Node(47, node0, node0, node0, (-886), 2);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertEquals(33, scope0.getVarCount());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("TypedScopeCreator$AbstractScopeBuilder$CollectProperties");
        Node node1 = new Node(122, node0, node0, node0, 1, 31);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "goog.isArray", "goog.isArray");
        node0.setType(64);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node1 = new Node(64, node0, node0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node1, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // Unexpected node type: EXPR_RESULT 1 [sourcename: java.lang.String@0000000773]
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "tQD-d\"SZB", "tQD-d\"SZB");
        node0.addSuppression("t3|;:S<rZ&Js1jP`<k");
        node0.setType(64);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node1 = new Node(38, node0);
        typedScopeCreator0.createScope(node1, (Scope) null);
        assertEquals(0, compiler0.getWarningCount());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "tQD-d\"SZB", "tQD-d\"SZB");
        Node node1 = Node.newString("tQD-d\"SZB");
        node0.addChildToBack(node1);
        node0.setType(64);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node2 = new Node(29, node0, node0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertTrue(scope0.isGlobal());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("!u:iO?fB$|U^,_gu");
        Node node1 = new Node(118, node0, node0, node0, 15, 4);
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
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(";  ");
        Node node1 = compiler0.parseTestCode(";  ");
        Node node2 = new Node(118, node0, node0, node1);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node2, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(VAR):  [testcode] :-1:-1
            // [source unknown]
            //   Parent: NULL
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("&SSo7c$:y)^V<");
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
        Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
        Node node2 = Node.newString(41, "&SSo7c$:y)^V<");
        Node node3 = new Node(48, node2, node0, node0, node1, (-2), 9);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node3, scope0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("i5ArUay");
        Node node1 = new Node(38, node0);
        Node node2 = new Node(118, node1, node1);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node2, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("i5rUa");
        Node node1 = new Node(38, node0);
        Node node2 = new Node(120, node1, node1);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node2, (Scope) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node1 = new Node(2);
        Scope scope0 = typedScopeCreator0.createInitialScope(node1);
        Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
        assertEquals(0, compiler0.getWarningCount());
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node1 = new Node(2);
        Scope scope0 = typedScopeCreator0.createInitialScope(node1);
        Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
        assertEquals(1, scope1.getVarCount());
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("goog.typedef");
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
        assertFalse(scope0.isLocal());
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("&SSo7c$:y)^V<");
        DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, defaultCodingConvention0);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
        Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
        Node node2 = new Node(48, node1, node0, node0, node1, (-2), 9);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        Node node3 = new Node(23, node2, 105, 2310);
        Scope scope1 = typedScopeCreator0.createScope(node3, scope0);
        assertTrue(scope1.isLocal());
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(";  ");
        DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, defaultCodingConvention0);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
        Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
        Node node2 = Node.newString(41, "");
        Node node3 = new Node(48, node2, node0, node0, node1, (-2), 9);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        Scope scope1 = typedScopeCreator0.createScope(node3, scope0);
        assertEquals(0, scope1.getVarCount());
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("&SSo7c$:y)^V<");
        GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
        JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
        ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
        Node node1 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
        Node node2 = Node.newString(41, "&SSo7c$:y)^V<");
        Node node3 = new Node(48, node2, node0, node0, node1, (-2), 9);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        LinkedFlowScope linkedFlowScope0 = LinkedFlowScope.createEntryLattice(scope0);
        JSType jSType0 = linkedFlowScope0.getTypeOfThis();
        scope0.declare("&SSo7c$:y)^V<", node2, jSType0, (CompilerInput) null, true);
        // Undeclared exception!
        try {
            typedScopeCreator0.createScope(node3, scope0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("i5ArUay");
        Node node1 = new Node(38, node0);
        node1.addSuppression(")&");
        JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
        assertNull(jSDocInfo0.getSourceName());
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("i5ArUay");
        Node node1 = new Node(38, node0);
        node0.addChildToBack(node1);
        JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("i5ArUay");
        Node node1 = new Node(38, node0);
        Node node2 = new Node(18, node1, node1);
        JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("j:%");
        node0.setType(64);
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Node node1 = new Node(86, node0, node0);
        Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
        assertTrue(scope0.isGlobal());
    }
}
