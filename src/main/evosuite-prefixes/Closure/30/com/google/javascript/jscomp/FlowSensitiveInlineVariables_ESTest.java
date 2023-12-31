/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 23:13:08 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FlowSensitiveInlineVariables_ESTest extends FlowSensitiveInlineVariables_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) null);
        flowSensitiveInlineVariables0.process((Node) null, (Node) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) null);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
        nodeTraversal0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) null);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.visit(nodeTraversal0, (Node) null, (Node) null);
        nodeTraversal0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) null);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
        nodeTraversal0.getLineNumber();
    }
}
