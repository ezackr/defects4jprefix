/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 21:58:36 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class FlowSensitiveInlineVariablesTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        // Undeclared exception!
        try {
            flowSensitiveInlineVariables0.process((Node) null, (Node) null);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
        assertEquals("", nodeTraversal0.getSourceName());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.visit(nodeTraversal0, (Node) null, (Node) null);
        assertEquals("", nodeTraversal0.getSourceName());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
        assertEquals("", nodeTraversal0.getSourceName());
    }
}
