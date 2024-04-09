/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 00:17:55 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
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
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        flowSensitiveInlineVariables0.process((Node) null, (Node) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
        nodeTraversal0.getSourceName();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.visit(nodeTraversal0, (Node) null, (Node) null);
        nodeTraversal0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Compiler compiler0 = new Compiler();
        FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
        flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
        nodeTraversal0.getLineNumber();
    }
}
