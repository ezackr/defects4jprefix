/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:27:03 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConstCheck;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PeepholeReplaceKnownMethods_ESTest extends PeepholeReplaceKnownMethods_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node0 = Node.newString("");
        Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertEquals(31, Node.SKIP_INDEXES_PROP);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node0 = new Node(37);
        Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertEquals(14, Node.DEFAULT_PROP);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Compiler compiler0 = new Compiler();
        ConstCheck constCheck0 = new ConstCheck(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, constCheck0);
        peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
        Node node0 = new Node(37, 37, 37);
        node0.addChildToBack(node0);
        Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertFalse(node1.isQualifiedName());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Compiler compiler0 = new Compiler();
        ConstCheck constCheck0 = new ConstCheck(compiler0);
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, constCheck0);
        peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
        Node node0 = new Node(37, 37, 37);
        node0.addChildToBack(node0);
        Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertEquals(10, Node.VARS_PROP);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Node node0 = new Node(37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertNotNull(node2);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Node node0 = new Node(37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertEquals(37, node2.getType());
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Node node0 = new Node(37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        Node node2 = Node.newString("N0=", 27, 16);
        node0.addChildToBack(node2);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node3 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertNotNull(node3);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Node node0 = new Node(37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        Node node2 = Node.newString("N0=", 27, 16);
        node0.addChildToBack(node2);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node3 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertTrue(node3.hasMoreThanOneChild());
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        Node node0 = new Node(37, 37, 37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        Node node2 = new Node(32, 2, 6);
        node0.addChildToBack(node2);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node3 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertNotNull(node3);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        Node node0 = new Node(37, 37, 37);
        Node node1 = new Node(33, node0);
        node0.addChildToBack(node1);
        Node node2 = new Node(32, 2, 6);
        node0.addChildToBack(node2);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
        Node node3 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        assertEquals((-2147483611), node3.getSourceOffset());
    }
}
