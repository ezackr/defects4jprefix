/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 03:39:04 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AnalyzePrototypeProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import java.util.Collection;
import java.util.Deque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class AnalyzePrototypeProperties_ESTest extends AnalyzePrototypeProperties_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("N=v4FK=s_H", "N=v4FK=s_H");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        analyzePrototypeProperties0.process(node0, node0);
        assertEquals(47, Node.IS_DISPATCHER);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("O");
        Compiler compiler0 = new Compiler(mockPrintStream0);
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, true);
        AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("O");
        Deque<AnalyzePrototypeProperties.Symbol> deque0 = analyzePrototypeProperties_NameInfo0.getDeclarations();
        assertEquals(0, deque0.size());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
        AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("");
        String string0 = analyzePrototypeProperties_NameInfo0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("Nw@Tj4\"3c}P=");
        boolean boolean0 = analyzePrototypeProperties_NameInfo0.readsClosureVariables();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        Node node0 = Node.newString("o%)P>7:cLirB;");
        Node node1 = new Node(118, node0);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node1, node1, node1, (JSModule) null);
        JSModule jSModule0 = analyzePrototypeProperties_GlobalFunction0.getModule();
        assertNull(jSModule0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, (JSModuleGraph) null, false, false);
        Collection<AnalyzePrototypeProperties.NameInfo> collection0 = analyzePrototypeProperties0.getAllNameInfo();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Nw@Tj4\"3c}P=", "Nw@Tj4\"3c}P=");
        AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, (JSModule) null);
        Node node1 = analyzePrototypeProperties_LiteralProperty0.getPrototype();
        assertNull(node1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = new Node(1412);
        AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, (JSModule) null);
        Node node1 = analyzePrototypeProperties_LiteralProperty0.getValue();
        assertSame(node0, node1);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty((Node) null, (Node) null, (Node) null, (Node) null, (JSModule) null);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_LiteralProperty0.remove();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("O");
        Compiler compiler0 = new Compiler(mockPrintStream0);
        SyntheticAst syntheticAst0 = new SyntheticAst("!E|@^;:4aA79");
        Node node0 = syntheticAst0.getAstRoot(compiler0);
        AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, (JSModule) null);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_AssignmentProperty0.getPrototype();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("O");
        Compiler compiler0 = new Compiler(mockPrintStream0);
        Node node0 = compiler0.parseTestCode("O");
        AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, (JSModule) null);
        JSModule jSModule0 = analyzePrototypeProperties_AssignmentProperty0.getModule();
        assertNull(jSModule0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("O");
        Compiler compiler0 = new Compiler(mockPrintStream0);
        Node node0 = compiler0.parseSyntheticCode("O", "O");
        AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, (JSModule) null);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_AssignmentProperty0.remove();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Node node0 = Node.newString(5760, "com.google.javascript.jscomp.AnalyzePrototypeProperties$LiteralProperty", 5760, 3313);
        AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, (JSModule) null);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_AssignmentProperty0.getValue();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.AnalyzePrototypeProperties$AssignmentProperty", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        JSModule[] jSModuleArray0 = new JSModule[1];
        JSModule jSModule0 = new JSModule("6M\u0006|0LkCTXrHx<`@-R");
        jSModuleArray0[0] = jSModule0;
        JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties((AbstractCompiler) null, jSModuleGraph0, true, true);
        AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo("6M\u0006|0LkCTXrHx<`@-R");
        analyzePrototypeProperties_NameInfo0.markReference(jSModule0);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_NameInfo0.markReference((JSModule) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.JSModuleGraph", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.AnalyzePrototypeProperties$ProcessExternProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties$ProcessExternProperties");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        analyzePrototypeProperties0.process(node0, node0);
        assertEquals(4096, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("V`usWI#2uj>HX,");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        Node node1 = new Node(64, node0, node0, node0, node0);
        Node node2 = new Node(24, node1);
        // Undeclared exception!
        try {
            analyzePrototypeProperties0.process(node2, node2);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Compiler compiler0 = new Compiler();
        Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.AValyzePrototypeProperties$ProcessExternProperties", "com.google.javascript.jscomp.AValyzePrototypeProperties$ProcessExternProperties");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
        Node node0 = Node.newString(64, "com.google.javascript.jscomp.AValyzePrototypeProperties$ProcessExternProperties", 31, 12);
        Node node1 = new Node(8, node0);
        analyzePrototypeProperties0.process(node1, node1);
        assertEquals(16, Node.SOURCENAME_PROP);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Compiler compiler0 = new Compiler();
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, true);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Nw@Tj=\"3c}P=", "Nw@Tj=\"3c}P=");
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
        try {
            analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = new Node(118);
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = new Node(105, node0, node0, node0);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_GlobalFunction0.remove();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Node.newString(118, "))FZ9<i|bKU");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = new Node(118, node0, node0, node0);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_GlobalFunction0.remove();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Node.newString(118, "))FZ9<i|bKU");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "))FZ9<i|bKU", "))FZ9<i|bKU");
        Node node2 = new Node(118, node1, node1, node0);
        analyzePrototypeProperties_GlobalFunction0.remove();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Node.newString(118, "com.google.javascript.jscomp.InlineFunctions$FindCandidatesReferences");
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, true, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.InlineFunctions$FindCandidatesReferences", "com.google.javascript.jscomp.InlineFunctions$FindCandidatesReferences");
        Node node2 = new Node(17, node1, node1, node0);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_GlobalFunction0.remove();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = new Node(118);
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = new Node(0, node0, node0, node0);
        // Undeclared exception!
        try {
            analyzePrototypeProperties_GlobalFunction0.getFunctionNode();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = new Node(118);
        AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, (JSModuleGraph) null, false, false);
        AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, (JSModule) null);
        Node node1 = new Node(105, node0, node0, node0);
        Node node2 = analyzePrototypeProperties_GlobalFunction0.getFunctionNode();
        assertEquals(11, Node.USES_PROP);
    }
}
